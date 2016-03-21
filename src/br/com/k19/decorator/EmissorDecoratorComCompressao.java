/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/**
 *
 * @author matheus
 */
public class EmissorDecoratorComCompressao extends EmissorDecorator {

    public EmissorDecoratorComCompressao(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando mensagem comprimida: ");
        String mensagemComprimida;
        
        try {
            mensagemComprimida = comprime(mensagem);
        } catch (IOException e) {
            mensagemComprimida = mensagem;
        }
        
        this.getEmissor().envia(mensagemComprimida);
    }
    
    private String comprime(String mensagem) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        try (DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater())) {
            dout.write(mensagem.getBytes());
        }
        
        return new String(out.toByteArray()); 
    }
    
}
