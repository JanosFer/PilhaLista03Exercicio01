package view;

import br.com.jonas.estruturas.PilhaInt;

public class Principal {

	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		
		int[] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		int tamanho = vetor.length - 1;
		
		for(int i = 0; i < tamanho; i++) {
			if(vetor[i] >= 0) {
				p.push(vetor[i]);
			}else {
				int soma = 0;
				
				try {
					soma = p.pop();
					soma += p.pop();
				}catch (Exception e){
					System.err.println(e.getMessage());
				}
				
				p.push(vetor[i]);
				p.push(soma);
			}
		}
		
		tamanho = p.size();
		System.out.println(tamanho);
	}

}
