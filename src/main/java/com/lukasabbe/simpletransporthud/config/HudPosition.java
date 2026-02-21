package com.lukasabbe.simpletransporthud.config;

import dev.isxander.yacl3.api.NameableEnum;
import net.minecraft.network.chat.Component;

public enum HudPosition implements NameableEnum {
    CENTER,
    TOP_LEFT,
    TOP_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_RIGHT;

    @Override
    public Component getDisplayName() {
        return Component.translatable("simple_transport_hud.config.position." + name().toLowerCase());
    }
}
