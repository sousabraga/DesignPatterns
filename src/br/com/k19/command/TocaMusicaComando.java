/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.command;

/**
 *
 * @author matheus
 */
public class TocaMusicaComando implements Comando {

    private Player player;
    private String file;
    
    public TocaMusicaComando(Player player, String file) {
        this.player = player;
        this.file = file;
    }
    
    @Override
    public void executa() {
        try {
            this.player.play(this.file);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
