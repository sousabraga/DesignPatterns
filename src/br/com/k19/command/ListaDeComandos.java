/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class ListaDeComandos {

    private List<Comando> comandos = new ArrayList<>();
    
    public void adiciona(Comando comando) {
        this.comandos.add(comando);
    }
    
    public void executa() {
        this.comandos.stream().forEach(comando -> comando.executa());
    }
}
