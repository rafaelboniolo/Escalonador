package escalonador;

import java.util.ArrayList;
import java.util.List;

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
