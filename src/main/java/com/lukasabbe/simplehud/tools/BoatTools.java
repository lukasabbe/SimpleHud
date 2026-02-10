package com.lukasabbe.simplehud.tools;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import org.jspecify.annotations.Nullable;

public class BoatTools {
    public static boolean isRidingBoat(){
        var player = getLocalPlayer();
        if(player == null) return false;
        return getLocalPlayer().getVehicle() != null;
    }
    private static @Nullable LocalPlayer getLocalPlayer() {
        return Minecraft.getInstance().player;
    }
}
