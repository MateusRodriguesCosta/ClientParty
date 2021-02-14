package clientparty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 * @author Mateus
 */
public class MenuPrincipal extends javax.swing.JFrame {
        private Connection Conexao;
        static Statement DataBase;
        static ResultSetMetaData ResultadosMData;
        static ResultSet Resultados;
        MenuCadastro menu;
        String codigo = null ;
        
    public MenuPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);  
        try{
                      Class.forName("com.mysql.jdbc.Driver");
                      Conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClientParty","root","");
                      DataBase = Conexao.createStatement();                                       
               }
               catch(ClassNotFoundException e) {
                      JOptionPane.showMessageDialog(null,"ERRO: Classe nao encontrada!");
                      e.printStackTrace();
                      System.exit(1);
               }
               catch (SQLException erro)  {
                      JOptionPane.showMessageDialog(null,"ERRO: "+erro.getMessage());
                      System.exit(1);
               }
        AtualizaTabelas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaClientes = new javax.swing.JTable();
        ACliente = new javax.swing.JButton();
        RCliente = new javax.swing.JButton();
        CCliente = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pesquisa_C = new javax.swing.JTextField();
        BuscaCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ADecoracao = new javax.swing.JButton();
        RDecoracao = new javax.swing.JButton();
        CDecoracao = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pesquisa_D = new javax.swing.JTextField();
        BuscaDecoracao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDecoracoes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AMesas = new javax.swing.JButton();
        RMesas = new javax.swing.JButton();
        CMesas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaMesasCadeiras = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NEUZA FESTAS");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(102, 102, 102)), "TABELA DE CLIENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        TabelaClientes.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        TabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Telefone/Celular", "RG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TabelaClientes.setColumnSelectionAllowed(true);
        TabelaClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaClientes);
        TabelaClientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        ACliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ACliente.setForeground(new java.awt.Color(51, 51, 51));
        ACliente.setText("Adicionar Cliente");
        ACliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ACliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AClienteMouseClicked(evt);
            }
        });

        RCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RCliente.setForeground(new java.awt.Color(51, 51, 51));
        RCliente.setText("Remover Cliente");
        RCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RClienteMouseClicked(evt);
            }
        });

        CCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CCliente.setForeground(new java.awt.Color(51, 51, 51));
        CCliente.setText("Editar Cliente");
        CCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CClienteMouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(244, 244, 244));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Pesquisar Cliente (Nome ou Codigo):");

        BuscaCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BuscaCliente.setForeground(new java.awt.Color(51, 51, 51));
        BuscaCliente.setText("BUSCAR");
        BuscaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscaClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pesquisa_C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Pesquisa_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BuscaCliente))
                .addContainerGap())
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientparty/LOGO.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NEUZA FESTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ACliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(ACliente)
                            .addComponent(RCliente)
                            .addComponent(CCliente)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CLIENTES", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ADecoracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ADecoracao.setForeground(new java.awt.Color(51, 51, 51));
        ADecoracao.setText("Adicionar Decoração");
        ADecoracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADecoracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADecoracaoMouseClicked(evt);
            }
        });

        RDecoracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RDecoracao.setForeground(new java.awt.Color(51, 51, 51));
        RDecoracao.setText("Remover Decoração");
        RDecoracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RDecoracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RDecoracaoMouseClicked(evt);
            }
        });

        CDecoracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CDecoracao.setForeground(new java.awt.Color(51, 51, 51));
        CDecoracao.setText("Editar Decoração");
        CDecoracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CDecoracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CDecoracaoMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(244, 244, 244));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Pesquisar Decoração (Código ou Tema):");

        BuscaDecoracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BuscaDecoracao.setForeground(new java.awt.Color(51, 51, 51));
        BuscaDecoracao.setText("BUSCAR");
        BuscaDecoracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscaDecoracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscaDecoracaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pesquisa_D, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscaDecoracao, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Pesquisa_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscaDecoracao)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(102, 102, 102)), "TABELA DE DECORAÇÕES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        TabelaDecoracoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Tema", "Cores", "Valor Completa", "N° Peças"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDecoracoes.setColumnSelectionAllowed(true);
        TabelaDecoracoes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TabelaDecoracoes);
        TabelaDecoracoes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientparty/LOGO.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("NEUZA FESTAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ADecoracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RDecoracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CDecoracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(CDecoracao)
                            .addComponent(RDecoracao)
                            .addComponent(ADecoracao)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DECORAÇÕES", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        AMesas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AMesas.setForeground(new java.awt.Color(51, 51, 51));
        AMesas.setText("Adicionar Mesas/Cadeiras");
        AMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMesasMouseClicked(evt);
            }
        });

        RMesas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RMesas.setForeground(new java.awt.Color(51, 51, 51));
        RMesas.setText("Remover Mesas/Cadeiras");
        RMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMesasMouseClicked(evt);
            }
        });

        CMesas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CMesas.setForeground(new java.awt.Color(51, 51, 51));
        CMesas.setText("Editar Mesas/Cadeiras");
        CMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMesasMouseClicked(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(102, 102, 102)), "TABELA DE MESAS E CADEIRAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        TabelaMesasCadeiras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Marca", "Modelo", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaMesasCadeiras.setColumnSelectionAllowed(true);
        TabelaMesasCadeiras.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TabelaMesasCadeiras);
        TabelaMesasCadeiras.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientparty/LOGO.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("NEUZA FESTAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AMesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RMesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CMesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(AMesas)
                                .addComponent(RMesas)
                                .addComponent(CMesas)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MESAS E CADEIRAS", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jScrollPane4.setViewportView(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AClienteMouseClicked
        MenuCadastro menu = new MenuCadastro("CADASTRO_C",GeraCodigo("clientes"));
        menu.show();
        dispose();
    }//GEN-LAST:event_AClienteMouseClicked

    private void RClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RClienteMouseClicked
        try {
        String codigo = TabelaClientes.getModel().getValueAt(TabelaClientes.getSelectedRow(), 0).toString();
        String nome  = TabelaClientes.getModel().getValueAt(TabelaClientes.getSelectedRow(), 1).toString();
                DataBase.execute("DELETE FROM clientes WHERE codigo = '"+codigo+"' AND nome = '"+nome+"' ");
                AtualizaCodigos();
               } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Nao foi possivel remoção, tente novamente!");
               }
               catch(RuntimeException e){
               JOptionPane.showMessageDialog(null, "Selecione um item da tabela para remoção!");
               }
        AtualizaTabelas();
    }//GEN-LAST:event_RClienteMouseClicked

    private void CClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CClienteMouseClicked
        try{
        MenuCadastro menu = new MenuCadastro("CONSULTA_C",TabelaClientes.getModel().getValueAt(TabelaClientes.getSelectedRow(), 0).toString());
        menu.show();
        dispose();
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela para edição!");
        }
    }//GEN-LAST:event_CClienteMouseClicked

    private void BuscaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscaClienteMouseClicked
        if(TabelaClientes.getRowCount()!=0){
            String pesquisa = Pesquisa_C.getText();
            for(int i = 0; i<TabelaClientes.getRowCount(); i++){
                if(TabelaClientes.getModel().getValueAt(i, 0).toString().equals(pesquisa) || TabelaClientes.getModel().getValueAt(i, 1).toString().equals(pesquisa)){
                    TabelaClientes.changeSelection(i, 1, false, false);                
                    break;
                }
                if(!TabelaClientes.getModel().getValueAt(i, 0).toString().equals(pesquisa) && i==TabelaClientes.getRowCount() || !TabelaClientes.getModel().getValueAt(i, 1).toString().equals(pesquisa) && i==TabelaClientes.getRowCount()){
                    JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Tabela vazia!");
        }
    }//GEN-LAST:event_BuscaClienteMouseClicked

    private void ADecoracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADecoracaoMouseClicked
        menu = new MenuCadastro("CADASTRO_D",GeraCodigo("decoracoes"));
        menu.show();
        dispose();
    }//GEN-LAST:event_ADecoracaoMouseClicked

    private void RDecoracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RDecoracaoMouseClicked
        try {
        String codigo = TabelaDecoracoes.getModel().getValueAt(TabelaDecoracoes.getSelectedRow(), 0).toString();       
                DataBase.execute("DELETE FROM decoracoes WHERE codigo = '"+codigo+"' ");
                AtualizaCodigos();
               } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Nao foi possivel remoção, tente novamente!");
               }
               catch(RuntimeException e){
               JOptionPane.showMessageDialog(null, "Selecione um item da tabela para remoção!");
               }
        AtualizaTabelas();
    }//GEN-LAST:event_RDecoracaoMouseClicked

    private void CDecoracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CDecoracaoMouseClicked
        try{
        String Consulta = TabelaDecoracoes.getModel().getValueAt(TabelaDecoracoes.getSelectedRow(), 0).toString();
        menu = new MenuCadastro("CONSULTA_D",Consulta);
        menu.show();
        dispose();
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela para edição!");
        }
    }//GEN-LAST:event_CDecoracaoMouseClicked

    private void BuscaDecoracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscaDecoracaoMouseClicked
        String pesquisa = Pesquisa_D.getText();
        if(TabelaDecoracoes.getRowCount()!=0){
            for(int i = 0; i<TabelaDecoracoes.getRowCount(); i++){
                if(TabelaDecoracoes.getModel().getValueAt(i, 0).equals(pesquisa) || TabelaDecoracoes.getModel().getValueAt(i, 2).equals(pesquisa)){
                    TabelaDecoracoes.changeSelection(i, 0, false, false);
                    break;
                }
                if(!TabelaDecoracoes.getModel().getValueAt(i, 0).equals(pesquisa) && i==TabelaClientes.getRowCount() || !TabelaDecoracoes.getModel().getValueAt(i, 2).equals(pesquisa) && i==TabelaDecoracoes.getRowCount()){
                    JOptionPane.showMessageDialog(null, "Não foram encontrados resultados!");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Tabela vazia!");
        }
    }//GEN-LAST:event_BuscaDecoracaoMouseClicked

    private void AMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMesasMouseClicked
        menu = new MenuCadastro("CADASTRO_M",GeraCodigo("mesas"));
        menu.show();
        dispose();
    }//GEN-LAST:event_AMesasMouseClicked

    private void RMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMesasMouseClicked
        try {
        String codigo = TabelaMesasCadeiras.getModel().getValueAt(TabelaMesasCadeiras.getSelectedRow(), 0).toString();
        String marca  = TabelaMesasCadeiras.getModel().getValueAt(TabelaMesasCadeiras.getSelectedRow(), 2).toString();
               DataBase.execute("DELETE FROM mesas WHERE codigo = '"+codigo+"' AND marca = '"+marca+"' ");
               AtualizaCodigos();
               } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Nao foi possivel remoção, tente novamente!");
               }
               catch(RuntimeException e){
               JOptionPane.showMessageDialog(null, "Selecione um item da tabela para remoção!");
               }
        AtualizaTabelas();
    }//GEN-LAST:event_RMesasMouseClicked

    private void CMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMesasMouseClicked
        try{
        String Consulta = TabelaMesasCadeiras.getModel().getValueAt(TabelaMesasCadeiras.getSelectedRow(), 0).toString();        
        menu = new MenuCadastro("CONSULTA_M",Consulta);
        menu.show();    
        dispose();
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela para edição!");
        }
    }//GEN-LAST:event_CMesasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACliente;
    private javax.swing.JButton ADecoracao;
    private javax.swing.JButton AMesas;
    private javax.swing.JButton BuscaCliente;
    private javax.swing.JButton BuscaDecoracao;
    private javax.swing.JButton CCliente;
    private javax.swing.JButton CDecoracao;
    private javax.swing.JButton CMesas;
    private javax.swing.JTextField Pesquisa_C;
    private javax.swing.JTextField Pesquisa_D;
    private javax.swing.JButton RCliente;
    private javax.swing.JButton RDecoracao;
    private javax.swing.JButton RMesas;
    private static javax.swing.JTable TabelaClientes;
    private static javax.swing.JTable TabelaDecoracoes;
    private static javax.swing.JTable TabelaMesasCadeiras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private static javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    public static void AtualizaTabelas(){        
        try {                   
                      Resultados = DataBase.executeQuery("SELECT codigo,nome,endereco,telefone,rg FROM clientes");            
                      ResultadosMData = Resultados.getMetaData();
                      int colunas = ResultadosMData.getColumnCount();                     
                      DefaultTableModel Model = (DefaultTableModel) TabelaClientes.getModel();
                      Model.setRowCount(0);                      
                      while(Resultados.next()){
                             Object[] objects = new Object[colunas];
                             for(int i = 0; i < colunas; i++) {
                                     objects[i] = Resultados.getObject(i+1);
                             }
                             Model.addRow(objects);
                      }                      
                      TabelaClientes.validate();
                      TabelaClientes.updateUI();                      
                      TabelaClientes.setModel(Model);
                      TabelaClientes.setCellSelectionEnabled(false);
                      TabelaClientes.setRowSelectionAllowed(true);
                      TabelaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
               }catch (SQLException ex) {
                              Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
               }
        try {                   
                      Resultados = DataBase.executeQuery("SELECT codigo,tipo,tema,cores,vcompleta,npecas FROM decoracoes");            
                      ResultadosMData = Resultados.getMetaData();
                      int colunas = ResultadosMData.getColumnCount();                     
                      DefaultTableModel Model = (DefaultTableModel) TabelaDecoracoes.getModel();
                      Model.setRowCount(0);                      
                      while(Resultados.next()){
                             Object[] objects = new Object[colunas];
                             for(int i = 0; i < colunas; i++) {
                                     objects[i] = Resultados.getObject(i+1);
                             }
                             Model.addRow(objects);
                      }
                      TabelaDecoracoes.validate();
                      TabelaDecoracoes.updateUI();
                      TabelaDecoracoes.setModel(Model);
                      TabelaDecoracoes.setCellSelectionEnabled(false);
                      TabelaDecoracoes.setRowSelectionAllowed(true);
                      TabelaDecoracoes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                      
               }catch (SQLException ex) {
                              Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
               }
        try {                   
                      Resultados = DataBase.executeQuery("SELECT codigo,tipo,marca,modelo,quantidade FROM mesas");            
                      ResultadosMData = Resultados.getMetaData();
                      int colunas = ResultadosMData.getColumnCount();                     
                      DefaultTableModel Model = (DefaultTableModel) TabelaMesasCadeiras.getModel();
                      Model.setRowCount(0);                      
                      while(Resultados.next()){
                             Object[] objects = new Object[colunas];
                             for(int i = 0; i < colunas; i++) {
                                     objects[i] = Resultados.getObject(i+1);
                             }
                             Model.addRow(objects);
                      }
                      TabelaMesasCadeiras.validate();
                      TabelaMesasCadeiras.updateUI();
                      TabelaMesasCadeiras.setModel(Model);
                      TabelaMesasCadeiras.setCellSelectionEnabled(false);
                      TabelaMesasCadeiras.setRowSelectionAllowed(true);
                      TabelaMesasCadeiras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
               }catch (SQLException ex) {
                              Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
               }
        Resultados = null;           
    }
    public static void AtualizaCodigos()  {
        try{
               int ID = 0;        
               Resultados = DataBase.executeQuery("SELECT codigo FROM clientes");
               while(Resultados.next()){
                      DataBase.execute("INSERT INTO clientes (codigo) VALUES ('"+ID+"')");
                      ID ++;
               }
               ID = 0;        
               Resultados = DataBase.executeQuery("SELECT codigo FROM decoracoes");
               while(Resultados.next()){
                      DataBase.execute("INSERT INTO decoracoes (codigo) VALUES ('"+ID+"')");
                      ID ++;
               }
               ID = 0;        
               Resultados = DataBase.executeQuery("SELECT codigo FROM mesas");
               while(Resultados.next()){
                      DataBase.execute("INSERT INTO mesas (codigo) VALUES ('"+ID+"')");
                      ID ++;
               }
        }
        catch(SQLException e){
               Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }
        Resultados = null;
    }
    public String GeraCodigo(String tabela){        
        try{
        int NRegistros = 0;   
        if(tabela == "clientes"){
            Resultados = DataBase.executeQuery("SELECT codigo,nome,endereco,telefone,rg FROM "+tabela);
        }
        if(tabela == "decoracoes"){
            Resultados = DataBase.executeQuery("SELECT codigo,tipo,tema,cores,vcompleta,npecas FROM "+tabela);
        }
        if(tabela == "mesas"){
            Resultados = DataBase.executeQuery("SELECT codigo,tipo,marca,modelo,quantidade FROM "+tabela);
        }
            while(Resultados.next()){
                NRegistros ++;
            }
            codigo = String.valueOf(NRegistros);
            
        }
        catch(SQLException e){      
            System.out.println("PROBLEMA"+e.getLocalizedMessage());
        }        
        return codigo;
    }
}