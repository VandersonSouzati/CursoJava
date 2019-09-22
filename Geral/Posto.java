public class Posto {
   public static void main(String args[]){
      BombaCombustivel b1 = new BombaCombustivel("Gasolina", 3.99f);
	  BombaCombustivel b2 = new BombaCombustivel("Etanol", 2.99f);
	  b1.puxarGancho();
	  b1.abastecerPorValor(50);
	  b1.voltarGancho();
	  
	  b2.puxarGancho();
	  b2.abastecerPorLitros(10);
	  b2.voltarGancho();
   }
}