/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author matheus
 */
public class TemaFlyweightFactory {

    private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = new HashMap<>();
    public static final Class<TemaAsterisco> ASTERISCO = TemaAsterisco.class;
    public static final Class<TemaHifen> HIFEN = TemaHifen.class;
    public static final Class<TemaK19> K19 = TemaK19.class;
    
    public static TemaFlyweight getTema(Class<? extends TemaFlyweight> clazz) {
        if (! temas.containsKey(clazz)) {
            try {
                temas.put(clazz, clazz.newInstance());
            } catch (InstantiationException | IllegalAccessException e) {
                e.getMessage();
            }
        }
        return temas.get(clazz);
    }
}
