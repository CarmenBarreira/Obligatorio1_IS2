package edu.ncsu.monopoly.gui;


import edu.ncsu.monopoly.*;

public class Main {

    
    public static void main(String[] args) throws ClassNotFoundException {
        PlayerRecord p = new PlayerRecord();
        WelcomeWindow frame = new WelcomeWindow(p);
        frame.setVisible(true);
    }
}
