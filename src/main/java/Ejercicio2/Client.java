package Ejercicio2;

public class Client {

    public static void main(String[] args) {

        Celular template = new Celular();

        Camara camara = new Camara();

        camara.setLente("5MP");
        camara.setFoco(10);

        template.setOrigen("Bolivia");
        template.setCamara(camara);
        template.setModelo("A1");
        template.setPeso(60);
        template.setTamano("xl");
        Celular celular1 = (Celular) template.clone();
        Celular celular2 = (Celular) template.clone();
        Celular celular3 = (Celular) template.clone();
        Celular celular4 = (Celular) template.clone();
        Celular celular5 = (Celular) template.clone();
        celular1.setImei(10001);
        celular2.setImei(10002);
        celular3.setImei(10003);
        celular4.setImei(10004);
        celular5.setImei(10005);
        celular1.showInfo();
        celular2.showInfo();
        celular3.showInfo();
        celular4.showInfo();
        celular5.showInfo();






    }

}