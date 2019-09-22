public class Moto extends Veiculo{
  private float fatorDesconto;
  
  public Moto(String modelo, String placa, float valorDiaria, float fatorDesconto){
      super(modelo, placa, valorDiaria);
	  this.fatorDesconto = fatorDesconto;
  }
  
  public float calcularAluguel(int qtdeDias){
     return (qtdeDias * super.getValorDiaria()) - ( (qtdeDias * super.getValorDiaria() * fatorDesconto)/100 );
  }
  
}