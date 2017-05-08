package edu.ncsu.monopoly.gui;

import javax.swing.JOptionPane;

import edu.ncsu.monopoly.*;
import edu.ncsu.monopoly.test.boardScenarios.GameBoardFull;

public class Main {

    
    public static void main(String[] args) throws ClassNotFoundException {
        PlayerRecord p = new PlayerRecord();
        WelcomeWindow frame = new WelcomeWindow(p);
        frame.setVisible(true);
    }
}
