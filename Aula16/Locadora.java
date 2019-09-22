public class Locadora{
   public static void main(String args[]){
      Veiculo estoque[];
	  estoque = new Veiculo[5];
	  estoque[0] = new Carro("Fiesta", "ERA-5235", 80.00f); 
	  estoque[1] = new Moto("CB-300", "FTA-5623", 50.00f, 5);
	  estoque[2] = new Quadriciclo("Modelo 1", "fgt-0909", 100.00f, 10);
	  estoque[3] = new Carro("Honda Civic", "FTR-0303", 250.00f);
	  estoque[4] = new Moto("Kavasak", "FGT-5959", 150.00f, 10);
	  
	  for(Veiculo v: estoque){
		  System.out.println("Veiculo v= "+v.getModelo()+" Aluguel = R$ "+v.calcularAluguel(7));
	  }
	  
   }
}