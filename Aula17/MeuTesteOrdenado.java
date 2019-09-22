import java.util.ArrayList;
import java.util.Collections;

public class MeuTesteOrdenado {
	public static void main(String args[]){
	  
      ArrayList<Player> listPlayers = new ArrayList<Player>();
	  listPlayers.add(new Player(1, "player001", 100f));
	  listPlayers.add(new Player(2, "player005", 50.50f));
	  listPlayers.add(new Player(3, "jog1010", 150f));
	  listPlayers.add(new Player(4, "playplay", 500f));
	  listPlayers.add(new Player(5, "playpa" , 500f));
	  
	  Collections.sort(listPlayers);
	  for(Player play: listPlayers){
		  System.out.println(play);
	  }

  	  /*ArrayList<String> listaNomes = new ArrayList<String>();
       listaNomes.add("Vanessa"); 
       listaNomes.add("Beatriz");
       listaNomes.add("Vanderson"); 
       listaNomes.add("Isadora");
       listaNomes.add("Artur");
       
       Collections.sort(listaNomes);
	   
       System.out.println("\n********Imprimindo a lista**********");
       for(String nomes: listaNomes){
		   System.out.println(nomes);
	   }
      */	   
	}
}