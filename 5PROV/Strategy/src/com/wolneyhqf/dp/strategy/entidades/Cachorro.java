package com.wolneyhqf.dp.strategy.entidades;

import com.wolneyhqf.dp.strategy.comportamentos.CorridaA15KmH;
import com.wolneyhqf.dp.strategy.comportamentos.Fugir;
import com.wolneyhqf.dp.strategy.comportamentos.Morder;

public class Cachorro extends Personagem {

	public Cachorro() {
		ataque = new Morder();
		defesa = new Fugir();
		corrida = new CorridaA15KmH();
	}

}
