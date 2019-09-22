public class AppPessoa{
	public static void main(String args[]){
	   Pessoa p1 = new Pessoa(1, "Vanderson", "Vanderson@email.com");
	   Pessoa p2 = new Pessoa(1, "Vanderson", "Vanderson@email.com");

	   if(p1 == p2){
           System.out.println("iguais -- com o operador \"==\" ");
	   }else {
	       System.out.println("diferente -- com o operador \"==\" ");
	   }

	   if(p1.equals(p2)){
	       System.out.println("iguais -- com o método equals");
	   }else {
	       System.out.println("diferente -- com o metodo equals");
	   }
	}
}