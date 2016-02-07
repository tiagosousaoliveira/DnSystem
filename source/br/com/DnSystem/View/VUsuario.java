package br.com.DnSystem.View;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import br.com.DnSystem.Conexao.Conexao;
import br.com.DnSystem.Control.CUsuario;
import br.com.DnSystem.Funcoes.FCodigo;
import br.com.DnSystem.Funcoes.FData;
import br.com.DnSystem.Model.MUsuario;

public class VUsuario extends JFrame {
	
	protected static final String JOptiionPane = null;
	JMenuBar menu 		   					= new JMenuBar();
	JPanel	 Local1							= new JPanel(); 
	JPanel	 Local2							= new JPanel(); 
	JPanel	 Local3							= new JPanel(); 
	JPanel	 Local4							= new JPanel(); 
	
	Calendar data;
	public static int dia;
	public static int mes;
	public static int ano;
	private	      int sequencia;
	private	      int seqparamento;
	
	private JTextField Tnome;
	private JTextField TrazaoSocial;
	private JTextField TCpf;
	private JTextField TRg;
	private JTextField TCep;
	private JTextField Tcodigo;
	private JTextField Tdata;
	private JTextField Temail;
	private JTextField Tusuario;
	private JPasswordField Tsenha;
	
	public VUsuario() {
		// TODO Auto-generated constructor stub
	super("Tela de Usuario");
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
    Local1.setSize(901,67);
    Local1.setLocation(57,94);
	
	Tnome = new JTextField();
	Tnome.setBounds(122, 30, 451, 26);
	Tnome.setColumns(10);
	
	JComboBox ComboTipo = new JComboBox();
	ComboTipo.setBounds(666, 30, 126, 26);
	JLabel lblNome = new JLabel("Nome");
	lblNome.setBounds(48, 33, 46, 14);
	JLabel lblTipo = new JLabel("Tipo");
	lblTipo.setBounds(628, 33, 46, 14);

	Local1.add(Tnome);
	Local1.add(ComboTipo);
	Local1.add(lblNome);
	Local1.add(lblTipo);

	//Container Secundario
//====================================================================================================================================================================================
	
    Local2.setLayout(null);
    Local2.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
    Local2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoa Juridica"));
    Local2.setSize(901,120);
    Local2.setLocation(57,163);
    
    
	TrazaoSocial = new JTextField();
	TrazaoSocial.setBounds(123, 26, 453, 26);
	TrazaoSocial.setColumns(10);
	TCpf = new JTextField();
	TCpf.setBounds(123, 57, 180, 26);
	TCpf.setColumns(10);
	TRg = new JTextField();
	TRg.setBounds(123, 86, 180, 26);
	TRg.setColumns(10);
	
	JCheckBox chckbxIsento = new JCheckBox("Isento");
	chckbxIsento.setBounds(328, 85, 97, 23);
	JLabel lblRazaoSoxial = new JLabel("Razao Social");
	lblRazaoSoxial.setBounds(42, 29, 76, 14);	
	JLabel lblCnpj = new JLabel("CPF");
	lblCnpj.setBounds(84, 60, 28, 14);
	JLabel lblIe = new JLabel("  RG");
	lblIe.setBounds(84, 89, 24, 14);
	
	Local2.add(TCpf);
	Local2.add(TrazaoSocial);
	Local2.add(TRg);
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
    
    TCep = new JTextField();
    TCep.setBounds(122, 21, 181, 26);
    TCep.setColumns(10);
	
	JComboBox comboBox_1 = new JComboBox();
	comboBox_1.setBounds(122, 57, 181, 20);
	JComboBox comboBox_2 = new JComboBox();
	comboBox_2.setBounds(393, 57, 181, 20);
	JComboBox ComboBairro = new JComboBox();
	ComboBairro.setBounds(122, 89, 181, 26);
	JComboBox ComboLogradouro = new JComboBox();
	ComboLogradouro.setBounds(393, 89, 181, 26);
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
	JComboBox ComboEstado = new JComboBox();
	ComboEstado.setBounds(122, 57, 181, 26);
	JComboBox ComboCidade = new JComboBox();
	ComboCidade.setBounds(393, 57, 181, 26);
	
	Local3.add(ComboCidade);
	Local3.add(ComboEstado);
	Local3.add(ComboLogradouro);
	Local3.add(lblCep);
	Local3.add(lblCep);
	Local3.add(lblEstado);
	Local3.add(lblCidade);
	Local3.add(ComboBairro);
	Local3.add(lblBairro);
	Local3.add(lblLogradouro);
	Local3.add(TCep);
	
	//Ultimo Container
//===================================================================================================================================================================================
	
    Local4.setLayout(null);
    Local4.setBorder(javax.swing.BorderFactory.createEtchedBorder()); 
    Local4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Adicionais"));
    Local4.setSize(901,126);
    Local4.setLocation(57,424);
    
	

	Temail = new JTextField();
	Temail.setBounds(119, 21, 461, 26);
	Temail.setColumns(10);
	
	JLabel lblEmail = new JLabel("Email");
	lblEmail.setBounds(61, 24, 46, 14);
	
    Tusuario = new JTextField();
    Tusuario.setBounds(119, 76, 86, 26);
    Tusuario.setColumns(10);
	
	Tsenha = new JPasswordField();
	Tsenha.setBounds(313, 76, 86, 26);
	Tsenha.setColumns(10);
	
	JLabel LUsuario = new JLabel("Usuario");
	LUsuario.setBounds(61, 79, 46, 14);

	JLabel LSenha = new JLabel("Senha");
	LSenha.setBounds(255, 79, 46, 14);
	
	Local4.add(Temail);
	Local4.add(lblEmail);
	Local4.add(Tusuario);
	Local4.add(Tsenha);
	Local4.add(LUsuario);
	Local4.add(LSenha);
	
	
	//COntainer Padrão
//===================================================================================================================================================================================
	sequencia = verificacao(seqparamento);
	Tcodigo = new JTextField(""+sequencia);
    Tcodigo.setBounds(57, 63, 86, 23);
    Tcodigo.setColumns(10);
    Tcodigo.setEditable(false);

    
	data = Calendar.getInstance();		
	dia = data.get(Calendar.DATE);					
	mes = data.get(Calendar.MONTH);
	ano = data.get(Calendar.YEAR);		
	mes= mes+1;
    Tdata = new JTextField(dia+" / "+mes+" / "+ano);
    Tdata.setBounds(872, 63, 86, 23);
    Tdata.setColumns(10);
   
    JLabel lblCodigo = new JLabel("Codigo");
    lblCodigo.setBounds(58, 48, 46, 14);
    JLabel lblDataCadastro = new JLabel("Data Cadastro");
    lblDataCadastro.setBounds(872, 48, 86, 14);
    
    JButton BGravar = new JButton("Gravar");
    BGravar.setBounds(869, 561, 89, 23);
    BGravar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MUsuario musuario = new MUsuario();
			int cod = Integer.parseInt(Tcodigo.getText());
			musuario.setTnome(Tnome.getText());
			musuario.setTrazaoSocial(TrazaoSocial.getText());
			musuario.setTCpf(TCpf.getText());
			musuario.setTRg(TRg.getText());
			musuario.setRCep(TCep.getText());
			musuario.setTcodigo(cod);
			musuario.setTdata(Tdata.getText());
			musuario.setTemail(Temail.getText());
			musuario.setTUsuario(Tusuario.getText());
			musuario.setTSenha(Tsenha.getText());
			
			CUsuario cusuario = new CUsuario(musuario);
			if(cusuario.retorno == 0){
				JOptionPane.showMessageDialog(null,"Gravar If inicial");
			}else{
				JOptionPane.showMessageDialog(null,"Gravar If Secundario");
			}
			
		}
	});
    
    JButton BCancelar = new JButton("Cancelar");
    BCancelar.setBounds(748, 561, 89, 23);
    BCancelar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	
	getContentPane().add(menu);
    getContentPane().add(Tdata);
    getContentPane().add(lblDataCadastro);
    getContentPane().add(lblCodigo);
    getContentPane().add(BGravar);
    getContentPane().add(BCancelar);
    getContentPane().add(Tcodigo);
	getContentPane().add(Local1);
	getContentPane().add(Local2);
	getContentPane().add(Local3);
	getContentPane().add(Local4);
	
	
    Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();  
    Dimension dw = getSize(); 
    this.setSize(1024,620);
    
	setVisible(true);
	setResizable(false);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	public int verificacao(int sequencia ){
		Conexao conexao = new Conexao();
		conexao.ConexaoMyql();
		
			for(int i = 1; i < 100000; i++){
				try{
					String SQL = "select *from usuario where codigo=?";
					java.sql.PreparedStatement stm = conexao.con.prepareStatement(SQL);
					stm.setInt(1,i);
					ResultSet rs = stm.executeQuery();
					
					if(rs.next()){
						String t = rs.getString("codigo");
						int s = Integer.parseInt(t);
						if (i > s){
							sequencia = i;
							return sequencia;
						}else{
							sequencia++;
						}
					}else{
						sequencia = i;
						return sequencia;
					}
				}catch(SQLException e ){
					JOptionPane.showMessageDialog(null, "Busca Não Retornou Dados");
				}
			}
			return sequencia;
   }
}
