package Listas;

import java.util.logging.Level;
import java.util.logging.Logger;

class Estudiante {

    private String nombre;
    private Double promedio;

    public String getNombre() {
        return nombre;
    }

    public Double getPromedio() {
        return promedio;
    }
}

public class Grupo {

    Lista<Estudiante> Alumnado = new ListaEnlazada<>();

    public void BajaEstudiantil(String nombre) {
        if (!Alumnado.isEmpty()) {
            Iterador<Estudiante> iterator = Alumnado.iter();
            Estudiante temp;
            while (iterator.hasNext()) {
                temp = iterator.next();
                if (temp.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                    try {
                        Alumnado.remove(Alumnado.getIndex(temp));
                    } catch (ElemNoEncE | PosicIncE ex) {
                        Logger.getLogger(Grupo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    public void AltaEstudiantil(Estudiante alumno) {
        Alumnado.add(alumno);
    }

    public Double PromedioAlumnado() {
        Double prom = 0.0;
        if (!Alumnado.isEmpty()) {
            Iterador<Estudiante> iterator = Alumnado.iter();
            while (iterator.hasNext()) {
                prom = iterator.next().getPromedio();
            }
        }
        return prom;
    }
}
