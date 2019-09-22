public class AppDB{
  public static void main(String args[]){
     InterfaceDB interdb;
	 
	 if(args[0].equals("mysql")){
		 interdb = new DriverMySQL();
	 }else{
		 interdb = new DriverOracle();
	 }
	 interdb.conectar("localhost"); 
	 interdb.executar("Select * From Tabela");
	 
  }
}