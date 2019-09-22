import java.io.File; 
import java.io.FileReader; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.util.ArrayList; 
public class LeitorArquivoComObjeto{
   public static void main(String[] args){
      try{
	     File tmpArquivo = new File("arquivoComObjeto.txt"); 
		 FileReader fr = new FileReader(tmpArquivo); 
		 BufferedReader bf = new BufferedReader(fr); 
		 ArrayList<Player> listPlayres = new ArrayList<Player>();
		 Player p; 
		 String linha = null;
		 while((linha = bf.readLine())!= null){
			 String[] listDados = linha.split(";");
			 for(int c=0; c<listDados; c++){
				p = new Player(Integer.parseInt(listDados[0]),listDados[1],Float.parseFloat(listDados[2]));
				
			 }
		 }
	  }
	  catch(IOException ex){
	     System.err.println("Erro de IO: "+ex.getMessage());
	  }
   }
}