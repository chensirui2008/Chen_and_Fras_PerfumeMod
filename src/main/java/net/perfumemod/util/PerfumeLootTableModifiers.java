package net.perfumemod.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.perfumemod.Items.PerfumeItems;

public class PerfumeLootTableModifiers {
  private static final Identifier MUSHROOM_ID = new Identifier("minecraft", "blocks/brown_mushroom");
  private static final Identifier KEIP_PLANT_ID = new Identifier("minecraft", "blocks/kelp_plant");
  private static final Identifier BEETROOT_ID = new Identifier("minecraft", "blocks/beetroots");
  private static final Identifier LEAVES_ID = new Identifier("minecraft", "blocks/oak_leaves");
  private static final Identifier WHEAT_ID = new Identifier("minecraft", "blocks/wheat");
  private static final Identifier CARROT_ID = new Identifier("minecraft", "blocks/carrots");
  private static final Identifier POTATOES_ID = new Identifier("minecraft", "blocks/potatoes");

  public static void modifyLootTable(){
    LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
      if (MUSHROOM_ID.equals(id)){
        //cinnamon
        LootPool.Builder poolBuilder = LootPool.builder()
          .rolls(ConstantLootNumberProvider.create(1))
          .conditionally(RandomChanceLootCondition.builder(0.35f))
          .with(ItemEntry.builder(PerfumeItems.CINNAMON))
          .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
        tableBuilder.pool(poolBuilder.build());
      }
      if (KEIP_PLANT_ID.equals(id)){
        //cumin
        LootPool.Builder poolBuilder = LootPool.builder()
          .rolls(ConstantLootNumberProvider.create(1))
          .conditionally(RandomChanceLootCondition.builder(0.35f))
          .with(ItemEntry.builder(PerfumeItems.CUMIN))
          .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
        tableBuilder.pool(poolBuilder.build());
      }
      if (BEETROOT_ID.equals(id)){
        //fennel
        LootPool.Builder poolBuilder_fennel = LootPool.builder()
          .rolls(ConstantLootNumberProvider.create(1))
          .conditionally(RandomChanceLootCondition.builder(0.35f))
          .with(ItemEntry.builder(PerfumeItems.FENNEL))
          .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
        tableBuilder.pool(poolBuilder_fennel.build());
        //anise
        LootPool.Builder poolBuilder_anise = LootPool.builder()
          .rolls(ConstantLootNumberProvider.create(1))
          .conditionally(RandomChanceLootCondition.builder(0.35f))
          .with(ItemEntry.builder(PerfumeItems.ANISE))
          .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
        tableBuilder.pool(poolBuilder_anise.build());
      }
      if (LEAVES_ID.equals(id)){
        //fragrant_leaves
        LootPool.Builder poolBuilder = LootPool.builder()
          .rolls(ConstantLootNumberProvider.create(1))
          .conditionally(RandomChanceLootCondition.builder(0.35f))
          .with(ItemEntry.builder(PerfumeItems.FRAGRANT_LEAVES))
          .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
        tableBuilder.pool(poolBuilder.build());
      }
      if (WHEAT_ID.equals(id)){
        //scallion
        LootPool.Builder poolBuilder = LootPool.builder()
          .rolls(ConstantLootNumberProvider.create(1))
          .conditionally(RandomChanceLootCondition.builder(0.35f))
          .with(ItemEntry.builder(PerfumeItems.SCALLION))
          .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
        tableBuilder.pool(poolBuilder.build());
      }
      if (CARROT_ID.equals(id)){
        //ginger
        LootPool.Builder poolBuilder = LootPool.builder()
          .rolls(ConstantLootNumberProvider.create(1))
          .conditionally(RandomChanceLootCondition.builder(0.35f))
          .with(ItemEntry.builder(PerfumeItems.GINGER))
          .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
        tableBuilder.pool(poolBuilder.build());
      }
      if (POTATOES_ID.equals(id)){
        //garlic
        LootPool.Builder poolBuilder = LootPool.builder()
          .rolls(ConstantLootNumberProvider.create(1))
          .conditionally(RandomChanceLootCondition.builder(0.35f))
          .with(ItemEntry.builder(PerfumeItems.GARLIC))
          .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)));
        tableBuilder.pool(poolBuilder.build());
      }
    });
  }
}
