
package lab6p2_danielreyes;

import java.util.ArrayList;


public class Artista extends Usuario{
    private String nombre;
    private ArrayList<Cancion> listacanciones = new ArrayList();
    private ArrayList<Album> listaalbumes = new ArrayList();

    public Artista() {
        super();
    }

    public Artista(String nombre, String username, String contra, int edad) {
        super(username, contra, edad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getListacanciones() {
        return listacanciones;
    }

    public void setListacanciones(ArrayList<Cancion> listacanciones) {
        this.listacanciones = listacanciones;
    }

    public ArrayList<Album> getListaalbumes() {
        return listaalbumes;
    }

    public void setListaalbumes(ArrayList<Album> listaalbumes) {
        this.listaalbumes = listaalbumes;
    }

    @Override
    public String toString() {
        return super.toString()+"Artista{" + "nombre=" + nombre + ", listacanciones=" + listacanciones + ", listaalbumes=" + listaalbumes + '}';
    }
    
    
}
