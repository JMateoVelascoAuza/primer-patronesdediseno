package ejercicio1;

import java.util.Date;

public class Materia3 {

    private static Materia3 instance;


    private Materia3(){
        System.out.println(new Date()+"Nombre Materia");
        //logic
    }


    public static Materia3 getInstance(){

        if (instance== null)
            instance= new Materia3();
        return instance;
    }

    public void time(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance=null;
    }
}
