package com.finallion.graveyard.init;

import com.finallion.graveyard.TheGraveyard;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class TGItems {

    public static final RegistryObject<BlockItem> TG_GRASS_BLOCK = RegistryObject.of(new ResourceLocation(TheGraveyard.MOD_ID, "tg_grass_block"), ForgeRegistries.ITEMS);

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_grass_block"), new BlockItem(TGBlocks.TG_GRASS_BLOCK, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_moss_block"), new BlockItem(TGBlocks.TG_MOSS_BLOCK, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_tuff"), new BlockItem(TGBlocks.TG_TUFF, new FabricItemSettings().group(TheGraveyard.GROUP)));

        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate"), new BlockItem(TGBlocks.TG_DEEPSLATE, new FabricItemSettings().group(TheGraveyard.GROUP)));

        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_cobbled_deepslate"), new BlockItem(TGBlocks.TG_COBBLED_DEEPSLATE, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_cobbled_deepslate_stairs"), new BlockItem(TGBlocks.TG_COBBLED_DEEPSLATE_STAIRS, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_cobbled_deepslate_slab"), new BlockItem(TGBlocks.TG_COBBLED_DEEPSLATE_SLAB, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_cobbled_deepslate_wall"), new BlockItem(TGBlocks.TG_COBBLED_DEEPSLATE_WALL, new FabricItemSettings().group(TheGraveyard.GROUP)));

        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_polished_deepslate"), new BlockItem(TGBlocks.TG_POLISHED_DEEPSLATE, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_polished_deepslate_stairs"), new BlockItem(TGBlocks.TG_POLISHED_DEEPSLATE_STAIRS, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_polished_deepslate_slab"), new BlockItem(TGBlocks.TG_POLISHED_DEEPSLATE_SLAB, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_polished_deepslate_wall"), new BlockItem(TGBlocks.TG_POLISHED_DEEPSLATE_WALL, new FabricItemSettings().group(TheGraveyard.GROUP)));

        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_bricks"), new BlockItem(TGBlocks.TG_DEEPSLATE_BRICKS, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_brick_stairs"), new BlockItem(TGBlocks.TG_DEEPSLATE_BRICK_STAIRS, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_brick_slab"), new BlockItem(TGBlocks.TG_DEEPSLATE_BRICK_SLAB, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_brick_wall"), new BlockItem(TGBlocks.TG_DEEPSLATE_BRICK_WALL, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_cracked_deepslate_bricks"), new BlockItem(TGBlocks.TG_CRACKED_DEEPSLATE_BRICKS, new FabricItemSettings().group(TheGraveyard.GROUP)));

        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_tiles"), new BlockItem(TGBlocks.TG_DEEPSLATE_TILES, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_tile_stairs"), new BlockItem(TGBlocks.TG_DEEPSLATE_TILE_STAIRS, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_tile_slab"), new BlockItem(TGBlocks.TG_DEEPSLATE_TILE_SLAB, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_tile_wall"), new BlockItem(TGBlocks.TG_DEEPSLATE_TILE_WALL, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_cracked_deepslate_tiles"), new BlockItem(TGBlocks.TG_CRACKED_DEEPSLATE_TILES, new FabricItemSettings().group(TheGraveyard.GROUP)));

        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_chiseled_deepslate"), new BlockItem(TGBlocks.TG_CHISELED_DEEPSLATE, new FabricItemSettings().group(TheGraveyard.GROUP)));

        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_stone"), new BlockItem(TGBlocks.TG_STONE, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_andesite"), new BlockItem(TGBlocks.TG_ANDESITE, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_granite"), new BlockItem(TGBlocks.TG_GRANITE, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_diorite"), new BlockItem(TGBlocks.TG_DIORITE, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_dirt"), new BlockItem(TGBlocks.TG_DIRT, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_coarse_dirt"), new BlockItem(TGBlocks.TG_COARSE_DIRT, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_rooted_dirt"), new BlockItem(TGBlocks.TG_ROOTED_DIRT, new FabricItemSettings()));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "tg_podzol"), new BlockItem(TGBlocks.TG_PODZOL, new FabricItemSettings()));


        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "dark_iron_bars"), new BlockItem(TGBlocks.DARK_IRON_BARS, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "gravestone"), new BlockItem(TGBlocks.GRAVESTONE, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "skull_with_rib_cage"), new BlockItem(TGBlocks.SKULL_WITH_RIB_CAGE, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "leaning_skeleton"), new BlockItem(TGBlocks.LEANING_SKELETON, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "skull_pile"), new BlockItem(TGBlocks.SKULL_PILE, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "lying_skeleton"), new BlockItem(TGBlocks.LYING_SKELETON, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "wither_skull_with_rib_cage"), new BlockItem(TGBlocks.WITHER_SKULL_WITH_RIB_CAGE, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "leaning_wither_skeleton"), new BlockItem(TGBlocks.LEANING_WITHER_SKELETON, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "wither_skull_pile"), new BlockItem(TGBlocks.WITHER_SKULL_PILE, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "lying_wither_skeleton"), new BlockItem(TGBlocks.LYING_WITHER_SKELETON, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "creeper_skeleton"), new BlockItem(TGBlocks.CREEPER_SKELETON, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "skeleton_hand"), new BlockItem(TGBlocks.SKELETON_HAND, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "wither_skeleton_hand"), new BlockItem(TGBlocks.WITHER_SKELETON_HAND, new FabricItemSettings().group(TheGraveyard.GROUP)));


        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "black_urn"), new BlockItem(TGBlocks.BLACK_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "gray_urn"), new BlockItem(TGBlocks.GRAY_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "light_gray_urn"), new BlockItem(TGBlocks.LIGHT_GRAY_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "white_urn"), new BlockItem(TGBlocks.WHITE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "light_blue_urn"), new BlockItem(TGBlocks.LIGHT_BLUE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "blue_urn"), new BlockItem(TGBlocks.BLUE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "cyan_urn"), new BlockItem(TGBlocks.CYAN_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "green_urn"), new BlockItem(TGBlocks.GREEN_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "lime_urn"), new BlockItem(TGBlocks.LIME_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "pink_urn"), new BlockItem(TGBlocks.PINK_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "magenta_urn"), new BlockItem(TGBlocks.MAGENTA_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "purple_urn"), new BlockItem(TGBlocks.PURPLE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "red_urn"), new BlockItem(TGBlocks.RED_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "orange_urn"), new BlockItem(TGBlocks.ORANGE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "yellow_urn"), new BlockItem(TGBlocks.YELLOW_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "brown_urn"), new BlockItem(TGBlocks.BROWN_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));


        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_black_urn"), new BlockItem(TGBlocks.SMALL_BLACK_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_gray_urn"), new BlockItem(TGBlocks.SMALL_GRAY_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_light_gray_urn"), new BlockItem(TGBlocks.SMALL_LIGHT_GRAY_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_white_urn"), new BlockItem(TGBlocks.SMALL_WHITE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_light_blue_urn"), new BlockItem(TGBlocks.SMALL_LIGHT_BLUE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_blue_urn"), new BlockItem(TGBlocks.SMALL_BLUE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_cyan_urn"), new BlockItem(TGBlocks.SMALL_CYAN_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_green_urn"), new BlockItem(TGBlocks.SMALL_GREEN_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_lime_urn"), new BlockItem(TGBlocks.SMALL_LIME_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_pink_urn"), new BlockItem(TGBlocks.SMALL_PINK_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_magenta_urn"), new BlockItem(TGBlocks.SMALL_MAGENTA_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_purple_urn"), new BlockItem(TGBlocks.SMALL_PURPLE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_red_urn"), new BlockItem(TGBlocks.SMALL_RED_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_orange_urn"), new BlockItem(TGBlocks.SMALL_ORANGE_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_yellow_urn"), new BlockItem(TGBlocks.SMALL_YELLOW_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));
        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "small_brown_urn"), new BlockItem(TGBlocks.SMALL_BROWN_URN, new FabricItemSettings().group(TheGraveyard.GROUP)));

        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "vase_block"), new BlockItem(TGBlocks.VASE_BLOCK, new FabricItemSettings().group(TheGraveyard.GROUP)));

        Registry.register(Registry.ITEM, new Identifier(TheGraveyard.MOD_ID, "skeleton_creeper_spawn_egg"), new SpawnEggItem(TGEntities.SKELETON_CREEPER, 7960171, 15263976, new FabricItemSettings().group(TheGraveyard.GROUP)));

    }


}
