/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.dao;

import cadastro.entidades.Venda;
import cadastroprodutos.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class VendaDAO {

    Connection con = ConexaoMySql.conectarBanco();
    String sql = null;
    Statement declaracao;
    ResultSet resultado;

    public void inserir(Venda c) {
        sql = "INSERT INTO venda (venda_data, venda_total, venda_status, cli_cod, Usuario_idusuario"
                + ") VALUES(?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(c.getVenda_data().getTime()));
            ps.setDouble(2, c.getVenda_total());
            ps.setInt(3, c.getVenda_status());
            ps.setInt(4, c.getVenda_cod());
            ps.setInt(5, c.getIdusuario());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Venda inserido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir venda!");
            e.printStackTrace();
        }
    }

    public void atualizar(Venda c) {
        sql = "UPDATE venda SET , venda_data = ?, venda_total = ?,venda_status = ?,"
                + "cli_cod = ?, idusuario = ?"
                + "idusuario = ? WHERE  = venda_cod ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, new java.sql.Date(c.getVenda_data().getTime()));
            ps.setDouble(2, c.getVenda_total());
            ps.setInt(3, c.getVenda_status());
            ps.setInt(4, c.getVenda_cod());
            ps.setInt(5, c.getIdusuario());

            ps.executeUpdate();
            System.out.println(ps.toString());
            JOptionPane.showMessageDialog(null, "Venda atualizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar venda!");
            e.printStackTrace();
        }
    }

    public Venda buscarId(int id) {
        Venda venda = new Venda();
        sql = "SELECT * FROM venda WHERE venda_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                venda.setVenda_cod(rs.getInt("venda_cod"));
                venda.setVenda_data(rs.getDate("venda_data"));
                venda.setVenda_total(rs.getDouble("venda_total"));
                venda.setVenda_status(rs.getInt("venda_status"));
                venda.setVenda_cod(rs.getInt("cli_cod"));
                venda.setIdusuario(rs.getInt("idusuario"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar venda!");
            e.printStackTrace();
        }

        return venda;
    }

    public Venda buscarCodigo(int codigo) {
        Venda venda = new Venda();
        sql = "SELECT * FROM venda WHERE cli_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                venda.setVenda_cod(rs.getInt("venda_cod"));
                venda.setVenda_data(rs.getDate("venda_data"));
                venda.setVenda_total(rs.getDouble("venda_total"));
                venda.setVenda_status(rs.getInt("venda_status"));
                venda.setVenda_cod(rs.getInt("cli_cod"));
                venda.setIdusuario(rs.getInt("idusuario"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar venda!");
            e.printStackTrace();
        }

        return venda;
    }

    public void excluir(Venda c) {
        sql = "DELETE FROM venda WHERE venda_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getVenda_cod());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Venda excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir venda!");
            e.printStackTrace();
        }
    }

    public int buscarProximoCodigo() {
        int codigo = 0;

        sql = "SELECT MAX(codigo) FROM venda";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                codigo = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar Codigo do venda!");
            e.printStackTrace();
        }

        return codigo + 1;
    }

    public ArrayList<Venda> listar() {
        ArrayList<Venda> venda = new ArrayList<>();
        sql = "SELECT * FROM CLIENTE";

        try {
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                int venda_cod = resultado.getInt("venda_cod");
                Date venda_data = resultado.getDate("venda_data");
                Double venda_total = resultado.getDouble("venda_total");
                int venda_status = resultado.getInt("venda_status");
                int idusuario = resultado.getInt("idusuario");
                Venda venda = new Venda(venda_cod, venda_data, venda_total, venda_status, idusuario);
                venda.add(venda);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar lista de venda!");
            e.printStackTrace();
        }

        return venda;
    }

    public ArrayList<Venda> pesquisarPorDescricao(String pesquisa) {
        ArrayList<Venda> vendaPesquisados = new ArrayList<>();
        sql = "SELECT * FROM venda WHERE nome LIKE '%" + pesquisa + "%'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (resultado.next()) {
                int venda_cod = resultado.getInt("venda_cod");
                Date venda_data = resultado.getDate("venda_data");
                Double venda_total = resultado.getDouble("venda_total");
                int venda_status = resultado.getInt("venda_status");
                int idusuario = resultado.getInt("idusuario");
                Venda venda = new Venda(venda_cod, venda_data, venda_total, venda_status, idusuario);
                venda.add(venda);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar venda!");
            e.printStackTrace();
        }

        return vendaPesquisados;
    }

    public ArrayList<Venda> pesquisarPorCodigo(int pesquisa) {
        ArrayList<Venda> vendaPesquisados = new ArrayList<>();
        sql = "SELECT * FROM venda WHERE codigo = " + pesquisa;

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {

                int venda_cod = rs.getInt("venda_cod");
                Date venda_data = rs.getDate("venda_data");
                Double venda_total = rs.getDouble("venda_total");
                int venda_status = rs.getInt("venda_status");
                int idusuario = rs.getInt("idusuario");

                Venda venda = new Venda(venda_cod, venda_data, venda_total, venda_status, idusuario);
                vendaPesquisados.add(venda);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar codigo!");
            e.printStackTrace();
        }
        return vendaPesquisados;
    }
}
