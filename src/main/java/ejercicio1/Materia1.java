package ejercicio1;

import java.util.Date;

public class Materia1 {

    private static Materia1 instance;


    private Materia1(){
        System.out.println(new Date()+"Nombre Materia");
        //logic
    }


    public static Materia1 getInstance(){

        if (instance== null)
            instance= new Materia1();
        return instance;
    }

    public void time(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance=null;
    }
}
