import java.util.Scanner;
public class ExercicioMatriz{
  public static void main(String[] args){
     Scanner teclado = new Scanner(System.in);
	 int  numeroLinha;
	 char operacao;
	 float resultado = 0;
	 float matriz[][]; 
	 int tamanho = 3;
	 
	 matriz = new float[tamanho][tamanho];
	 System.out.println("Informe a linha"); 
	 numeroLinha = Integer.parseInt(teclado.nextLine()); //teclado.nextInt();
	 
	 //teclado = new Scanner(System.in);
	 System.out.println("Entre com a operacao: M->Media e S->Soma");
	 
	 operacao = teclado.nextLine().charAt(0);
	 
	 for(int linha=0;linha<tamanho;linha++){
		 System.out.println("Digite os 3 valores da linha "+linha);
		 for(int coluna=0;coluna<tamanho;coluna++){
			matriz[linha][coluna] = teclado.nextFloat(); 
		 }
	 }
	 
	 for(int coluna=0;coluna<tamanho;coluna++){
	     resultado = resultado + matriz[numeroLinha][coluna];
		 if(operacao =='M' || operacao =='m'){
            resultado = (resultado/tamanho);
         } 
	 }
	 System.out.printf("%.2f", resultado);
	}
}