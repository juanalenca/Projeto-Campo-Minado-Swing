package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.modelo.Tabuleiro;

public class Temp {
	
	public static void main(String[] args) {
		
		Tabuleiro tab = new Tabuleiro(3, 3, 9);
		
		tab.registrarObservador(e -> {
			if(e.isGanhou()) {
				System.out.println("MISSION PASSED\n+ RESPECT");
			} else {
				System.out.println("WASTED");
				
			}
		});
		
		tab.alternarMarcacao(0, 0);
		tab.alternarMarcacao(0, 1);
		tab.alternarMarcacao(0, 2);
		tab.alternarMarcacao(1, 0);
		tab.alternarMarcacao(1, 1);
		tab.alternarMarcacao(1, 2);
		tab.alternarMarcacao(2, 0);
		tab.alternarMarcacao(2, 1);
		tab.abrir(2, 2);
		//tab.alternarMarcacao(2, 2);
		
	}

}
