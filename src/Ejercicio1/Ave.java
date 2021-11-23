package Ejercicio1;

public class Ave implements Runnable{
    private String nombre;
    private double metros;
    private int descanso;

   public Ave(String nombre, double metros, int descanso){
       this.nombre = nombre;
       this.metros = metros;
       this.descanso = descanso;
   }


    @Override
    public void run() {

        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
