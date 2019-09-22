public class TesteExceptions{
    public static void main(String args[]){
		try{
	       int x = Integer.parseInt(args[0]);
           int y = Integer.parseInt(args[1]);
           int res = x / y;
           System.out.println("Resultado: "+res);
        }
		catch(ArrayIndexOutOfBoundsException | NumberFormatException ex){
            System.err.println("Favor informar 2 valores inteiros"); 
        }
		/*
        catch(NumberFormatException ex){
            System.err.println("Favor, informar 2 valores inteiros");
        }
		*/
        catch(ArithmeticException ex){
            System.err.println("Erro de divisao por zero ");
        } 
		catch(Exception ex){
		    System.err.println("Deu ruim");	
	    }
		finally{
			System.out.println("Chegou no finally, da para fazer alguma coisa ");
		}
    }
}