package taguima.vanilladiscs.events;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import taguima.vanilladiscs.VanillaDiscs;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VanillaDiscs.MODID);

    // calm
    public static final RegistryObject<SoundEvent> DISC_MINECRAFT = registerSoundEvent("music_disc.minecraft");
    public static final RegistryObject<SoundEvent> DISC_CLARK = registerSoundEvent("music_disc.clark");
    public static final RegistryObject<SoundEvent> DISC_SWEDEN = registerSoundEvent("music_disc.sweden");

    // creative


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(VanillaDiscs.MODID, name);
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}
