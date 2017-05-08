package edu.ncsu.monopoly;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

public class PlayerRecord extends Observable implements Serializable{

    private ArrayList<User> users = new ArrayList<>();

    public void addPlayer(User p) {
        users.add(p);
        updateObserver();
    }

    public void updateObserver() {
        setChanged();
        notifyObservers();
    }

    public void removePlayer(User p) {
        users.remove(p);
        updateObserver();
    }

    public ArrayList<User> getListPlayers() {
        return this.users;
    }
    
        public void persistirGuardar(PlayerRecord sis) throws IOException {
         
        FileOutputStream f = new FileOutputStream("archivo");
        BufferedOutputStream b = new BufferedOutputStream(f);
        ObjectOutputStream s = new ObjectOutputStream(b);
        try {
            s.writeObject(sis);
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("1G-" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2G-"
                    + "-" + e.getMessage());
        }
        
    }
    
    public PlayerRecord persistirLeer() throws IOException, ClassNotFoundException {
        FileInputStream ff = new FileInputStream ("archivo");
        BufferedInputStream bb = new BufferedInputStream(ff);
        ObjectInputStream ss = new ObjectInputStream(bb);
        PlayerRecord sisRetorno = new PlayerRecord();
        try {
            sisRetorno= (PlayerRecord)ss.readObject();
            ss.close();
        } catch (FileNotFoundException e) {
            System.out.println("1L-" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2L-"
                    + "-" + e.getMessage());
        }
        
        return sisRetorno;
    }
}
