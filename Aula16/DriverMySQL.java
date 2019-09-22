public class DriverMySQL implements InterfaceDB{
	
    public void conectar(String servidor){
	   System.out.println("MySQL > Connecting on "+servidor);
	}
	public void executar(String SQL){
	   System.out.println("MySQL > "+SQL);
	}
}