package com.finallion.graveyard.init;


import com.finallion.graveyard.TheGraveyard;
import com.finallion.graveyard.blockentities.GravestoneBlockEntity;
import com.finallion.graveyard.blockentities.UrnBlockEntity;
import com.finallion.graveyard.blocks.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TGBlocks {



    // blocks backported from 1.17
    public static final Block TG_DEEPSLATE = new TGDeepslateBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block TG_ROOTED_DIRT = new Block(FabricBlockSettings.copyOf(Blocks.DIRT));
    public static final Block TG_TUFF = new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK));
    public static final Block TG_MOSS_BLOCK = new TGMossBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));

    public static final Block TG_COBBLED_DEEPSLATE = new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE));
    public static final Block TG_COBBLED_DEEPSLATE_STAIRS = new TGStairsBlock(FabricBlockSettings.copyOf(Blocks.STONE_STAIRS), TG_COBBLED_DEEPSLATE.getDefaultState());
    public static final Block TG_COBBLED_DEEPSLATE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB));
    public static final Block TG_COBBLED_DEEPSLATE_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE));

    public static final Block TG_POLISHED_DEEPSLATE = new Block(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block TG_POLISHED_DEEPSLATE_STAIRS = new TGStairsBlock(FabricBlockSettings.copyOf(Blocks.STONE_STAIRS), TG_POLISHED_DEEPSLATE.getDefaultState());
    public static final Block TG_POLISHED_DEEPSLATE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB));
    public static final Block TG_POLISHED_DEEPSLATE_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE));

    public static final Block TG_DEEPSLATE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block TG_DEEPSLATE_BRICK_STAIRS = new TGStairsBlock(FabricBlockSettings.copyOf(Blocks.STONE_STAIRS), TG_DEEPSLATE_BRICKS.getDefaultState());
    public static final Block TG_DEEPSLATE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB));
    public static final Block TG_DEEPSLATE_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE));
    public static final Block TG_CRACKED_DEEPSLATE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS));

    public static final Block TG_DEEPSLATE_TILES = new Block(FabricBlockSettings.copyOf(Blocks.STONE));
    public static final Block TG_DEEPSLATE_TILE_STAIRS = new TGStairsBlock(FabricBlockSettings.copyOf(Blocks.STONE_STAIRS), TG_DEEPSLATE_TILES.getDefaultState());
    public static final Block TG_DEEPSLATE_TILE_SLAB = new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB));
    public static final Block TG_DEEPSLATE_TILE_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE));
    public static final Block TG_CRACKED_DEEPSLATE_TILES = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS));

    public static final Block TG_CHISELED_DEEPSLATE = new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS));


    // helper blocks that get don't get replaced on world generation, generate ores or generate trees on
    public static final Block TG_GRASS_BLOCK = new TGGrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).drops(Blocks.GRASS_BLOCK.getLootTableId()));
    public static final Block TG_DIRT = new TGStoneBlock(() -> Blocks.DIRT, FabricBlockSettings.copyOf(Blocks.DIRT).drops(Blocks.DIRT.getLootTableId()));
    public static final Block TG_COARSE_DIRT = new TGStoneBlock(() -> Blocks.COARSE_DIRT, FabricBlockSettings.copyOf(Blocks.COARSE_DIRT).drops(Blocks.COARSE_DIRT.getLootTableId()));
    public static final Block TG_ANDESITE = new TGStoneBlock(() -> Blocks.ANDESITE, FabricBlockSettings.copyOf(Blocks.ANDESITE).drops(Blocks.ANDESITE.getLootTableId()));
    public static final Block TG_GRANITE = new TGStoneBlock(() -> Blocks.GRANITE, FabricBlockSettings.copyOf(Blocks.GRANITE).drops(Blocks.GRANITE.getLootTableId()));
    public static final Block TG_DIORITE = new TGStoneBlock(() -> Blocks.DIORITE, FabricBlockSettings.copyOf(Blocks.DIORITE).drops(Blocks.DIORITE.getLootTableId()));
    public static final Block TG_STONE = new TGStoneBlock(() -> Blocks.STONE, FabricBlockSettings.copyOf(Blocks.STONE).drops(Blocks.STONE.getLootTableId()));
    public static final Block TG_PODZOL = new TGStoneBlock(() -> Blocks.PODZOL, FabricBlockSettings.copyOf(Blocks.PODZOL).drops(Blocks.PODZOL.getLootTableId()));


    public static final Identifier GRAVESTONE_TEXTURE = new Identifier("minecraft", "block/polished_basalt_side");

    public static final Block DARK_IRON_BARS = new DarkIronBars(FabricBlockSettings.of(Material.METAL).strength(1.0F).nonOpaque());
    public static final Block SKULL_WITH_RIB_CAGE = new BoneDisplayBlock();
    public static final Block LEANING_SKELETON = new BoneDisplayBlock();
    public static final Block SKULL_PILE = new BoneDisplayBlock();
    public static final Block LYING_SKELETON = new BoneDisplayBlock();
    public static final Block WITHER_SKULL_WITH_RIB_CAGE = new BoneDisplayBlock();
    public static final Block LEANING_WITHER_SKELETON = new BoneDisplayBlock();
    public static final Block WITHER_SKULL_PILE = new BoneDisplayBlock();
    public static final Block LYING_WITHER_SKELETON = new BoneDisplayBlock();
    public static final Block CREEPER_SKELETON = new BoneDisplayBlock();
    public static final Block SKELETON_HAND = new BoneDisplayBlock();
    public static final Block WITHER_SKELETON_HAND = new BoneDisplayBlock();

    public static final Block BLACK_URN = new UrnBlock();
    public static final Block WHITE_URN = new UrnBlock();
    public static final Block LIGHT_GRAY_URN = new UrnBlock();
    public static final Block GRAY_URN = new UrnBlock();
    public static final Block BROWN_URN = new UrnBlock();
    public static final Block BLUE_URN = new UrnBlock();
    public static final Block LIGHT_BLUE_URN = new UrnBlock();
    public static final Block CYAN_URN = new UrnBlock();
    public static final Block PURPLE_URN = new UrnBlock();
    public static final Block MAGENTA_URN = new UrnBlock();
    public static final Block PINK_URN = new UrnBlock();
    public static final Block ORANGE_URN = new UrnBlock();
    public static final Block RED_URN = new UrnBlock();
    public static final Block YELLOW_URN = new UrnBlock();
    public static final Block GREEN_URN = new UrnBlock();
    public static final Block LIME_URN = new UrnBlock();

    public static final Block SMALL_BLACK_URN = new UrnBlock();
    public static final Block SMALL_WHITE_URN = new UrnBlock();
    public static final Block SMALL_LIGHT_GRAY_URN = new UrnBlock();
    public static final Block SMALL_GRAY_URN = new UrnBlock();
    public static final Block SMALL_BROWN_URN = new UrnBlock();
    public static final Block SMALL_BLUE_URN = new UrnBlock();
    public static final Block SMALL_LIGHT_BLUE_URN = new UrnBlock();
    public static final Block SMALL_CYAN_URN = new UrnBlock();
    public static final Block SMALL_PURPLE_URN = new UrnBlock();
    public static final Block SMALL_MAGENTA_URN = new UrnBlock();
    public static final Block SMALL_PINK_URN = new UrnBlock();
    public static final Block SMALL_ORANGE_URN = new UrnBlock();
    public static final Block SMALL_RED_URN = new UrnBlock();
    public static final Block SMALL_YELLOW_URN = new UrnBlock();
    public static final Block SMALL_GREEN_URN = new UrnBlock();
    public static final Block SMALL_LIME_URN = new UrnBlock();

    public static final Block VASE_BLOCK = new VaseBlock();

    public static final Block GRAVESTONE = new GravestoneBlock(GRAVESTONE_TEXTURE);


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_rooted_dirt"), TG_ROOTED_DIRT);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_moss_block"), TG_MOSS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate"), TG_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_tuff"), TG_TUFF);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_cobbled_deepslate"), TG_COBBLED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_cobbled_deepslate_stairs"), TG_COBBLED_DEEPSLATE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_cobbled_deepslate_slab"), TG_COBBLED_DEEPSLATE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_cobbled_deepslate_wall"), TG_COBBLED_DEEPSLATE_WALL);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_polished_deepslate"), TG_POLISHED_DEEPSLATE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_polished_deepslate_stairs"), TG_POLISHED_DEEPSLATE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_polished_deepslate_slab"), TG_POLISHED_DEEPSLATE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_polished_deepslate_wall"), TG_POLISHED_DEEPSLATE_WALL);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_bricks"), TG_DEEPSLATE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_brick_stairs"), TG_DEEPSLATE_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_brick_slab"), TG_DEEPSLATE_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_brick_wall"), TG_DEEPSLATE_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_cracked_deepslate_bricks"), TG_CRACKED_DEEPSLATE_BRICKS);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_tiles"), TG_DEEPSLATE_TILES);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_tile_stairs"), TG_DEEPSLATE_TILE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_tile_slab"), TG_DEEPSLATE_TILE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_deepslate_tile_wall"), TG_DEEPSLATE_TILE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_cracked_deepslate_tiles"), TG_CRACKED_DEEPSLATE_TILES);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_chiseled_deepslate"), TG_CHISELED_DEEPSLATE);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_stone"), TG_STONE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_diorite"), TG_DIORITE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_granite"), TG_GRANITE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_andesite"), TG_ANDESITE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_dirt"), TG_DIRT);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_coarse_dirt"), TG_COARSE_DIRT);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_grass_block"), TG_GRASS_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "tg_podzol"), TG_PODZOL);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "dark_iron_bars"), DARK_IRON_BARS);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "skull_with_rib_cage"), SKULL_WITH_RIB_CAGE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "leaning_skeleton"), LEANING_SKELETON);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "skull_pile"), SKULL_PILE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "lying_skeleton"), LYING_SKELETON);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "skeleton_hand"), SKELETON_HAND);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "wither_skull_with_rib_cage"), WITHER_SKULL_WITH_RIB_CAGE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "leaning_wither_skeleton"), LEANING_WITHER_SKELETON);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "wither_skull_pile"), WITHER_SKULL_PILE);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "lying_wither_skeleton"), LYING_WITHER_SKELETON);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "wither_skeleton_hand"), WITHER_SKELETON_HAND);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "creeper_skeleton"), CREEPER_SKELETON);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "black_urn"), BLACK_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "brown_urn"), BROWN_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "blue_urn"), BLUE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "light_blue_urn"), LIGHT_BLUE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "cyan_urn"), CYAN_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "gray_urn"), GRAY_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "light_gray_urn"), LIGHT_GRAY_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "white_urn"), WHITE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "purple_urn"), PURPLE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "magenta_urn"), MAGENTA_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "pink_urn"), PINK_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "lime_urn"), LIME_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "green_urn"), GREEN_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "red_urn"), RED_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "orange_urn"), ORANGE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "yellow_urn"), YELLOW_URN);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_black_urn"), SMALL_BLACK_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_brown_urn"), SMALL_BROWN_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_blue_urn"), SMALL_BLUE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_light_blue_urn"), SMALL_LIGHT_BLUE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_cyan_urn"), SMALL_CYAN_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_gray_urn"), SMALL_GRAY_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_light_gray_urn"), SMALL_LIGHT_GRAY_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_white_urn"), SMALL_WHITE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_purple_urn"), SMALL_PURPLE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_magenta_urn"), SMALL_MAGENTA_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_pink_urn"), SMALL_PINK_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_lime_urn"), SMALL_LIME_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_green_urn"), SMALL_GREEN_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_red_urn"), SMALL_RED_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_orange_urn"), SMALL_ORANGE_URN);
        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "small_yellow_urn"), SMALL_YELLOW_URN);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "vase_block"), VASE_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(TheGraveyard.MOD_ID, "gravestone"), GRAVESTONE);

    }

    public static final BlockEntityType<GravestoneBlockEntity> GRAVESTONE_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(TheGraveyard.MOD_ID, "gravestone_block_entity"), BlockEntityType.Builder.create(GravestoneBlockEntity::new, GRAVESTONE).build(null));
    public static BlockEntityType<UrnBlockEntity> URN_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(TheGraveyard.MOD_ID, "urn_block_entity"), BlockEntityType.Builder.create(UrnBlockEntity::new,
            BLACK_URN,
            BLUE_URN,
            LIGHT_BLUE_URN,
            CYAN_URN,
            BROWN_URN,
            GRAY_URN,
            LIGHT_GRAY_URN,
            PURPLE_URN,
            MAGENTA_URN,
            PINK_URN,
            RED_URN,
            YELLOW_URN,
            ORANGE_URN,
            GREEN_URN,
            LIME_URN,
            WHITE_URN).build(null));


}
