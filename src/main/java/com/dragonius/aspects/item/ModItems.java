package com.dragonius.aspects.item;

import com.dragonius.aspects.Aspects;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Aspects.MODID);
    

    public static final DeferredItem<Item> ABYSALHEART = ITEMS.register("abysalheart",
            () -> new Item(new Item.Properties()));
//this for new item^
public static final DeferredItem<Item> DRACONICSWORD = ITEMS.register("draconicsword",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENTAXE = ITEMS.register("ancientaxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHADOWBOW = ITEMS.register("shadowbow",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GURDIANSHIELD = ITEMS.register("gurdianshield",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NATURESPICKAXE = ITEMS.register("naturespickaxe",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
