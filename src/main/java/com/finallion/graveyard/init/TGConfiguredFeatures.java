package com.finallion.graveyard.init;

import com.finallion.graveyard.TheGraveyard;
import com.finallion.graveyard.world.features.surfaceFeatures.*;
import com.finallion.graveyard.world.features.surfaceFeatures.coralFeatures.DeadCoralClawFeature;
import com.finallion.graveyard.world.features.surfaceFeatures.coralFeatures.DeadCoralMushroomFeature;
import com.finallion.graveyard.world.features.surfaceFeatures.coralFeatures.DeadCoralTreeFeature;
import com.finallion.graveyard.world.features.trees.*;
import com.finallion.graveyard.world.features.trees.config.TGTreeFeatureConfig;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.decorator.*;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class TGConfiguredFeatures {


    // tree features
    public static final Feature<TGTreeFeatureConfig> SMALL_SPRUCE_TREE_01 = new SmallSpruceTree01(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> SMALL_SPRUCE_TREE_02 = new SmallSpruceTree02(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> SMALL_SPRUCE_TREE_03 = new SmallSpruceTree03(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> SMALL_SPRUCE_TREE_04 = new SmallSpruceTree04(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> SMALL_SPRUCE_TREE_05 = new SmallSpruceTree05(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> SMALL_SPRUCE_TREE_06 = new SmallSpruceTree06(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> SMALL_BENT_SPRUCE_TREE_01 = new SmallBentSpruceTree01(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> FALLEN_SPRUCE_TREE = new FallenSpruceTree(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> LARGE_BENT_SPRUCE_TREE_01 = new LargeBentSpruceTree01(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> LARGE_BENT_SPRUCE_TREE_02 = new LargeBentSpruceTree02(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> LARGE_SPRUCE_TREE_01 = new LargeSpruceTree01(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> LARGE_SPRUCE_TREE_02 = new LargeSpruceTree02(TGTreeFeatureConfig.CODEC);
    public static final Feature<TGTreeFeatureConfig> LARGE_SPRUCE_TREE_03 = new LargeSpruceTree03(TGTreeFeatureConfig.CODEC);

    // other features
    private static final Feature<DefaultFeatureConfig> MOSS_CARPET_FEATURE = new MossCarpetFeature(DefaultFeatureConfig.CODEC);
    private static final Feature<DefaultFeatureConfig> COBWEB_FEATURE = new CobwebFeature(DefaultFeatureConfig.CODEC);
    private static final Feature<DefaultFeatureConfig> BUSH_FEATURE = new BushFeature(DefaultFeatureConfig.CODEC);
    private static final Feature<DefaultFeatureConfig> GRAVESTONE_FEATURE = new GraveFeature(DefaultFeatureConfig.CODEC);
    private static final Feature<DefaultFeatureConfig> SOUL_LIGHT_FEATURE = new SoulLightFeature(DefaultFeatureConfig.CODEC);
    private static final Feature<DefaultFeatureConfig> FALLEN_TREE_FEATURE = new FallenTreeFeature(DefaultFeatureConfig.CODEC);
    private static final Feature<DefaultFeatureConfig> DEAD_CORAL_TREE_FEATURE = new DeadCoralTreeFeature(DefaultFeatureConfig.CODEC);
    private static final Feature<DefaultFeatureConfig> DEAD_CORAL_CLAW_FEATURE = new DeadCoralClawFeature(DefaultFeatureConfig.CODEC);
    private static final Feature<DefaultFeatureConfig> DEAD_CORAL_MUSHROOM_FEATURE = new DeadCoralMushroomFeature(DefaultFeatureConfig.CODEC);
    private static final Feature<DefaultFeatureConfig> DEAD_CORAL_PATCH_FEATURE = new DeadCoralPatchFeature(DefaultFeatureConfig.CODEC);

    // configured features registry keys
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSS_CARPET_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "moss_carpet_feature"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBWEB_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "cobweb_feature"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> BUSH_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "bush_feature"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRAVESTONE_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "gravestone_feature"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOUL_LIGHT_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "soul_light_feature"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> FALLEN_TREE_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "fallen_tree_feature"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEAD_CORAL_TREE_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "dead_coral_tree_feature"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEAD_CORAL_CLAW_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "dead_coral_claw_feature"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEAD_CORAL_MUSHROOM_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "dead_coral_mushroom_feature"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEAD_CORAL_PATCH_FEATURE_KEY = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(TheGraveyard.MOD_ID, "dead_coral_patch_feature"));



    // configured features
    public static final ConfiguredFeature<?, ?> MOSS_CARPET_CONFIG = MOSS_CARPET_FEATURE.configure(new DefaultFeatureConfig());
    public static final ConfiguredFeature<?, ?> COBWEB_CONFIG = COBWEB_FEATURE.configure(new DefaultFeatureConfig());
    public static final ConfiguredFeature<?, ?> BUSH_CONFIG = BUSH_FEATURE.configure(new DefaultFeatureConfig());
    public static final ConfiguredFeature<?, ?> GRAVESTONE_CONFIG = GRAVESTONE_FEATURE.configure(new DefaultFeatureConfig());
    public static final ConfiguredFeature<?, ?> SOUL_LIGHT_CONFIG = SOUL_LIGHT_FEATURE.configure(new DefaultFeatureConfig());
    public static final ConfiguredFeature<?, ?> FALLEN_TREE_CONFIG = FALLEN_TREE_FEATURE.configure(new DefaultFeatureConfig());
    public static final ConfiguredFeature<?, ?> DEAD_CORAL_TREE_CONFIG = DEAD_CORAL_TREE_FEATURE.configure(new DefaultFeatureConfig());
    public static final ConfiguredFeature<?, ?> DEAD_CORAL_CLAW_CONFIG = DEAD_CORAL_CLAW_FEATURE.configure(new DefaultFeatureConfig());
    public static final ConfiguredFeature<?, ?> DEAD_CORAL_MUSHROOM_CONFIG = DEAD_CORAL_MUSHROOM_FEATURE.configure(new DefaultFeatureConfig());
    public static final ConfiguredFeature<?, ?> DEAD_CORAL_PATCH_CONFIG = DEAD_CORAL_PATCH_FEATURE.configure(new DefaultFeatureConfig());

    // placed features
    public static PlacedFeature MOSS_CARPET_PLACED_FEATURE = MOSS_CARPET_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(100));
    public static PlacedFeature COBWEB_PLACED_FEATURE = COBWEB_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(40));
    public static PlacedFeature BUSH_PLACED_FEATURE = BUSH_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(35));
    public static PlacedFeature GRAVESTONE_PLACED_FEATURE = GRAVESTONE_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(1));
    public static PlacedFeature SOUL_LIGHT_PLACED_FEATURE = SOUL_LIGHT_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(100));
    public static PlacedFeature FALLEN_TREE_PLACED_FEATURE = FALLEN_TREE_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(20));
    public static PlacedFeature DEAD_CORAL_TREE_PLACED_FEATURE = DEAD_CORAL_TREE_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(20));
    public static PlacedFeature DEAD_CORAL_CLAW_PLACED_FEATURE = DEAD_CORAL_CLAW_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(20));
    public static PlacedFeature DEAD_CORAL_MUSHROOM_PLACED_FEATURE = DEAD_CORAL_MUSHROOM_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(20));
    public static PlacedFeature DEAD_CORAL_PATCH_PLACED_FEATURE = DEAD_CORAL_PATCH_CONFIG.withPlacement(RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, CountPlacementModifier.of(35));

    // configured tree feature collections
    public static final ConfiguredFeature<?, ?> HAUNTED_FOREST_TREES = register("haunted_forest_trees", Feature.RANDOM_SELECTOR.configure(
            new RandomFeatureConfig(List.of(
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.25F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.25F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_02.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.25F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_02.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.25F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_03.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.375F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_03.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.375F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_04.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_04.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_05.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_05.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_06.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_SPRUCE_TREE_06.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.FALLEN_SPRUCE_TREE.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.FALLEN_SPRUCE_TREE.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.25F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.25F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F)),
                    TreePlacedFeatures.SPRUCE_CHECKED)
    ));

    public static final ConfiguredFeature<?, ?> ERODED_HAUNTED_FOREST_TREES = register("eroded_haunted_forest_trees", Feature.RANDOM_SELECTOR.configure(
            new RandomFeatureConfig(List.of(
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.SMALL_BENT_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.FALLEN_SPRUCE_TREE.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.075F),
                    new RandomFeatureEntry(TGConfiguredFeatures.FALLEN_SPRUCE_TREE.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.075F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_02.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_BENT_SPRUCE_TREE_02.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.5F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_01.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.5F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_02.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03.configure(new TGTreeFeatureConfig(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F),
                    new RandomFeatureEntry(TGConfiguredFeatures.LARGE_SPRUCE_TREE_03.configure(new TGTreeFeatureConfig(Blocks.SPRUCE_LOG.getDefaultState(), Blocks.SPRUCE_LEAVES.getDefaultState())).withWouldSurviveFilter(Blocks.SPRUCE_SAPLING), 0.1F)),
                    TreePlacedFeatures.SPRUCE_CHECKED)
    ));

    public static final ConfiguredFeature<?, ?> ANCIENT_DEAD_REEF_VEGETATION = register("ancient_dead_reef_vegetation", Feature.SIMPLE_RANDOM_SELECTOR.configure(new SimpleRandomFeatureConfig(List.of(() -> {
        return DEAD_CORAL_TREE_FEATURE.configure(FeatureConfig.DEFAULT).withPlacement(new PlacementModifier[0]);
    }, () -> {
        return DEAD_CORAL_CLAW_FEATURE.configure(FeatureConfig.DEFAULT).withPlacement(new PlacementModifier[0]);
    }, () -> {
        return DEAD_CORAL_MUSHROOM_FEATURE.configure(FeatureConfig.DEFAULT).withPlacement(new PlacementModifier[0]);
    }))));

    public static PlacedFeature ERODED_HAUNTED_FOREST_TREES_PLACED_FEATURE = ERODED_HAUNTED_FOREST_TREES.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(10, 0.1F, 1)));
    public static PlacedFeature HAUNTED_FOREST_TREES_PLACED_FEATURE = HAUNTED_FOREST_TREES.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(15, 0.1F, 1)));
    public static PlacedFeature ANCIENT_DEAD_CORAL_REEF_WATER_PLACED_FEATURE = ANCIENT_DEAD_REEF_VEGETATION.withPlacement(NoiseBasedCountPlacementModifier.of(20, 400.0D, 0.0D), SquarePlacementModifier.of(), PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP, BiomePlacementModifier.of());
    public static PlacedFeature ANCIENT_DEAD_CORAL_REEF_PLACED_FEATURE = ANCIENT_DEAD_REEF_VEGETATION.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(7, 0.1F, 1)));


    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String id, ConfiguredFeature<FC, ?> feature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(TheGraveyard.MOD_ID, id), feature);
    }

    public static void registerFeatures() {
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "moss_carpet_feature"), MOSS_CARPET_FEATURE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "cobweb_feature"), COBWEB_FEATURE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "bush_feature"), BUSH_FEATURE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "gravestone_feature"), GRAVESTONE_FEATURE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "soul_light_feature"), SOUL_LIGHT_FEATURE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "fallen_tree_feature"), FALLEN_TREE_FEATURE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "dead_coral_tree_feature"), DEAD_CORAL_TREE_FEATURE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "dead_coral_claw_feature"), DEAD_CORAL_CLAW_FEATURE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "dead_coral_mushroom_feature"), DEAD_CORAL_MUSHROOM_FEATURE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "dead_coral_patch_feature"), DEAD_CORAL_PATCH_FEATURE);

        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "small_spruce_tree_01"), SMALL_SPRUCE_TREE_01);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "small_spruce_tree_02"), SMALL_SPRUCE_TREE_02);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "small_spruce_tree_03"), SMALL_SPRUCE_TREE_03);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "small_spruce_tree_04"), SMALL_SPRUCE_TREE_04);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "small_spruce_tree_05"), SMALL_SPRUCE_TREE_05);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "small_spruce_tree_06"), SMALL_SPRUCE_TREE_06);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "small_bent_spruce_tree_01"), SMALL_BENT_SPRUCE_TREE_01);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "fallen_spruce_tree"), FALLEN_SPRUCE_TREE);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "large_bent_spruce_tree_01"), LARGE_BENT_SPRUCE_TREE_01);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "large_bent_spruce_tree_02"), LARGE_BENT_SPRUCE_TREE_02);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "large_spruce_tree_01"), LARGE_SPRUCE_TREE_01);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "large_spruce_tree_02"), LARGE_SPRUCE_TREE_02);
        Registry.register(Registry.FEATURE, new Identifier(TheGraveyard.MOD_ID, "large_spruce_tree_03"), LARGE_SPRUCE_TREE_03);

    }

    public static void registerConfiguredFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, MOSS_CARPET_FEATURE_KEY.getValue(), MOSS_CARPET_CONFIG);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, COBWEB_FEATURE_KEY.getValue(), COBWEB_CONFIG);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, BUSH_FEATURE_KEY.getValue(), BUSH_CONFIG);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, GRAVESTONE_FEATURE_KEY.getValue(), GRAVESTONE_CONFIG);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, SOUL_LIGHT_FEATURE_KEY.getValue(), SOUL_LIGHT_CONFIG);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, FALLEN_TREE_FEATURE_KEY.getValue(), FALLEN_TREE_CONFIG);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, DEAD_CORAL_TREE_FEATURE_KEY.getValue(), DEAD_CORAL_TREE_CONFIG);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, DEAD_CORAL_CLAW_FEATURE_KEY.getValue(), DEAD_CORAL_CLAW_CONFIG);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, DEAD_CORAL_MUSHROOM_FEATURE_KEY.getValue(), DEAD_CORAL_MUSHROOM_CONFIG);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, DEAD_CORAL_PATCH_FEATURE_KEY.getValue(), DEAD_CORAL_PATCH_CONFIG);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "moss_carpet_placed_feature"), MOSS_CARPET_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "cobweb_placed_feature"), COBWEB_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "bush_placed_feature"), BUSH_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "gravestone_placed_feature"), GRAVESTONE_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "soul_light_placed_feature"), SOUL_LIGHT_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "fallen_tree_placed_feature"), FALLEN_TREE_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "dead_coral_tree_placed_feature"), DEAD_CORAL_TREE_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "dead_coral_claw_placed_feature"), DEAD_CORAL_CLAW_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "dead_coral_mushroom_placed_feature"), DEAD_CORAL_MUSHROOM_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "dead_coral_patch_placed_feature"), DEAD_CORAL_PATCH_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "eroded_haunted_forest_trees_placed_feature"), ERODED_HAUNTED_FOREST_TREES_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "haunted_forest_trees_placed_feature"), HAUNTED_FOREST_TREES_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "ancient_dead_coral_reef_placed_feature"), ANCIENT_DEAD_CORAL_REEF_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheGraveyard.MOD_ID, "ancient_dead_coral_reef_water_placed_feature"), ANCIENT_DEAD_CORAL_REEF_WATER_PLACED_FEATURE);
    }
}
