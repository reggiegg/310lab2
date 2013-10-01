package superFunGameMethod;

public abstract class AbstractGame {
	
	protected abstract void setupGame();
	protected abstract boolean playerOneTurn();
	protected abstract boolean playerTwoTurn();
	protected abstract void finishGame(int i);
	
	public final void playGame(){
		
		setupGame();
		int p = 0;
		while (true){
			if (playerOneTurn()){
				p = 1;
				break;
			};
			if (playerTwoTurn()){
				p = 2;
				break;
			};
		}
		finishGame(p);
	}
	
}
