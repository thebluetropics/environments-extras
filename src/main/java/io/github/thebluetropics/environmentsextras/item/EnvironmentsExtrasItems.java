package io.github.thebluetropics.environmentsextras.item;

import io.github.thebluetropics.environmentsextras.EnvironmentsExtrasMod;
import io.github.thebluetropics.environmentsextras.block.EnvironmentsExtrasBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EnvironmentsExtrasItems {
  public static final BlockItem SOLID_GRASS_BLOCK = register("solid_grass_block", new BlockItem(EnvironmentsExtrasBlocks.SOLID_GRASS_BLOCK, new Item.Settings()));

  public static <T extends Item> T register(String id, T item) {
    return Registry.register(Registries.ITEM, Identifier.of(EnvironmentsExtrasMod.ID, id), item);
  }

  public static void initialize() { /* ... */ }
}
