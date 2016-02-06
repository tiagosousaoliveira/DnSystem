package br.com.DnSystem.View;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class VCliente extends JFrame {
	
	JMenuBar menu 		   					= new JMenuBar();
	JPanel	 Local1							= new JPanel(); 
	JPanel	 Local2							= new JPanel(); 
	JPanel	 Local3							= new JPanel(); 
	JPanel	 Local4							= new JPanel(); 
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	public VCliente() {
		// TODO Auto-generated constructor stub
	super("Tela de Cliente");
	getContentPane().setLayout(null);
	
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();  
    Dimension w = getSize(); 
    menu.setLocation(0, 2);
    menu.setSize((d.width - w.width),20);
	
 
	//COntainer Inicial
//===================================================================================================================================================================================
    
    Local1.setLayout(null);
    Local1.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
    Local1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro Cliente"));
    Local1.setSize(901,61);
    Local1.setLocation(57,94);
	
	textField = new JTextField();
	textField.setBounds(122, 30, 451, 20);
	textField.setColumns(10);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setBounds(666, 30, 126, 20);
	JLabel lblNome = new JLabel("Nome");
	lblNome.setBounds(48, 33, 46, 14);
	JLabel lblTipo = new JLabel("Tipo");
	lblTipo.setBounds(628, 33, 46, 14);

	Local1.add(textField);
	Local1.add(comboBox);
	Local1.add(lblNome);
	Local1.add(lblTipo);

	//Container Secundario
//====================================================================================================================================================================================
	
    Local2.setLayout(null);
    Local2.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
    Local2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa Juridica"));
    Local2.setSize(901,126);
    Local2.setLocation(57,157);
	textField_1 = new JTextField();
	textField_1.setBounds(123, 26, 453, 20);
	textField_1.setColumns(10);
	textField_2 = new JTextField();
	textField_2.setBounds(123, 57, 180, 20);
	textField_2.setColumns(10);
	textField_3 = new JTextField();
	textField_3.setBounds(123, 86, 180, 20);
	textField_3.setColumns(10);
	
	JCheckBox chckbxIsento = new JCheckBox("Isento");
	chckbxIsento.setBounds(328, 85, 97, 23);
	JLabel lblRazaoSoxial = new JLabel("Razao Social");
	lblRazaoSoxial.setBounds(42, 29, 76, 14);	
	JLabel lblCnpj = new JLabel("CNPJ");
	lblCnpj.setBounds(72, 60, 36, 14);
	JLabel lblIe = new JLabel("IE");
	lblIe.setBounds(84, 89, 29, 14);
	
	Local2.add(textField_2);
	Local2.add(textField_1);
	Local2.add(textField_3);
	Local2.add(chckbxIsento);
	Local2.add(lblRazaoSoxial);
	Local2.add(lblCnpj);
	Local2.add(lblIe);

	
	//COntainer Seguinte
//===================================================================================================================================================================================
	
    Local3.setLayout(null);
    Local3.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
    Local3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
    Local3.setSize(901,138);
    Local3.setLocation(57,284);
    
	textField_4 = new JTextField();
	textField_4.setBounds(122, 21, 181, 20);
	textField_4.setColumns(10);
	
	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setBounds(122, 57, 181, 20);
	JComboBox comboBox_2 = new JComboBox();
	comboBox_2.setBounds(393, 57, 181, 20);
	JComboBox comboBox_3 = new JComboBox();
	comboBox_3.setBounds(122, 89, 181, 20);
	JComboBox comboBox_4 = new JComboBox();
	comboBox_4.setBounds(393, 89, 181, 20);
	JLabel lblCep = new JLabel("CEP");
	lblCep.setBounds(66, 24, 46, 14);
	JLabel lblEstado = new JLabel("Estado");
	lblEstado.setBounds(66, 60, 46, 14);
	JLabel lblCidade = new JLabel("Cidade");
	lblCidade.setBounds(315, 60, 46, 14);
	JLabel lblBairro = new JLabel("Bairro");
	lblBairro.setBounds(66, 92, 46, 14);
	JLabel lblLogradouro = new JLabel("Logradouro");
	lblLogradouro.setBounds(315, 92, 68, 14);
	JComboBox comboBox_5 = new JComboBox();
	comboBox_5.setBounds(122, 57, 183, 20);
	JComboBox comboBox_6 = new JComboBox();
	comboBox_6.setBounds(393, 57, 183, 20);
	
	Local3.add(comboBox_6);
	Local3.add(comboBox_5);
	Local3.add(comboBox_4);
	Local3.add(lblCep);
	Local3.add(lblCep);
	Local3.add(lblEstado);
	Local3.add(lblCidade);
	Local3.add(comboBox_3);
	Local3.add(lblBairro);
	Local3.add(lblLogradouro);
	Local3.add(textField_4);
	
	//Ultimo Container
//===================================================================================================================================================================================
	
    Local4.setLayout(null);
    Local4.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
    Local4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Adicionais"));
    Local4.setSize(901,126);
    Local4.setLocation(57,424);
    
	

	textField_7 = new JTextField();
	textField_7.setBounds(119, 21, 461, 20);
	textField_7.setColumns(10);
	
	JLabel lblEmail = new JLabel("Email");
	lblEmail.setBounds(61, 24, 46, 14);
	
	Local4.add(textField_7);
	Local4.add(lblEmail);
	
	
	
	//COntainer Padrão
//===================================================================================================================================================================================
    textField_5 = new JTextField();
    textField_5.setBounds(57, 63, 86, 20);
    textField_5.setColumns(10);
    
    textField_6 = new JTextField();
    textField_6.setBounds(872, 63, 86, 20);
    textField_6.setColumns(10);
    
    JLabel lblCodigo = new JLabel("Codigo");
    lblCodigo.setBounds(58, 48, 46, 14);
    JLabel lblDataCadastro = new JLabel("Data Cadastro");
    lblDataCadastro.setBounds(872, 48, 86, 14);
    JButton btnNewButton = new JButton("Gravar");
    btnNewButton.setBounds(869, 561, 89, 23);
    JButton btnNewButton_1 = new JButton("Cancelar");
    btnNewButton_1.setBounds(748, 561, 89, 23);
    
    
    
    add(textField_6);
    add(lblCodigo);
    add(lblDataCadastro);
    add(btnNewButton);
    add(btnNewButton_1);
    add(textField_5);
	add(Local1);
	add(Local2);
	add(Local3);
	add(Local4);
    add(menu);
    

	
    Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();  
    Dimension dw = getSize(); 
    this.setSize(1024,620);
    
	setVisible(true);
	setResizable(false);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
