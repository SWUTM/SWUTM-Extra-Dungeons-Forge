package net.swutm.swutmextradungeons;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.swutm.swutmextradungeons.world.structure.ModStructures;
import org.slf4j.Logger;

@Mod(swutmextradungeons.MOD_ID)
public class swutmextradungeons
{
    public static final String MOD_ID = "swutmextradungeons";

    private static final Logger LOGGER = LogUtils.getLogger();
    public swutmextradungeons()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModStructures.DEFERRED_REGISTRY_STRUCTURE.register(modEventBus);
    }
}
