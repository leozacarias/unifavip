import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaSenha extends JFrame implements Subject {

	private static final long serialVersionUID = 1L;

	private List<Observer> observers = new ArrayList<>();

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

	public int getSenhaAtual() {
		return senhaAtual;
	}

	public void atualizarSenha() {
		senhaAtual++;
		lbSenha.setText("Senha Atual: " + senhaAtual);
		notificar();
	}

	@Override
	public void registrarObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removerObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notificar() {
		for (Observer observer : observers) {
			observer.atualizar(this);
		}
	}

}
