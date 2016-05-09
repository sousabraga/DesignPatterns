/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.strategy;

import java.util.List;

/**
 *
 * @author matheus
 */
public interface Sorter {
    
    <T extends Comparable<? super T>> List<T> sort(List<T> list);
}
