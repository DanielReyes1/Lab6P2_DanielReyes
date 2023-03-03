
package lab6p2_danielreyes;

import java.util.ArrayList;


public class Album extends Lanzamiento{
    private ArrayList<Cancion> listacanciones = new ArrayList();
    private int cantidad;

    public Album() {
        super();
    }

    public Album(int cantidad, String titulo, String fecha, int likes) {
        super(titulo, fecha, likes);
        this.cantidad = cantidad;
    }

    public ArrayList<Cancion> getListacanciones() {
        return listacanciones;
    }

    public void setListacanciones(ArrayList<Cancion> listacanciones) {
        this.listacanciones = listacanciones;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return super.toString()+ "Album{" + "listacanciones=" + listacanciones + ", cantidad=" + cantidad + '}';
    }
    
    
}
