package ejercicio1;

public class Client {

    public static void main(String[]args){

        RecursosHumanos recursosHumanos = new RecursosHumanos();

        Tesis tema1 = new Tesis();
        Tesis tema2  = new Tesis();
        Tesis tema3 = new Tesis();
        Tesis tema4 =new Tesis();

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 =new Estudiante();


        estudiante1.setCi("12345654LP");
        estudiante2.setCi("673783786376TJ");
        estudiante3.setCi("7823987984CBBA");
        estudiante4.setCi("7845897654lp");
        estudiante1.setNombre("Juna");
        estudiante2.setNombre("pepe");
        estudiante3.setNombre("Mario");
        estudiante4.setNombre("Luis");



        tema1.setTitulo("Ing Comercial");
        tema1.setMencion("Marketing");
        tema1.setDatosStudent(estudiante1);

        tema2.setTitulo("Ing Sistemas");
        tema2.setMencion("Algoritmica");
        tema2.setDatosStudent(estudiante2);


        tema3.setTitulo("Marketing");
        tema3.setMencion("Bolsa");
        tema3.setDatosStudent(estudiante3);

        tema4.setTitulo("Admin Empresas");
        tema4.setMencion("Base emoresarial");
        tema4.setDatosStudent(estudiante4);


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                RecursosHumanos.registrarTesis(tema1, new Date());

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

              RecursosHumanos.registrarTesis(tema2, new Date());

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

              RecursosHumanos.registrarTesis(tema3, new Date());

            }
        });


        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {

               RecursosHumanos.registrarTesis(tema4, new Date());

            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {

                RecursosHumanos.registrarTesis(tema1, new Date());

            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        RecursosHumanos.mostrarDatosRegistro();






    }

}