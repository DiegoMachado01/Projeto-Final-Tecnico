package cadastro.dao;

import cadastro.entidades.Compra;
import cadastro.entidades.Itemcompra;
import cadastroprodutos.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class CompraDAO {

    Connection con = ConexaoMySql.conectarBanco();
    String sql = null;
    Statement declaracao;
    ResultSet resultado;

    public void inserir(Compra p) {
        sql = "INSERT INTO compra "
                + "(com_data, com_total, com_status, com_codusuario)"
                + " VALUES(?,?,?,?)";
        System.out.println("sql compra: " + sql);
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(p.getCom_data().getTime()));
            ps.setDouble(2, p.getCom_total());
            ps.setInt(3, p.getCom_status());
            ps.setInt(4, p.getIdusuario());
            System.out.println("ps compra: " + ps.toString());
            ps.executeUpdate();

            for (Itemcompra item : p.getItenscompra()) {
                item.setCom_cod(p.getCom_cod());
                inserirItem(item);
            }

            JOptionPane.showMessageDialog(null, "compra insercom_codo com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir compra!");
            e.printStackTrace();
        }
    }

    public void atualizar(Compra p) {
        sql = "UPDATE compra SET datacompra = ?, "
                + " com_data = ?, com_total = ?,com_status = ?,com_codusuario "
                + "WHERE com_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, p.getCom_cod());
            ps.setInt(2, p.getCom_total());
            ps.setInt(3, p.getCom_status());
            ps.setInt(4, p.getIdusuario());

            ps.executeUpdate();
            for (Itemcompra item : p.getItenscompra()) {
                atualizarItem(item);
            }
            JOptionPane.showMessageDialog(null, "compra atualizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar compra!");
            e.printStackTrace();
        }
    }

    public void excluir(Compra p) {
        sql = "DELETE FROM compra WHERE com_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, p.getId());

            for (Itemcompra item : p.getItenscompra()) {
                excluirItem(item);
            }

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "compra excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir compra!");
            e.printStackTrace();
        }
    }

    public Compra buscar(int com_cod) {
        Compra compra = new Compra();
        sql = "SELECT * FROM compra WHERE com_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, com_cod);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                compra.setId(rs.getInt("com_cod"));
                compra.setCom_data(rs.getDate("setCom_data"));
                compra.setCom_total(rs.getInt("setCom_total"));
                compra.setCom_status(rs.getInt("com_status"));
                compra.setIdusuario(rs.getInt("com_codUsuario"));
                ArrayList<Itemcompra> itens = listarItens(com_cod);
                compra.setItenscompra(itens);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar compra!");
            e.printStackTrace();
        }

        return compra;
    }

    public ArrayList<Compra> listar() {
        ArrayList<Compra> compras = new ArrayList<>();
        sql = "SELECT * FROM compra";

        try {
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                int com_cod = resultado.getInt("com_cod");
                Date com_data = resultado.getDate("com_data");
                int com_total = resultado.getInt("com_total");
                int com_status = resultado.getInt("com_status");
                int idusuario = resultado.getInt("idusuario");

                ArrayList<Itemcompra> itens = listarItens(com_cod);

                Compra compra = new Compra(com_cod, com_data, com_total, com_status, idusuario, itens);
                compras.add(compra);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar lista de usuarios!");
            e.printStackTrace();
        }

        return compras;
    }

    public int buscarId() {
        int com_cod = 0;

        sql = "SELECT MAX(com_cod) FROM compra";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                com_cod = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar Id!");
            e.printStackTrace();
        }

        return com_cod + 1;
    }

    private ArrayList<Itemcompra> listarItens(int com_codcompra) {
        ArrayList<Itemcompra> itens = new ArrayList<>();
        return itens;
    }

    /**
     * MÉTODOS PARA MANIPULAÇÃO DE ITENS DE PEDIDO *
     */
    private void inserirItem(Itemcompra i) {
        sql = "INSERT INTO itemcompra "
                + "(com_codcompra, com_codProduto,"
                + "qtd, valorUnitario, valorTotalItem) VALUES(?,?,?,?,?,?)";
        System.out.println("sql item: " + sql);
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getItc_cod());
            ps.setFloat(2, i.getItc_qtde());
            ps.setDouble(4, i.getItc_valorunitario());
            ps.setDouble(3, i.getItc_valortotal());
            ps.setDouble(5, i.getCom_cod());
            ps.setInt(5, i.getIdusuario());
            System.out.println("ps item: " + ps.toString());
            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Item!");
            e.printStackTrace();
        }
    }

    private void atualizarItem(Itemcompra i) {
        sql = "UPDATE itemcompra SET  itc_qtde = ?,"
                + "itc_valorunitario = ?, itc_valortotal = ?,idusuario =? WHERE com_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getItc_cod());
            ps.setFloat(2, i.getItc_qtde());
            ps.setDouble(4, i.getItc_valorunitario());
            ps.setDouble(3, i.getItc_valortotal());
            ps.setDouble(5, i.getCom_cod());
            ps.setInt(5, i.getIdusuario());

            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar item!");
            e.printStackTrace();
        }
    }

    private void excluirItem(Itemcompra i) {
        sql = "DELETE FROM itemcompra WHERE com_cod = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getItc_cod());
            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir item!");
            e.printStackTrace();
        }
    }

}
