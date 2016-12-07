package runLengthEnconding;

public class CompactacaoRLE {

	public static void main(String[] args) {

		// Variavel ultilizadas.
		// Contador Branco.
		int B = 0;
		// Contador Preto .
		int P = 0;
		// Contador Linha.
		int cont = 0;

		// Matriz bidimensional iniciada com a imagem representada pelos bits 0
		// e 1.
		int imagem[][] = { 
				{ 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 0, 0 }, 
				{ 0, 1, 0, 0, 0, 0, 1, 0 },
				{ 1, 0, 1, 0, 0, 1, 0, 1 }, 
				{ 1, 0, 0, 0, 0, 0, 0, 1 },
				{ 0, 1, 0, 1, 1, 0, 1, 0 }, 
				{ 0, 1, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 1, 1, 1, 0, 0 } 
				};

		// Loop que percorre as linhas da matriz.
		for (int linha = 0; linha < imagem.length; linha++) {
			// Loop que percorre as colunas da matriz.
			for (int coluna = 0; coluna < imagem[linha].length; coluna++) { 	
				
				// Condição que verifica qual a linha que está sendo lida. 				
				if (linha == cont) { 					
					// Variavel ValorImagem recebe o valor armazenado na posição atual. 					
					int ValorImagem = imagem[linha][coluna];
					// Condição que verifica se o ValorImagem é igual a zero e 					
					// se o contador Preto é maior que zero. 					
					if ((ValorImagem == 0) && (P > 0)) {
						// Se a condição for Verdadeira Imprime o valor do
						// Contador Preto.
						System.out.print(P + "P");
						P = 0;// Zera o contador Preto.
						B++;// Incrementa o contador Branco.
					}
					// Condição que Verifica se o ValorImagem é igual a zero.
					else if (ValorImagem == 0) {
						// Se for verdadeira incrementa no contador Branco.
						B++;
					}
					// Condição que verifica se o valor da Imagem é igual a um e o contador Branco é mairo que zero.
					else if ((ValorImagem == 1) && (B > 0)) {
						// Se a condiçao for verdadeira, imprime o valor do contador Branco.
						System.out.print(B + "B");
						B = 0; // Zera contador Branco.
						P++; // Incrementa contador Preto.
					}
					// Condição que verifica se o ValorImagem é igual a um.
					else if (ValorImagem == 1) {
						// Se a condição for verdadeira incrementa o contador Preto.
						P++;
					}
					// Se a condição a cima for falsa. (Essa condição é execultada
					// quando a condição que verifica linha é falsa).
				} else {
					// Verifica se o contador Branco maior que zero.
					if (B > 0) {
						// Se a condição for verdadeira, Imprime valor contador Branco.
						System.out.print(B + "B");
						B = 0;// Zera contador Branco.
					
					// Verifica se o contador Preto maior que Zero.
					} else if (P > 0) {
						// Se a condição for verdadeira, imprime valor do contador Preto.
						System.out.print(P + "P");
						P = 0;// zera contador Preto.l
					}
					
					// Imprime Zero (indicador de separação de linhas).
					System.out.print("0");
					// Verifica se o valor da posição atual é iqual a zero.
					if (imagem[linha][coluna] == 0) {
						B++;// Incrementa contador Branco.
					} else {
						// Incrementa contador Preto.
						P++;
					}
					// Incrementa Contador Linha.
					cont++;
				}
			}
		}
		// Verifica se Contador Branco maior que zero
		if (B > 0) {
			// Imprime valor contador Branco.
			System.out.println(B + "B");	
		// Verifica se o contador Preto Maior que Zero.
		} else if (P > 0) {
			// Imprime valor contador Preto.
			System.out.println(P + "P");
		}
		
		// Imprime zero, zero (marcador de fim da imagem).
		System.out.println("00");

	}
}