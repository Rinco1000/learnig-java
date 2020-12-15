package oo;

public class Main extends TesteAbstract {
  
	public static void main (String[] args) {
		/*
		Player player = new Player();
		player.startPlayer();
		Enemy enemy = new Enemy();
		enemy.startEnemy();
		Player player2 = new Player();
		player2.startPlayer();
		*/
	    //new Main().instanceMain2();
	}
	    public void TesteAbstract() {
	    	StartGame();
	    	
	    	
	    }
	
	    public void instanceMain2() {
	    	new Main2().print1();
	    } 
	    
	    private class Main2{
	    	public void print1() {
	    		System.out.println("Calling my method");
	    	}
	    }
	
	
	
}
