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
public class InsertionSorter implements Sorter {

    @Override
    public <T extends Comparable<? super T>> List<T> sort(List<T> list) {
      list = new ArrayList<>(list);
      
      for (int i = 1; i < list.size(); i++) {
          T a = list.get(i);
          int j;
          for (j = i - 1; j >= 0 && list.get(j).compareTo(a) > 0; j--) {
              list.remove(j + 1);
              list.add(j + 1, list.get(j));
              list.remove(j);
              list.add(j, a);
          }
      }
      
      return list;
    }
    
}
