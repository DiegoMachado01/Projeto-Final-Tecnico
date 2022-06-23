/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.telas;

import cadastro.dao.ClienteDAO;
import cadastro.entidades.Cliente;
import cadastro.util.ManipularImagem;
import cadastroprodutos.ConexaoMySql;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ClienteTela extends javax.swing.JFrame {

    Connection con = ConexaoMySql.conectarBanco();
    ClienteDAO dao = new ClienteDAO();
    Cliente c = new Cliente();
    BufferedImage imagem;

    /**
     * Creates new form ClienteTela
     */
    public ClienteTela() {
        initComponents();
        edtCodigo.setText(String.valueOf(dao.buscarProximoCodigo()));
        listarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        editCodigo = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        editNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        editTelefone = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        edtPesquisa = new javax.swing.JTextField();
        radioCodigo = new javax.swing.JRadioButton();
        radioNome = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        editCPF = new javax.swing.JLabel();
        edtCPF = new javax.swing.JTextField();
        edtEndereço = new javax.swing.JLabel();
        edtEndereco = new javax.swing.JTextField();
        editBairro = new javax.swing.JLabel();
        editCidade = new javax.swing.JLabel();
        edtCidade = new javax.swing.JTextField();
        edtBairro = new javax.swing.JTextField();
        editEmail = new javax.swing.JLabel();
        edtEmail = new javax.swing.JTextField();
        edtCelular = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setName("frame()"); // NOI18N

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 405));

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Telefone", "CPF", "E-mail"
            }
        ));
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        editCodigo.setText("Código");

        edtCodigo.setEditable(false);
        edtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtCodigoFocusLost(evt);
            }
        });
        edtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCodigoActionPerformed(evt);
            }
        });

        editNome.setText("Nome");

        edtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtNomeFocusLost(evt);
            }
        });

        editTelefone.setText("Telefone");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        btnInserir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnInserirKeyPressed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setEnabled(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar");

        buttonGroup1.add(radioCodigo);
        radioCodigo.setSelected(true);
        radioCodigo.setText("Código");

        buttonGroup1.add(radioNome);
        radioNome.setText("Nome");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editCPF.setText("CPF");

        edtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPFActionPerformed(evt);
            }
        });

        edtEndereço.setText("Endereço");

        editBairro.setText("Bairro");

        editCidade.setText("Cidade");

        edtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCidadeActionPerformed(evt);
            }
        });

        edtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtBairroActionPerformed(evt);
            }
        });

        editEmail.setText("E-mail");

        edtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEmailActionPerformed(evt);
            }
        });

        edtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(edtPesquisa)
                        .addGap(10, 10, 10)
                        .addComponent(radioCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioNome)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edtEndereço)
                            .addComponent(edtEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editTelefone)
                                    .addComponent(editCodigo))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(editCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(editNome)
                                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editCidade)
                                    .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editBairro)
                                    .addComponent(edtBairro)))
                            .addComponent(editEmail)
                            .addComponent(edtEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInserir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtualizar))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLimpar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(editCodigo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(editTelefone)
                                                .addComponent(editCPF))
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(edtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(edtEndereço))
                                        .addComponent(editNome))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(edtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(editCidade)
                                        .addComponent(editBairro))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(editEmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtPesquisa)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioNome)
                        .addComponent(radioCodigo)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        //Pega o número da linha selecionada
        int linha = tbClientes.getSelectedRow();

        //Atribui aos campo de textos os registros de cada coluna
        //[coluna 0, coluna 1, coluna 2] = [codigo, nome, telefone] etc...
        edtCodigo.setText(tbClientes.getValueAt(linha, 0).toString());
        edtNome.setText(tbClientes.getValueAt(linha, 1).toString());
        edtCelular.setText(tbClientes.getValueAt(linha, 2).toString());
        edtCPF.setText(tbClientes.getValueAt(linha, 3).toString());
        edtEmail.setText(tbClientes.getValueAt(linha, 4).toString());

        c = dao.buscarCodigo((Integer) tbClientes.getValueAt(linha, 0));                
        if (c != null) {
            edtEndereco.setText(c.getCli_endereco());
            edtCidade.setText(c.getCli_cidade());
            edtBairro.setText(c.getCli_bairro());
        }

        btnAtualizar.setEnabled(true);
        btnLimpar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnInserir.setEnabled(false);

    }//GEN-LAST:event_tbClientesMouseClicked

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        inserirCliente();
        btnAtualizar.setEnabled(true);
        btnLimpar.setEnabled(true);
        btnExcluir.setEnabled(true);

        edtNome.setText("");
        edtCelular.setText("");
        tbClientes.clearSelection();
        edtCodigo.setText("");
        edtEndereço.setText("");
        edtNome.setText("");


    }//GEN-LAST:event_btnInserirActionPerformed
    private void inserirCliente() {
        // verifica se há campos em branco
        if (edtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Atenção!",
                    JOptionPane.ERROR_MESSAGE);

        } else if (edtCelular.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Telefone", "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
        } else {

            Cliente cliente = pegarDados();
            dao.inserir(cliente);
            listarClientes();
        }
    }
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Cliente cliente = pegarDados();
        dao.atualizar(cliente);
        listarClientes();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Cliente cliente = new Cliente();
        cliente.setCli_cod(Integer.parseInt(edtCodigo.getText()));
        dao.excluir(cliente);
        listarClientes();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed

        edtNome.setText("");
        edtCelular.setText("");

        lblImagem.setIcon(null);
        tbClientes.clearSelection();
        btnInserir.setEnabled(true);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Pesquisa vazia lista todos  os clientes
        if (edtPesquisa.getText().isEmpty()) {
            listarClientes();
        } else {
            //Pesquisa digitada, faz a procura de acordo com o RadioButton
            if (radioCodigo.isSelected()) {
                pesquisarPorCodigo();
            } else {
                pesquisarPorDescricao();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void edtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCodigoActionPerformed

    private void edtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtNomeFocusLost
        edtCelular.requestFocus();
    }//GEN-LAST:event_edtNomeFocusLost

    private void edtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtCodigoFocusLost
        edtNome.requestFocus();
    }//GEN-LAST:event_edtCodigoFocusLost

    private void btnInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnInserirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            inserirCliente();
        }
    }//GEN-LAST:event_btnInserirKeyPressed

    private void edtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCPFActionPerformed

    private void edtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCidadeActionPerformed

    private void edtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtBairroActionPerformed

    private void edtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEmailActionPerformed

    private void edtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCelularActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel editBairro;
    private javax.swing.JLabel editCPF;
    private javax.swing.JLabel editCidade;
    private javax.swing.JLabel editCodigo;
    private javax.swing.JLabel editEmail;
    private javax.swing.JLabel editNome;
    private javax.swing.JLabel editTelefone;
    private javax.swing.JTextField edtBairro;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtCelular;
    private javax.swing.JTextField edtCidade;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtEndereco;
    private javax.swing.JLabel edtEndereço;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtPesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JRadioButton radioCodigo;
    private javax.swing.JRadioButton radioNome;
    private javax.swing.JTable tbClientes;
    // End of variables declaration//GEN-END:variables

    public Cliente pegarDados() {

        int codigo = 0;
        if (!edtCodigo.getText().equals("")) {
            codigo = Integer.parseInt(edtCodigo.getText());
        } else {
            codigo = 0;
        }

        c = dao.buscarCodigo(codigo);
        int id = 0;
        if (c != null) {
            id = c.getCli_cod();
        }

        String cli_nome = edtNome.getText();
        String cli_cpfcnpj = edtCPF.getText();
        String cli_endereco = edtEndereco.getText();
        String cli_bairro = edtBairro.getText();
        String cli_cel = edtCelular.getText();
        String cli_email = edtEmail.getText();
        String cli_cidade = edtCidade.getText();

        Cliente cliente = new Cliente(codigo, cli_nome,
                cli_cpfcnpj, cli_endereco, cli_bairro, cli_cel, cli_email, cli_cidade, 1);
        return cliente;
    }

    /*
    Método que mostra os registros do banco de dados na tabela
     */
    public void listarClientes() {
        //Array com a lista de clientes do banco de dados
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes = dao.listar();
        popularTabela(clientes);
    }

    public void popularTabela(ArrayList<Cliente> clientes) {
        DefaultTableModel tabela = (DefaultTableModel) tbClientes.getModel();
        tabela.setRowCount(0);

        //Instancia um vetor Object para montar a linha de registro
        Object[] registro = new Object[5];

        //Percorre o array de clientes
        for (int i = 0; i < clientes.size(); i++) {

            //Cada posição do vetor Object recebe uma informação do cliente, 
            //formando uma linha da tabela [codigo, nome, telefone]
            registro[0] = clientes.get(i).getCli_cod();
            registro[1] = clientes.get(i).getCli_nome();
            registro[2] = clientes.get(i).getCli_cel();
            registro[3] = clientes.get(i).getCli_cpfcnpj();
            registro[4] = clientes.get(i).getCli_email();
            

            //Insere a linha na tabela
            tabela.addRow(registro);
        }
    }

    private void pesquisarPorCodigo() {
        int codigo = Integer.parseInt(edtPesquisa.getText());
        ArrayList<Cliente> resultado = dao.pesquisarPorCodigo(codigo);
        popularTabela(resultado);
    }

    private void pesquisarPorDescricao() {
        String nome = edtPesquisa.getText();
        ArrayList<Cliente> resultado = dao.pesquisarPorDescricao(nome);
        popularTabela(resultado);
    }
}
