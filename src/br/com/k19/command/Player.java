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
public class Player {
    
    public void play(String fileName) throws InterruptedException {
        System.out.println("Tocando o arquivo " + fileName);
        long duracao = (long) (Math.random()*2000);
        System.out.println("Duração (s): " + duracao/1000.0);
        Thread.sleep(duracao);
        System.out.println("Fim");
    }
    
    public void increaseVolume(int levels) {
        System.out.println("Aumentando o volume em: " + levels);
    }
    
    
    public void decreaseVolume(int levels) {
        System.out.println("Diminuindo o volume em: " + levels);
    }
}
