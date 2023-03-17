package br.com.poo.image;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Padaria extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoProduto;
	private JTextField txtCodigoBarras;
	private JTextField txtDescricao;
	private JTextField txtValorUnitario;
	private JTextField txtQuantidade;
	private JTextField txtTotalItem;
	private JTextField txtSubtotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Padaria frame = new Padaria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Padaria() {
		
		String[][] produtos = {
				
				{"2023","Pão Francês","13.00","17032023"},
				{"2024","Pão de Leite","15.00","14032024"},
				{"2025","Torta de Frango","50.00","17032025"},
				{"2026","Leite Integral A","5.00","17032026"},
				{"2027","Manteiga","5.00","17032027"},
				{"2028","Bolo", "20.00","17032028"},
				{"2029","Bauru","12.00","17032029"},
				{"2030","Fanta Uva","14.00","17032030"}
				
				
				
		};
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlEsquerdo = new JPanel();
		pnlEsquerdo.setBackground(SystemColor.activeCaption);
		pnlEsquerdo.setBounds(0, 0, 800, 700);
		contentPane.add(pnlEsquerdo);
		pnlEsquerdo.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(0, 0, 800, 300);
		
		/*
		 * Para ajudar a iamgem ao tamanho da Label, foi necessário aplicar o comando
		 * nem ImageIcon para definir a scala no elemento getImage.
		 * o tamanho da imagem foi de ajustado para largura da label(lbl.getWidth) e altura da
		 * label (lbl.getHeight) e para finalizar, foi alterado a forma de fechamento da
		 * imagem quando a tela fecha, foi setado o valor para suavização(image.SCALE_SMOOTH)
		 * 
		 * */
		
		
		lblLogo.setIcon(new ImageIcon(new ImageIcon(Padaria.class.getResource("/br/com/poo/image/Padaria2.jpg")).getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
		
		pnlEsquerdo.add(lblLogo);
		
		JLabel lblCodigoProduto = new JLabel("Código do Produto:");
		lblCodigoProduto.setFont(new Font("Arial", Font.ITALIC, 20));
		lblCodigoProduto.setBounds(10, 311, 186, 33);
		pnlEsquerdo.add(lblCodigoProduto);
		
		JLabel lblCodigoBarras = new JLabel("Código de Barras:");
		lblCodigoBarras.setFont(new Font("Arial", Font.ITALIC, 20));
		lblCodigoBarras.setBounds(432, 311, 186, 33);
		pnlEsquerdo.add(lblCodigoBarras);
		
		txtCodigoProduto = new JTextField();
		txtCodigoProduto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				for(int linha = 0 ; linha <produtos.length ; linha++){
					for(int coluna = 0 ; coluna < produtos[0].length; coluna++) {
						if(txtCodigoProduto.getText().equals(produtos[linha][0])) {
							txtCodigoBarras.setText(produtos[linha][3]);
							txtDescricao.setText(produtos[linha][1]);
							txtValorUnitario.setText(produtos[linha][2]);
							break;
							
						}
					}
					
				}
				
			
				
				
			}
			
		});
		txtCodigoProduto.setFont(new Font("Arial", Font.ITALIC, 20));
		txtCodigoProduto.setForeground(SystemColor.window);
		txtCodigoProduto.setBackground(SystemColor.activeCaption);
		txtCodigoProduto.setBounds(10, 343, 214, 30);
		pnlEsquerdo.add(txtCodigoProduto);
		txtCodigoProduto.setColumns(10);
		
		txtCodigoBarras = new JTextField();
		txtCodigoBarras.setForeground(Color.WHITE);
		txtCodigoBarras.setFont(new Font("Arial", Font.ITALIC, 20));
		txtCodigoBarras.setColumns(10);
		txtCodigoBarras.setBackground(SystemColor.activeCaption);
		txtCodigoBarras.setBounds(432, 343, 214, 30);
		pnlEsquerdo.add(txtCodigoBarras);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 384, 780, 2);
		pnlEsquerdo.add(separator);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setFont(new Font("Arial", Font.ITALIC, 20));
		lblDescricao.setBounds(10, 397, 186, 33);
		pnlEsquerdo.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setForeground(Color.WHITE);
		txtDescricao.setFont(new Font("Arial", Font.ITALIC, 20));
		txtDescricao.setColumns(10);
		txtDescricao.setBackground(SystemColor.activeCaption);
		txtDescricao.setBounds(10, 429, 780, 30);
		pnlEsquerdo.add(txtDescricao);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 469, 780, 2);
		pnlEsquerdo.add(separator_1);
		
		JLabel lblValorUnitario = new JLabel("Valor Unitario");
		lblValorUnitario.setFont(new Font("Arial", Font.ITALIC, 20));
		lblValorUnitario.setBounds(10, 472, 186, 33);
		pnlEsquerdo.add(lblValorUnitario);
		
		txtValorUnitario = new JTextField();
		txtValorUnitario.setForeground(Color.WHITE);
		txtValorUnitario.setFont(new Font("Arial", Font.ITALIC, 20));
		txtValorUnitario.setColumns(10);
		txtValorUnitario.setBackground(SystemColor.activeCaption);
		txtValorUnitario.setBounds(10, 504, 214, 30);
		pnlEsquerdo.add(txtValorUnitario);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Arial", Font.ITALIC, 20));
		lblQuantidade.setBounds(267, 470, 186, 33);
		pnlEsquerdo.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setForeground(Color.WHITE);
		txtQuantidade.setFont(new Font("Arial", Font.ITALIC, 20));
		txtQuantidade.setColumns(10);
		txtQuantidade.setBackground(SystemColor.activeCaption);
		txtQuantidade.setBounds(267, 502, 214, 30);
		pnlEsquerdo.add(txtQuantidade);
		
		JLabel lblTotalItem = new JLabel("Total Item");
		lblTotalItem.setFont(new Font("Arial", Font.ITALIC, 20));
		lblTotalItem.setBounds(523, 470, 186, 33);
		pnlEsquerdo.add(lblTotalItem);
		
		txtTotalItem = new JTextField();
		txtTotalItem.setForeground(Color.WHITE);
		txtTotalItem.setFont(new Font("Arial", Font.ITALIC, 20));
		txtTotalItem.setColumns(10);
		txtTotalItem.setBackground(SystemColor.activeCaption);
		txtTotalItem.setBounds(523, 502, 214, 30);
		pnlEsquerdo.add(txtTotalItem);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 542, 780, 2);
		pnlEsquerdo.add(separator_1_1);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setFont(new Font("Arial", Font.ITALIC, 25));
		lblSubtotal.setBounds(10, 562, 186, 33);
		pnlEsquerdo.add(lblSubtotal);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setForeground(Color.WHITE);
		txtSubtotal.setFont(new Font("Arial", Font.BOLD, 35));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBackground(SystemColor.activeCaption);
		txtSubtotal.setBounds(183, 562, 270, 89);
		pnlEsquerdo.add(txtSubtotal);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBackground(SystemColor.activeCaption);
		btnIncluir.setIcon(new ImageIcon(Padaria.class.getResource("/br/com/poo/image/Icone.png")));
		btnIncluir.setFont(new Font("Arial", Font.BOLD, 30));
		btnIncluir.setBounds(481, 566, 243, 80);
		pnlEsquerdo.add(btnIncluir);
		
		JPanel pnlDireito = new JPanel();
		pnlDireito.setBackground(SystemColor.activeCaptionBorder);
		pnlDireito.setBounds(810, 0, 774, 700);
		contentPane.add(pnlDireito);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.scrollbar);
		panel.setBounds(0, 710, 1584, 150);
		contentPane.add(panel);
	}
}
