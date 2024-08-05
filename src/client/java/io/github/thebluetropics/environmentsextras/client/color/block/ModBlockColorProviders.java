package io.github.thebluetropics.environmentsextras.client.color.block;

import io.github.thebluetropics.environmentsextras.block.EnvironmentsExtrasBlocks;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.world.biome.GrassColors;
import org.jetbrains.annotations.ApiStatus.Internal;

@Internal
public class ModBlockColorProviders {
  public static void register() {
    ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
      return world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getDefaultColor();
    }, EnvironmentsExtrasBlocks.SOLID_GRASS_BLOCK);
  }
}
