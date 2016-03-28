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
public class Estoque {
    
    public void enviaProduto(String produto, String enderecoDeEntrega) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(calendar.getTime());
        
        System.out.println("O produto " + produto + " será entregue no endereço "
                + enderecoDeEntrega + " até as 18h do dia " + format);  
    }
}
