public class QuestaoComDica extends QuestaoSimples{
   private String dica;
   public QuestaoComDica(String pergunta, String resposta, String dica){
      super(pergunta, resposta);
	  this.dica = dica;
   }
   
   public String aplicarQuestao(){
      return super.aplicarQuestao() + "\n"+ dica;  
   }
   
}