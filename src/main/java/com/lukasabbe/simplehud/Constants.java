package com.lukasabbe.simplehud;

import net.minecraft.resources.Identifier;

import java.util.Arrays;
import java.util.List;

public class Constants {
    public final static String MOD_ID = "simplehud";
    //Config
    public final static Identifier ConfigIdentifier = Identifier.fromNamespaceAndPath(MOD_ID, "config");
    //Hud:s
    public final static Identifier ElytraHudIdentifier = Identifier.fromNamespaceAndPath(MOD_ID, "elytra_hud");

    public final static List<Identifier> HudIdentifiers = Arrays.asList(ElytraHudIdentifier);
}
