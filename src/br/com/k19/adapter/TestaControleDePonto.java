/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.adapter;

/**
 *
 * @author matheus
 */
public class TestaControleDePonto {
    
    public static void main(String[] args) throws InterruptedException {
        ControleDePonto controleDePonto = new ControleDePontoAdapter();
        
        Funcionario funcionario = new Funcionario("Marcelo Martins");
        
        controleDePonto.registraEntrada(funcionario);
        Thread.sleep(5000);
        controleDePonto.registraSaida(funcionario);
    }
}
