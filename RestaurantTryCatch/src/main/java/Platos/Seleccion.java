
package Platos;

import java.util.ArrayList;


public class Seleccion {

    private ArrayList<String> platoSeleccionado = new ArrayList<>();
    private int total = 0;
    private final int precioPlato;
    
    public Seleccion(int precioPlato) {
        this.precioPlato = precioPlato;
    }
    
    public void agregarPlato (String plato){
        platoSeleccionado.add(plato);
        total += precioPlato;
    }

    public ArrayList<String> getPlatoSeleccionado() {
        return platoSeleccionado;
    }

    public int getTotal() {
        return total;
    }
    
    
}
