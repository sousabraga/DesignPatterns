/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class TestaSorter {
    
    public static void main(String[] args) {
        Sorter sorter = new InsertionSorter();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(2);
        list.add(14);
        
        List<Integer> list2 = sorter.sort(list);
        
        list2.stream().forEach(integer -> System.out.println(integer));
        
        Sorter sorter2 = new SelectionSorter();
        List<Integer> list3 = sorter2.sort(list);
        
        list3.stream().forEach(integer -> System.out.println(integer));
    }
}
