/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.bridge;

/**
 *
 * @author matheus
 */
public class TesteRecibo {
    
    public static void main(String[] args) {
        GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
        Recibo recibo = new Recibo("K19 Treinamentos", "Marcelo Martins", 1000, geradorDeArquivoTXT);
        recibo.geraArquivo();
    }
}
