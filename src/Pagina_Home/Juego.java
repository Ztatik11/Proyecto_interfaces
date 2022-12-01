/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagina_Home;

/**
 *
 * @author DavidBejaranoLlano
 */
public class Juego {
    
    //Atributos de la clase
    private int ID;
    private String Titulo;
    private String Descripcion;
    private float Precio;
    private float Nota;
    private String Genero;
    private String Desarrolladora;
    private int Numero_jugadores;

    //Constructor con el mismo nombre de la clase
    public Juego(){}

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

    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public float getNota() {
        return Nota;
    }
    public void setNota(float Nota) {
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

    public int getNumero_jugadores() {
        return Numero_jugadores;
    }
    public void setNumero_jugadores(int Numero_jugadores) {
        this.Numero_jugadores = Numero_jugadores;
    }
    
    
    
}
