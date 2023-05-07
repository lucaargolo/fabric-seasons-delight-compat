package io.github.lucaargolo.seasonsdelightcompat;

import io.github.lucaargolo.seasons.FabricSeasons;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.Version;

public class FabricSeasonsDelightCompat implements ModInitializer {

    //TODO: Make files for mushroom colonys (100% every season) (it'll just impact with the bonemeal config on)
    //TODO: Make rich soil not spam particles when it cant grow crops (priority: low)
    //TODO: Investigate if any other crops need mixing (especially from the addons)
    //TODO: Corn from cultural delights? (Optional mixin?)

    private static final String MOD_ID = "seasonsdelightcompat";
    private static final String DEP_ID = "farmersdelight";

    @Override
    public void onInitialize() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
            Version version = modContainer.getMetadata().getVersion();
            String[] split = version.getFriendlyString().split("-");
            if(split.length > 1) {
                String mod = split[0];
                String dep = split[1];
                FabricSeasons.LOGGER.info("[" + FabricSeasons.MOD_NAME + "] Successfully loaded "+MOD_ID+" "+mod+" for "+DEP_ID+" "+dep);
            }
        });

    }


}
