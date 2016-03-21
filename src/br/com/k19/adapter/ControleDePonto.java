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
public class ControleDePonto {
    
    public void registraEntrada(Funcionario funcionario) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println("Entrada: " + funcionario.getNome() + " em " + format);    
    }
    
    public void registraSaida(Funcionario funcionario) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String format = simpleDateFormat.format(calendar.getTime());
        System.out.println("Saída: " + funcionario.getNome() + " em " + format);
    }
}
