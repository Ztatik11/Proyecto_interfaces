/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagina_Home;

import static com.mysql.cj.conf.PropertyKey.logger;
import java.awt.Button;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
 
public class Ayuda{
String ventana_actual;
Button ayuda;
public Ayuda(String Ventana_actual,Button boton_ayuda){
    this.ventana_actual= Ventana_actual;
    this.ayuda = boton_ayuda;
}
 
//Método llamado al cargar la ayuda.
void cargarAyuda() throws HelpSetException, MalformedURLException{

	// Carga el fichero de ayuda
	File fichero = new File("src/help/help.hs");
	URL hsURL = fichero.toURI().toURL();
 
	// Crea el HelpSet y el HelpBroker
	HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
	HelpBroker hb = helpset.createHelpBroker();
        hb.enableHelpOnButton(ayuda, "manual", helpset);
	// Pone ayuda a item de menu al pulsar F1. mntmIndice es el JMenuitem

}
}
