
package lab6p2_danielreyes;

import java.util.ArrayList;

public class Cliente extends Usuario{
    private ArrayList<Cancion> listacancioneslike = new ArrayList();
    private ArrayList<Playlistt> listaplaylist = new ArrayList();
    private ArrayList<Playlistt> listaplaylistlike = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(String username, String contra, int edad) {
        super(username, contra, edad);
    }

    public ArrayList<Cancion> getListacancioneslike() {
        return listacancioneslike;
    }

    public void setListacancioneslike(ArrayList<Cancion> listacancioneslike) {
        this.listacancioneslike = listacancioneslike;
    }

    public ArrayList<Playlistt> getListaplaylist() {
        return listaplaylist;
    }

    public void setListaplaylist(ArrayList<Playlistt> listaplaylist) {
        this.listaplaylist = listaplaylist;
    }

    public ArrayList<Playlistt> getListaplaylistlike() {
        return listaplaylistlike;
    }

    public void setListaplaylistlike(ArrayList<Playlistt> listaplaylistlike) {
        this.listaplaylistlike = listaplaylistlike;
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "listacancioneslike=" + listacancioneslike + ", listaplaylist=" + listaplaylist + ", listaplaylistlike=" + listaplaylistlike + '}';
    }
    
    
}
