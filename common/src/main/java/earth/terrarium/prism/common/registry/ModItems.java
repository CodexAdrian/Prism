package earth.terrarium.prism.common.registry;

import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.prism.Prism;
import earth.terrarium.prism.common.util.PlatformUtils;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModItems {
    public static final CreativeModeTab ITEM_GROUP = PlatformUtils.createTab(new ResourceLocation(Prism.MOD_ID, "main"), () -> new ItemStack(Items.GRASS_BLOCK));
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(Registry.ITEM, Prism.MOD_ID);
}
