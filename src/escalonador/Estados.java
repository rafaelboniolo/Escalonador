/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NataN-PC
 */
public class Estados {
    public List<Processo> bufferCriados;
    public List<Processo> bufferProntos;
    public List<Processo> bufferFinalizados;

    public Estados() {
        this.bufferCriados = new ArrayList<>();
        this.bufferProntos = new ArrayList<>();
        this.bufferFinalizados = new ArrayList<>();
    }
    
    
}
