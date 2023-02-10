package earth.terrarium.prism;

import com.mojang.logging.LogUtils;
import com.teamresourceful.resourcefulconfig.common.config.Configurator;
import earth.terrarium.prism.common.config.ModIdConfig;
import earth.terrarium.prism.common.registry.ModBlocks;
import earth.terrarium.prism.common.registry.ModItems;
import org.slf4j.Logger;

public class Prism {
    public static final String MOD_ID = "prism";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final Configurator CONFIGURATOR = new Configurator();

    public static void init() {
        CONFIGURATOR.registerConfig(ModIdConfig.class);
        ModBlocks.BLOCKS.init();
        ModItems.ITEMS.init();
    }

    public static void postInit() {
    }
}
