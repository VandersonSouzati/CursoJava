
import java.io.FileReader; 
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class TreinoArquivo {
  
   public static void leitor(String path) throws IOException{
	   
	 FileReader fileReader = new FileReader(path);
	 BufferedReader bufferedReader = new BufferedReader(fileReader);
	 
	 String linha=null ;
	
	 while(true){
	   if(linha != null){
	      System.out.println("Linha lida: "+linha);
	   }else 
	    break;
	    linha = bufferedReader.readLine();
	 }
	  bufferedReader.close();
   }
  
  
   public static String escritor() throws IOException{
     
	  String path = "d://cursos//arquivoQualquer.txt";
	  
      FileWriter fileWriter = new FileWriter(path);
	  BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	  Scanner teclado = new Scanner(System.in);
	  System.out.println("Digite o conteudo do arquivo");
	  String conteudo = teclado.nextLine();
	  fileWriter.append(conteudo+"\n");
	  bufferedWriter.close();
      return path;
   }
   
   public static void main(String args[]){
	   try{
          String caminhoArquivo = escritor();
          System.out.println("Lendo o arquivo");
		  leitor(caminhoArquivo);
	   }catch(IOException erro) {System.out.println("Deu ruim: "+erro.getMessage());}
   }
}