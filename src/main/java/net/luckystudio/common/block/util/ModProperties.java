package net.luckystudio.common.block.util;

import net.luckystudio.common.block.util.enums.VerticalLinearConnectionBlock;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;

public class ModProperties {
    public static final EnumProperty<VerticalLinearConnectionBlock> VERTICAL_CONNECTION = EnumProperty.of("vertical_connection", VerticalLinearConnectionBlock.class);
    public static final IntProperty STACKABLE = IntProperty.of("stackable", 1, 8);
    public static final BooleanProperty ROTATED = BooleanProperty.of("rotated");
}
