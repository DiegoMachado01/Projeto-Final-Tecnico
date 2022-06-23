package cadastro.dao;

import cadastro.entidades.ItemPedido;
import cadastro.entidades.Pedido;
import cadastroprodutos.ConexaoMySql;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoDAO {

    Connection con = ConexaoMySql.conectarBanco();
    String sql = null;
    Statement declaracao;
    ResultSet resultado;

    public void inserir(Pedido p) {
        sql = "INSERT INTO pedido "
                + "(dataPedido, idCliente, valorTotalPedido, idUsuario)"
                + " VALUES(?,?,?,?)";
        System.out.println("sql Pedido: " + sql);
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(p.getDataPedido().getTime()));
            ps.setInt(2, p.getIdCliente());
            ps.setDouble(3, p.getValorTotalPedido());
            ps.setInt(4, p.getIdUsuario());
            System.out.println("ps Pedido: " + ps.toString());
            ps.executeUpdate();

            for (ItemPedido item : p.getItensPedido()) {
                item.setIdPedido(p.getId());
                inserirItem(item);
            }

            JOptionPane.showMessageDialog(null, "Pedido inserido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir pedido!");
            e.printStackTrace();
        }
    }

    public void atualizar(Pedido p) {
        sql = "UPDATE pedido SET dataPedido = ?, "
                + "idCliente = ?, valorTotalPedido = ?, idUsuario = ? "
                + "WHERE id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, new java.sql.Date(p.getDataPedido().getTime()));
            ps.setInt(2, p.getIdCliente());
            ps.setDouble(3, p.getValorTotalPedido());
            ps.setInt(2, p.getIdUsuario());
            ps.setInt(5, p.getId());

            ps.executeUpdate();
            for (ItemPedido item : p.getItensPedido()) {
                atualizarItem(item);
            }
            JOptionPane.showMessageDialog(null, "Pedido atualizado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar pedido!");
            e.printStackTrace();
        }
    }

    public void excluir(Pedido p) {
        sql = "DELETE FROM pedido WHERE id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, p.getId());

            for (ItemPedido item : p.getItensPedido()) {
                excluirItem(item);
            }

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pedido excluído com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir pedido!");
            e.printStackTrace();
        }
    }

    public Pedido buscar(int id) {
        Pedido pedido = new Pedido();
        sql = "SELECT * FROM pedido WHERE id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                pedido.setId(rs.getInt("id"));
                pedido.setDataPedido(rs.getDate("dataPedido"));
                pedido.setIdCliente(rs.getInt("idCliente"));
                pedido.setValorTotalPedido(rs.getDouble("valorTotalPedido"));
                pedido.setIdUsuario(rs.getInt("idUsuario"));
                ArrayList<ItemPedido> itens = listarItens(id);
                pedido.setItensPedido(itens);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar pedido!");
            e.printStackTrace();
        }

        return pedido;
    }

    public ArrayList<Pedido> listar() {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        sql = "SELECT * FROM pedido";

        try {
            Statement st = con.createStatement();
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                int id = resultado.getInt("id");
                Date dataPedido = resultado.getDate("dataPedido");
                int idCliente = resultado.getInt("idCliente");
                double valorTotalPedido = resultado.getDouble("valorTotalPedido");
                int idUsuario = resultado.getInt("idUsuario");

                ArrayList<ItemPedido> itens = listarItens(id);

                Pedido pedido = new Pedido(id, dataPedido, idCliente,
                        valorTotalPedido, idUsuario, itens);
                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar lista de usuarios!");
            e.printStackTrace();
        }

        return pedidos;
    }

    public int buscarId() {
        int id = 0;

        sql = "SELECT MAX(id) FROM pedido";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.first()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar Id!");
            e.printStackTrace();
        }

        return id + 1;
    }

    private ArrayList<ItemPedido> listarItens(int idPedido) {
        ArrayList<ItemPedido> itens = new ArrayList<>();
        return itens;
    }

    /**
     * MÉTODOS PARA MANIPULAÇÃO DE ITENS DE PEDIDO *
     */
    private void inserirItem(ItemPedido i) {
        sql = "INSERT INTO itemPedido "
                + "(idPedido, idProduto,"
                + "qtd, valorUnitario, valorTotalItem) VALUES(?,?,?,?,?)";
        System.out.println("sql item: " + sql);
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getIdPedido());
            ps.setInt(2, i.getIdProduto());
            ps.setDouble(3, i.getQtd());
            ps.setDouble(4, i.getValorUnitario());
            ps.setDouble(5, i.getValorTotalItem());
            System.out.println("ps item: " + ps.toString());
            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Item!");
            e.printStackTrace();
        }
    }

    private void atualizarItem(ItemPedido i) {
        sql = "UPDATE itemPedido SET qtd = ?, valorUnitario = ?,"
                + "valorTotalItem = ?, idProduto = ? WHERE id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, i.getQtd());
            ps.setDouble(2, i.getValorUnitario());
            ps.setDouble(3, i.getValorTotalItem());
            ps.setInt(4, i.getIdProduto());
            ps.setInt(5, i.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar item!");
            e.printStackTrace();
        }
    }

    private void excluirItem(ItemPedido i) {
        sql = "DELETE FROM itemPedido WHERE id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir item!");
            e.printStackTrace();
        }
    }

}
