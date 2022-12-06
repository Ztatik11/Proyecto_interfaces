/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagina_Home;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;


/**
 *
 * @author DavidBejaranoLlano
 */
public class Juego {
    
    //Atributos de la clase
    private int ID;
    private String Titulo;
    private String Descripcion;
    private String Precio;
    private String Nota;
    private String Genero;
    private String Desarrolladora;
    private String Numero_jugadores;
    private Image imagen;

    //Constructor con el mismo nombre de la clase
    public Juego(ArrayList <Object> datos){
        this.Titulo = datos.get(1).toString();
        this.Descripcion = datos.get(2).toString();
        this.Precio = datos.get(3).toString();
        this.Nota = datos.get(4).toString();
        this.Genero = datos.get(5).toString();
        this.Desarrolladora = datos.get(6).toString();
        this.Numero_jugadores = datos.get(7).toString();
        this.imagen = conversion_imagen(datos.get(8));
    }
    
    
    public Image conversion_imagen(Object imagen){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Image img = null;
        //img = getToolkit().getDefaultToolkit().createImage(imagen);
        //img = img.getScaledInstance(ID, ID, ID);
        
        return img;
    } 

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrecio() {
        return Precio;
    }
    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getNota() {
        return Nota;
    }
    public void setNota(String Nota) {
        this.Nota = Nota;
    }

    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDesarrolladora() {
        return Desarrolladora;
    }
    public void setDesarrolladora(String Desarrolladora) {
        this.Desarrolladora = Desarrolladora;
    }

    public String getNumero_jugadores() {
        return Numero_jugadores;
    }
    public void setNumero_jugadores(String Numero_jugadores) {
        this.Numero_jugadores = Numero_jugadores;
    }
    
    
    
}
