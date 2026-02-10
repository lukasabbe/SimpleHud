package com.lukasabbe.simplehud.config;

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
        return null;
    }
}
