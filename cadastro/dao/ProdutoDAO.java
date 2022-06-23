/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.dao;

;

import cadastro.entidades.Produto;
import cadastroprodutos.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class ProdutoDAO {

    Connection con = ConexaoMySql.conectarBanco();
    String sql = null;
    Statement declaracao;
    ResultSet resultado;

    public void inserir(Produto p) {
        sql = "INSERT INTO produto (codigo, descricao, unProd_codadeMedProd_coda, qtd, "
                + "valorUnitario, caminhoImagem) VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getProd_nome());
            ps.setString(2, p.getProd_descricao());
            ps.setDouble(3, p.getProd_valorcompra());
            ps.setDouble(4, p.getProd_valorvenda());
            ps.setBytes(5, p.getProd_foto());
            ps.setString(6, p.getProd_marca());
            ps.setInt(7, p.getIdusuario());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto inserProd_codo com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto!");
            e.printStackTrace();
        }
    }

    public void atualizar(Produto p) {
        sql = "UPDATE produto SET codigo = ?, prod_nome = ?, prod_descricao = ?, "
                + "prod_valorcompra = ?, prod_valorvenda = ?, prod_foto = ?,prod_marca? WHERE prod_cod= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getProd_nome());
            ps.setString(2, p.getProd_descricao());
            ps.setDouble(3, p.getProd_valorcompra());
            ps.setDouble(4, p.getProd_valorvenda());
            ps.setBytes(5, p.getProd_foto());
            ps.setString(6, p.getProd_marca());
            ps.setInt(7, p.getIdusuario());

            System.out.println(ps.toString());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto!");
            e.printStackTrace();
        }
    }

    public void excluir(Produto p) {
        sql = "DELETE FROM produto WHERE Prod_cod = ?,?,?,?,?,?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getProd_cod());
            ps.setString(2, p.getProd_nome());
            ps.setString(3, p.getProd_descricao());
            ps.setDouble(4, p.getProd_valorcompra());
            ps.setDouble(5, p.getProd_valorvenda());
            ps.setBytes(6, p.getProd_foto());
            ps.setString(7, p.getProd_marca());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produto!");
            e.printStackTrace();
        }
    }

    public Produto buscar(String codigo) {
        Produto produto = new Produto();
        sql = "SELECT * FROM produto WHERE codigo = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                produto.setProd_cod(rs.getInt("prod_cod"));
                produto.setProd_nome(rs.getString("prod_nome"));
                produto.setProd_descricao(rs.getString("prod_descricao"));
                produto.setProd_valorcompra(rs.getDouble("prod_valorcompra"));
                produto.setProd_valorvenda(rs.getDouble("prod_valorvenda"));
                produto.setProd_foto(rs.getBytes("prod_foto"));
                produto.setProd_marca(rs.getString("prod_marca"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto!");
            e.printStackTrace();
        }

        return produto;
    }

    public ArrayList<Produto> listar() {
        ArrayList<Produto> produtos = new ArrayList<>();
        sql = "SELECT * FROM produto";

        try {
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                int prod_cod = resultado.getInt("prod_cod");
                String prod_nome = resultado.getString("prod_nome");
                String prod_descricao = resultado.getString("prod_descricao");
                double prod_valorcompra = resultado.getDouble("prod_valorcompra");
                double prod_valorvenda = resultado.getDouble("prod_valorvenda");
                byte[] prod_foto = resultado.getBytes("prod_foto");
                String prod_marca = resultado.getString("prod_marca");
                int idusuario = resultado.getInt("idusuario");

                Produto produto;
                produto = new Produto(prod_cod, prod_nome, prod_descricao, prod_valorcompra,
                        prod_valorvenda, prod_foto, prod_marca, idusuario);
                produtos.add(produto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar lista de produtos!");
            e.printStackTrace();
        }

        return produtos;
    }

    public int buscarId() {
        int Prod_cod = 0;

        sql = "SELECT MAX(Prod_cod) FROM produto";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                Prod_cod = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar Prod_cod do Produto!");
            e.printStackTrace();
        }

        return Prod_cod + 1;
    }

    public ArrayList<Produto> pesquisarPorDescricao(String pesquisa) {
        ArrayList<Produto> produtosPesquisados = new ArrayList<>();
        sql = "SELECT * FROM produto WHERE descricao LIKE '%" + pesquisa + "%'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                int prod_cod = resultado.getInt("prod_cod");
                String prod_nome = resultado.getString("prod_nome");
                String prod_descricao = resultado.getString("prod_descricao");
                double prod_valorcompra = resultado.getDouble("prod_valorcompra");
                double prod_valorvenda = resultado.getDouble("prod_valorvenda");
                byte[] prod_foto = resultado.getBytes("prod_foto");
                String prod_marca = resultado.getString("prod_marca");
                int idusuario = resultado.getInt("idusuario");

                Produto produto;
                produto = new Produto(prod_cod, prod_nome, prod_descricao, prod_valorcompra,
                        prod_valorvenda, prod_foto, prod_marca, idusuario);
                produtosPesquisados.add(produto);
                produtosPesquisados.add(produto);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar produtos!");
            e.printStackTrace();
        }

        return produtosPesquisados;
    }

    public ArrayList<Produto> pesquisarPorCodigo(int pesquisa) {
        ArrayList<Produto> produtosPesquisados = new ArrayList<>();
        sql = "SELECT * FROM produto WHERE codigo = " + pesquisa;

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                int prod_cod = resultado.getInt("prod_cod");
                String prod_nome = resultado.getString("prod_nome");
                String prod_descricao = resultado.getString("prod_descricao");
                double prod_valorcompra = resultado.getDouble("prod_valorcompra");
                double prod_valorvenda = resultado.getDouble("prod_valorvenda");
                byte[] prod_foto = resultado.getBytes("prod_foto");
                String prod_marca = resultado.getString("prod_marca");
                int idusuario = resultado.getInt("idusuario");

                Produto produto;
                produto = new Produto(prod_cod, prod_nome, prod_descricao, prod_valorcompra,
                        prod_valorvenda, prod_foto, prod_marca, idusuario);
                produtosPesquisados.add(produto);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar codigo!");
            e.printStackTrace();
        }
        return produtosPesquisados;
    }
}
