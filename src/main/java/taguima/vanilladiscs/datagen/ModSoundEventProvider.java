package taguima.vanilladiscs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;
import taguima.vanilladiscs.VanillaDiscs;
import taguima.vanilladiscs.events.ModSoundEvents;

public class ModSoundEventProvider extends SoundDefinitionsProvider {
    /**
     * Creates a new instance of this data provider.
     *
     * @param output The {@linkplain PackOutput} instance provided by the data generator.
     * @param modId  The mod ID of the current mod.
     * @param helper The existing file helper provided by the event you are initializing this provider in.
     */
    protected ModSoundEventProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, VanillaDiscs.MODID, helper);
    }

    @Override
    public void registerSounds() {
        this.add(ModSoundEvents.DISC_MINECRAFT, SoundDefinition.definition().with(sound("minecraft:music/game/calm1").stream()));
        this.add(ModSoundEvents.DISC_CLARK, SoundDefinition.definition().with(sound("minecraft:music/game/calm2").stream()));
        this.add(ModSoundEvents.DISC_SWEDEN, SoundDefinition.definition().with(sound("minecraft:music/game/calm3").stream()));
    }
}
