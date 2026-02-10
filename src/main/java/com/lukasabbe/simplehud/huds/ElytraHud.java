package com.lukasabbe.simplehud.huds;

import com.lukasabbe.simplehud.Constants;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.Identifier;

public class ElytraHud implements SimpleHud {
    @Override
    public void render(GuiGraphics graphics, DeltaTracker tracker) {
        if(!isHudActivated()) return;
        //if(!ElytraTools.isFlying()) return;
        if(client.noRender) return;

        renderBackPlate(graphics);

    }

    @Override
    public Identifier getIdentifier() {
        return Constants.ElytraHudIdentifier;
    }

}
