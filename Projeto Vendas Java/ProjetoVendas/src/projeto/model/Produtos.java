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
public class Produtos {
   
    //Atributos

    /**
     *
     */
    private int id;

    /**
     *
     */
    private String descricao;

    /**
     *
     */
    private double preco;

    /**
     *
     */
    private int qtd_estoque;

    /**
     *
     */
    private Fornecedores fornecedor;
    
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
    public String getDescricao() {
        return descricao;
    }

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     *
     * @return
     */
    public double getPreco() {
        return preco;
    }

    /**
     *
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     *
     * @return
     */
    public int getQtd_estoque() {
        return qtd_estoque;
    }

    /**
     *
     * @param qtd_estoque
     */
    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    /**
     *
     * @return
     */
    public Fornecedores getFornecedor() {
        return fornecedor;
    }

    /**
     *
     * @param fornecedor
     */
    public void setFornecedor(Fornecedores fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
}
