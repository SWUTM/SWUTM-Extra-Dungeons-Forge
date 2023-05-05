package net.swutm.swutmextradungeons.world.structure;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.swutmextradungeons.swutmextradungeons;

public class ModStructures {

    /**
     * We are using the Deferred Registry system to register our structure as this is the preferred way on Forge.
     * This will handle registering the base structure for us at the correct time so we don't have to handle it ourselves.
     *
     * HOWEVER, do note that Deferred Registries only work for anything that is a Forge Registry. This means that
     * configured structures and configured features need to be registered directly to BuiltinRegistries as there
     * is no Deferred Registry system for them.
     */
    public static final DeferredRegister<StructureType<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(Registry.STRUCTURE_TYPE_REGISTRY, swutmextradungeons.MOD_ID);

    /**
     * Registers the base structure itself and sets what its path is. In this case,
     * this base structure will have the resourcelocation of structure_tutorial:sky_structures.
     */
    public static final RegistryObject<StructureType<BigStickStructures>> BIG_STICK_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("bigstick", () -> () -> BigStickStructures.CODEC);
    public static final RegistryObject<StructureType<BlackStoneTreesStructures>> BLACK_STONE_BRICK_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("blackstonetrees", () -> () -> BlackStoneTreesStructures.CODEC);
    public static final RegistryObject<StructureType<BlackStoneTrees1Structures>> BLACK_STONE_BRICK1_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("blackstonetrees1", () -> () -> BlackStoneTrees1Structures.CODEC);
    public static final RegistryObject<StructureType<CakeStructures>> CAKE_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("cake", () -> () -> CakeStructures.CODEC);
    public static final RegistryObject<StructureType<HayBlockStructures>> HAY_BLOCK_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("hayblock", () -> () -> HayBlockStructures.CODEC);
    public static final RegistryObject<StructureType<HouseStructures>> HOUSE_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("house", () -> () -> HouseStructures.CODEC);
    public static final RegistryObject<StructureType<House1Structures>> HOUSE1_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("house1", () -> () -> House1Structures.CODEC);
    public static final RegistryObject<StructureType<Idol1Structures>> IDOL1_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("idol1", () -> () -> Idol1Structures.CODEC);
    public static final RegistryObject<StructureType<Idol2Structures>> IDOL2_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("idol2", () -> () -> Idol2Structures.CODEC);
    public static final RegistryObject<StructureType<KelpStructures>> KELP_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("kelp", () -> () -> KelpStructures.CODEC);
    public static final RegistryObject<StructureType<Parkour1Structures>> PARKOUR1_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("parkour1", () -> () -> Parkour1Structures.CODEC);
    public static final RegistryObject<StructureType<Parkour2Structures>> PARKOUR2_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("parkour2", () -> () -> Parkour2Structures.CODEC);
    public static final RegistryObject<StructureType<Pumpkin1Structures>> PUMPKIN1_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("pumpkin1", () -> () -> Pumpkin1Structures.CODEC);
    public static final RegistryObject<StructureType<Pumpkin2Structures>> PUMPKIN2_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("pumpkin2", () -> () -> Pumpkin2Structures.CODEC);
    public static final RegistryObject<StructureType<SpawnerStructures>> SPAWNER_STRUCTURES = DEFERRED_REGISTRY_STRUCTURE.register("spawner", () -> () -> SpawnerStructures.CODEC);

}