package kata4.main;
// 1 CLASE HistogramDisplay  se extiende ApplicationFrame
// 2 Constructor de HistogramDisplay  se invoca al constructor de la superclase y se establece un contenedor de tipo chartPanel.

import java.util.ArrayList;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

// 3 método execute()  se hace visible el frame.
// 4 método JPanel()  se inserta un panel.
// 5 método createChart()  se crea un Diagrama de Barras.
// 6 método createDataSet()  se crea el conjunto de datos.
// 7, 8 CLASE KATA3  se instancia un objeto HistogramDisplay y sobre este objeto se invoca al método execute()

// 1 CLASE Histogram
// 2 Se define un mapa de clave genérica y valores enteros.
// 3 método get()  para el mapa, se devuelve el valor correspondiente a una clave.
// 4 método keySet()  devuelve el conjunto de claves del mapa.
// 5 método increment()  se rellena el mapa.
// 6 CLASE HistogramDisplay
// se crea una variable global de tipo Histogram
// 7, 8 se modifica constructor  se pasa como parámetro un objeto Histogram y dentro del constructor se hace referencia a este objeto.
// 9 método dataSet()  se reemplazan todos los métodos addValue por uno solo dentro un bucle
// 10, 11, 12 CLASE Kata4  se instancia un objeto Histogram y sobre este objeto se llama al método increment(). Se invoca al método execute()
public class Kata4 {

    public static void main(String[] args) {
        String filename = "email.txt";
        List<Mail> mailList = new ArrayList<Mail>();
        Histogram<String> histogram = new Histogram<String>();
        HistogramDisplay histoDisplay;
        
        mailList = MailListReader.read("email.txt");
        histogram = MailHistogramBuilder.build(mailList);
        new HistogramDisplay(histogram).execute();
        
        
    }
    
}
