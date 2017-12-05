package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import entity.Aluno;
import implement.AlunoDAOImp;

public class TelaSistema {

	private JFrame frame;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtNota01;
	private JTextField txtNota02;
	private JTextField txtBuscarAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSistema window = new TelaSistema();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaSistema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane);
		
		JPanel aba_cadastrar = new JPanel();
		tabbedPane.addTab("Cadastrar", null, aba_cadastrar, null);
		aba_cadastrar.setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(120, 90, 99, 14);
		aba_cadastrar.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(333, 84, 188, 20);
		aba_cadastrar.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(120, 121, 99, 14);
		aba_cadastrar.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(333, 115, 188, 20);
		aba_cadastrar.add(txtNome);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(333, 146, 188, 20);
		aba_cadastrar.add(txtEmail);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(120, 152, 99, 14);
		aba_cadastrar.add(lblEmail);
		
		JLabel lblNota01 = new JLabel("Primeira Nota");
		lblNota01.setBounds(120, 183, 99, 14);
		aba_cadastrar.add(lblNota01);
		
		txtNota01 = new JTextField();
		txtNota01.setColumns(10);
		txtNota01.setBounds(333, 177, 188, 20);
		aba_cadastrar.add(txtNota01);
		
		JLabel lblNota02 = new JLabel("Segunda Nota");
		lblNota02.setBounds(120, 214, 99, 14);
		aba_cadastrar.add(lblNota02);
		
		JLabel logoSenac = new JLabel();
		logoSenac.setIcon(new ImageIcon(getClass().getResource("/image/logo_senac.png")));
		logoSenac.setBounds(10, 273, 349, 85);
		logoSenac.setVisible(true);
		aba_cadastrar.add(logoSenac);
		
		txtNota02 = new JTextField();
		txtNota02.setColumns(10);
		txtNota02.setBounds(333, 208, 188, 20);
		aba_cadastrar.add(txtNota02);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Aluno aluno = new Aluno();
				
				/** LEMBRANDO!!! TUDO QUE VEM DE FORM É TEXTO **/
				aluno.setMatricula(Integer.parseInt(txtMatricula.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setEmail(txtEmail.getText());
				aluno.setNota01(Double.parseDouble(txtNota01.getText()));
				aluno.setNota02(Double.parseDouble(txtNota02.getText()));
				
				/* Gravando no banco */
				if(new AlunoDAOImp().salvar(aluno)) {
					JOptionPane.showMessageDialog(aba_cadastrar, 
							"Dados gravados com sucesso!", "Cadastro de Aluno", 
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(aba_cadastrar, 
							"Falha ao gravar", "Cadastro de Aluno", 
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnCadastrar.setBounds(422, 239, 99, 23);
		aba_cadastrar.add(btnCadastrar);
		
		JLabel lblCadastroDeAlunos = new JLabel("Cadastro de Alunos");
		lblCadastroDeAlunos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblCadastroDeAlunos.setBounds(227, 27, 174, 31);
		aba_cadastrar.add(lblCadastroDeAlunos);
		
		JPanel aba_buscar = new JPanel();
		tabbedPane.addTab("Buscar", null, aba_buscar, null);
		aba_buscar.setLayout(null);
		
		JLabel lblLocalizarAluno = new JLabel("Localizar Aluno");
		lblLocalizarAluno.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblLocalizarAluno.setBounds(244, 11, 141, 14);
		aba_buscar.add(lblLocalizarAluno);
		
		JLabel lblMatricula_1 = new JLabel("Matricula");
		lblMatricula_1.setBounds(165, 96, 46, 14);
		aba_buscar.add(lblMatricula_1);
		
		txtBuscarAluno = new JTextField();
		txtBuscarAluno.setBounds(376, 93, 86, 20);
		aba_buscar.add(txtBuscarAluno);
		txtBuscarAluno.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(270, 198, 89, 23);
		aba_buscar.add(btnBuscar);
		
		JPanel aba_editar = new JPanel();
		tabbedPane.addTab("Editar", null, aba_editar, null);
		
		JPanel aba_listar = new JPanel();
		tabbedPane.addTab("Listar", null, aba_listar, null);
		
		
	}
}
