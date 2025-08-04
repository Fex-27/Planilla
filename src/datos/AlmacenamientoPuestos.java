
package datos;

import java.util.ArrayList;
import logica.Puestos;

/**
 *
 * @author felix
 */
public class AlmacenamientoPuestos {
    private ArrayList<Puestos> listaPuestos;

    public AlmacenamientoPuestos() {
        this.listaPuestos = new ArrayList();
    }

    public ArrayList<Puestos> getListaPuestos() {
        return listaPuestos;
    }

    public void setListaPuestos(ArrayList<Puestos> listaPuestos) {
        this.listaPuestos = listaPuestos;
    }
    
    //metodos del crub
    
    public void insertarPuesto(Puestos puesto){
        if (this.listaPuestos != null){
            this.listaPuestos.add(puesto);
        }
    }
    public void editarPuesto(int index, Puestos newPuesto){
        if(index >= 0 && newPuesto != null && !listaPuestos.isEmpty()){
            this.listaPuestos.set(index, newPuesto);
            
        }
    }
    public boolean eliminarPuesto(Puestos puesto){
        if(this.listaPuestos.contains(puesto)){
             this.listaPuestos.remove(puesto);
             return true;
        }
        return false;  // el puesto no existe en el Arraylist
    }
}
        

