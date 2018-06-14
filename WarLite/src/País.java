import java.util.ArrayList;
import java.util.List;

public class Pa�s {
	
	private int exercito;
	private int pID;
	private int id;
	private String nome;
	private int Level;
	List <Pa�s> vizinhos = new ArrayList<Pa�s>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Adiciona n soldados ao exercito de um pa�s
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
	
	public void levelUp() {
		
		this.setLevel(this.getLevel() + 1);
	}
	
	public Pa�s (int id, String nome) {
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
	
	//Mostra todos os vizinhos de um pa�s
	public void print_Vizinhos() {
		int i = 0;
		
		while (this.vizinhos.size() > i) {
			System.out.println(i + 1 + ". " + this.vizinhos.get(i).nome + " " + "N�vel: "  + this.vizinhos.get(i).Level + " " + "Soldados: "  + this.vizinhos.get(i).exercito + " Jogador: " + this.vizinhos.get(i).pID);
			i++;
		}
	}
	
	public void atacar(Pa�s p) {

		Batalha b = new Batalha();	
		b.luta(this, p);
	}
}
