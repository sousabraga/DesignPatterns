/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class Apresentacao {
    
    private List<Slide> slides = new ArrayList<>();
    
    public void adicionaSlide(Slide slide) {
        slides.add(slide);
    }
    
    public void imprime() {
        slides.stream().forEach(slide -> {
            slide.imprime();
            System.out.println();
        });
    }
}
