package com.wolneyhqf.dp.strategy.entidades;

import com.wolneyhqf.dp.strategy.comportamentos.Morder;
import com.wolneyhqf.dp.strategy.comportamentos.NaoCorre;
import com.wolneyhqf.dp.strategy.comportamentos.NaoDefende;

public class Zumbi extends Personagem {

	public Zumbi() {
		ataque = new Morder();
		defesa = new NaoDefende();
		corrida = new NaoCorre();
	}

}
