/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Pedido;
import model.Produto;
import utils.ConnectionFactory;
import view.TelaPdv;

/**
 *
 * @author edmar_sr
 */
public class PedidoDAO {
    
    java.sql.Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    public int numeroPedido() {
        conexao = ConnectionFactory.conector();
        String sql = "select * from pedido order by id desc limit 1";
        int numero = 0;
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                numero = rs.getInt("id");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return numero;
    } 
    
    public void insertPedido(Cliente nomeCliente, Produto precoTotal) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        conexao = ConnectionFactory.conector();
        TelaPdv cad = new TelaPdv();
        
        String sql = "insert into pedido (nome_cliente, total) values (?,?)";
        
         try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nomeCliente.getNome());
            pst.setObject(2, precoTotal.getPrecoTotal());
            pst.execute();
            
            String numeroPedido = String.valueOf(numeroPedido());

            JOptionPane.showMessageDialog(null, "Pedido número "+numeroPedido+" incluído com sucesso");

        } catch (SQLIntegrityConstraintViolationException e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Número de pedido ja usado." + "\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!!!", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
