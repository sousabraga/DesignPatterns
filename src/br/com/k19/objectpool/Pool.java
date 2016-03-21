/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.objectpool;

/**
 *
 * @author matheus
 * @param <T>
 */
public interface Pool<T> {
    
    T acquire();
    void release(T t);
    
}
