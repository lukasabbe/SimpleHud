package com.lukasabbe.simpletransporthud.config;

import dev.isxander.yacl3.api.NameableEnum;
import net.minecraft.network.chat.Component;

public enum SpeedEnum implements NameableEnum {
    kmh,
    mph,
    ms;
    @Override
    public Component getDisplayName() {
        return Component.translatable("simple_transport_hud.config.speed_enum." + name().toLowerCase());
    }
}
