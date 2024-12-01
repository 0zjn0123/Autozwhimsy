package org.autoz.autozwhimsy;

import net.fabricmc.api.ModInitializer;
import org.autoz.autozwhimsy.block.ModBlock;
import org.autoz.autozwhimsy.items.DieTool;
import org.autoz.autozwhimsy.items.ModItem;

public class Autozwhimsy implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItemGroups.registerModItemGroups();
        ModItem.initialize();
        ModBlock.initialize();
        DieTool.initialize();
    }
}
