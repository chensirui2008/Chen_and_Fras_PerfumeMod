package net.perfumemod.Items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.perfumemod.PerfumeMod;

public class PerfumeItems {
  public static final Item ANISE = registerItem("anise", new Item(new FabricItemSettings().group(PerfumeItemGroup.PERFUMES)));
  public static final Item CHILI = registerItem("chili", new Item(new FabricItemSettings().group(PerfumeItemGroup.PERFUMES)));
  public static final Item GARLIC = registerItem("garlic", new Item(new FabricItemSettings().group(PerfumeItemGroup.PERFUMES)));
  private static Item registerItem(String name, Item item){
    return Registry.register(Registry.ITEM, new Identifier(PerfumeMod.MOD_ID, name), item);
  }

  public static void registerPerfumeItems(){
    PerfumeMod.LOGGER.debug("registering perfume items");
  }
}
