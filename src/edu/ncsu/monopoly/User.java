package edu.ncsu.monopoly;

public class User {
	private String name; 
	private String photo; 
	private int gamesPlayed; 
	private int gamesWon;
	
	public User(){
		name = "Sin nombre";
		photo = "Sin foto";
		gamesPlayed = 0;
		gamesWon = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPhoto(){
		return photo;
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
	
	
}
