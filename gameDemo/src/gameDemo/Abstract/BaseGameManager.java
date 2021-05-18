package gameDemo.Abstract;

import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;

public  class BaseGameManager implements GameServices{

	@Override
	public void addGame(Game game, Gamer gamer) {
		
		System.out.println(game.getGameNameString() + " adl� oyunu " + gamer.getFirstNameString() + " " + gamer.getLastNameString() + " kullan�c� taraf�ndan sisteme eklendi ve oyun �creti: " + game.getGameUnitPrice() + " TL");
		
	}

}
