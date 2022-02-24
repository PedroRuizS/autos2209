package poo.conceptos;

import javafx.scene.paint.Color;

public class automovil {

string marca;
string subMarca;
int modelo;
Color color;

public static void main(string [] args) {
    
    automovil miBocho = new automovil("Bocho");
    miBocho.setMarca("VW");
    miBocho.setsubMarca("Sedan");
    miBocho.setmodelo("1970");
    miBocho.setColor("Azul");
    System.out.println("Las especificaciones de tu automovil son");
    System.out.println(miBocho.getmarca());
    System.out.println(miBocho.getsubMarca());
    System.out.println(miBocho.getmodelo());
    System.out.println(miBocho.getcolor());

}


public static void main(string [] args) {
    automovil miAkura = new automovil("Akura");
    miAkura.setMarca("Akura");
    miAkura.setsubMarca("NSK");
    miAkura.setmodelo("2013");
    miAkura.setColor("Gris");
    System.out.println("Las especificaciones de tu automovil son");
    System.out.println(miAkura.getmarca());
    System.out.println(miAkura.getsubMarca());
    System.out.println(miAkura.getmodelo());
    System.out.println(miAkura.getcolor());

}

public static void main(string [] args) {
    automovil miMustang = new automovil("Mustang");
    miMustang.setMarca("Ford");
    miMustang.setsubMarca("Musant");
    miMustang.setmodelo("2010");
    miMustang.setColor("Amarillo");
    System.out.println("Las especificaciones de tu automovil son");
    System.out.println(miAkura.getmarca());
    System.out.println(miAkura.getsubMarca());
    System.out.println(miAkura.getmodelo());
    System.out.println(miAkura.getcolor());

}



              

}
