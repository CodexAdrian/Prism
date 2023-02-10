package earth.terrarium.prism.common.registry;

import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.prism.Prism;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(Registry.BLOCK, Prism.MOD_ID);
}
