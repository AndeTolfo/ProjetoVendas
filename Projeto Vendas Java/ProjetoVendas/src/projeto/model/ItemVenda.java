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
public class ItemVenda {
   // Atributos

    /**
     *
     */
    private int id;

    /**
     *
     */
    private Vendas venda;

    /**
     *
     */
    private Produtos produto;

    /**
     *
     */
    private int qtd;

    /**
     *
     */
    private double subtotal;
    
    // Getter e Setters

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
    public Vendas getVenda() {
        return venda;
    }

    /**
     *
     * @param venda
     */
    public void setVenda(Vendas venda) {
        this.venda = venda;
    }

    /**
     *
     * @return
     */
    public Produtos getProduto() {
        return produto;
    }

    /**
     *
     * @param produto
     */
    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    /**
     *
     * @return
     */
    public int getQtd() {
        return qtd;
    }

    /**
     *
     * @param qtd
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     *
     * @return
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     *
     * @param subtotal
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
