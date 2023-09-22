package net.ghosted.fragment.item;

import com.google.common.collect.AbstractListMultimap;
import net.ghosted.fragment.fragment;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, fragment.MOD_ID);

    public static final RegistryObject<Item> STAREECH = ITEMS.register("stareech",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAREECH_INGOT = ITEMS.register("stareech_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HASTER = ITEMS.register("haster",
            () -> new Item(new Item.Properties(.food(ModFoodProperties.HASTER)));


    public static final RegistryObject<Item> REINFORCED_SWORD = ITEMS.register("reinforced_sword",
            () -> new SwordItem(ModToolTiers.REINFORCED, 4, 3, new Item.Properties().durability(10000)));
    public static final RegistryObject<Item> REINFORCED_PICKAXE = ITEMS.register("reinforced_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REINFORCED, 1, 5, new Item.Properties().durability(10000)));
    public static final RegistryObject<Item> REINFORCED_SHOVEL = ITEMS.register("reinforced_shovel",
            () -> new ShovelItem(ModToolTiers.REINFORCED, 1, 5, new Item.Properties().durability(10000)));
    public static final RegistryObject<Item> REINFORCED_AXE = ITEMS.register("reinforced_axe",
            () -> new AxeItem(ModToolTiers.REINFORCED, 1, 2, new Item.Properties().durability(10000)));
    public static final RegistryObject<Item> REINFORCED_HOE = ITEMS.register("reinforced_hoe",
            () -> new HoeItem(ModToolTiers.REINFORCED, 1, 5, new Item.Properties().durability(10000)));

    public static void register(IEventBus eventBus) {
              ITEMS.register(eventBus);
          }
}
