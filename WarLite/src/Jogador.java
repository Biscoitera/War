import java.util.ArrayList;
import java.util.List;


public class Jogador {
	
	
	private Objetivo obj;
	private int pID;
	private String nome;
	public int nPaises;

	List <País> paises = new ArrayList<País>();
	
	public Objetivo getObj() {
		return obj;
	}
	public void setObj(Objetivo obj) {
		this.obj = obj;
	}
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * Procura territorios que foram sorteados para o jogador e os adiciona ao arrayList
	 * 
	 * @param tab Tabuleiro
	 */
	public void addPaises(Tabuleiro tab) {
		int i = 0;
		while(tab.paises.size() > i) {
			if(tab.paises.get(i).getpID() == this.getpID()) {
				paises.add(tab.paises.get(i));
				i++;
			}
		}
	}
	
	/**
	 * Mostra os paises que o jogador controla
	 */
	public void print_Paises() {
		int i = 0;
		while(paises.size() > i) {
			if(paises.get(i).getpID() == 0) {
				System.out.println(i + 1 + ". " + paises.get(i).getNome() + " " + "Nível: "  + paises.get(i).getLevel() + " " + "Soldados: "  + paises.get(i).getExercito() + " Jogador: " + paises.get(i).getpID());
				i++;
			}
		}
	}
	/**
	 * Cria um novo jogador com id, nome e referência ao tabuleiro
	 * @param id Id do jogador
	 * @param nome Nome do jogador
	 * @param tab Tabuleiro que está sendo usado para o jogo
	 */
	public Jogador(int id, String nome, Tabuleiro tab) {
		
		this.setpID(id);
		this.setNome(nome);
		this.addPaises(tab);
		//this.print_Paises();
	}
	
}
