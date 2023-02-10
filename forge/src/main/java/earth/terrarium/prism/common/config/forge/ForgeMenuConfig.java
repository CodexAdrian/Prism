package earth.terrarium.prism.common.config.forge;

import com.teamresourceful.resourcefulconfig.client.ConfigScreen;
import com.teamresourceful.resourcefulconfig.common.config.ResourcefulConfig;
import earth.terrarium.prism.Prism;
import earth.terrarium.prism.common.config.ModIdConfig;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.ModLoadingContext;

public class ForgeMenuConfig {
    public static void register() {
        ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory((client, parent) -> {
                    ResourcefulConfig config = Prism.CONFIGURATOR.getConfig(ModIdConfig.class);
                    if (config == null) {
                        return null;
                    }
                    return new ConfigScreen(null, config);
                })
        );
    }
}
