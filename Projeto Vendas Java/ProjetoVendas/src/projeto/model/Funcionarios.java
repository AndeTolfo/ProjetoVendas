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
public class Funcionarios extends Clientes {
    
    //atributos

    /**
     *
     */
    private String senha;

    /**
     *
     */
    private String cargo;

    /**
     *
     */
    private String nivel_acesso;
    
    //getter e setters

    /**
     *
     * @return
     */

    public String getSenha() {
        return senha;
    }

    /**
     *
     * @param senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     *
     * @return
     */
    public String getCargo() {
        return cargo;
    }

    /**
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     *
     * @return
     */
    public String getNivel_acesso() {
        return nivel_acesso;
    }

    /**
     *
     * @param nivel_acesso
     */
    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }
    
    
}
