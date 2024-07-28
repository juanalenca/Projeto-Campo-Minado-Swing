package br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.cod3r.cm.modelo.Tabuleiro;

/*O JPanel é como um agrupador/container que agrupa 
outros componentes dentro dele. E nele iremos colocar 
todos os elementos que repesentam as linhas e colunas*/
@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(
				tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(campo -> add(new BotaoCampo(campo)));
		
		tabuleiro.registrarObservador(evento -> {
			
			SwingUtilities.invokeLater(() -> {
				
				if(evento.isGanhou()) {
					JOptionPane.showMessageDialog(this, "MISSION PASSED\n+ RESPECT");
				} else {
					JOptionPane.showMessageDialog(this, "WASTED");
				}
				
				tabuleiro.reiniciar();
				
			});
			
		});
		
	}

}
