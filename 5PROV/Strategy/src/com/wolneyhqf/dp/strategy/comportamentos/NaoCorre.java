package com.wolneyhqf.dp.strategy.comportamentos;

public class NaoCorre implements Corrida {

	@Override
	public void correr() {
		System.out.println("Não consegue correr.");
	}

}
