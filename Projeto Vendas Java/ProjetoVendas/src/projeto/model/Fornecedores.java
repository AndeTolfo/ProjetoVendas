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
public class Fornecedores extends Clientes{
    //atributos

    /**
     *
     */
    private String cnpj;
    
    //getter e setters 

    /**
     *
     * @return
     */

    public String getCnpj() {
        return cnpj;
    }

    /**
     *
     * @param cnpj
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
    @Override 
    public String toString(){
        return this.getNome();
    }
}
