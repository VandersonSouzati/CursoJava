import java.io.*; 
public class TesteExceptionArquivo {
   public static void main(String args[]) throws IOException{
      BufferedReader bf = null;
	  try{
	     bf = new BufferedReader(new FileReader("arquivo.txt"));
		 String linha =null;
		 while((linha = bf.readLine()) !=null){
		    System.out.println(linha);
		 }
	  }catch(IOException ex) {System.out.println("Erro "+ex.getMessage());}
	  finally{
		 System.out.println("Fechando o bf");
	     bf.close();
	  }
   }
}