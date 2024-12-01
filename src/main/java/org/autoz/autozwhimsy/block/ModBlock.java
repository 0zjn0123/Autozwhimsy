package org.autoz.autozwhimsy.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {
    public static final Block AUTOZBLOCK = register("autoz_block", new Block(Block.Settings.create().strength(4.0f)));

    private static <T extends Block> T register(String name, T block) {
        Identifier id = Identifier.of("autozwhimsy", name);
        Registry.register(Registries.BLOCK, id, block);
        Registry.register(Registries.ITEM, Identifier.of("autozwhimsy", "autoz_block"), new BlockItem(block, new Item.Settings()));
        return block;
    }
    public static void initialize() {
    }
}
