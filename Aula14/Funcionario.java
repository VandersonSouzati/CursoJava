public class Funcionario extends Pessoa{
   private double salario; 
   
   public Funcionario(String nome, String email, double salario){
	   super(nome, email); 
	   this.salario = salario;
   }
   
   public double getSalario(){
     return this.salario;
   }
   public void setSalario(double salario){
      this.salario = salario;
   }
   
   public String toString(){
	   return "Funcionario: "+super.nome+"("+super.email+")"+this.salario;  
   }
}