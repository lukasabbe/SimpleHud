package com.lukasabbe.simplehud.huds;

import com.lukasabbe.simplehud.Constants;
import com.lukasabbe.simplehud.tools.BoatTools;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.Identifier;

public class BoatHud implements SimpleHud{
    @Override
    public void render(GuiGraphics graphics, DeltaTracker tracker) {
        if(!isHudActivated()) return;
        if(client.noRender) return;
        if(!BoatTools.isRidingBoat()) return;
        if(client.player == null) return;

        renderBackPlate(graphics);

    }

    @Override
    public Identifier getIdentifier() {
        return Constants.BoatHudIdentifier;
    }
}
