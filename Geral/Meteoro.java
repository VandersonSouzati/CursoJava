import java.util.Scanner;
public class Meteoro{
  public static void main(String args[]){
    int x1, x2, y1, y2; //Coordenadas do retangulo
	int x, y; //Coordenadas do meteorito
	int contador;
	int n, teste;

    contador = 0;
    teste    = 0;

    do{
	  Scanner teclado = new Scanner(System.in);
      n = 0;
	  x1 = teclado.nextInt();
 	  y1 = teclado.nextInt();
 	  x2 = teclado.nextInt();
	  y2 = teclado.nextInt();
	  
	  
	if( ( x1 + x2 + y1 + y2 ) > 0 ){ 
	  
	  n = teclado.nextInt();
      System.out.println("Leu o \"n\" com o valor: "+n);
	  
	  for(int i=0; i<n; i++){
		x = teclado.nextInt();
	    y = teclado.nextInt();
	    if(x >= x1 && x <= x2 && y >= y2 && y <= y1){
		  contador++;
	    }
      }
	} 
	}while( (x1 + x2 + y1 + y2) >  0);
	
	System.out.println("Total de "+contador + " Meteoritos na fazenda");
  }
}