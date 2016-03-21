/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.composite;

/**
 *
 * @author matheus
 */
public class TestaCaminho {
    
    public static void main(String[] args) {
        Trecho trecho1 = new TrechoAndando("Vá até o cruzamento da Av. Rebouças com Av.Brigadeiro Faria Lima", 500);
        Trecho trecho2 = new TrechoDeCarro("Vá até o cruzamento da Av. Brigadeiro Faria Lima com Av. Cidade Jardim", 1500);
        Trecho trecho3 = new TrechoDeCarro("Vire a direita da Marginal Pinheiros", 500);
        
        Caminho caminho1 = new Caminho();
        caminho1.adiciona(trecho1);
        caminho1.adiciona(trecho2);
        
        System.out.println("Caminho 1: ");
        caminho1.imprime();
        
        Caminho caminho2 = new Caminho();
        caminho2.adiciona(caminho1);
        caminho2.adiciona(trecho3);
        
        System.out.println("---------------------------");
        System.out.println("Caminho 2: ");
        caminho2.imprime();
    }
}
