package net.tysontheember.emberstextapi.fabric;

import net.fabricmc.api.ClientModInitializer;

public class EmbersTextAPIFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EmbersTextAPIFabric.LOGGER.info("Client initializer loaded for Minecraft 1.21.11");
    }
}
