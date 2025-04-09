package com.dragonius.aspects.tab;

import com.dragonius.aspects.Aspects;
import com.dragonius.aspects.blocks.ModBlocks;
import com.dragonius.aspects.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Aspects.MODID);

    public static final Supplier<CreativeModeTab> Aspects_of_Old_Tab = CREATIVE_MODE_TAB.register("aspects_of_old_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ABYSALHEART.get()))
                    .title(Component.translatable("creativetab.aspects.aspects_of_old"))
                    .displayItems((itemDisplayParametres, output) ->{
                        output.accept(ModItems.ABYSALHEART);
                        output.accept(ModItems.DRACONICSWORD);
                        output.accept(ModItems.ANCIENTAXE);
                        output.accept(ModItems.SHADOWBOW);
                        output.accept(ModItems.GURDIANSHIELD);
                        output.accept(ModItems.NATURESPICKAXE);
                        output.accept(ModBlocks.ALTAR);

                    })
                    .build());

    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
