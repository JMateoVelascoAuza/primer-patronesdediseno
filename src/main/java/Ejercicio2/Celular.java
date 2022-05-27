package Ejercicio2;

public class Celular {
        private String modelo;
        private String tamano;
        private int peso;

        private Camara camara;
        private int imei;
        private String origen;




        public Celular(){}
        public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamanio) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void showInfo() {

        System.out.println("Modelo: " + getModelo());
        System.out.println("Peso: " + getPeso());
        System.out.println("Tamaño: " + getTamano());
        System.out.println("Camara Foco: " + getCamara().getFoco());
        System.out.println("Camara Lente:  " + getCamara().getLente());
        System.out.println("Imei: " + getImei());
        System.out.println("Pais Creado: " + getOrigen());

        System.out.println("////////////////");

    }

    @Override
    public Object clone() {

        Celular celular = new Celular();
        Camara camara = new Camara();

        camara.setFoco(this.getCamara().getFoco());
        camara.setLente(this.getCamara().getLente());

        celular.setModelo(this.getModelo());
        celular.setTamano(this.getTamano());
        celular.setPeso(this.getPeso());
        celular.setCamara(camara);
        celular.setOrigen(this.getOrigen());

        return celular;




    }



}