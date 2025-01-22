package net.luckystudio.datagen.util;

import net.luckystudio.LuckysPalette;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels {
    public static final Model CUBE_COLUMN_HEAD = block("cube_column", "_head",TextureKey.END, TextureKey.SIDE);
    public static final Model CUBE_COLUMN_MIDDLE = block("cube_column", "_middle", TextureKey.END, TextureKey.SIDE);
    public static final Model CUBE_COLUMN_TAIL = block("cube_column", "_tail", TextureKey.END, TextureKey.SIDE);
    public static final Model LUMBER = modBlock("lumber", TextureKey.SIDE, TextureKey.TOP, TextureKey.PARTICLE);
    public static final Model LUMBER_2 = modBlock("lumber_2","_2", TextureKey.SIDE, TextureKey.TOP, TextureKey.PARTICLE);
    public static final Model LUMBER_3 = modBlock("lumber_3","_3", TextureKey.SIDE, TextureKey.TOP, TextureKey.PARTICLE);
    public static final Model LUMBER_4 = modBlock("lumber_4","_4", TextureKey.SIDE, TextureKey.TOP, TextureKey.PARTICLE);
    public static final Model LUMBER_5 = modBlock("lumber_5","_5", TextureKey.SIDE, TextureKey.TOP, TextureKey.PARTICLE);
    public static final Model LUMBER_6 = modBlock("lumber_6","_6", TextureKey.SIDE, TextureKey.TOP, TextureKey.PARTICLE);
    public static final Model LUMBER_7 = modBlock("lumber_7","_7", TextureKey.SIDE, TextureKey.TOP, TextureKey.PARTICLE);
    public static final Model LUMBER_8 = modBlock("lumber_8","_8", TextureKey.SIDE, TextureKey.TOP, TextureKey.PARTICLE);

    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.ofVanilla("block/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.ofVanilla("block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }

    private static Model modBlock(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(LuckysPalette.ofMod("block/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model modBlock(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(LuckysPalette.ofMod("block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
