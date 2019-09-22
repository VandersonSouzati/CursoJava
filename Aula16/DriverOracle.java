public class DriverOracle implements InterfaceDB{
	
   public void conectar(String servidor){
      System.out.println("ORACLE > Conneting: "+servidor);
   }
   public void executar(String SQL){
      System.out.println("ORACLE > "+SQL);
   }
}