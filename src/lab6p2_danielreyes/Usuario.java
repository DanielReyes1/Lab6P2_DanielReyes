
package lab6p2_danielreyes;


public class Usuario {
    private String username, contra;
    private int edad;//mayor de 12

    public Usuario() {
    }

    public Usuario(String username, String contra, int edad) {
        this.username = username;
        this.contra = contra;
        setEdad(edad);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        if(edad > 12 ){
            this.edad = edad;
        }else{
            this.edad = 75757575;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contra=" + contra + ", edad=" + edad + '}';
    }
    
    
}
