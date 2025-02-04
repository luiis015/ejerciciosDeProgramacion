package Model;

public class Persona {
    private String nombre;
    private  String DNI ;

    public String getDNI() {
        return DNI;
    }



    //getter y setter
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Persona (String nombre , String DNI ){
        this.nombre= nombre;
        this.DNI= DNI;
    }



    public void mostrarDatod (){
        System.out.println("Nombre" + nombre + "DNI" + DNI);
    }

    public  String getNombre(){return  nombre;}
}



