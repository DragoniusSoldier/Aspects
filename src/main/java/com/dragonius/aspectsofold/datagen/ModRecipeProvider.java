package com.dragonius.aspectsofold.datagen;

import com.dragonius.aspectsofold.blocks.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALTAR.get())
                .pattern("   ")
                .pattern("CEC")
                .pattern("PPP")
                .define('C', Items.CHAIN)
                .define('E', Items.EMERALD_BLOCK)
                .define('P', Items.POLISHED_ANDESITE)
                .unlockedBy("has_chain", has(Items.CHAIN))
                .unlockedBy("has_emerald_block", has(Items.EMERALD_BLOCK))
                .unlockedBy("has_polished_andesite", has(Items.POLISHED_ANDESITE))
                .save(recipeOutput);
    }
}
