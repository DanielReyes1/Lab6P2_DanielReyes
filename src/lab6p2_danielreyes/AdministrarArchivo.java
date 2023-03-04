
package lab6p2_danielreyes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class AdministrarArchivo {
    private ArrayList<Usuario> listaPersonas = new ArrayList();
    private File archivo = null;

    public AdministrarArchivo() {
    }

    public AdministrarArchivo(String path) {
        
        archivo = new File(path);
    
    }

    public ArrayList<Usuario> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Usuario> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return ""+ listaPersonas ;
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Usuario u : listaPersonas) {
                if(u instanceof Artista artista){
                    bw.write(artista.getNombre()+ ";");
                    bw.write(u.getUsername() + ";");
                    bw.write(u.getContra() + ";");
                    bw.write(u.getEdad()+ ";");
                }else{
                    bw.write(u.getUsername() + ";");
                    bw.write(u.getContra() + ";");
                    bw.write(u.getEdad()+ ";");
                }
                
                
                bw.write(";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                while (sc.hasNext()) {
                    for (Usuario listaPersona : listaPersonas) {
                        if(listaPersona instanceof Artista){
                            listaPersonas.add(new Artista(sc.next(),sc.next(),sc.next(),sc.nextInt()));
                        }else{
                            listaPersonas.add(new Cliente(sc.next(),sc.next(),sc.nextInt()));
                        }
                    }
                    
                    String temp = sc.next();
                    
                    
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
