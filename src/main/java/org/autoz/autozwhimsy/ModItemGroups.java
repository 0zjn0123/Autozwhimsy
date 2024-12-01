package org.autoz.autozwhimsy;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.autoz.autozwhimsy.block.ModBlock;
import org.autoz.autozwhimsy.items.DieTool;
import org.autoz.autozwhimsy.items.ModItem;

import static com.mojang.text2speech.Narrator.LOGGER;

public class ModItemGroups {
    //    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of("autozwhimsy", "autozwhimsygroup"),
//        ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.autozwhimsy.autozwhimsygroup"))
//            .icon(() -> new ItemStack(ModItem.AUTOZFOODITEM))
//            .entries((displayContext, entries) -> {
//                entries.add(ModItem.AUTOZFOODITEM);
//            }).build());
    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of("autozwhimsy", "autozwhimsy_group"),
        ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.autozwhimsy.autozwhimsy_group"))
            .icon(() -> new ItemStack(ModItem.AUTOZFOODITEM))
            .entries((displayContext, entries) -> {
                entries.add(ModItem.AUTOZFOODITEM);
                entries.add(ModBlock.AUTOZBLOCK);
                entries.add(DieTool.DIE_TOOL);
            }).build());

    public static void registerModItemGroups() {
        LOGGER.info("Registering Item Groups");

    }

}
