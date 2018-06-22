/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

import java.util.List;
import javax.swing.JLabel;
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
    private List<List<JLabel>> labels;

    public Processo(String nome, int tempo, int cont, JProgressBar bar, List<List<JLabel>> labels) {
        this.nome = nome;
        this.tempo = tempo;
        this.cont = cont;
        this.bar = bar;
        this.labels = labels;
        
        this.bar.setMaximum(tempo);
    }

    public List<List<JLabel>> getLabels() {
        return labels;
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
