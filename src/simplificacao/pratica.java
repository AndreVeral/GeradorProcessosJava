/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplificacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Senac Sistemas
 */
public class pratica {
    public static void main(String[] args) {
        List<processo> processos = new ArrayList<>();
        List<Integer> listaIds = new ArrayList<>();
        List<Integer> tempo = new ArrayList<>();
        int tmp;
       
        for (int i = 0; i < 5; i++) {
           processo p = new processo();
           tmp = p.id;
           listaIds.add(tmp);
           tmp = p.tmpProcesso;
           tempo.add(tmp);
           processos.add(p);
        }
        for (int i = 0; i < 5; i++) {
            
            System.out.println(tempo.get(i));
        }
        
    }
}

class processo{
    int tmpProcesso;
    int id;
    processo(){
        this.tmpProcesso = (int)(Math.random()*5);
        this.id = (int)(Math.random()*100);
    }
}