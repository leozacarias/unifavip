package com.wolneyhqf.dp.strategy.entidades;

import com.wolneyhqf.dp.strategy.comportamentos.AtaqueComPexeira;
import com.wolneyhqf.dp.strategy.comportamentos.CorridaA15KmH;
import com.wolneyhqf.dp.strategy.comportamentos.Fugir;

public class Humano extends Personagem {

	public Humano() {
		ataque = new AtaqueComPexeira();
		defesa = new Fugir();
		corrida = new CorridaA15KmH();
	}

}

