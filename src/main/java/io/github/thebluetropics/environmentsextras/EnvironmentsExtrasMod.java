package io.github.thebluetropics.environmentsextras;

import io.github.thebluetropics.environmentsextras.block.EnvironmentsExtrasBlocks;
import io.github.thebluetropics.environmentsextras.item.EnvironmentsExtrasItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnvironmentsExtrasMod implements ModInitializer {
  public static final String ID = "environments_extras";
  public static final Logger LOGGER = LoggerFactory.getLogger(ID);

  @Override
  public void onInitialize() {
    EnvironmentsExtrasBlocks.initialize();
    EnvironmentsExtrasItems.initialize();
  }
}
