package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String codigo, ArrayList<Docente> l) {
        super(codigo);
        lista = l;

    }

    public void establecerLista(ArrayList<Docente> l) {
        lista = l;
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public void calcularPromedioSueldos() {

        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos += lista.get(i).getSueldo();
        }
        promedioSueldos = promedioSueldos / lista.size();
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n", codigo);

        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio Sueldos: %.2f\n",
                cadena, obtenerPromedioSueldos());
        return cadena;
    }
}
