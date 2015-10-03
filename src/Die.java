
import java.security.SecureRandom;



public class Die {

	// PRIVATE INSTANCE VARIABLES +++++++++++++++++++++++++++++++++++++
	final SecureRandom randomObjects = new SecureRandom();
	 private int _dice =randomObjects.nextInt(6);
	 private int _number;
		private int _result;
		private int _game;
	 SecureRandom generateRandom = new SecureRandom();
	 
	 //PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++++++++++
	    
	    public int GetNumber(){
	    	return this._number;
	    }
	    public void SetNumber(int number){
	    	this._number = number;
	    }
	    
	    public int GetDice(){
	    	return this._dice;
	    }
	    public void SetDice(int dice){
	    	this._dice = dice;
	    }
	    public int GetResult(){
	    	return this._result;
	    }
	    public void SetResult(int result){
	    	this._result = result;
	    }
	    
	    public int GetGame(){
	    	return this._game;
	    }
	    public void SetGame(int game){
	    	this._game = game;
	    }
	
	 // CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++
	 public Die() {
			SetDice(_dice);
		}
		
		//PUBLIC METHODS ++++++++++++++++++++++++++++++++++++
		// diceGame Method
		public int diceValue(int dice1, int dice2) {
		
		this.SetResult(dice1+dice2);
		System.out.printf("First dice is %d and second dice is %d. Then total is %d.\n",dice1,dice2,dice1+dice2);
		if(this.GetResult() == this.GetNumber()){
			System.out.println();
			System.out.println("Congradulations! You won.");
			this.SetGame(1);
			}
		else{
			this.SetGame(0);
		}
		return this._game ;
			}

			
			
	
		
		}

