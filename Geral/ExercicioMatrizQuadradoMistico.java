import java.util.Scanner;

public class ExercicioMatrizQuadradoMistico {
    public static void main(String args[]){
	   Scanner teclado = new Scanner(System.in);
	   int numeroElementos = teclado.nextInt();
	   int matriz[][] = new int[numeroElementos][numeroElementos];
	   
	   for(int linha =0; linha< numeroElementos; linha++){
		   for(int coluna=0; coluna < numeroElementos; coluna++){
		        matriz[linha][coluna] = teclado.nextInt(); 	   
	       }
	   }
       	  
       int somaReferencia=0;
       for(int coluna=0; coluna<numeroElementos; coluna++){
            somaReferencia += matriz[0][coluna];
       } 
	   boolean quadradoMistico = true;
	   int somaLinha;
	   int somaColuna;
	   
	   for(int linha=1; linha < numeroElementos && quadradoMistico == true; linha++){
		     somaLinha = 0;     
			 for(int coluna = 0; coluna < numeroElementos; coluna++  ){
                  somaLinha += matriz[linha][coluna]; 
             }
             if(somaReferencia != somaLinha){
                  quadradoMistico = false;
             }			
	   }
	   
	   for(int coluna = 0; coluna < numeroElementos && quadradoMistico ==true; coluna++){
		   somaColuna = 0;
		   for(int linha =0; linha < numeroElementos; linha++ ){
			   somaColuna += matriz[linha][coluna];
		   }
		   if(somaReferencia != somaColuna){
			   quadradoMistico = false;  
		   }
	   }
      
      if(quadradoMistico){
           System.out.println("SIM");
      }else{
           System.out.println("NAO");
      }	  
}
}