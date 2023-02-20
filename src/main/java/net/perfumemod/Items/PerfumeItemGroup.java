package net.perfumemod.Items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.perfumemod.PerfumeMod;

import javax.naming.Name;

public class PerfumeItemGroup {

  public static final ItemGroup PERFUMES = FabricItemGroupBuilder.build(new Identifier(PerfumeMod.MOD_ID, "perfumes"), () -> new ItemStack(PerfumeItems.ANISE));
}
