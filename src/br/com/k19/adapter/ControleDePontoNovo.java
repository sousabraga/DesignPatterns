/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author matheus
 */
public class ControleDePontoNovo {
    
    public void registra(Funcionario funcionario, boolean entrada) {    
        Calendar calendar = Calendar.getInstance(); 
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String format = simpleDateFormat.format(calendar.getTime());
        
        if (entrada == true) 
            System.out.println("Entrada: " + funcionario.getNome() + " em " + format);
        else
            System.out.println("Saída: " + funcionario.getNome() + " em " + format);
    }
}
