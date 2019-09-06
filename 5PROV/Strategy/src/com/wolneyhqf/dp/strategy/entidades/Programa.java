package com.wolneyhqf.dp.strategy.entidades;

import com.wolneyhqf.dp.strategy.comportamentos.Voadora;

public class Programa {
	
	public static void main(String[] args) {
		Humano humano = new Humano();
		
		humano.atacar();
		humano.defender();
		humano.correr();
		
		humano.setAtaque(new Voadora());
		
		humano.atacar();
	}

}
