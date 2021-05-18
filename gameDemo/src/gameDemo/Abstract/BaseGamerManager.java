package gameDemo.Abstract;

import gameDemo.Entities.Gamer;

public  class BaseGamerManager implements GamerServices{

	@Override
	public void addGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstNameString() + " " + gamer.getLastNameString() + " adl� oyuncu sisteme eklendi.");
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstNameString() + " " + gamer.getLastNameString() + " adl� oyuncunun bilgileri g�ncellendi.");
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstNameString() + " " + gamer.getLastNameString() + " adl� oyuncu sistemden silindi.");
		
	}

}
