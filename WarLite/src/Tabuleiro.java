import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tabuleiro {
	List <Pa�s> paises = new ArrayList<Pa�s>();
	
	
//Coloca todos os pa�ses do arquivo no tabuleiro	
public void inicia_Paises() {
	File f1 = new File("src/Input.txt");
	String linha = ""; 
	int ID = 0;
	
	String nome = "";
	Scanner s;
	Pa�s p;
	try
	{
		FileReader fr = new FileReader(f1);			
		BufferedReader br = new BufferedReader(fr);
		linha = br.readLine();
		
		while(linha != null) {
			s = new Scanner(linha);	
			
			boolean b;
			while (b = s.hasNext())	
			{
				if (s.hasNextInt())  
				{
					ID = s.nextInt();
					
				}else				
				{
					nome = s.next();
					
				}
			}
			while (b = s.hasNext())	
			{
				if (s.hasNextInt())   
				{
					ID = s.nextInt();
					//System.out.print(ID + " ");
				}
			}
			//System.out.println(" ");
			
			//cria new Pa�s com ID e nome 
			p = new Pa�s(ID, nome);
			paises.add(p);
			//proxima linha
			linha = br.readLine();
		}
		
		//System.out.println(paises.get(2).getNome());
		 
	}catch(IOException e){}
}
//Adiciona os vizinhos de cada pa�s em seu array de vizinho
public void set_Vizinhos() {
	File f1 = new File("src/Vizinhos.txt");
	String linha = ""; 
	int ID = 0;
	int vID = 0;
	Scanner s;
	try
	{
		FileReader fr = new FileReader(f1);			
		BufferedReader br = new BufferedReader(fr);
		linha = br.readLine();
		
		while(linha != null) {
			s = new Scanner(linha);	
			//Pra cada linha:
			
			//System.out.println(linha);
			boolean b;
			ID = s.nextInt();
			//System.out.print(ID +". ");
			
			while (b = s.hasNext())	
			{
				if (s.hasNextInt())  
				{
					vID = s.nextInt();
					//System.out.print(vID + " ");
					paises.get(ID-1).vizinhos.add(paises.get(vID - 1));
				}
			}
			
			
			//System.out.println("");
			linha = br.readLine();
			}

	}catch(IOException e){}
}
//Mostra todos os pa�ses do tabuleiro
public void print_Paises() {
	int i = 0;
	while(paises.size() > i) {
		if(paises.get(i).getpID() == 0) {
			System.out.println(i + 1 + ". " + paises.get(i).getNome() + " " + "N�vel: "  + paises.get(i).getLevel() + " " + "Soldados: "  + paises.get(i).getExercito() + " Jogador: " + paises.get(i).getpID());
			i++;
		}
	}
}
 public Tabuleiro(){
		
		this.inicia_Paises();
		this.set_Vizinhos();
		}			
	}