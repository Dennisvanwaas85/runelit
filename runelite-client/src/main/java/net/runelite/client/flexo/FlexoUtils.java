package net.runelite.client.flexo;

import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.plugins.aaaflexo.FlexoOverlay;

import java.awt.*;

public class FlexoUtils {

    public static Rectangle getInvItemClickArea(WidgetItem item) {
        Rectangle clickArea = item.getCanvasBounds();
        FlexoOverlay.clickArea = clickArea;
        return clickArea;
    }

}
