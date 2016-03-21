/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.bridge;

/**
 *
 * @author matheus
 */
public class Recibo implements Documento {
    
    private String emissor;
    private String favorecido;
    private double valor;
    private GeradorDeArquivo geradorDeArquivo;
    
    public Recibo(String emissor, String favorecido, double valor, GeradorDeArquivo geradorDeArquivo) {
        this.emissor = emissor;
        this.favorecido = favorecido;
        this.valor = valor;
        this.geradorDeArquivo = geradorDeArquivo;
    }

    @Override
    public void geraArquivo() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Recibo: ").append("\n");
        buffer.append("Empresa: ").append(this.emissor).append("\n");
        buffer.append("Cliente: ").append(this.favorecido).append("\n");
        buffer.append("Valor: ").append(this.valor).append("\n");
        
        this.geradorDeArquivo.gera(buffer.toString());
    }
      
}
