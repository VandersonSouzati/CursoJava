public class MeuBussines{
	
   public static void metodoLancador(String str) throws Exception{
      if(str != null){
	     System.out.println("Teste "+str);
	  }else{
	     throw new Exception("Ixe deu ruim no método");
	  }
   }
   
   public static void outroMetodo(String str){
	  if(str != null){
		  System.out.println("Teste outro método "+str);
	  }else {
		  throw new RuntimeException("Ixe, deu ruim no outro metodo");
	  }
   }
   
}