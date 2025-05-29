package controle;

import dominio.*;

public class ControlaVeiculo
{
	public static void main(String[] args)
	{
		Carro carro = new Carro("Toyota","Corolla", 2004, 4);
		Moto moto = new Moto("Yamaha","XJ6 N", 2009, 600);
		
		System.out.println("Marca do carro: " + carro.getMarca() + "\nModelo do carro: " + carro.getModelo() + "\nAno do carro: " + carro.getAno() + "\nQuantidade de portas: " + carro.getQuantidadePortas());
		System.out.println("Marca da moto: " + moto.getMarca() + "\nModelo da moto: " + moto.getModelo() + "\nAno da moto: " + carro.getAno() + "\nCilindradas: " + moto.getCilindradas());
	}
}
