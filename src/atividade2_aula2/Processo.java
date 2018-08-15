/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2_aula2;

/**
 *
 * @author Senac Sistemas
 */
public class Processo {

    private int contador;
    private String tipoProcesso;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getTipoProcesso() {
        return tipoProcesso;
    }

    public void setTipoProcesso(String tipoProcesso) {
        this.tipoProcesso = tipoProcesso;
    }

    public Processo(Integer ct, String tp) {
        this.contador = ct;
        this.tipoProcesso = tp;
    }
}
