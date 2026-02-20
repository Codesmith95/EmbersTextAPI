package net.tysontheember.emberstextapi.fabric;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmbersTextAPIFabric implements ModInitializer {
    public static final String MOD_ID = "emberstextapi";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initialized bare-bones Fabric {} module for Minecraft 1.21.11", MOD_ID);
    }
}
