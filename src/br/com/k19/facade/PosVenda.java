/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author matheus
 */
public class PosVenda {
    
    public void agendaContato(String cliente, String produto) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 30);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(calendar.getTime());
        
        System.out.println("Entrar em contato com " + cliente + " sobre o produto "
                + produto + " no dia " + format);
    }
}
