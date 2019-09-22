import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;
public class TesteExceptionArquivo2{
   public static void main(String[] args){

	  try(BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));){
	      String linha = null;
		  while((linha = br.readLine()) != null){
		      System.out.println(linha);
		  }
	  }catch(IOException ex){System.out.println("Erro "+ex.getMessage());}
   }
}