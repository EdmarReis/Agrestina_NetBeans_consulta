/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import utils.ConnectionFactory;

/**
 *
 * @author edmar_sr
 */
public class ClienteDAO {
    java.sql.Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    public List listarCliente() {
        conexao = ConnectionFactory.conector();
        String sql = "select * from clientes where ativo = true order by nome ASC";
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                String nomeCliente = rs.getString("nome");
                Cliente cliente = new Cliente(nomeCliente);
                listaClientes.add(cliente);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaClientes;
    }
    
    public List listarClientePeloNome(String nome) {
        conexao = ConnectionFactory.conector();
        String sql = "select * from clientes where nome like ?";
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome + "%");
            rs = pst.executeQuery();
            
            while (rs.next()) {
                String nomeCliente = rs.getString("nome");
                Cliente cliente = new Cliente(nomeCliente);
                listaClientes.add(cliente);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listaClientes;
    }
    
    public void excluirCliente(String cnpjCpf) {
        conexao = ConnectionFactory.conector();
        String sql = "delete from clientes where cpf_cnpj = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, cnpjCpf);
            boolean alteracao = pst.execute();
            JOptionPane.showMessageDialog(null, "O Cliente com CNPJ/CPF " + cnpjCpf + " foi excluído", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
