package edu.ncsu.monopoly;

import java.awt.Color;

public class User {
	private String name; 
	private String photo; 
	private int gamesPlayed; 
	private int gamesWon;
        private  Color chipColor;
	
	public User(){
		name = "Sin nombre";
		photo = "";
		gamesPlayed = 0;
		gamesWon = 0;
                chipColor = Color.BLACK;
	}
        
        	public User(String nombre){
		name = nombre;
		photo = "";
		gamesPlayed = 0;
		gamesWon = 0;
                chipColor = Color.BLACK;
	}
        
        public User(String nameParam, Color playerColor, String strPhoto){
		name = nameParam;
		gamesPlayed = 0;
		gamesWon = 0;
                photo= strPhoto;
                chipColor=playerColor;
                
	}

	
	public String getName(){
		return name;
	}
	
	public String getPhoto(){
		return photo;
	}
        
        public Color getChipColor(){
		return chipColor;
	}
	
	public void setChipColor(Color chip){
		chipColor= chip;
	}
	
	public int getGamesPlayed(){
		return gamesPlayed;
	}
	
	public int getGamesWon(){
		return gamesWon;
	}
	
	public void setName (String newName){
		name = newName;
	}
	
	public void setPhoto (String newPhoto){
		photo = newPhoto;	
	}


    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }


    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }
	
	
}
