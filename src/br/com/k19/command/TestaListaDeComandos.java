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
public class TestaListaDeComandos {
    
    public static void main(String[] args) {
        
        Player player = new Player();
        ListaDeComandos listaDeComandos = new ListaDeComandos();
        
        listaDeComandos.adiciona(new TocaMusicaComando(player, "musica1.mp3"));
        listaDeComandos.adiciona(new AumentaVolumeComando(player, 3));
        listaDeComandos.adiciona(new TocaMusicaComando(player, "musica2.mp3"));
        listaDeComandos.adiciona(new DiminuiVolumeComando(player, 3));
        listaDeComandos.adiciona(new TocaMusicaComando(player, "musica3.mp3"));
  
        listaDeComandos.executa();
    }
}
