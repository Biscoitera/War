import java.util.ArrayList;
import java.util.List;

public class País {
	
	private int exercito;
	private int pID;
	private int id;
	private String nome;
	private int Level;
	List <País> vizinhos = new ArrayList<País>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Adiciona n soldados ao exercito de um país
	 * @param n Numero de soldados adicionados
	 */
	public void add_Exercito(int n) {
		this.setExercito(this.getExercito() + n);
	}
	
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	/**
	 * Incrementa o nível do país
	 */
	public void levelUp() {
		
		this.setLevel(this.getLevel() + 1);
	}
	/**
	 * Cria um novo país com id e nome
	 * @param id id do novo país
	 * @param nome Nome do novo país
	 */
	public País (int id, String nome) {
		this.exercito = 1;
		//pID =
		this.Level = 0;
		this.id = id;
		this.nome = nome;
		
	}
	public int getExercito() {
		return exercito;
	}
	public void setExercito(int exercito) {

		this.exercito = exercito;
	}
	
	/**
	 * Mostra todos os vizinhos de um país
	 */
	public void print_Vizinhos() {
		int i = 0;
		
		while (this.vizinhos.size() > i) {
			System.out.println(i + 1 + ". " + this.vizinhos.get(i).nome + " " + "Nível: "  + this.vizinhos.get(i).Level + " " + "Soldados: "  + this.vizinhos.get(i).exercito + " Jogador: " + this.vizinhos.get(i).pID);
			i++;
		}
	}
	/**
	 * Cria uma batalha com o país p como alvo
	 * @param p País alvo do ataque
	 */
	public void atacar(País p) {

		Batalha b = new Batalha();	
		b.luta(this, p);
	}
}
