
package Model;

public class Model_TipoCad {
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

    @Override
    public String toString() {
        return getTipo();
    }
    
    
}
