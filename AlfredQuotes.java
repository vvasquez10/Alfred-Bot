import java.util.*;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        // TU CÓDIGO AQUÍ
        return String.format("Hola %s. Encantado de verte.", name);
    }

    public String guestGreeting() {
        // TU CÓDIGO AQUÍ
        String saludo;
        Date date = new Date();// the date instance
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        if (calendar.get(Calendar.HOUR_OF_DAY)<12){
            saludo = "buenos días";
        } else if(calendar.get(Calendar.HOUR_OF_DAY)<18){
            saludo = "buenas tardes";
        } else{
            saludo = "buenas noches";
        }

        return String.format("Hola, "+saludo+" encantado de verte.");
    }
    
    public String dateAnnouncement() {
        // TU CÓDIGO AQUÍ
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String dias[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

        Date date = new Date();// the date instance
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");        

        return "Actualmente es "+ dias[calendar.get(Calendar.DAY_OF_WEEK)-1] +", "+calendar.get(Calendar.DAY_OF_MONTH)+" de "+meses[calendar.get(Calendar.MONTH)]+" a las "+sdf.format(date)+" de "+calendar.get(Calendar.YEAR);
    }
    
    public String respondBeforeAlexis(String conversation) {
        // TU CÓDIGO AQUÍ
        if (conversation.contains("Alfred")){
            return "A su servicio. Como desee, naturalmente";
        } else if (conversation.contains("Alexis")){
            return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        } else{
            return "Bien. Y con eso, me retiraré";
        }
    }
    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    //="comment from-rainbow">// BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!
}
