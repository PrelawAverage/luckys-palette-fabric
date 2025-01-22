package net.luckyowl.common.block.custom;

import com.mojang.serialization.MapCodec;
import net.luckyowl.common.block.util.ModProperties;
import net.luckyowl.common.block.util.interfaces.Strippable;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class LumberBlock extends Block implements Strippable, Waterloggable {
    public static final MapCodec<LumberBlock> CODEC = createCodec(LumberBlock::new);
    public static final Property<Integer> STACK = ModProperties.STACKABLE;
    public static final BooleanProperty ROTATED = ModProperties.ROTATED;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public static final VoxelShape SHAPE_1 = Block.createCuboidShape(6, 0, 0, 10, 4, 16);
    public static final VoxelShape SHAPE_3 = Stream.of(
            Block.createCuboidShape(0, 4, 6, 16, 8, 10),
            Block.createCuboidShape(2, 0, 0, 6, 4, 16),
            Block.createCuboidShape(10, 0, 0, 14, 4, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape SHAPE_5 = Stream.of(
            Block.createCuboidShape(6, 8, 0, 10, 12, 16),
            Block.createCuboidShape(2, 0, 0, 6, 4, 16),
            Block.createCuboidShape(10, 0, 0, 14, 4, 16),
            Block.createCuboidShape(0, 4, 2, 16, 8, 6),
            Block.createCuboidShape(0, 4, 10, 16, 8, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape SHAPE_7 = Stream.of(
            Block.createCuboidShape(2, 0, 0, 6, 4, 16),
            Block.createCuboidShape(10, 0, 0, 14, 4, 16),
            Block.createCuboidShape(0, 4, 2, 16, 8, 6),
            Block.createCuboidShape(0, 4, 10, 16, 8, 14),
            Block.createCuboidShape(2, 8, 0, 6, 12, 16),
            Block.createCuboidShape(10, 8, 0, 14, 12, 16),
            Block.createCuboidShape(0, 12, 6, 16, 16, 10)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape ROTATED_SHAPE_1 = Block.createCuboidShape(0, 0, 6, 16, 4, 10);
    public static final VoxelShape ROTATED_SHAPE_3 = Stream.of(
            Block.createCuboidShape(6, 4, 0, 10, 8, 16),
            Block.createCuboidShape(0, 0, 2, 16, 4, 6),
            Block.createCuboidShape(0, 0, 10, 16, 4, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape ROTATED_SHAPE_5 = Stream.of(
            Block.createCuboidShape(0, 8, 6, 16, 12, 10),
            Block.createCuboidShape(0, 0, 2, 16, 4, 6),
            Block.createCuboidShape(0, 0, 10, 16, 4, 14),
            Block.createCuboidShape(2, 4, 0, 6, 8, 16),
            Block.createCuboidShape(10, 4, 0, 14, 8, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape ROTATED_SHAPE_7 = Stream.of(
            Block.createCuboidShape(0, 0, 2, 16, 4, 6),
            Block.createCuboidShape(0, 0, 10, 16, 4, 14),
            Block.createCuboidShape(2, 4, 0, 6, 8, 16),
            Block.createCuboidShape(10, 4, 0, 14, 8, 16),
            Block.createCuboidShape(0, 8, 2, 16, 12, 6),
            Block.createCuboidShape(0, 8, 10, 16, 12, 14),
            Block.createCuboidShape(6, 12, 0, 10, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public MapCodec<LumberBlock> getCodec() {
        return CODEC;
    }

    public LumberBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(STACK, 1)
                .with(ROTATED, false)
                .with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STACK, ROTATED, WATERLOGGED);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        int stack = state.get(STACK);
        if (stack == 1) {
            return state.get(ROTATED) ? ROTATED_SHAPE_1 : SHAPE_1;
        } else if (stack == 2) {
            return Block.createCuboidShape(0, 0, 0, 16, 4, 16);
        } else if (stack == 3) {
            return state.get(ROTATED) ? ROTATED_SHAPE_3 : SHAPE_3;
        } else if (stack == 4) {
            return Block.createCuboidShape(0, 0, 0, 16, 8, 16);
        } else if (stack == 5) {
            return state.get(ROTATED) ? ROTATED_SHAPE_5 : SHAPE_5;
        } else if (stack == 6) {
            return Block.createCuboidShape(0, 0, 0, 16, 12, 16);
        } else if (stack == 7) {
            return state.get(ROTATED) ? ROTATED_SHAPE_7 : SHAPE_7;
        } else if (stack == 8) {
            return Block.createCuboidShape(0, 0, 0, 16, 16, 16);
        }
        return super.getOutlineShape(state, world, pos, context);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);
        Direction direction = ctx.getHorizontalPlayerFacing().getOpposite();
        boolean rotated = direction == Direction.NORTH || direction == Direction.SOUTH;
        if (blockState.isOf(this) && !ctx.getPlayer().isSneaking()) {
            return blockState.with(STACK, blockState.get(STACK) + 1).with(WATERLOGGED, ctx.getWorld().getFluidState(blockPos).getFluid() == Fluids.WATER);
        } else {
            BlockState blockState2 = this.getDefaultState();
            return blockState2.with(ROTATED, rotated).with(WATERLOGGED, ctx.getWorld().getFluidState(blockPos).getFluid() == Fluids.WATER);
        }
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        return !context.shouldCancelInteraction() && context.getStack().getItem() == this.asItem() && state.get(STACK) < 8 && context.canReplaceExisting();
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return Strippable.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state;
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state;
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
}