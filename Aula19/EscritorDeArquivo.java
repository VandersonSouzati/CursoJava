import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class EscritorDeArquivo{
   public static void main(String[] args){
      try{
	      File fs = new File("arquivo.txt");
		  FileWriter fileWriter = new FileWriter(fs);
		  Scanner teclado = new Scanner(System.in);
		  String texto = null;
		  do{ 
		      System.out.print("Digite um texto (FIM para sair): ");
			  texto = teclado.nextLine();
			  if(!texto.equals("FIM")){
				 fileWriter.write(texto+"\n");
			 }
		  }while(!texto.equals("FIM"));
		  
		  fileWriter.close();
	  }
	  catch(IOException ex){
	    System.out.println("Erro ao manipular arquivo com o escritor de arquivo");
	  }
   }
}