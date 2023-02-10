package earth.terrarium.prism.fabric;

import earth.terrarium.prism.Prism;
import net.fabricmc.api.ModInitializer;

public class ModIdFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Prism.init();
    }
}
