
package lab6p2_danielreyes;


public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single() {
        super();
    }

    public Single(Cancion cancion, String titulo, String fecha, int likes) {
        super(titulo, fecha, likes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return ""+cancion;
    }
    
    
}
