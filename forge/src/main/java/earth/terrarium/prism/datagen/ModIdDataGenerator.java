package earth.terrarium.prism.datagen;

import earth.terrarium.prism.Prism;
import earth.terrarium.prism.datagen.provider.client.ModLangProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Prism.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModIdDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // Client
        generator.addProvider(event.includeClient(), new ModLangProvider(generator));

        // Server
    }
}
