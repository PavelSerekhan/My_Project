package Book.ProgrammingGraphic;

import java.awt.*;

public class ListFonts {
    public static void main(String[] args) {
        String[] fontNames = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        for (String fontName : fontNames){
            System.out.println(fontName);
        }

        var sansbold14 = new Font("SansSerif", Font.BOLD,14);
    }
}
