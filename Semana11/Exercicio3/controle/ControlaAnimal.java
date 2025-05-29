package controle;

import dominio.*;

public class ControlaAnimal
{
	public static void main(String[] args)
	{
        Cachorro cachorro = new Cachorro("Preta", 5);
        Gato gato = new Gato("Tica", 10);
		
		cachorro.emitirSom();
		gato.emitirSom();
	}
}
