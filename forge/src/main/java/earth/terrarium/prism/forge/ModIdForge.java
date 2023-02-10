package earth.terrarium.prism.forge;

import earth.terrarium.prism.Prism;
import earth.terrarium.prism.client.forge.ModIdClientForge;
import earth.terrarium.prism.client.ModIdClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Prism.MOD_ID)
public class ModIdForge {
    public ModIdForge() {
        Prism.init();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(ModIdForge::commonSetup);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> ModIdClientForge::init);
        bus.addListener(ModIdForge::onClientSetup);
    }

    public static void commonSetup(FMLCommonSetupEvent event) {
        Prism.postInit();
    }

    public static void onClientSetup(FMLClientSetupEvent event) {
        ModIdClient.init();
        ModIdClientForge.postInit();
    }
}
