/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import projeto.jdbc.ConnectionFactory;
import projeto.model.ItemVenda;

/**
 *
 * @author ander
 */
public class ItemVendaDAO {
    
    /**
     *
     */
    private Connection con;

    /**
     *
     */
    public ItemVendaDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
   // Metodo Cadastra Item 

    /**
     *
     * @param obj
     */
    public void cadastraitem(ItemVenda obj){
                try {

            String sql = "insert into tb_itensvendas (venda_id, produto_id,qtd,subtotal) values (?,?,?,?)";
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());

            stmt.execute();
            stmt.close();
            

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro : " + erro);

        }
        
        
        
        
        
    }
    
    
}
