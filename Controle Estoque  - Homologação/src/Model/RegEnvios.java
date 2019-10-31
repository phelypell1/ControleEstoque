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
public class RegEnvios {
    private int id_envio;
    private String cidade;
    private ModelTransportadora transp;
    private String data_envio;
    private String enviadopor;
    private String destinatario;
    private boolean devolvido;

    /**
     * @return the id_envio
     */
    public int getId_envio() {
        return id_envio;
    }

    /**
     * @param id_envio the id_envio to set
     */
    public void setId_envio(int id_envio) {
        this.id_envio = id_envio;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the transp
     */
    public ModelTransportadora getTransp() {
        return transp;
    }

    /**
     * @param transp the transp to set
     */
    public void setTransp(ModelTransportadora transp) {
        this.transp = transp;
    }

    /**
     * @return the data_envio
     */
    public String getData_envio() {
        return data_envio;
    }

    /**
     * @param data_envio the data_envio to set
     */
    public void setData_envio(String data_envio) {
        this.data_envio = data_envio;
    }

    /**
     * @return the enviadopor
     */
    public String getEnviadopor() {
        return enviadopor;
    }

    /**
     * @param enviadopor the enviadopor to set
     */
    public void setEnviadopor(String enviadopor) {
        this.enviadopor = enviadopor;
    }

    /**
     * @return the destinatario
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * @return the devolvido
     */
    public boolean isDevolvido() {
        return devolvido;
    }

    /**
     * @param devolvido the devolvido to set
     */
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}
