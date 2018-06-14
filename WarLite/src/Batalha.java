



public class Batalha {
	private Dado dado = new Dado(6);
	
	
	/**
	 * Gera uma batalha entre país x e o país y onde x é o país atacante e y o defensor. Os dois países jogam um dado, se o valor da defesa for igual ou maior que o atacante a defesa vence e o atacante não consegue conquistar o novo territorio.
	 * @param x
	 * @param y
	 * @return
	 */
	public int luta(País x, País y) {
		
		
		int a = dado.roll(x.getLevel());
		int d = dado.roll(y.getLevel());
		
		System.out.println("Ataque:" + a + " Defesa: " + d);
		if(a > d) {
			System.out.println("Ataque vence");
			x.setExercito(x.getExercito() + 1);
			y.setExercito(y.getExercito() - 1);
			
			if(y.getExercito() == 0) {
				
				x.setExercito(x.getExercito() - 1);
				y.setExercito(1);
				y.setpID(x.getpID());
				
				if(y.getLevel() > 0) {
					y.setLevel(y.getLevel() - 1);
				}
			}
			return 0;
		}
		else {	
			System.out.println("Defesa Vence");
			
			y.setExercito(y.getExercito() + 1);
			return 1;
		}		   
	
	}
	
}