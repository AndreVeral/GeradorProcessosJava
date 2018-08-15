/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeito_atividade2_aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Senac Sistemas
 */
public class Processador {

    private List<Object> processosExec;

    Processador() {
        this.processosExec = new ArrayList<>();
    }

    public void ExecutarProcessos(List<Processo> listaProcessos) throws InterruptedException {
        do {
            System.out.println("Tamanho da lista: " + listaProcessos.size());
            System.out.println("Executando primeiro processo");
            Processo proc = listaProcessos.remove(0);
            int tmpExec = proc.getTempoEx();
            System.out.println("Tempo para execução: " + tmpExec);
            TimeUnit.SECONDS.sleep(tmpExec);
            System.out.println("Processo Finalizado");
            this.processosExec.add(proc);
            System.out.println("Processos Encerrados"
                    + this.processosExec.size());
        } while (listaProcessos.size() > 0);
        
        System.out.println("Finalizado");

    }

}
