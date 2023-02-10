package earth.terrarium.prism.client.fabric;

import earth.terrarium.prism.client.ModIdClient;
import net.fabricmc.api.ClientModInitializer;

public class ModIdClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModIdClient.init();
    }
}
