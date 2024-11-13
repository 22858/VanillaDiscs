/*
package taguima.vanilladiscs.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import taguima.vanilladiscs.VanillaDiscs;

import java.util.concurrent.CompletableFuture;


public class TagGen extends ItemTagsProvider {


    public TagGen(PackOutput p_275204_, CompletableFuture<HolderLookup.Provider> p_275194_, CompletableFuture<TagLookup<Item>> p_275207_, CompletableFuture<TagLookup<Block>> p_275634_) {
        super(p_275204_, p_275194_, p_275207_, p_275634_);
    }

    public TagGen(PackOutput packoutput, CompletableFuture<HolderLookup.Provider> lookupProvider, String modid, ExistingFileHelper existingFileHelper)
    {
        super(packoutput, lookupProvider, modid, existingFileHelper);

    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.MUSIC_DISCS)
                .add(VanillaDiscs.MUSIC_DISC_MINECRAFT.get())
                .add(VanillaDiscs.MUSIC_DISC_CLARK.get())
                .add(VanillaDiscs.MUSIC_DISC_SWEDEN.get());
        tag(ItemTags.CREEPER_DROP_MUSIC_DISCS);
    }
}
*/