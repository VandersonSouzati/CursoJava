import java.util.Scanner;

public class TesteMatriz{ 
  public static void main(String args[]){
      Scanner teclado = new Scanner(System.in);
      String matriz[][];
	  matriz = new String[3][3];
      for(int linha = 0; linha < 3; linha++){
           for(int coluna=0; coluna < 3; coluna++){
			   matriz[linha][coluna] = teclado.nextLine();   
		   }
      }
      
      System.out.println("Imprimindo a matriz......");
      for(int l=0; l<3; l++){
         for(int c=0; c< 3; c++){
		     System.out.printf("%7s", matriz[l][c]);
		 }
		 System.out.println("");
      }	  
  }
}