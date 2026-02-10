package com.lukasabbe.simplehud.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;

public class ElytraTools {
    private static final LocalPlayer player = Minecraft.getInstance().player;
    public static boolean isFlying(){
        if(player == null) return false;
        return player.isFallFlying();
    }
}
