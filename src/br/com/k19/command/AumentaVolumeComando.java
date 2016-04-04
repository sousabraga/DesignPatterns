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
public class AumentaVolumeComando implements Comando {
    
    private Player player;
    private int levels;
    
    public AumentaVolumeComando(Player player, int levels) {
        this.player = player;
        this.levels = levels;
    }

    @Override
    public void executa() {
        this.player.increaseVolume(levels);
    }
}
