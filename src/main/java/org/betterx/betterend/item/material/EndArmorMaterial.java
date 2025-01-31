//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.betterx.betterend.item.material;

import net.minecraft.class_1741;
import net.minecraft.class_1856;
import net.minecraft.class_1935;
import net.minecraft.class_3417;
import net.minecraft.class_6880;
import org.betterx.betterend.BetterEnd;
import org.betterx.betterend.registry.EndBlocks;
import org.betterx.betterend.registry.EndItems;
import org.betterx.wover.item.api.armor.CustomArmorMaterial;

public class EndArmorMaterial {
    public static final class_6880<class_1741> THALLASIUM;
    public static final class_6880<class_1741> TERMINITE;
    public static final class_6880<class_1741> AETERNIUM;
    public static final class_6880<class_1741> CRYSTALITE;

    public EndArmorMaterial() {
    }

    static {
        THALLASIUM = CustomArmorMaterial.start(BetterEnd.C.mk("thallasium")).defense(1, 4, 5, 2, 12).enchantmentValue(17).equipSound(class_3417.field_14862).toughness(0.0F).knockbackResistance(0.0F).repairIngredientSupplier(() -> class_1856.method_8091(new class_1935[]{EndBlocks.THALLASIUM.ingot})).buildAndRegister();
        TERMINITE = CustomArmorMaterial.start(BetterEnd.C.mk("terminite")).defense(3, 6, 7, 3, 14).enchantmentValue(26).equipSound(class_3417.field_14862).toughness(1.0F).knockbackResistance(0.05F).repairIngredientSupplier(() -> class_1856.method_8091(new class_1935[]{EndBlocks.TERMINITE.ingot})).buildAndRegister();
        AETERNIUM = CustomArmorMaterial.start(BetterEnd.C.mk("aeternium")).defense(5, 8, 10, 5, 30).enchantmentValue(40).equipSound(class_3417.field_21866).toughness(3.5F).knockbackResistance(0.2F).repairIngredientSupplier(() -> class_1856.method_8091(new class_1935[]{EndItems.AETERNIUM_INGOT})).buildAndRegister();
        CRYSTALITE = CustomArmorMaterial.start(BetterEnd.C.mk("crystalite")).defense(3, 6, 8, 3, 24).enchantmentValue(30).equipSound(class_3417.field_15103).toughness(1.2F).knockbackResistance(0.1F).repairIngredientSupplier(() -> class_1856.method_8091(new class_1935[]{EndBlocks.TERMINITE.ingot})).buildAndRegister();
    }
}
