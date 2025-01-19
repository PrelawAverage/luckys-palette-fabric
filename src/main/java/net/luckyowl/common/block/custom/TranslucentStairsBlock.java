package net.luckyowl.common.block.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.Direction;

public class TranslucentStairsBlock extends StairsBlock {
    public static final MapCodec<TranslucentStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
                    .apply(instance, TranslucentStairsBlock::new)
    );

    @Override
    public MapCodec<? extends TranslucentStairsBlock> getCodec() {
        return CODEC;
    }

    public TranslucentStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) || super.isSideInvisible(state, stateFrom, direction);
    }
}
