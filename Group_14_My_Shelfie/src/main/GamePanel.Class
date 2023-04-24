package Main;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {

        // screen setting
        final int originalTileSize = 638; // 638 * 638  for every cornici
        final float scale = 0.25F;  //Multiples to be small
        final float titleSize = originalTileSize * scale; //1\4 * 638 = 159.5
        final int maxScreenCol = 12; //column
        final int macScreenRow = 12; //row
        final int screenWidth = (int) (titleSize * maxScreenCol); //WIDTH of screen = 12 * 159.5 = 1914 pixl
        final float screenHeght = (titleSize * macScreenRow); //HEGHT of screen = 12 * 159.5 = 1914 pixl



    public GamePanel() {

            this.setPreferredSize(new Dimension(screenWidth, (int) screenHeght));
            this.setBackground(Color.cyan); //Background color
            this.setDoubleBuffered(true); //It is used to avoid flicker in graphics


        }

    }
