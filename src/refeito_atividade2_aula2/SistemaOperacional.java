/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeito_atividade2_aula2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Senac Sistemas
 */
public class SistemaOperacional {
    private List<Processo> listaProcessos;
    private List<Integer> listaIds;
    private int qtdProcessos;
    
    public SistemaOperacional(){
        this.listaProcessos = new ArrayList<>();
        this.listaIds = new ArrayList<>();
        this.qtdProcessos = 5;
        Processador processador = new Processador();
    }
    
    public void Executar() throws InterruptedException{
        Processador processador = new Processador();
        for (int i = 0; i < this.qtdProcessos; i++) {
            int id  = 0;
            do {
                id = (int)(Math.random()*100+1);
            } while (listaIds.contains(id));
            this.listaIds.add(id);
            Processo proc = new Processo(id);
            this.listaProcessos.add(proc);
            
        }
        processador.ExecutarProcessos(listaProcessos);
    }
}
