import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaSenha extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private int senhaAtual = 0;
	private JLabel lbNome;
	private JLabel lbSenha;
	private JButton btAtualizarSenha;

	public TelaSenha() {
		this.setTitle("Tela Senha");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(650, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		this.lbNome = new JLabel("Tela Senha");
		this.lbNome.setFont(new Font("Serif", Font.BOLD, 32));
		this.lbNome.setBounds(20, 20, 400, 40);
		this.add(lbNome);
		
		this.btAtualizarSenha = new JButton("Atualizar Senha");
		this.btAtualizarSenha.setBounds(20, 85, 200, 25);
		btAtualizarSenha.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				atualizarSenha();
			}
		});
		this.add(btAtualizarSenha);

		this.lbSenha = new JLabel("Senha Atual: " + senhaAtual);
		this.lbSenha.setFont(new Font("Serif", Font.BOLD, 60));
		this.lbSenha.setBounds(20, 150, 500, 100);
		this.add(lbSenha);

	}
	
	public void atualizarSenha() {
		senhaAtual++;
		lbSenha.setText("Senha Atual: " + senhaAtual);
	}

}
