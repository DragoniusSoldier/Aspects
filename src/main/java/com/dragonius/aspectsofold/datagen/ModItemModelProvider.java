package com.dragonius.aspectsofold.datagen;


import com.dragonius.aspectsofold.Aspects;
import com.dragonius.aspectsofold.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Aspects.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.ABYSALHEART.get());
        basicItem(ModItems.DRACONICSWORD.get());
        basicItem(ModItems.ANCIENTAXE.get());
        basicItem(ModItems.SHADOWBOW.get());
        basicItem(ModItems.GURDIANSHIELD.get());
        basicItem(ModItems.NATURESPICKAXE.get());

    }
}
