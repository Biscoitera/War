
public class Dado {
	int max;
	
	/**
	 * Rola um dado com um bonus x adicionado ao resultado final
	 * @param x Bonus no valor do dado
	 * @return Retorna o valor rolado + x
	 */
	public int roll(int x) {
		
		return (int) Math.floor((Math.random() * this.max) + 1) + x;
		
	}
	
	
	public int getMax() {
		return max;
	}


	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * Cria um novo dado com um valor máximo max.
	 * @param max Valor máximo que o dado encontra sem bônus
	 */
	public Dado(int max) {
		
		this.setMax(max);
		
	}
	
}
