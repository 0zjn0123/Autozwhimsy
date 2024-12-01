package org.autoz.autozwhimsy.items;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

import static org.autoz.autozwhimsy.items.ModItem.registerItems;

public abstract class DieTool extends Item {

    public DieTool(Settings settings) {
        super(settings);
    }
    public static final RegistryKey<DamageType> DABIANKILL_DAMAGE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of("autozwhimsy", "dabiankill"));

    public static final Item DIE_TOOL = registerItems("die_tool", new DieTool(new Item.Settings()) {
        public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//            if (world.isClient()) {
//                return TypedActionResult.pass(user.getStackInHand(hand));
//            }
            // 让手持玩家被答编之力杀死了
            DamageSource damageSource = new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(DABIANKILL_DAMAGE), user); // 绕过盔甲
            user.damage(damageSource, 100000.0F);

            return TypedActionResult.success(user.getStackInHand(hand));
        }
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable("item.autozwhimsy.die_tool.tooltip"));
        }
    });
    public static void initialize() {
    }

    public abstract void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context);
}
