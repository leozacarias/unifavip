package com.wolneyhqf.dp.strategy.entidades;

import com.wolneyhqf.dp.strategy.comportamentos.Ataque;
import com.wolneyhqf.dp.strategy.comportamentos.Corrida;
import com.wolneyhqf.dp.strategy.comportamentos.Defesa;

public abstract class Personagem {
	
	private String nome;
	protected Ataque ataque;
	protected Defesa defesa;
	protected Corrida corrida;
	
	public void andar() {
		System.out.println("Personagem andando.");
	}
	
	public void correr() {
		corrida.correr();
	}
	
	public void atacar() {
		ataque.atacar();
	}
	
	public void defender() {
		defesa.defender();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAtaque(Ataque ataque) {
		this.ataque = ataque;
	}

	public void setDefesa(Defesa defesa) {
		this.defesa = defesa;
	}

	public void setCorrida(Corrida corrida) {
		this.corrida = corrida;
	}
	

}

