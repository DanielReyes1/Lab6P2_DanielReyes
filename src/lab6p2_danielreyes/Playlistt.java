
package lab6p2_danielreyes;

import java.util.ArrayList;


public class Playlistt {
    private String nombre, usuario;
    private int likes;
    ArrayList<Cancion> listacanciones = new ArrayList();

    public Playlistt() {
    }

    public Playlistt(String nombre, String usuario, int likes) {
        this.nombre = nombre;
        this.likes = likes;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getListacanciones() {
        return listacanciones;
    }

    public void setListacanciones(ArrayList<Cancion> listacanciones) {
        this.listacanciones = listacanciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
