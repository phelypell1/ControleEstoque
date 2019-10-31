/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author phelype
 */
public class ItensReg {
    private int id_itens;
    private String item;
    private String data_cadastro;

    /**
     * @return the id_itens
     */
    public int getId_itens() {
        return id_itens;
    }

    /**
     * @param id_itens the id_itens to set
     */
    public void setId_itens(int id_itens) {
        this.id_itens = id_itens;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the data_cadastro
     */
    public String getData_cadastro() {
        return data_cadastro;
    }

    /**
     * @param data_cadastro the data_cadastro to set
     */
    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    @Override
    public String toString() {
        return getItem();
    }
    
    
    
}
