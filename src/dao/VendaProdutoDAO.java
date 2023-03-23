/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Produto;
import utils.ConnectionFactory;

/**
 *
 * @author edmar_sr
 */
public class VendaProdutoDAO {
    
    java.sql.Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void insertVendaProduto(String codigoProduto, String nomeProduto, Double quantidade, Double precoUnitario, Object desconto, Object precoTotal, String formaPagamento, String data, String operador, String nomeCliente) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        conexao = ConnectionFactory.conector();
        String sql = "insert into vendaProduto (id_pedido,nome_cliente,nome_produto,codigo_produto,preco_unitario,quantidade,desconto,total,operador,data_pedido,forma_pagamento) values (?,?,?,?,?,?,?,?,?,?,?)";
        PedidoDAO numeroPedido = new PedidoDAO();
        int idPedido = numeroPedido.numeroPedido();
        
         try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idPedido+1);
            pst.setString(2, nomeCliente);
            pst.setString(3, nomeProduto);
            pst.setString(4, codigoProduto);
            pst.setDouble(5, precoUnitario);
            pst.setDouble(6, quantidade);
            pst.setObject(7, desconto);
            pst.setObject(8, precoTotal);
            pst.setString(9, operador);
            pst.setString(10, data);
            pst.setString(11, formaPagamento);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Item incluído com sucesso.");

        } catch (SQLIntegrityConstraintViolationException e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Erro na inclusão de item" + "\n" + e, "Erro!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
