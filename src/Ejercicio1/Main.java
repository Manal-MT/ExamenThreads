package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        //Thread
        Thread t1 = new Thread(new Ave("Águila", 500, 50)) ;
        Thread t2 = new Thread(new Ave("Collibrí", 100, 100)) ;
        Thread t3 = new Thread(new Ave("Perdiz",50, 50)) ;

        System.out.println(t1);
       t1.start();
       t2.start();
       t3.start();


    }


}
