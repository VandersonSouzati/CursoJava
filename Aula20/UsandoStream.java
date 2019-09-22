import java.util.List;
import java.util.Arrays; 
public class UsandoStream{
   public static void main(String args[]){
      List<Integer> list; 
	  list = Arrays.asList(1,2,3,4,5,5,2,1,9,10,5,80,230,365,20,2,1,10);
	  
	  list.stream()
	      .filter(numero -> numero > 0)
		  //.distinct()
		  .forEach( u -> verificaNumero(u));
   }
   
   public static void verificaNumero(Integer numero){
	   if(numero%2==0){
		   System.out.println(numero +" --> Numero par");
	   }else{
		   System.out.println(numero +" --> Numero Impar");
	   }
   }
}