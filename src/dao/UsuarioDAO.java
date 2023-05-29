/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import utils.ConnectionFactory;

/**
 *
 * @author edmar_sr
 */
public class UsuarioDAO {
    
    java.sql.Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public int verificaPerfil(String nome){
        
        conexao = ConnectionFactory.conector(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String sql = "select perfil from login where nome = ?";
        int perfilUsuario = 0;
        
        try {
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                perfilUsuario = rs.getInt("perfil");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return perfilUsuario;
    }
    
}
