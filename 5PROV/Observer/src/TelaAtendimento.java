import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaAtendimento extends JFrame implements Observer {

	private static final long serialVersionUID = 1L;
	
	private int senhaAtual = 0;
	private JLabel lbNome;
	private JLabel lbSenha;

	public TelaAtendimento() {
		this.setTitle("Tela Atendimento");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(650, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		this.lbNome = new JLabel("Tela Atendimento");
		this.lbNome.setFont(new Font("Serif", Font.BOLD, 32));
		this.lbNome.setBounds(20, 20, 400, 40);
		this.add(lbNome);
		

		this.lbSenha = new JLabel("Senha Atual: " + senhaAtual);
		this.lbSenha.setFont(new Font("Serif", Font.BOLD, 60));
		this.lbSenha.setBounds(20, 150, 500, 100);
		this.lbSenha.setForeground(Color.green);
		this.add(lbSenha);

	}

	@Override
	public void atualizar(Subject subject) {
		if(subject instanceof TelaSenha) {
			TelaSenha telaSenha = (TelaSenha) subject;
			this.senhaAtual = telaSenha.getSenhaAtual();
			this.lbSenha.setText("Senha Atual: " + this.senhaAtual);
		}
	}

}
