package taguima.vanilladiscs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;
import taguima.vanilladiscs.VanillaDiscs;

import static taguima.vanilladiscs.VanillaDiscs.MODID;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup." + MODID + ".group", "VanillaDiscs");
        this.add(VanillaDiscs.MUSIC_DISC_MINECRAFT.get(), "Music Disc");
        this.add("item." + MODID + "." + VanillaDiscs.MUSIC_DISC_MINECRAFT.get() + ".desc", "C418 - Minecraft");
        this.add(VanillaDiscs.MUSIC_DISC_CLARK.get(), "Music Disc");
        this.add("item." + MODID + "." + VanillaDiscs.MUSIC_DISC_CLARK.get() + ".desc", "C418 - Clark");
        this.add(VanillaDiscs.MUSIC_DISC_SWEDEN.get(), "Music Disc");
        this.add("item." + MODID + "." + VanillaDiscs.MUSIC_DISC_SWEDEN.get() + ".desc", "C418 - Sweden");




    }
}
