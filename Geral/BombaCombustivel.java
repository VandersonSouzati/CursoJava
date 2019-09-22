public class BombaCombustivel{
   private String  combustivel;
   private float   precoLitro;
   private float   qtdLitro;
   private float   valorTotal; 
   private boolean emAbastecimento;
   
   public BombaCombustivel(String combustivel, float preco){
      this.combustivel     = combustivel;
	  this.precoLitro      = preco;
	  this.qtdLitro        = 0f;
	  this.valorTotal      = 0f; 
	  this.emAbastecimento = false;
   }
   
   public void puxarGancho(){
      emAbastecimento = true; 
	  System.out.println("Bomba pronta para abastecer");
   }

   public void abastecerPorValor(float valor){
       if(emAbastecimento){
	      this.qtdLitro = (valor / this.precoLitro);
		  this.valorTotal = valor;
	   }else {
	      System.out.println("Por favor tirar o gancho antes ");
	   }
   }
   public void abastecerPorLitros(float litros){
        if(emAbastecimento){
		    this.valorTotal = litros * this.precoLitro;
			this.qtdLitro = litros;
		}else{
		   System.out.println("Favor tirar o gancho da bomba ");
		}
   }
   
   public void voltarGancho(){
      emAbastecimento = false; 
	  System.out.println("+-----------------------------------+");
	  System.out.println("|         Posto do Vanderson        |");
	  System.out.println("+-----------------------------------+");
	  System.out.println("| Combustivel: " +this.combustivel);
	  System.out.println("| Preço Litro: " +this.precoLitro);
	  System.out.println("| Total Litros: "+this.qtdLitro);
	  System.out.println("| Valor Total: " +this.valorTotal);
	  System.out.println("|+----------------------------------|");
	  System.out.println("| Obrigado e Volte sempre :)        |");
	  System.out.println("+-----------------------------------|");
	  System.out.println();
	  System.out.println();
	  
   }
 
/*
         BombaCombustivel
	- combustivel:     String
    - precoLitro:      float
    - qtdLitro:        float
    - valorTotal:      float  
    - emAbastecimento: boolean	
	<<constructro>> BombaCombustivel(combustivel: String, preco: float)
	+ abastecePorLitro(qtdLitro: float)
	+ abastecePorValor(valor: float)
	+ retiraDoGancho()
	+ colocaNoGancho()
*/
}

