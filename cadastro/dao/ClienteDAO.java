/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.dao;

import cadastro.entidades.Cliente;
import cadastro.entidades.Cliente;
import cadastroprodutos.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection con = ConexaoMySql.conectarBanco();
    String sql = null;
    Statement declaracao;
    ResultSet resultado;

    public void inserir(Cliente c) {
        sql = "INSERT INTO cliente (cli_cod, cli_nome, cli_cpfcnpj,cli_endereco,"
                +"cli_bairro,cli_cel,cli_email,cli_cidade, Usuario_idusuario "
                + ") VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCli_cod());
            ps.setString(2, c.getCli_nome());
            ps.setString(3, c.getCli_cpfcnpj());
            ps.setString(4, c.getCli_endereco());
            ps.setString(5, c.getCli_bairro());
            ps.setString(6, c.getCli_cel());
            ps.setString(7, c.getCli_email());
            ps.setString(8, c.getCli_cidade());
            ps.setInt(9, c.getIdusuario());
            System.out.println("sql: "+ ps.toString());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente!");
            e.printStackTrace();
        }
    }

    public void atualizar(Cliente c) {
        sql = "UPDATE cliente SET cli_nome = ?, cli_cpfcnpj = ?, cli_endereco = ?,"
                + "cli_bairro = ?, cli_cel = ?, cli_email = ?, cli_cidade = ?, "
                + "Usuario_idusuario = ? WHERE cli_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, c.getCli_nome());
            ps.setString(2, c.getCli_cpfcnpj());
            ps.setString(3, c.getCli_endereco());
            ps.setString(4, c.getCli_bairro());
            ps.setString(5, c.getCli_cel());
            ps.setString(6, c.getCli_email());
            ps.setString(7, c.getCli_cidade());
            ps.setInt(8, c.getIdusuario());
            ps.setInt(9, c.getCli_cod());

            ps.executeUpdate();
            System.out.println(ps.toString());
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente!");
            e.printStackTrace();
        }
    }

    public Cliente buscarId(int id) {
        Cliente cliente = new Cliente();
        sql = "SELECT * FROM cliente WHERE cod_cli = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cliente.setCli_cod(rs.getInt("cod_cli"));
                cliente.setCli_nome(rs.getString("cli_nome"));
                cliente.setCli_cpfcnpj(rs.getString("cli_cpfcnpj"));
                cliente.setCli_endereco(rs.getString("cli_endereco"));
                cliente.setCli_bairro(rs.getString("cli_bairro"));
                cliente.setCli_cel(rs.getString("cli_cel"));
                cliente.setCli_email(rs.getString("cli_email"));
                cliente.setIdusuario(rs.getInt("Usuario_idusuario"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente!");
            e.printStackTrace();
        }

        return cliente;
    }

    public Cliente buscarCodigo(int codigo) {
        Cliente cliente = new Cliente();
        sql = "SELECT * FROM cliente WHERE cli_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cliente.setCli_cod(rs.getInt("cli_cod"));
                cliente.setCli_nome(rs.getString("cli_nome"));
                cliente.setCli_cpfcnpj(rs.getString("cli_cpfcnpj"));
                cliente.setCli_endereco(rs.getString("cli_endereco"));
                cliente.setCli_bairro(rs.getString("cli_bairro"));
                cliente.setCli_cel(rs.getString("cli_cel"));
                cliente.setCli_email(rs.getString("cli_email"));
                cliente.setCli_cidade(rs.getString("cli_cidade"));
                cliente.setIdusuario(rs.getInt("Usuario_idusuario"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente!");
            e.printStackTrace();
        }

        return cliente;
    }

    public void excluir(Cliente c) {
        sql = "DELETE FROM cliente WHERE cod_cli = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCli_cod());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente!");
            e.printStackTrace();
        }
    }

    public int buscarProximoCodigo() {
        int codigo = 0;

        sql = "SELECT MAX(cli_cod) FROM cliente";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                codigo = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar Codigo do cliente!");
            e.printStackTrace();
        }

        return codigo + 1;
    }

    public ArrayList<Cliente> listar() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        sql = "SELECT * FROM CLIENTE";

        try {
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                int cli_cod = resultado.getInt("cli_cod");
                String cli_nome = resultado.getString("cli_nome");
                String cli_cpfcnpj = resultado.getString("cli_cpfcnpj");
                String cli_endereco = resultado.getString("cli_endereco");
                String cli_bairro = resultado.getString("cli_bairro");
                String cli_cel = resultado.getString("cli_cel");
                String cli_email = resultado.getString("cli_email");
                String cli_cidade = resultado.getString("cli_cidade");
                int idusuario = resultado.getInt("Usuario_idusuario");
                Cliente cliente = new Cliente(cli_cod, cli_nome, cli_cpfcnpj, cli_endereco, cli_bairro, cli_cel, cli_email, cli_cidade, idusuario);
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar lista de clientes!");
            e.printStackTrace();
        }

        return clientes;
    }

    public ArrayList<Cliente> pesquisarPorDescricao(String pesquisa) {
        ArrayList<Cliente> clientesPesquisados = new ArrayList<>();
        sql = "SELECT * FROM cliente WHERE nome LIKE '%" + pesquisa + "%'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                int cli_cod = rs.getInt("cli_cod");
                String cli_nome = rs.getString("cli_nome");
                String cli_cpfcnpj = rs.getString("cli_cpfcnpj");
                String cli_endereco = rs.getString("cli_endereco");
                String cli_bairro = rs.getString("cli_bairro");
                String cli_cel = rs.getString("cli_cel");
                String cli_email = rs.getString("cli_email");
                String cli_cidade = rs.getString("cli_cidade");
                int idusuario = rs.getInt("Usuario_idusuario");

                Cliente cliente = new Cliente(cli_cod, cli_nome, cli_cpfcnpj, cli_endereco, cli_bairro, cli_cel, cli_email, cli_cidade, idusuario);
                clientesPesquisados.add(cliente);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar clientes!");
            e.printStackTrace();
        }

        return clientesPesquisados;
    }

    public ArrayList<Cliente> pesquisarPorCodigo(int pesquisa) {
        ArrayList<Cliente> clientesPesquisados = new ArrayList<>();
        sql = "SELECT * FROM cliente WHERE codigo = " + pesquisa;

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {

                int cli_cod = rs.getInt("cli_cod");
                String cli_nome = rs.getString("cli_nome");
                String cli_cpfcnpj = rs.getString("cli_cpfcnpj");
                String cli_endereco = rs.getString("cli_endereco");
                String cli_bairro = rs.getString("cli_bairro");
                String cli_cel = rs.getString("cli_cel");
                String cli_email = rs.getString("cli_email");
                String cli_cidade = rs.getString("cli_cidade");
                int idusuario = rs.getInt("Usuario_idusuario");

                Cliente cliente = new Cliente(cli_cod, cli_nome, cli_cpfcnpj, cli_endereco, cli_bairro, cli_cel, cli_email, cli_cidade, idusuario);
                clientesPesquisados.add(cliente);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar codigo!");
            e.printStackTrace();
        }
        return clientesPesquisados;
    }
}
