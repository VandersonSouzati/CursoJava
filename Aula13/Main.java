public class Main {
	public static void main(String args[]){
	   String s1 = new String("String 1");
	   String s2 = new String("String 1");


	   if(s1 == s2){
	      System.out.println("Iguais  -- com o operador ==");
	   }else {
	      System.out.println("Diferentes -- com o operador ==");
	   }

	   if(s1.equals(s2)){
	   	  System.out.println("Iguais -- com equals");
	   }else {	
          System.out.println("Diferentes -- com equals");
	   }
	}
}