package taguima.vanilladiscs.datagen;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import taguima.vanilladiscs.VanillaDiscs;

import static taguima.vanilladiscs.VanillaDiscs.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerator {
    @SubscribeEvent
    public static void generate(GatherDataEvent event){
        var generator = event.getGenerator();
        var packoutput = generator.getPackOutput();
        var existingFileHelper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new ModItemModelProvider(packoutput, existingFileHelper));
        generator.addProvider(true, new ModLanguageProvider(packoutput));
        generator.addProvider(true, new ModLanguageProviderZh(packoutput));
        generator.addProvider(true, new ModSoundEventProvider(packoutput, existingFileHelper));


        //generator.addProvider(event.includeServer(), new TagGen(packoutput, lookupProvider, MODID, existingFileHelper));

    }
}
