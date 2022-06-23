/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.dao;

import cadastro.entidades.Tipopagamento;
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
public class TipopagamentoDAO {

    Connection con = ConexaoMySql.conectarBanco();
    String sql = null;
    Statement declaracao;
    ResultSet resultado;

    public void inserir(Tipopagamento u) {
        sql = "INSERT INTO usuario (tpa_nome) VALUES(?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getTpa_nome());
            ps.setInt(2, u.getIdusuario());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Tipopagamento inserido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuario!");
            e.printStackTrace();
        }
    }

    public void atualizar(Tipopagamento u) {
        sql = "UPDATE usuario SET senha = ?, tipo = ? WHERE tpa_cod= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, u.getTpa_cod());
            ps.setString(2, u.getTpa_nome());
            ps.setInt(3, u.getIdusuario());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Tipopagamento atualizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar usuario!");
            e.printStackTrace();
        }
    }

    public void excluir(Tipopagamento u) {
        sql = "DELETE FROM usuario WHERE tpa_cod= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, u.getIdusuario());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tipopagamento excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario!");
            e.printStackTrace();
        }
    }

    public int buscarId() {
        int id = 0;

        sql = "SELECT MAX(id) FROM usuario";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar id do usuario!");
            e.printStackTrace();
        }

        return id + 1;
    }

    public ArrayList<Tipopagamento> listar() {
        ArrayList<Tipopagamento> usuarios = new ArrayList<>();
        sql = "SELECT * FROM usuario";

        try {
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                int tpa_cod = resultado.getInt("tpa_cod");
                String tpa_nome = resultado.getString("tpa_nome");
                int Idusuario = resultado.getInt("Idusuario");
                Tipopagamento usuario = new Tipopagamento(tpa_cod, tpa_nome, Idusuario);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar lista de usuarios!");
            e.printStackTrace();
        }

        return usuarios;
    }

    public ArrayList<Tipopagamento> pesquisarPorDescricao(String pesquisa) {
        ArrayList<Tipopagamento> usuariosPesquisados = new ArrayList<>();
        sql = "SELECT * FROM usuario WHERE login LIKE '%" + pesquisa + "%'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                int tpa_cod = resultado.getInt("tpa_cod");
                String tpa_nome = resultado.getString("tpa_nome");
                int Idusuario = resultado.getInt("Idusuario");
                Tipopagamento usuario = new Tipopagamento(tpa_cod, tpa_nome, Idusuario);
                usuariosPesquisados.add(usuario);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar usuarios!");
            e.printStackTrace();
        }

        return usuariosPesquisados;
    }

    public ArrayList<Tipopagamento> pesquisarPorTipo(int pesquisa) {
        ArrayList<Tipopagamento> usuariosPesquisados = new ArrayList<>();
        sql = "SELECT * FROM usuario WHERE tipo = " + pesquisa;

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {

                int tpa_cod = resultado.getInt("tpa_cod");
                String tpa_nome = resultado.getString("tpa_nome");
                int idusuario = resultado.getInt("idusuario");
                Tipopagamento tipopagamento = new Tipopagamento(tpa_cod, tpa_nome, idusuario);
                usuariosPesquisados.add(tipopagamento);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar codigo!");
            e.printStackTrace();
        }
        return usuariosPesquisados;
    }
}


