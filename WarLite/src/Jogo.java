import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo {
	List <Jogador> jogadores = new ArrayList<Jogador>();
	Tabuleiro tab;
	
	/**
	 * Inicia n jogadores
	 * @param n número de jogadores a serem iniciados
	 */
	public void inicia_Jogadores(int n) {
		int id = 0;

		Jogador j;
		String nome;
		Scanner reader = new Scanner(System.in);
		
		
		
		while(id < n) {
			System.out.println("Jogador " + (id+1) + " digite seu nome: ");
			nome =(reader.next());
			j = new Jogador(id, nome, tab);
			jogadores.add(j);
			id ++;
		}
		reader.close();
	}
	
	/**
	 * Sorteia os países aleatoriamente para os jogadores
	 * @param n Numero de jogadores no sorteio de países
	 */
	public void sort_Paises(int n) {
		int i = 0;
		while (tab.paises.size() > i) {
			
			tab.paises.get(i).setpID((int) Math.floor((Math.random() * n) + 1));
			i++;
		}
	}	
	/**
	 * Funcão que inicia todo o jogo 
	 */
	public Jogo() {
		
		int n = 0;
		
		tab = new Tabuleiro();
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Digite o número de jogadores: ");
		
		n = reader.nextInt();
		//Usa o numero digitado para iniciar o numero correto de jogadores
		inicia_Jogadores(n);
		reader.close();
		
		sort_Paises(jogadores.size());
		jogadores.get(0).print_Paises();
		
		
		
	}
	
}
