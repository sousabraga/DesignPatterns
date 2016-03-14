/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author matheus
 */
public class Campanha implements Prototype<Campanha> {

    private String nome;
    private Calendar vencimento;
    private Set<String> palavrasChave;

    public Campanha(String nome, Calendar vencimento, Set<String> palavrasChave) {
        this.nome = nome;
        this.vencimento = vencimento;
        this.palavrasChave = palavrasChave;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public Calendar getVencimento() {
        return this.vencimento;
    }
    
    public Set<String> getPalavrasChave() {
        return this.palavrasChave;
    }
    
    @Override
    public Campanha clone() {
        String nome = "Cópia da campanha: " + this.nome;
        Calendar vencimento = (Calendar) this.vencimento.clone();
        Set<String> palavrasChave = new HashSet<String>(this.palavrasChave);
        Campanha campanha = new Campanha(nome, vencimento, palavrasChave);
        
        return campanha;
    }
    
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("------------------\n");
        buffer.append("Nome da campanha: ");
        buffer.append(this.nome);
        buffer.append("\n");
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(this.vencimento.getTime());
        buffer.append("Vencimento: ");
        buffer.append(format);
        buffer.append("\n");
        
        buffer.append("Palavras chave: \n");
        
        this.palavrasChave.stream().forEach((palavraChave) -> {
            buffer.append(" - ");
            buffer.append(palavraChave);
            buffer.append("\n");
        });
        
        buffer.append("------------------\n");
        
        return buffer.toString();
    }
    
}
