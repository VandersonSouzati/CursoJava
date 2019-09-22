public class AppCliente {
  public static void main(String args[]){
     Cliente[] clientesLista = new Cliente[5];
	 clientesLista[0] = new Cliente("Vanderson", "vanderson@gmail.com", 300); 
	 clientesLista[1] = new ClienteVIP("Vanessa", "vanessa@hotmail.com", 200, 500);
	 clientesLista[2] = new Cliente("Beatriz", "beatriz@filha.com", 500); 
	 clientesLista[3] = new Cliente("Gustavo", "gustavo@gmail.com", 600); 
	 clientesLista[4] = new ClienteVIP("Vanderson", "vanderson@vip.com", 800, 1200);
	 
	 for(Cliente cliente: clientesLista){
		 System.out.println(cliente);
	 }
  }
}