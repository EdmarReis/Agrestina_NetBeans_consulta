/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.ClienteCadastroDAO;
import dao.ProdutoDAO;
import dao.UsuarioDAO;
import java.awt.Image;
import java.io.File;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.Cliente;
import model.Usuario;
import net.proteanit.sql.DbUtils;
import utils.ConnectionFactory;


/**
 *
 * @author Camila
 */
public class CadastroClientes extends javax.swing.JFrame {

    /**
     * Creates new form CadastroClientes
     */
    public CadastroClientes() {
        conexao = ConnectionFactory.conector(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        btnLimparCLiente = new javax.swing.JButton();
        btnSalvarCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnPesquisarCliente = new javax.swing.JButton();
        lblEndereco1 = new javax.swing.JLabel();
        rbAtivo = new javax.swing.JRadioButton();
        rbInativo = new javax.swing.JRadioButton();
        lbl = new javax.swing.JLabel();
        lblOperador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Endereço", "CPF/CNPJ", "Telefone", "Email", "Ativo"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        lblNome.setText("Nome");

        lblCelular.setText("Celular");

        lblEmail.setText("Email");

        lblEndereco.setText("Endereço");

        lblCpf.setText("CPF/CNPJ");

        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyReleased(evt);
            }
        });

        btnLimparCLiente.setText("Limpar");
        btnLimparCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCLienteActionPerformed(evt);
            }
        });

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        btnAlterarCliente.setText("Editar");
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        btnPesquisarCliente.setText("Pesquisar");

        lblEndereco1.setText("Ativo");
        lblEndereco1.setToolTipText("");

        rbAtivo.setSelected(true);
        rbAtivo.setText("Ativo");

        rbInativo.setText("Inativo");

        lbl.setText("Usuário:");

        lblOperador.setText("usuario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnLimparCLiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarCliente)
                        .addGap(101, 101, 101)
                        .addComponent(btnAlterarCliente)
                        .addGap(89, 89, 89)
                        .addComponent(btnPesquisarCliente)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCelular)
                            .addComponent(lblEmail)
                            .addComponent(lblEndereco)
                            .addComponent(lblCpf)
                            .addComponent(lblEndereco1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCpf)
                            .addComponent(rbInativo)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbAtivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl)
                                .addGap(18, 18, 18)
                                .addComponent(lblOperador)
                                .addGap(70, 70, 70)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAtivo)
                            .addComponent(lbl)
                            .addComponent(lblOperador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbInativo)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEndereco1)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparCLiente)
                    .addComponent(btnSalvarCliente)
                    .addComponent(btnAlterarCliente)
                    .addComponent(btnPesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // TODO add your handling code here:
        setCamposClientes();
    }//GEN-LAST:event_tblClientesMouseClicked

    private void txtNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyReleased
        // TODO add your handling code here:
        pesquisarClientes();
    }//GEN-LAST:event_txtNomeClienteKeyReleased

    private void btnLimparCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCLienteActionPerformed
        // TODO add your handling code here:
        limpaTelaCliente();
    }//GEN-LAST:event_btnLimparCLienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        // TODO add your handling code here:
        UsuarioDAO usuarioDao = new UsuarioDAO();
        ClienteCadastroDAO clienteDAO = new ClienteCadastroDAO();
        int verificaPerfil = usuarioDao.verificaPerfil(lblOperador.getText());
        if (verificaPerfil == 1) {
            if (txtNomeCliente.getText().equals("") || txtCelular.getText().equals("(  )      -    ") || txtEmail.getText().equals("") || txtEndereco.getText().equals("") || txtCpf.getText().equals("   .   .   -  ")) {
                JOptionPane.showMessageDialog(null, "Existem campos vazios");
            } else {
                //salvarCliente();
                clienteDAO.salvarCliente(txtNomeCliente.getText(),txtEndereco.getText(),txtCpf.getText(),txtCelular.getText(),txtEmail.getText(),rbAtivo.isSelected(),rbInativo.isSelected());
                limpaTelaCliente();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Perfil não autorizado para essa transação", "Erro", JOptionPane.ERROR_MESSAGE);
            limpaTelaCliente();
        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        // TODO add your handling code here:
        UsuarioDAO usuarioDao = new UsuarioDAO();
        ClienteCadastroDAO clienteDAO = new ClienteCadastroDAO();
        int verificaPerfil = usuarioDao.verificaPerfil(lblOperador.getText());
        if (verificaPerfil == 1 || verificaPerfil == 2) {
            int question = JOptionPane.showConfirmDialog(null, "Deseja Salvar as alterações?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (txtNomeCliente.getText().equals("") || txtEndereco.getText().equals("") || txtCelular.getText().equals("") || txtCpf.getText().equals("") || txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {
                if (question == JOptionPane.YES_OPTION) {
                    //alterarCliente();
                    clienteDAO.alterarCliente(txtNomeCliente.getText(),txtEndereco.getText(),txtCelular.getText(),txtEmail.getText(),txtCpf.getText(), rbAtivo.isSelected(),rbInativo.isSelected());
                    limpaTelaCliente();
                    pesquisarClientes();
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma alteração foi realizada.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Perfil não autorizado para essa transação", "Erro", JOptionPane.ERROR_MESSAGE);
            limpaTelaCliente();
        }
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }
    
    private void limpaTelaCliente() {
        txtNomeCliente.setText(null);
        txtCelular.setText(null);
        txtCpf.setText(null);
        txtEmail.setText(null);
        txtEndereco.setText(null);
        //txtIdCliente.setText(null);
        DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();
        model.setRowCount(0);
    }
    
    public void pesquisarClientes() {
        String sql = "select * from clientes where nome like ? ORDER BY nome ASC";
        //String sql = "select * from clientes where nome like ? and ativo = true";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomeCliente.getText() + "%");
            rs = pst.executeQuery();

            tblClientes.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    private void setCamposClientes() {
        int setar = tblClientes.getSelectedRow();
        //txtIdCliente.setText(tblClientes.getModel().getValueAt(setar, 0).toString());
        txtNomeCliente.setText(tblClientes.getModel().getValueAt(setar, 0).toString());
        txtEndereco.setText(tblClientes.getModel().getValueAt(setar, 1).toString());
        txtCpf.setText(tblClientes.getModel().getValueAt(setar, 2).toString());
        txtCelular.setText(tblClientes.getModel().getValueAt(setar, 3).toString());
        txtEmail.setText(tblClientes.getModel().getValueAt(setar, 4).toString());
        if(tblClientes.getValueAt(setar, 5).equals(true)){
            rbAtivo.setSelected(true);
        }
        if(tblClientes.getValueAt(setar, 5).equals(false)){
            rbInativo.setSelected(true);
        }
    }
    
    void exportarNome(Cliente usuario) {
        lblOperador.setText(usuario.getNome());
        lbl.setText(usuario.getNome());
    }
    
    //JLabel lblFoto = new JLabel("Foto");
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private JTable table;
    private String caminhoFoto;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnLimparCLiente;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOperador;
    public javax.swing.JRadioButton rbAtivo;
    public javax.swing.JRadioButton rbInativo;
    private javax.swing.JTable tblClientes;
    public javax.swing.JTextField txtCelular;
    public javax.swing.JTextField txtCpf;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtEndereco;
    public javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
