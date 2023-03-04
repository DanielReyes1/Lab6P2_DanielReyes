
package lab6p2_danielreyes;


public class Lanzamiento {
    private String titulo, fecha;
    private int likes;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo, String fecha, int likes) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
}
