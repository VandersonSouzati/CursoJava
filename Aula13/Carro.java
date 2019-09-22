public class Carro{
    private int id;
	private String marca; 
	private String modelo; 
	
	public Carro(int id, String marca, String modelo){
	    this.id = id;
        this.marca = marca;
        this.modelo = modelo;
	}
	public int getId(){
	   return this.id;
	}
	public void setId(int id){
       this.id = id;
	}
	public String getMarca(){
	   return this.marca;
	}
	public void setMarca(String marca){
	   this.marca = marca;
	}
	public String getModelo(){
	   return this.modelo;
	}
	public void setModelo(String modelo){
	   this.modelo = modelo;
	}

	//Reescrita do método finalize(), usado pelo Garbage collector
	public void finalize(){
	   System.out.println("Garbage Collector --> "+this.id);
	}
}