package ejercicio1;

import java.util.Date;

public class Materia4 {

    private static Materia4 instance;


    private Materia4(){
        System.out.println(new Date()+"Nombre Materia");

    }


    public static Materia4 getInstance(){

        if (instance== null)
            instance= new Materia4();
        return instance;
    }

    public void time(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance=null;
    }
}
