package net.ghosted.fragment.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties HASTER = new FoodProperties.Builder().nutrition(10)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 14400000),1f).build();


}
