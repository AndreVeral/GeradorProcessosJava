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
    private int tempoEspera;

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

    public void ExecutarProcessosRound() throws InterruptedException {
        int quantum = 2;
        //percorrer a lista
        //verificar se cada processo da lista tem um tempo maior que quantum
        //1caso tenha, sleep quantum, diminuir tempo exec do processo, jogar no 
        //final da fila
        //2caso não tenha, executa tmp processo, joga lista finalizados
        while(!this.processosExec.isEmpty()){
            Processo proc = this.processosExec.remove(0);
            
            if(proc.time > quantum){
                TimeUnit.SECONDS.sleep(quantum);
                proc.setTime(proc.time-quantum);
                this.processosExec.add(proc);
        }else{
                TimeUnit.SECONDS.sleep(proc.time);
                proc.setTime(0);
                this.listProcessosExecutados.add(proc);
            }
    }
}
