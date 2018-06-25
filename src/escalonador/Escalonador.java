package escalonador;

/*
* @Autor Rafael Boniolo
* @Autor Natanael Dotti
*/

public class Escalonador {
    public static void main(String[] args) {
        new Thread(()->{
            new Frame().setVisible(true);
        }).start();
    }    
}
