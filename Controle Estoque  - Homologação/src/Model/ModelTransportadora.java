package Model;

public class ModelTransportadora {
    private int id_transp;
    private String transportadora;
    private boolean ativa;
    private String data_cadastro;

    /**
     * @return the id_transp
     */
    public int getId_transp() {
        return id_transp;
    }

    /**
     * @param id_transp the id_transp to set
     */
    public void setId_transp(int id_transp) {
        this.id_transp = id_transp;
    }

    /**
     * @return the transportadora
     */
    public String getTransportadora() {
        return transportadora;
    }

    /**
     * @param transportadora the transportadora to set
     */
    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
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

    /**
     * @return the ativa
     */
    public boolean isAtiva() {
        return ativa;
    }

    /**
     * @param ativa the ativa to set
     */
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return getTransportadora();
    }
}
