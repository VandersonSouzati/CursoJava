import java.util.Scanner;

public class Prova {
   public static void main(String[] args){
       QuestaoSimples questao[];
	   questao = new QuestaoSimples[5];
	   Scanner teclado; 
	   teclado = new Scanner(System.in);
	   
	   questao[0] = new QuestaoSimples("Quem descobriu o Brasil", "PA Cabral"); 
	   questao[1] = new QuestaoComDica("Qual a linuagem usada no curso", "Java", 
	                                    "Inicia com Ja e termina com va"); 
	   questao[2] = new QuestaoME("Qual a cor do cavalo branco de Napoleao", "a",
	                                    "Branco","Marron", "Preto", "Pardo");
	   questao[3] = new QuestaoSimples("Qual a formula da agua", "H2O");
	   questao[4] = new QuestaoComDica("Quem é o presidente do Brasil", "Bolsonaro", "é chamado de Mito");
	   
	   int pontuacao=0;
	   
	   System.out.println("*********Prova************");
	   for(int c=0; c<questao.length; c++){
		   String resposta;
		   System.out.println(questao[c].aplicarQuestao());
		   resposta = teclado.nextLine();
		   if(questao[c].corrigir(resposta)){
			   System.out.println("Acertou ");
			   pontuacao +=2;
		   }else{
			   System.out.println("Errou ");
		   }
	   }
	   System.out.println("Sua pontuacao foi de: "+pontuacao);
   }
}