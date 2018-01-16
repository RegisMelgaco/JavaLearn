package br.com.empresa.banco.Erros;

public class ValorInvalidoException extends RuntimeException{

	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}

}
