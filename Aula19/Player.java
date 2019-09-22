public class Player{
   private int id; 
   private String nome; 
   private float score;
   
   public Player(int id, String nome, float score){
      this.id= id;
	  this.nome = nome; 
	  this.score = score;
   }
   public int getId(){
      return this.id;
   }
   public String getNome(){
      return this.nome;
   }
   public float getScore(){
      return this.score;
   }
   public void setId(int id){
      this.id = id;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   public void setScore(float score){
      this.score = score;
   }
   public String toString(){
      return this.id+";"+this.nome+";"+this.score;
   }
   public String showInfo(){
      return "Player ( "+this.id+", "+this.nome+", "+this.score+ ")";	   
   }
}