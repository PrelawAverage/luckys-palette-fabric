package net.luckyowl.common.block.custom;

import com.mojang.serialization.MapCodec;
import net.luckyowl.common.block.util.ModProperties;
import net.luckyowl.common.block.util.enums.VerticalLinearConnectionBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.List;

public class PlankedWallBlock extends PillarBlock {
    public static final MapCodec<PlankedWallBlock> CODEC = createCodec(PlankedWallBlock::new);
    public static final EnumProperty<VerticalLinearConnectionBlock> STACKABLE_BLOCK = ModProperties.VERTICAL_CONNECTION;
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    @Override
    public MapCodec<? extends PillarBlock> getCodec() {
        return CODEC;
    }

    public PlankedWallBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(AXIS, Direction.Axis.Y)
                .with(STACKABLE_BLOCK, VerticalLinearConnectionBlock.SINGLE));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(STACKABLE_BLOCK, VerticalLinearConnectionBlock.SINGLE)
                .with(AXIS, ctx.getSide().getAxis());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STACKABLE_BLOCK, AXIS);
    }

    @Override
    protected void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if(world.isClient) return;

        Direction.Axis axis = state.get(AXIS);

        BlockPos relativeHeadBlockPos = getRelativeAxisNeighborPosition(axis, pos, VerticalLinearConnectionBlock.HEAD);
        BlockPos relativeTailBlockPos = getRelativeAxisNeighborPosition(axis, pos, VerticalLinearConnectionBlock.TAIL);

        BlockState relativeHeadBlock = world.getBlockState(relativeHeadBlockPos);
        BlockState relativeTailBlock = world.getBlockState(relativeTailBlockPos);

        VerticalLinearConnectionBlock LinearConnectionBlockType = getLinearConnectionBlockType(state, relativeHeadBlock, relativeTailBlock);

        BlockState updatedState = state.with(STACKABLE_BLOCK, LinearConnectionBlockType);

        world.setBlockState(pos, updatedState, 3);
    }

    private BlockPos getRelativeAxisNeighborPosition(Direction.Axis axis, BlockPos pos, VerticalLinearConnectionBlock linearConnectionBlock) {
        return switch (axis) {
            case X -> linearConnectionBlock == VerticalLinearConnectionBlock.HEAD ? pos.east() :
                    linearConnectionBlock == VerticalLinearConnectionBlock.TAIL ? pos.west() : null;
            case Y -> linearConnectionBlock == VerticalLinearConnectionBlock.HEAD ? pos.up() :
                    linearConnectionBlock == VerticalLinearConnectionBlock.TAIL ? pos.down() : null;
            case Z -> linearConnectionBlock == VerticalLinearConnectionBlock.HEAD ? pos.north() :
                    linearConnectionBlock == VerticalLinearConnectionBlock.TAIL ? pos.south() : null;
        };
    }

    private VerticalLinearConnectionBlock getLinearConnectionBlockType(BlockState state, BlockState relativeHeadBlock, BlockState relativeBlockTail) {
        boolean isHeadBlockConnected = relativeHeadBlock.isOf(state.getBlock()) && relativeHeadBlock.get(AXIS) == state.get(AXIS);
        boolean isTailBlockConnected = relativeBlockTail.isOf(state.getBlock()) && relativeBlockTail.get(AXIS) == state.get(AXIS);

        if (isHeadBlockConnected && isTailBlockConnected) return VerticalLinearConnectionBlock.MIDDLE;
        if (isHeadBlockConnected) return VerticalLinearConnectionBlock.TAIL;
        if (isTailBlockConnected) return VerticalLinearConnectionBlock.HEAD;
        return VerticalLinearConnectionBlock.SINGLE;
    }
}
