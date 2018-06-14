import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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


	//Procura territorios que foram sorteados para o jogador e os adiciona ao arrayList
	public void addPaises(Tabuleiro tab) {
		int i = 0;
		while(tab.paises.size() > i) {
			if(tab.paises.get(i).getpID() == this.getpID()) {
				paises.add(tab.paises.get(i));
				i++;
			}
		}
	}
	
	//Mostra os paises que o jogador controla
	public void print_Paises() {
		int i = 0;
		while(paises.size() > i) {
			if(paises.get(i).getpID() == 0) {
				System.out.println(i + 1 + ". " + paises.get(i).getNome() + " " + "Nível: "  + paises.get(i).getLevel() + " " + "Soldados: "  + paises.get(i).getExercito() + " Jogador: " + paises.get(i).getpID());
				i++;
			}
		}
	}
	public Jogador(int id, String nome, Tabuleiro tab) {
		
		this.setpID(id);
		this.setNome(nome);
		this.addPaises(tab);
		//this.print_Paises();
	}
	
}
