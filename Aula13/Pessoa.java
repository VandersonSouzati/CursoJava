public class Pessoa{
	private int id; 
	private String nome; 
	private String email; 

	public Pessoa(int id, String nome, String email){
	   this.id = id; 
	   this.nome = nome; 
	   this.email = email;
	}

	public int getId(){
	   return this.id;
	}
	public void setId(int id){
	   this.id = id;
	}
	public String getNome(){
	   return this.nome;
	}
	public void setNome(String nome){
	   this.nome = nome;
	}
	public String getEmail(){
	   return this.email;
	}
	public void setEmail(String email){
	   this.email = email;
	}

    //Reescrita do método equals que foi herdada da class Object
    public boolean equals(Object object){
    	if(object instanceof Pessoa){
             Pessoa p = (Pessoa)object;
             return this.id == p.id && this.nome.equals(p.nome) && this.email.equals(p.email);
    	}
    	return false;
    }
}


