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
public class TipoEquipamento {
    private int codigo_tipo;
    private String tipo;

    /**
     * @return the codigo_tipo
     */
    public int getCodigo_tipo() {
        return codigo_tipo;
    }

    /**
     * @param codigo_tipo the codigo_tipo to set
     */
    public void setCodigo_tipo(int codigo_tipo) {
        this.codigo_tipo = codigo_tipo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
