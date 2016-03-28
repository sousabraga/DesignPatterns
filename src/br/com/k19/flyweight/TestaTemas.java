/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.flyweight;

/**
 *
 * @author matheus
 */
public class TestaTemas {
    
    public static void main(String[] args) {
        
        Apresentacao apresentacao = new Apresentacao();
        
        apresentacao.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.K19), 
                            "K11 - Orientação a Objetos em Java", "Com este curso você vai obter uma base "
                            + "sólida de conhecimentos de Java e de Orientação a objetos."));
        
        apresentacao.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCO), 
                            "K12 - Desenvovimento Web com JSF2 e JPA2", "Depois desse curso você estará apto a "
                            + "desenvolver aplicações web com os padrões da plataforma Java."));
        
        apresentacao.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.HIFEN), 
                            "K21 - Persistência com JPA2 e Hibernate", "Neste curso de Java Avançado abordamos de "
                            + "maneira profunda os recursos de persistência do JPA2 e do Hibernate."));
        
        apresentacao.imprime();
    }
}
