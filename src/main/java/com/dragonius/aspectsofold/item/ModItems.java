package com.dragonius.aspectsofold.item;

import com.dragonius.aspectsofold.Aspects;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Aspects.MODID);
    

    public static final DeferredItem<Item> ABYSALHEART = ITEMS.register("abysalheart",
            () -> new Item(new Item.Properties().fireResistant()){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.aspectsofold.abysalheart"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
//this for new item^
public static final DeferredItem<Item> DRACONICSWORD = ITEMS.register("draconicsword",
            () -> new Item(new Item.Properties().fireResistant().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if(Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.draconicsword.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.draconicsword"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ANCIENTAXE = ITEMS.register("ancientaxe",
            () -> new Item(new Item.Properties().fireResistant().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if(Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.ancientaxe.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.ancientaxe"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SHADOWBOW = ITEMS.register("shadowbow",
            () -> new Item(new Item.Properties().fireResistant().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if(Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.shadowbow.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.shadowbow"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GURDIANSHIELD = ITEMS.register("gurdianshield",
            () -> new Item(new Item.Properties().fireResistant().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if(Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.gurdianshield.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.gurdianshield"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> NATURESPICKAXE = ITEMS.register("naturespickaxe",
            () -> new Item(new Item.Properties().fireResistant().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if(Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.naturespickaxe.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aspectsofold.naturespickaxe"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
