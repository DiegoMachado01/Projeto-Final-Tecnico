/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.dao;

import cadastro.entidades.Categoria;
import cadastroprodutos.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class CategoriaDAO {

    Connection con = ConexaoMySql.conectarBanco();
    String sql = null;
    Statement declaracao;
    ResultSet resultado;

    public void inserir(Categoria c) {
        sql = "INSERT INTO categoria (cli_nome, "
                + ") VALUES(?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getCat_nome());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Categoria inserido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir categoria!");
            e.printStackTrace();
        }
    }

    public void atualizar(Categoria c) {
        sql = "UPDATE categoria SET , cli_nome = ?,"
                + " idusuario = ? WHERE cat_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, c.getCat_cod());
            ps.setString(2, c.getCat_nome());
            ps.executeUpdate();
            System.out.println(ps.toString());
            JOptionPane.showMessageDialog(null, "Categoria atualizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar categoria!");
            e.printStackTrace();
        }
    }

    public Categoria buscarId(int id) {
        Categoria categoria = new Categoria();
        sql = "SELECT * FROM categoria WHERE cat_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                categoria.setCat_cod(rs.getInt("cat_cod"));
                categoria.setCat_nome(rs.getString("cli_nome"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar categoria!");
            e.printStackTrace();
        }

        return categoria;
    }

    public Categoria buscarCodigo(int codigo) {
        Categoria categoria = new Categoria();
        sql = "SELECT * FROM categoria WHERE cli_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                categoria.setCat_cod(rs.getInt("cat_cod"));
                categoria.setCat_nome(rs.getString("cli_nome"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar categoria!");
            e.printStackTrace();
        }

        return categoria;
    }

    public void excluir(Categoria c) {
        sql = "DELETE FROM categoria WHERE cat_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCat_cod());
            ps.setString(1, c.getCat_nome());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Categoria excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir categoria!");
            e.printStackTrace();
        }
    }

    public int buscarProximoCodigo() {
        int codigo = 0;

        sql = "SELECT MAX(codigo) FROM categoria";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                codigo = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar Codigo do categoria!");
            e.printStackTrace();
        }

        return codigo + 1;
    }

    public ArrayList<Categoria> listar() {
        ArrayList<Categoria> categorias = new ArrayList<>();
        sql = "SELECT * FROM CLIENTE";

        try {
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                int cli_cod = resultado.getInt("cli_cod");
                String cli_nome = resultado.getString("cli_nome");

                Categoria categoria = new Categoria(cli_cod, cli_nome);
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar lista de categorias!");
            e.printStackTrace();
        }

        return categorias;
    }

    public ArrayList<Categoria> pesquisarPorDescricao(String pesquisa) {
        ArrayList<Categoria> categoriasPesquisados = new ArrayList<>();
        sql = "SELECT * FROM categoria WHERE nome LIKE '%" + pesquisa + "%'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                int cli_cod = rs.getInt("cli_cod");
                String cli_nome = rs.getString("cli_nome");

                Categoria categoria = new Categoria(cli_cod, cli_nome);
                categoriasPesquisados.add(categoria);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar categorias!");
            e.printStackTrace();
        }

        return categoriasPesquisados;
    }

    public ArrayList<Categoria> pesquisarPorCodigo(int pesquisa) {
        ArrayList<Categoria> categoriasPesquisados = new ArrayList<>();
        sql = "SELECT * FROM categoria WHERE codigo = " + pesquisa;

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {

                int cli_cod = rs.getInt("cli_cod");
                String cli_nome = rs.getString("cli_nome");

                Categoria categoria = new Categoria(cli_cod, cli_nome);
                categoriasPesquisados.add(categoria);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar codigo!");
            e.printStackTrace();
        }
        return categoriasPesquisados;
    }
}

