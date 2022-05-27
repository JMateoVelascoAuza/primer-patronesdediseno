package Ejercicio3;

public class MediasCreator {


    @Override
    public Medias creator() {
        Medias medias = new Medias();
        medias.setColor("blanco");
        medias.setGarantia("1 Mes");
        medias.setTamano("L");
        return medias;
    }
}
