/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author phelype
 */
public class RetEstoqueM {
    
    private int id_hts;
    private Model_Estoque estoque_id;
    private Date data_alteracao;
    private String editado;
    private int quant_retirado;

    /**
     * @return the id_hts
     */
    public int getId_hts() {
        return id_hts;
    }

    /**
     * @param id_hts the id_hts to set
     */
    public void setId_hts(int id_hts) {
        this.id_hts = id_hts;
    }

    /**
     * @return the estoque_id
     */
    public Model_Estoque getEstoque_id() {
        return estoque_id;
    }

    /**
     * @param estoque_id the estoque_id to set
     */
    public void setEstoque_id(Model_Estoque estoque_id) {
        this.estoque_id = estoque_id;
    }

    /**
     * @return the data_alteracao
     */
    public Date getData_alteracao() {
        return data_alteracao;
    }

    /**
     * @param data_alteracao the data_alteracao to set
     */
    public void setData_alteracao(Date data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    /**
     * @return the editado
     */
    public String getEditado() {
        return editado;
    }

    /**
     * @param editado the editado to set
     */
    public void setEditado(String editado) {
        this.editado = editado;
    }

    /**
     * @return the quant_retirado
     */
    public int getQuant_retirado() {
        return quant_retirado;
    }

    /**
     * @param quant_retirado the quant_retirado to set
     */
    public void setQuant_retirado(int quant_retirado) {
        this.quant_retirado = quant_retirado;
    }
    
    
   
    
}
