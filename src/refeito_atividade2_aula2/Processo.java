/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeito_atividade2_aula2;

/**
 *
 * @author Senac Sistemas
 */
public class Processo {
    private int tempoEx;
    private int id;
    private int tipoProc;

    public int getTempoEx() {
        return tempoEx;
    }

    public int getId() {
        return id;
    }

    public int getTipoProc() {
        return tipoProc;
    }
    
    Processo(Integer id){
        this.tipoProc = (int)(Math.random()*2);
        this.tempoEx = (int)(Math.random()*6);
        this.id = id;
        
    }
}
