package taguima.vanilladiscs.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import taguima.vanilladiscs.VanillaDiscs;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VanillaDiscs.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(VanillaDiscs.MUSIC_DISC_MINECRAFT);
        simpleItem(VanillaDiscs.MUSIC_DISC_CLARK);
        simpleItem(VanillaDiscs.MUSIC_DISC_SWEDEN);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",

                //new ResourceLocation(VanillaDiscs.MODID,"item/" + item.getId().getPath()));

                new ResourceLocation(VanillaDiscs.MODID,"item/disc"));
    }
}
