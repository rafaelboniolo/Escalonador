/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

import javax.swing.JProgressBar;

/**
 *
 * @author NataN-PC
 */
public class Processo {
    private String nome;
    private int tempo;
    private int cont;
    private JProgressBar bar;

    public Processo(String nome, int tempo, int cont, JProgressBar bar) {
        this.nome = nome;
        this.tempo = tempo;
        this.cont = cont;
        this.bar = bar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }
    
    
}
