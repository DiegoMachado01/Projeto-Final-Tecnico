package cadastro.telas;

import cadastro.dao.ProdutoDAO;
import cadastro.entidades.Produto;
import cadastro.util.ManipularImagem;
import cadastroprodutos.ConexaoMySql;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProdutoTela extends javax.swing.JFrame {

    Connection con = ConexaoMySql.conectarBanco();
    ProdutoDAO dao = new ProdutoDAO();
    Produto p = new Produto();
    BufferedImage imagem;

    public ProdutoTela() {
        initComponents();
        //edtCodigo.setText(String.valueOf(dao.buscarId()));
        listarProdutos();
    }

    public Produto pegarDados() {

        String codigo = edtCodigo.getText();
        p = dao.buscar(codigo);
        int id = 0;
        if (p != null) {
            id = p.getProd_cod();
        }
        int prod_cod = Integer. parseInt (edtCodigo.getText());
        String prod_nome = edtNome.getText();
        String prod_descricao = edtDescricao.getText();
        double prod_valorcompra = Double.parseDouble(edtCompra.getText());
        double prod_valorvenda = Double.parseDouble(edtVenda.getText());
        String prod_marca = edtMarca.getText();
        int idusuario = 1;
        byte[] prod_foto = 1;
         //= String caminhoImagem = edtCaminhoImagem.getText();
        Produto produto = new Produto(prod_cod, prod_nome, prod_descricao, prod_valorcompra, prod_valorvenda,prod_foto,
                prod_marca, idusuario);
        
        return produto;
    }

    public void listarProdutos() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos = dao.listar();

        DefaultTableModel tabela = (DefaultTableModel) tbProdutos.getModel();
        tabela.setRowCount(0);

        Object[] registro = new Object[5];

        for (int i = 0; i < produtos.size(); i++) {
            registro[0] = produtos.get(i).getProd_cod();
            registro[1] = produtos.get(i).getProd_nome();
            registro[2] = produtos.get(i).getProd_descricao();
            registro[3] = produtos.get(i).getProd_valorcompra();
            registro[4] = produtos.get(i).getProd_valorvenda();
            registro[5] = produtos.get(i).getProd_foto();
            registro[6] = produtos.get(i).getProd_marca();
            registro[7] = produtos.get(i).getIdusuario();

            tabela.addRow(registro);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        etcCodigo = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtDescricao = new javax.swing.JTextField();
        edtCompra = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        edtMarca = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        radioCodigo = new javax.swing.JRadioButton();
        radioDescrição = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        edtVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtCaminhoImagem = new javax.swing.JTextField();
        btnFoto = new javax.swing.JButton();
        jLabelFoto = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        etcNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setName("frame()"); // NOI18N

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Unid. Medida", "Quantidade", "Preço"
            }
        ));
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProdutos);

        etcCodigo.setText("Código");

        jLabel3.setText("Descrição");

        edtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtDescricaoFocusLost(evt);
            }
        });
        edtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtDescricaoKeyPressed(evt);
            }
        });

        edtCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtCompraFocusLost(evt);
            }
        });
        edtCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtCompraKeyPressed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
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

        jLabel6.setText("Marca");

        edtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtMarcaActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar");

        buttonGroup1.add(radioCodigo);
        radioCodigo.setText("Código");

        buttonGroup1.add(radioDescrição);
        radioDescrição.setText("Descrição");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        edtVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtVendaFocusLost(evt);
            }
        });
        edtVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtVendaActionPerformed(evt);
            }
        });
        edtVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtVendaKeyPressed(evt);
            }
        });

        jLabel5.setText("Valor Venda");

        edtCaminhoImagem.setEditable(false);

        btnFoto.setText("Foto do Produto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        edtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeActionPerformed(evt);
            }
        });

        etcNome.setText("Nome");

        jLabel2.setText("Valor Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radioCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioDescrição))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnFoto)
                                .addComponent(edtCaminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(etcCodigo)
                                        .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addComponent(etcNome))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(edtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(edtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnInserir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(edtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(358, 358, 358)
                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(122, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(13, 13, 13)
                        .addComponent(btnFoto)
                        .addGap(18, 18, 18)
                        .addComponent(edtCaminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etcCodigo)
                            .addComponent(etcNome)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioCodigo)
                    .addComponent(radioDescrição)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(287, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        //Pega o número da linha selecionada
        int linha = tbProdutos.getSelectedRow();

        // busca produto pelo código (Primeira coluna da tabela)
        p = dao.buscar(tbProdutos.getValueAt(linha, 0).toString());

        //Atribui aos campo de textos os registros de cada coluna
        //[coluna 0, coluna 1, coluna 2] = [codigo, descricao, unidadeMed...]
        edtCodigo.setText(p.getProd_cod());
        edtDescricao.setText(p.getProd_descricao());
        edtCompra.setText(p.getProd_valorcompra());
        edtVenda.setText(String.valueOf(p.getProd_valorvenda()));
        edtMarca.setText(String.valueOf(p.getProd_marca()));
        edtCaminhoImagem.setText(p.getCaminhoImagem());

        /* Carrega a imagem */
        final File dir = new File("./src/cadastro/imagens/" + p.getCaminhoImagem());
        try {
            File arquivo = dir.getCanonicalFile();
            imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 100, 100);
            edtCaminhoImagem.setText(arquivo.getName());
            jLabelFoto.setIcon(new ImageIcon(imagem));
        } catch (Exception ex) {
            // System.out.println(ex.printStackTrace().toString());
        }

        btnAtualizar.setEnabled(true);
        btnLimpar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tbProdutosMouseClicked

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        String codigo = "";
        // verifica se há campos em branco
        if (edtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição", "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
        } else if (edtCompra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Unidade de Medida", "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
        } else if (edtVenda.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Quantidade", "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
        } else if (edtMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Valor Unitário", "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
        } else if (edtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Código", "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            codigo = edtCodigo.getText();
            ProdutoDAO dao = new ProdutoDAO();
            // busca código para verificar se já existe outro
            Produto produto = dao.buscar(codigo);
            //verifica se existe outro produto com o mesmo código
            if (produto != null && produto.getProd_cod() == codigo) {
                JOptionPane.showMessageDialog(null, "Código já existe ", "Atenção!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                produto = pegarDados(); // pega Dados para preencher o Objeto
                dao.inserir(produto); // Insere dados no banco
                listarProdutos(); // lista todos os produtos novamente
            }
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Produto produto = pegarDados();
        dao.atualizar(produto);
        listarProdutos();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Produto produto = pegarDados();
        dao.excluir(produto);
        listarProdutos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edtCodigo.setText("");
        edtDescricao.setText("");
        edtCompra.setText("");
        edtVenda.setText("");
        edtMarca.setText("");
        edtCaminhoImagem.setText("");
        jLabelCaminhoImagem.setText("");
        jLabelFoto.setIcon(null);
        tbProdutos.clearSelection();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void edtVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtVendaActionPerformed

    private void edtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDescricaoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtCompra.requestFocus();
        }
    }//GEN-LAST:event_edtDescricaoKeyPressed

    private void edtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtDescricaoFocusLost

        edtCompra.requestFocus();
    }//GEN-LAST:event_edtDescricaoFocusLost

    private void edtCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCompraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtVenda.requestFocus();
        }
    }//GEN-LAST:event_edtCompraKeyPressed

    private void edtCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtCompraFocusLost
        edtVenda.requestFocus();
    }//GEN-LAST:event_edtCompraFocusLost

    private void edtVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtVendaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtMarca.requestFocus();
        }
    }//GEN-LAST:event_edtVendaKeyPressed

    private void edtVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtVendaFocusLost
        edtMarca.requestFocus();
    }//GEN-LAST:event_edtVendaFocusLost

    public void popularTabela(ArrayList<Produto> produtos) {
        DefaultTableModel tabela = (DefaultTableModel) tbProdutos.getModel();
        tabela.setRowCount(0);

        //Instancia um vetor Object para montar a linha de registro
        Object[] registro = new Object[5];

        //Percorre o array de produtos
        for (int i = 0; i < produtos.size(); i++) {

            //Cada posição do vetor Object recebe uma informação do produto, 
            //formando uma linha da tabela [codigo, nome, telefone]
            registro[0] = produtos.get(i).getProd_cod();
            registro[1] = produtos.get(i).getProd_nome();
            registro[2] = produtos.get(i).getProd_descricao();
            registro[3] = produtos.get(i).getProd_valorcompra();
            registro[4] = produtos.get(i).getProd_valorvenda();
            registro[5] = produtos.get(i).getProd_foto();
            registro[6] = produtos.get(i).getProd_marca();
            registro[7] = produtos.get(i).getIdusuario();

            //Insere a linha na tabela
            tabela.addRow(registro);
        }
    }

    private void pesquisarPorCodigo() {
        int codigo = Integer.parseInt(txtPesquisa.getText());
        ArrayList<Produto> resultado = dao.pesquisarPorCodigo(codigo);
        popularTabela(resultado);
    }

    private void pesquisarPorDescricao() {
        String nome = txtPesquisa.getText();
        ArrayList<Produto> resultado = dao.pesquisarPorDescricao(nome);
        popularTabela(resultado);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Pesquisa vazia lista todos  os produtos
        if (txtPesquisa.getText().isEmpty()) {
            listarProdutos();
        } else {
            //Pesquisa digitada, faz a procura de acordo com o RadioButton
            if (radioCodigo.isSelected()) {
                pesquisarPorCodigo();
            } else {
                pesquisarPorDescricao();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        final File initialdir = new File("./src/cadastro/imagens");
        JFileChooser fc = new JFileChooser(initialdir);

        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            try {

                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 100, 100);
                edtCaminhoImagem.setText(arquivo.getName());
                jLabelFoto.setIcon(new ImageIcon(imagem));

            } catch (Exception ex) {
                //System.out.println(ex.printStackTrace().toString());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeActionPerformed

    private void edtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtMarcaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edtCaminhoImagem;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtCompra;
    private javax.swing.JTextField edtDescricao;
    private javax.swing.JTextField edtMarca;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtVenda;
    private javax.swing.JLabel etcCodigo;
    private javax.swing.JLabel etcNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JRadioButton radioCodigo;
    private javax.swing.JRadioButton radioDescrição;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

}
