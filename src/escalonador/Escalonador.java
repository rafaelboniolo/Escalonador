/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalonador;

/**
 *
 * @author NataN-PC
 */
public class Escalonador {

    /**
     * @param args the command line arguments
     */
    
    static int N = 4;
    
    public static int circular(int inicio){
        if(inicio > N-1){
            return 0;
        }else{
            return inicio;
        }
    }
    
    public static void main(String[] args) {
        
        new Thread(()->{
            new Frame().setVisible(true);
        }).start();
    }
    
}
