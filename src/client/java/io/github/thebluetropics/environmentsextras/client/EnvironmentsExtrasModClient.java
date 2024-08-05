package io.github.thebluetropics.environmentsextras.client;

import io.github.thebluetropics.environmentsextras.block.EnvironmentsExtrasBlocks;
import io.github.thebluetropics.environmentsextras.client.color.block.ModBlockColorProviders;
import io.github.thebluetropics.environmentsextras.client.color.item.ModItemColorProviders;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.world.biome.GrassColors;

public class EnvironmentsExtrasModClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    ModBlockColorProviders.register();
    ModItemColorProviders.register();
  }
}
