public class MinhaAplicacao{
   public static void main(String[] args){
      MeuObjeto o = new MeuObjeto(); 
	  o.metodoDoObjeto(new MinhaInterface(){
	      public void metodoDaInterface(){
		     System.out.println("Metodo da interface");
		  }
	  });
      
	  o.metodoDoObjeto(()-> System.out.println("Metodo da interface com lambda"));
  }
}