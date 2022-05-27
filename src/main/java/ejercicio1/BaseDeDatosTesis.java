package ejercicio1;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BaseDeDatosTesis {

    private static BaseDeDatosTesis instance;
    private Map<Tesis, Date> registro = new HashMap<>();

    private BaseDeDatosTesis() {

        System.out.println("Generando la base de datos...");

    }

    public static BaseDeDatosTesis getInstance() {

        if(instance == null) {

            multiThreadControl();

        }

        return instance;

    }

    private synchronized static void multiThreadControl() {

        if(instance == null) {

            instance = new BaseDeDatosTesis();

        }

    }

    public void registrarTesis(Tesis tesis, Date date) {

        if(!registro.containsKey(tesis)) {

            System.out.println("Registrando la tesis del estudiante: " + tesis.getDatosEstudiante().getNombre() + " a fecha: " + date);
            registro.put(tesis, date);
        } else {

            System.out.println("Error! La tesis está duplicada!");

        }

    }

    public void mostrarRegistro() {

        System.out.println("Registro");
        for(Map.Entry<Tesis,Date> entry: registro.entrySet()) {

            System.out.println(entry.getKey().getDatosEstudiante().getNombre() + " -------"+ entry.getKey().getDatosEstudiante().getCi() +"--------" + entry.getKey().getTitulo() + "-------" + entry.getKey().getMencion() + "--------" + entry.getValue());

        }

    }


}