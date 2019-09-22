public class AppHeranca{
  public static void main(String[] args){
     Pessoa p = new Pessoa("Vanderson", "vanderson@teste");

	 Funcionario f = new Funcionario("Vanderson", "vanderson@teste.com", 6000); 

	 System.out.println("Mostrar info"); 
	 System.out.println("Pessoa: "+p.getNome() + " -- "+p.getEmail());
     System.out.println("Funcionario: "+f.getNome()+ " -- "+f.getEmail()+ " -- "+f.getSalario());
	 
  }
}