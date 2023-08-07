/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto.jdbc.ConnectionFactory;
import projeto.model.Vendas;

/**
 *
 * @author ander
 */
public class VendasDAO {

    /**
     *
     */
    private Connection con;

    /**
     *
     */
    public VendasDAO() {
        this.con = new ConnectionFactory().getConnection();
    
}
    
// Cadastrar Venda

    /**
     *
     * @param obj
     */
public void cadastrarVenda(Vendas obj){
    try {
  String sql = "insert into tb_vendas(cliente_id,data_venda,total_venda,observacoes)values(?,?,?,?)";
        
    //conectar banco de dados e organizar o sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getCliente().getCod_cliente());
            stmt.setString(2, obj.getData_venda());
            stmt.setDouble(3, obj.getTotal_venda());
            stmt.setString(4, obj.getObs());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro:" + erro);
        } 
}
    
    
    //Retorna Ultima Venda 

    /**
     *
     * @return
     */
    public int retornaultimavenda(){
             try {
            int idvenda = 0;

            String sql = "select max(id) id from tb_vendas";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Vendas p = new Vendas();

                p.setId(rs.getInt("id"));
                idvenda = p.getId();
            }

            return idvenda;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }   
        
        
    }
    





}
