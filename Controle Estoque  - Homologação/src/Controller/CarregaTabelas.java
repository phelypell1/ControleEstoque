/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB_Conexao.ConexaoMySql;
import Model.Controle_Login;
import Model.Controle_Perfil;
import Model.Controle_Usuarios;
import Model.HtsEstoque;
import Model.ItensReg;
import Model.ModelLogin;
import Model.ModelPerfil;
import Model.Model_Cadastro;
import Model.Model_Estoque;
import Model.RegEnvios;
import Model.RegItens;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class CarregaTabelas {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public String dataUS(String data) {
        Model_Cadastro model = new Model_Cadastro();

        String dia = model.getDataCompra().substring(0, 2);
        String mes = model.getDataCompra().substring(3, 5);
        String ano = model.getDataCompra().substring(6);
        String dataf = dia + "-" + mes + "-" + ano;
        return dataf;
    }

    public String Convert(String valor) {
        RegEnvios reg = new RegEnvios();

        return valor;
    }

    public List<Model_Estoque> CarregaTabelaN() {
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<Model_Estoque> Tabela = new ArrayList<>();

        try {
            sql = "Select id_estoque, descricao, quant ,data_cadastro, user_cad, status from Estoque order by descricao";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Model_Estoque model = new Model_Estoque();
                model.setId_estoque(rs.getInt("id_estoque"));
                model.setDescricao(rs.getString("descricao"));
                if(rs.getInt("quant") < 5){
                    JOptionPane.showMessageDialog(null, "Atenção ! \n O produto "+rs.getString("descricao")+" está abaixo da quantidade recomenda");
                }else{
                model.setQuant(rs.getInt("quant"));
                }
                model.setData_cadastro(sdf.format(rs.getDate("data_cadastro")));
                model.setUser_cad(rs.getString("user_cad"));
                model.setStatus(rs.getString("status"));

                Tabela.add(model);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            ConexaoMySql.CloseConection(conn);
        }

        return Tabela;
    }

    public List<Model_Estoque> BuscaTabela(String valor) {
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        List<Model_Estoque> Tabela = new ArrayList<>();

        try {
            sql = "Select id_estoque,descricao, quant,data_cadastro, user_cad, status from Estoque"
                    + " where id_estoque like ? "
                    + " or descricao like ?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + valor + "%");
            pst.setString(2, "%" + valor + "%");

            rs = pst.executeQuery();
            while (rs.next() == true) {

                Model_Estoque model = new Model_Estoque();

                model.setId_estoque(rs.getInt("id_estoque"));
                model.setDescricao(rs.getString("descricao"));
                model.setQuant(rs.getInt("quant"));
                model.setData_cadastro(sdf.format(rs.getDate("data_cadastro")));
                model.setUser_cad(rs.getString("user_cad"));
                model.setStatus(rs.getString("status"));

                Tabela.add(model);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            ConexaoMySql.CloseConection(conn);
        }

        return Tabela;
    }

    public List<RegItens> CarregaHtsEstoque() {
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        ResultSet rs;
        String sql;
        List<RegItens> Tabela = new ArrayList<>();

        try {
            sql = "select item, descricao_item from RegItens "
                    + "inner join Itens_Reg on id_itens = tipo_item "
                    + "order by id_reg desc limit 1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                RegItens reg = new RegItens();
                ItensReg item = new ItensReg();

                item.setItem(rs.getString("item"));
                reg.setItem(item);

                reg.setDescricao(rs.getString("descricao_item"));
                Tabela.add(reg);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            ConexaoMySql.CloseConection(conn, pst);
        }

        return Tabela;
    }

    public List<RegEnvios> RegEnvios() {
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        ResultSet rs;
        String sql;
        List<RegEnvios> Tabela = new ArrayList<>();

        try {
            sql = "select id_envio, cidade, data_envio, enviadoPor, devolvido from RegEnvios";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                RegEnvios reg = new RegEnvios();
                reg.setId_envio(rs.getInt("id_envio"));
                reg.setCidade(rs.getString("cidade"));
                reg.setData_envio(sdf.format(rs.getDate("data_envio")));
                reg.setEnviadopor(rs.getString("enviadoPor"));
                reg.setDevolvido(rs.getBoolean("devolvido"));
                Tabela.add(reg);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            ConexaoMySql.CloseConection(conn, pst);
        }
        return Tabela;
    }

    public List<HtsEstoque> RegHts() {
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        ResultSet rs;
        String sql;
        List<HtsEstoque> Tabela = new ArrayList<>();

        try {
            sql = "select id_hts, item_retirado, data_alteracao, editado, quant_retirado, obs from HtsEstoque";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                HtsEstoque ht = new HtsEstoque();
                Model_Estoque est = new Model_Estoque();

                ht.setId_hts(rs.getInt("id_hts"));
                //ht.setIdEstoque(rs.getString("estoque_id"));
                ht.setItem_retirado(rs.getString("item_retirado"));
                ht.setData_alteracao(sdf.format(rs.getDate("data_alteracao")));
                ht.setEditado(rs.getString("editado"));
                ht.setQuant_retirado(rs.getInt("quant_retirado"));
                ht.setObs(rs.getString("obs"));
                Tabela.add(ht);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            ConexaoMySql.CloseConection(conn, pst);
        }
        return Tabela;
    }

    public List<HtsEstoque> BuscaRel(String valor) {
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        ResultSet rs;
        String sql;
        List<HtsEstoque> Tabela = new ArrayList<>();

        try {
            sql = "select id_hts, item_retirado, data_alteracao, editado, quant_retirado, obs from HtsEstoque"
                    + " where item_retirado like ? ";
                    

            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + valor + "%");
            

            rs = pst.executeQuery();
            while (rs.next() == true) {

                HtsEstoque model = new HtsEstoque();

                model.setId_hts(rs.getInt("id_hts"));
                model.setItem_retirado(rs.getString("item_retirado"));
                model.setData_alteracao(sdf.format(rs.getDate("data_alteracao")));
                model.setEditado(rs.getString("editado"));
                model.setQuant_retirado(rs.getInt("quant_retirado"));
                model.setObs(rs.getString("obs"));

                Tabela.add(model);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            ConexaoMySql.CloseConection(conn, pst);
        }
        return Tabela;
    }
    
    public List<Controle_Usuarios> ListaUsuarios() {
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        ResultSet rs;
        String sql;
        List<Controle_Usuarios> usuarios = new ArrayList<>();

        try {
            sql = "select Login, Perfil, nome, EhAtivo, DataCadastro, Email, Cargo, Regiao, Imagem "
                    + "from Usuario"
                    + "inner join Login on idLogin = idLogin "
                    + "iner join Perfil on idPerfil = idPerfil";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Controle_Usuarios user = new Controle_Usuarios();
                ModelLogin login = new ModelLogin();
                ModelPerfil perfil = new ModelPerfil();
                
                login.setLogin(rs.getString("Login"));
                user.setIdLogin(login);
                perfil.setPerfil(rs.getString("Perfil"));
                user.setIdPerfil(perfil);
                user.setNome(rs.getString("Nome"));
                user.setEhativo(rs.getBoolean("EhAtivo"));
                user.setData(dataUS(rs.getString("DataCadastro")));
                user.setEmail(rs.getString("Email"));
                user.setCargo(rs.getString("Cargo"));
                user.setRegiao(rs.getString("Regiao"));
                user.setImagem((Image) rs.getBlob("Imagem"));
                usuarios.add(user);
               
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
            ConexaoMySql.CloseConection(conn, pst);
        }
        return usuarios;
    }
}