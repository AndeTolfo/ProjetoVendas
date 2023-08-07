/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.model;

/**
 *
 * @author ander
 */
public class Vendas {
    //Atributos

    /**
     *
     */
    private int id;

    /**
     *
     */
    public Clientes cliente;

    /**
     *
     */
    private String data_venda;

    /**
     *
     */
    private double total_venda;

    /**
     *
     */
    private String obs;
    
    //Getter e Setters

    /**
     *
     * @return
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public Clientes getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente
     */
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    /**
     *
     * @return
     */
    public String getData_venda() {
        return data_venda;
    }

    /**
     *
     * @param data_venda
     */
    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    /**
     *
     * @return
     */
    public double getTotal_venda() {
        return total_venda;
    }

    /**
     *
     * @param total_venda
     */
    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

    /**
     *
     * @return
     */
    public String getObs() {
        return obs;
    }

    /**
     *
     * @param obs
     */
    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
    
    
}
