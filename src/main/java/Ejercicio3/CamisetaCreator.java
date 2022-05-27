package Ejercicio3;

public class CamisetaCreator   {

    @Override
    public Camiseta creator() {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("Negro");
        camiseta.setGarantia("3 Meses");
        camiseta.setTamano("S");
        return camiseta;
    }

         }


