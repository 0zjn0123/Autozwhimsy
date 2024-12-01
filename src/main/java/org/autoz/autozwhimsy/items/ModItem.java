package org.autoz.autozwhimsy.items;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

import static com.mojang.text2speech.Narrator.LOGGER;

public class ModItem extends Item{

    public ModItem(Settings settings) {
        super(settings);

    }


    static Item registerItems(String id, Item item) {


        //        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(TutorialMod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of("autozwhimsy", id), item);
    }

    public static final FoodComponent AUTOZFOODITEMbuilder = new FoodComponent.Builder()
        .alwaysEdible()
        .snack()
        .build();


    public static final Item AUTOZFOODITEM = registerItems("autozfooditem", new Item(new Item.Settings().food(AUTOZFOODITEMbuilder)) {
        @Override
        public void appendTooltip(ItemStack itemStack, Item.TooltipContext context, List<Text> tooltip, TooltipType type){
            tooltip.add(Text.translatable("itemTooltip.autozwhimsy.autozfooditem").formatted(Formatting.GOLD));
        }
    });



    public static void initialize() {

        LOGGER.info("Registering Autozwhimsy Items");

    }
}
