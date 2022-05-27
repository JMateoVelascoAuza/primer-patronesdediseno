package ejercicio1;

import java.util.Date;

public class Materia2 {

    private static Materia2 instance;


    private Materia2(){
        System.out.println(new Date()+"Nombre Materia");
        //logic
    }


    public static Materia2 getInstance(){

        if (instance== null)
            instance= new Materia2();
        return instance;
    }

    public void time(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance=null;
    }
}
