package br.com.DnSystem.View;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.JToolBar.Separator;

public class VHome extends JFrame{
	
	JToolBar barra 		   				= new JToolBar();
	JButton  Jcadastros    				= new JButton ();
	JButton  JFinanceiro   				= new JButton ();
	JButton  Jcompras	   				= new JButton ();
	JButton  Jestoque	   				= new JButton ();
	JButton  Jvendas	   				= new JButton ();
		
	JLabel vendas 						= new JLabel("Modulo de Vendas");
	JLabel compras 						= new JLabel("Modulo de Compras");
	JLabel financeiro 					= new JLabel("Modulo Financeiro");
	JLabel estoque 						= new JLabel("Modulo de Estoque");

	JMenuBar menuvendas    				= new JMenuBar();
	JMenuBar menuestoque   				= new JMenuBar();
	JMenuBar menucompras   				= new JMenuBar();
	JMenuBar menufinaneceio				= new JMenuBar();	
	
	JMenu 	 vProcessos	   	  			= new JMenu("Processos");
	JMenu 	 vRelatorios	   	  		= new JMenu("Relatorios");
	JMenu 	 vConsultas	   	  			= new JMenu("Consultas");
	JMenu 	 vParametrizacoes  			= new JMenu("Parametrizações");
	
	JMenuItem vPedido					= new JMenuItem("Pedido");
	JMenuItem vAprovacao				= new JMenuItem("Aprovacao");
	JSeparator vsepara					= new JSeparator();
 	JMenuItem vConferencia				= new JMenuItem("Conferencia");
	JMenuItem vFaturamento				= new JMenuItem("Faturamento");
	JMenuItem vNota						= new JMenuItem("Nota Fiscal");
	JMenuItem vCliente					= new JMenuItem("Cadastro de Clientes");
	JMenuItem vUsuario					= new JMenuItem("cadastro de Usuarios");
	
	JMenu 	 cProcessos	   	  			= new JMenu("Processos");
	JMenu 	 cRelatorios	   	  		= new JMenu("Relatorios");
	JMenu 	 cConsultas	   	  			= new JMenu("Consultas");
	JMenu 	 cParametrizacoes  			= new JMenu("Parametrizações");

	JMenuItem cPedido					= new JMenuItem("Pedido e Sugestao de Compra");
	JMenuItem cAprovacao				= new JMenuItem("Aprovacao");
	JSeparator csepara					= new JSeparator();
 	JMenuItem cRecepcao					= new JMenuItem("Recepçao de Nota");
	JMenuItem cAjuste					= new JMenuItem("Ajuste de Estoque");
	JMenuItem cPreco					= new JMenuItem("Ajuste de Preços");
	JMenuItem cFornecedor				= new JMenuItem("Cadastro de Fornecedor");
	JMenuItem cTransportadora			= new JMenuItem("Cadastro de Transportadora");
	
	JMenu 	 eProcessos	   	  			= new JMenu("Processos");
	JMenu 	 eRelatorios	   	  		= new JMenu("Relatorios");
	JMenu 	 eConsultas	   	  			= new JMenu("Consultas");
	JMenu 	 eParametrizações  			= new JMenu("Parametrizações");
	
	JMenuItem eBalanco					= new JMenuItem("Balanço / Produtos");
	JMenuItem eOutrasSaidas				= new JMenuItem("Saidas Avulsas ");
	JSeparator esepara					= new JSeparator();
	JMenuItem eAjuste					= new JMenuItem("Ajuste de Estoque");
	JMenuItem ePreco					= new JMenuItem("Ajuste de Preços");
	JMenuItem eProdutos					= new JMenuItem("Cadastro de Produtos");

	JMenu 	 fProcessos	   	  			= new JMenu("Processos");
	JMenu 	 fRelatorios	   	  		= new JMenu("Relatorios");
	JMenu 	 fConsultas	   	  			= new JMenu("Consultas");
	JMenu 	 fParametrizações  			= new JMenu("Parametrizações");
	
	JMenuItem fDuplicatas				= new JMenuItem("Controle de Duplicatas");
	JMenuItem fRecebePagar				= new JMenuItem("Recebimento e Pagamento");
	JSeparator fsepara					= new JSeparator();
 	JMenuItem fImpressao				= new JMenuItem("Impressao de Duplicatas");
	JMenuItem fBaixa					= new JMenuItem("Baixa e Cancelamento");
	int fonte = 15;
	
	
	public VHome() {
		// TODO Auto-generated constructor stub
		super("Tela Inicial");
		this.setLayout(null);
		
		menuvendas.setVisible(false);
		menuestoque.setVisible(false);				
		menucompras.setVisible(false);
		menufinaneceio.setVisible(false);	
		
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension dw = getSize(); 
        barra.setSize((ds.width - dw.width),50);
        menuvendas.setLocation(0, 60);
        menuvendas.setSize((ds.width - dw.width),20);
        menuestoque.setLocation(0, 60);
        menuestoque.setSize((ds.width - dw.width),20);
        menucompras.setLocation(0, 60);
        menucompras.setSize((ds.width - dw.width),20);
        menufinaneceio.setLocation(0, 60);
        menufinaneceio.setSize((ds.width - dw.width),20);
        

		ImageIcon liv = new ImageIcon(getClass().getResource("../img/livros.png"));
		liv.setImage(liv.getImage().getScaledInstance(50, 35,35));
		Jcadastros = new JButton(liv);
		Jcadastros.setToolTipText("Menu de Cadastros");
		Jcadastros.setBorder(null);
		Jcadastros.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VGerencia vgerencia = new VGerencia();
			}
		});
				
		ImageIcon fin = new ImageIcon(getClass().getResource("../img/dinheiro.png"));
		fin.setImage(fin.getImage().getScaledInstance(50, 35,35));
		JFinanceiro = new JButton(fin);
		JFinanceiro.setToolTipText("Modulo Financeiro");
		JFinanceiro.setBorder(null);
		JFinanceiro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				financeiro.setBounds(1200, 95, 135, 14);
				financeiro.setFont(new Font("Arial", Font.BOLD, fonte));
				financeiro.setVisible(true);
				compras.setVisible(false);
				vendas.setVisible(false);
				estoque.setVisible(false);
				
				menuvendas.setVisible(false);
				menuestoque.setVisible(false);
				menufinaneceio.setVisible(true);
				menucompras.setVisible(false);
				
			}
		});
		
		ImageIcon com = new ImageIcon(getClass().getResource("../img/compras.png"));
		com.setImage(com.getImage().getScaledInstance(50, 35,35));
		Jcompras = new JButton(com);
		Jcompras.setToolTipText("Modulo Compras");
		Jcompras.setBorder(null);
		Jcompras.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				compras.setBounds(1200, 95, 145, 14);
				compras.setFont(new Font("Arial", Font.BOLD, fonte));
				financeiro.setVisible(false);
				compras.setVisible(true);
				vendas.setVisible(false);
				estoque.setVisible(false);
				
				menuvendas.setVisible(false);
				menuestoque.setVisible(false);
				menufinaneceio.setVisible(false);
				menucompras.setVisible(true);
					
			}
		});
		
		ImageIcon est = new ImageIcon(getClass().getResource("../img/estoque.png"));
		est.setImage(est.getImage().getScaledInstance(50, 35,35));
		Jestoque = new JButton(est);
		Jestoque.setToolTipText("Modulo de Estoque");
		Jestoque.setBorder(null);
		Jestoque.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				estoque.setBounds(1200, 95, 140, 14);
				estoque.setFont(new Font("Arial", Font.BOLD, fonte));
				financeiro.setVisible(false);
				compras.setVisible(false);
				vendas.setVisible(false);
				estoque.setVisible(true);
				
				menuestoque.setVisible(true);
				menufinaneceio.setVisible(false);
				menuvendas.setVisible(false);
				menucompras.setVisible(false);
				
			}
		});
		
		ImageIcon ven = new ImageIcon(getClass().getResource("../img/venda.png"));
		ven.setImage(ven.getImage().getScaledInstance(50, 35,35));
		Jvendas = new JButton(ven);
		Jvendas.setToolTipText("Modulo de Vendas");
		Jvendas.setBorder(null);
		Jvendas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				vendas.setBounds(1200, 95, 135, 14);
				vendas.setFont(new Font("Arial", Font.BOLD, fonte));
				financeiro.setVisible(false);
				compras.setVisible(false);
				vendas.setVisible(true);
				estoque.setVisible(false);
				
				menuvendas.setVisible(true);
				menucompras.setVisible(false);
				menuestoque.setVisible(false);
				menufinaneceio.setVisible(false);
				
			}
		});

		ImageIcon venda = new ImageIcon(getClass().getResource("../img/home.png"));
		venda.setImage(venda.getImage().getScaledInstance(1000, 800,500));
		JLabel vend = new JLabel(venda);
		vend.setSize( 900, 750);
		vend.setLocation(650, 120);
	//	vend.setBorder(BorderFactory.createLineBorder(Color.black));
		
		fDuplicatas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VFinanceiro vfinanceiro = new VFinanceiro();
				
			}
		});
		
		vUsuario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VUsuario vusuario = new VUsuario();
				
			}
		});
		vCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VCliente vcliente = new VCliente();
				
			}
		});

		barra.add(Jcadastros);
		barra.add(JFinanceiro);
		barra.add(Jcompras);
		barra.add(Jestoque);
		barra.add(Jvendas);
		
		menuvendas.add(vProcessos);
		menuvendas.add(vRelatorios);
		menuvendas.add(vConsultas);
		menuvendas.add(vParametrizacoes);
		
		vProcessos.add(vPedido);
		vProcessos.add(vAprovacao);
		vProcessos.add(vsepara);
		vProcessos.add(vConferencia);
		vProcessos.add(vFaturamento);
		vProcessos.add(vNota);
		vProcessos.add(vCliente);
		vProcessos.add(vUsuario);

		menucompras.add(cProcessos);
		menucompras.add(cRelatorios);
		menucompras.add(cConsultas);
		menucompras.add(cParametrizacoes);

		cProcessos.add(cPedido);
		cProcessos.add(cAprovacao);
		cProcessos.add(csepara);
		cProcessos.add(cAjuste);
		cProcessos.add(cPreco);
		cProcessos.add(cFornecedor);
		cProcessos.add(cTransportadora);
		
		menuestoque.add(eProcessos);
		menuestoque.add(eRelatorios);
		menuestoque.add(eConsultas);
		menuestoque.add(eParametrizações);
		
		eProcessos.add(eBalanco);
		eProcessos.add(eOutrasSaidas);
		eProcessos.add(esepara);
		eProcessos.add(eAjuste);
		eProcessos.add(ePreco);
		eProcessos.add(eProdutos);

		menufinaneceio.add(fProcessos);
		menufinaneceio.add(fRelatorios);
		menufinaneceio.add(fConsultas);
		menufinaneceio.add(fParametrizações);

		fProcessos.add(fDuplicatas);
		fProcessos.add(fRecebePagar);
		fProcessos.add(fsepara);
		fProcessos.add(fImpressao);
		fProcessos.add(fBaixa);

		this.add(menuvendas);
		this.add(menucompras);
		this.add(menuestoque);
		this.add(menufinaneceio);
		
		this.add(vendas);
		this.add(compras);
		this.add(financeiro);
		this.add(estoque);
		this.add(barra);
		this.add(vend);
		
	
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();  
		this.setBackground(Color.white);
		
		setVisible(true);
		setSize(tela);
		setResizable(false);
		setLocationRelativeTo(null); 		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}
}
