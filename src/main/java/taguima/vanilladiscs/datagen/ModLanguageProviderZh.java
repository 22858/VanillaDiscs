package taguima.vanilladiscs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import taguima.vanilladiscs.VanillaDiscs;

import static taguima.vanilladiscs.VanillaDiscs.MODID;

public class ModLanguageProviderZh extends LanguageProvider {
    public ModLanguageProviderZh(PackOutput output) {
        super(output, VanillaDiscs.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.add("itemGroup." + MODID + ".group", "原版唱片");
        this.add(VanillaDiscs.MUSIC_DISC_MINECRAFT.get(), "音乐唱片");
        this.add("item." + MODID + "." + VanillaDiscs.MUSIC_DISC_MINECRAFT.get() + ".desc", "C418 - Minecraft");
        this.add(VanillaDiscs.MUSIC_DISC_CLARK.get(), "音乐唱片");
        this.add("item." + MODID + "." + VanillaDiscs.MUSIC_DISC_CLARK.get() + ".desc", "C418 - Clark");
        this.add(VanillaDiscs.MUSIC_DISC_SWEDEN.get(), "音乐唱片");
        this.add("item." + MODID + "." + VanillaDiscs.MUSIC_DISC_SWEDEN.get() + ".desc", "C418 - Sweden");
    }
}
