/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.objectpool;

/**
 *
 * @author matheus
 */
public class TestaFuncionarioPool {

    public static void main(String[] args) {
        
        Pool<Funcionario> funcionarioPool = new FuncionarioPool();
        Funcionario funcionario = funcionarioPool.acquire();
        
        while (funcionario != null) {
            System.out.println(funcionario.getNome());
            funcionario = funcionarioPool.acquire();
        }
    }  
}
