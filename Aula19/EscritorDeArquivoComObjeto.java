import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritorDeArquivoComObjeto {
   public static void main(String args[]){
      int idInicial, idFinal;
	  try{
	     File tmpArquivo = new File("arquivoComObjeto.txt");
         FileWriter wrtArquivo = new FileWriter(tmpArquivo);
		 Scanner teclado = new Scanner(System.in);
         System.out.print("Digite o id inicial: "); 
         idInicial = teclado.nextInt();
         System.out.print("Digite o id final: ");
         idFinal = teclado.nextInt();
         Player p;
		 for(int tmp=idInicial; tmp <=idFinal; tmp++){
            p = new Player(tmp, "Player_"+tmp, tmp);
			wrtArquivo.write(p+"\n");
         }
         wrtArquivo.close();		 
	  }
	  catch(IOException ex){
	     System.err.println("Erro IOException "+ex.getMessage());
	  }
	  catch(Exception ex){
	     System.err.println("Erro Exception: "+ex.getMessage());   
	  }
   }
}