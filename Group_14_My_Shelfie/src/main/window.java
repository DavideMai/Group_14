package Main;

import javax.swing.*;
import javax.swing.JFrame;

public class window {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The command that is used to close the JFrame
        window.setResizable(false); //It is used to disable the JFrame's resizability
        window.setTitle("My_Shelfie"); //title of window

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null); //It is used to locate the JFrame in the center of the screen
        window.setVisible(true);
}
}
