package com.finallion.graveyard.init;

import com.finallion.graveyard.TheGraveyard;
import com.finallion.graveyard.items.DaggerItem;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;


/*
public class TGItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheGraveyard.MOD_ID);

    public static final RegistryObject<Item> SKELETON_CREEPER_SPAWN_EGG = ITEMS.register("skeleton_creeper_spawn_egg",
            () -> new SpawnEggItem(TGEntities.SKELETON_CREEPER.get(), 7960171, 15263976, new Item.Properties().tab(TheGraveyard.GROUP)));

    public static final RegistryObject<Item> ACOLYTE_SPAWN_EGG = ITEMS.register("acolyte_spawn_egg",
            () -> new SpawnEggItem(TGEntities.ACOLYTE.get(), 2688830, 5898240, new Item.Properties().tab(TheGraveyard.GROUP)));

    public static final RegistryObject<Item> GHOUL_SPAWN_EGG = ITEMS.register("ghoul_spawn_egg",
            () -> new SpawnEggItem(TGEntities.GHOUL.get(), 6239802, 16487198, new Item.Properties().tab(TheGraveyard.GROUP)));

    public static final RegistryObject<Item> REAPER_SPAWN_EGG = ITEMS.register("reaper_spawn_egg",
            () -> new SpawnEggItem(TGEntities.REAPER.get(), 1381653, 5898240, new Item.Properties().tab(TheGraveyard.GROUP)));


}

 */


@Mod.EventBusSubscriber(modid = TheGraveyard.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TGItems {
    public static final List<Item> items_list = new ArrayList<Item>();

    @SubscribeEvent
    public static void initItems(RegistryEvent.Register<Item> event) {

        // all items that are no block items
        createSpawnEgg(TGEntities.SKELETON_CREEPER, 7960171, 15263976, "skeleton_creeper");
        createSpawnEgg(TGEntities.ACOLYTE, 2688830, 5898240, "acolyte");
        createSpawnEgg(TGEntities.GHOUL, 6239802, 16487198, "ghoul");
        createSpawnEgg(TGEntities.REAPER, 1381653, 5898240, "reaper");

        registerItem(new DaggerItem(ItemTier.STONE, 4, -1.0F, new Item.Properties().tab(TheGraveyard.GROUP)), "bone_dagger");

        items_list.forEach((e) -> event.getRegistry().register(e));
    }

    public static Item registerItem(Item item, String name) {
        item.setRegistryName(new ResourceLocation(TheGraveyard.MOD_ID, name));
        items_list.add(item);

        return item;
    }

    public static Item createSpawnEgg(EntityType<?> entity, int color1, int color2, String name) {
        Item spawnEgg = new SpawnEggItem(entity, color1, color2, new Item.Properties().tab(TheGraveyard.GROUP));
        return registerItem(spawnEgg, name + "_spawn_egg");
    }


}
