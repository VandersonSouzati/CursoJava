import java.io.File; 
import java.io.FileReader; 
import java.io.BufferedReader;
import java.io.IOException; 

public class LeitorArquivo{
   public static void main(String[] args){
      try{
	     File tmpArquivo = new File("arquivo.txt"); 
		 FileReader fr = new FileReader(tmpArquivo);
		 BufferedReader bf = new BufferedReader(fr);
		 String linha = null;
		 while( (linha = bf.readLine()) != null){
			 System.out.println(linha);
		 }
		 fr.close(); 
		 bf.close();
	  }
	  catch(IOException ex){
	     System.err.println("Erro de IO: "+ex.getMessage());
	  }
   }
}