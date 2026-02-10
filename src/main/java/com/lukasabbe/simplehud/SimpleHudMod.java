package com.lukasabbe.simplehud;

import com.lukasabbe.simplehud.config.Config;
import com.lukasabbe.simplehud.huds.ElytraHud;
import com.lukasabbe.simplehud.huds.SimpleHud;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;

import java.util.Arrays;
import java.util.List;

public class SimpleHudMod implements ClientModInitializer {

    public static List<SimpleHud> HUD_LIST = Arrays.asList(
            new ElytraHud()
    );

    public static Config configInstance = null;

    @Override
    public void onInitializeClient() {
        Config.HANDLER.load();
        configInstance = Config.HANDLER.instance();
        HUD_LIST.forEach(simpleHud -> HudElementRegistry.addFirst(simpleHud.getIdentifier(), simpleHud::render));
    }
}
