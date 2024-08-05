package io.github.thebluetropics.environmentsextras.client.color.item;

import io.github.thebluetropics.environmentsextras.item.EnvironmentsExtrasItems;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.world.biome.GrassColors;
import org.jetbrains.annotations.ApiStatus.Internal;

@Internal
public class ModItemColorProviders {
  public static void register() {
    ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
      return GrassColors.getDefaultColor();
    }, EnvironmentsExtrasItems.SOLID_GRASS_BLOCK);
  }
}
