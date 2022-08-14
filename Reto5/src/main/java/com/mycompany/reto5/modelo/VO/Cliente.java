package com.mycompany.reto5.modelo.VO;


public class Cliente {
    private int id_compra;
    private String Constructura;
    private String Banco;

    public Cliente() {
    }

    public Cliente(int id_compra, String Constructura, String Banco) {
        this.id_compra = id_compra;
        this.Constructura = Constructura;
        this.Banco = Banco;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getConstructura() {
        return Constructura;
    }

    public void setConstructura(String Constructura) {
        this.Constructura = Constructura;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_compra=" + id_compra + ", Constructura=" + Constructura + ", Banco=" + Banco + '}';
    }

    public void setConstructora(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getConstructora() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
