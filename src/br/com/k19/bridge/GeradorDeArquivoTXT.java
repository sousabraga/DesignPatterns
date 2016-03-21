/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author matheus
 */
public class GeradorDeArquivoTXT implements GeradorDeArquivo {

    @Override
    public void gera(String conteudo) {
        try {
            PrintStream saida = new PrintStream("arquivo.txt");
            saida.println(conteudo);
            saida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
