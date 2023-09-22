package net.ghosted.fragment.item;

import net.ghosted.fragment.fragment;
import net.ghosted.fragment.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier REINFORCED = TierSortingRegistry.registerTier(
            new ForgeTier(5, 10000, 13f, 5f, 26,
                    ModTags.Blocks.NEEDS_REINFORCED_TOOL, () -> Ingredient.of(ModItems.STAREECH_INGOT.get())),
            new ResourceLocation(fragment.MOD_ID, "stareech"), List.of(Tiers.NETHERITE), List.of());

}
