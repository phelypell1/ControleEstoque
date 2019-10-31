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
public class RegItens {
    private int id_reg;
    private RegEnvios envio_id;
    private String descricao;
    private ItensReg item;

    /**
     * @return the id_reg
     */
    public int getId_reg() {
        return id_reg;
    }

    /**
     * @param id_reg the id_reg to set
     */
    public void setId_reg(int id_reg) {
        this.id_reg = id_reg;
    }

    /**
     * @return the envio_id
     */
    public RegEnvios getEnvio_id() {
        return envio_id;
    }

    /**
     * @param envio_id the envio_id to set
     */
    public void setEnvio_id(RegEnvios envio_id) {
        this.envio_id = envio_id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the item
     */
    public ItensReg getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(ItensReg item) {
        this.item = item;
    }
}
