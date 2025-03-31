/* package Exeptions;

import javax.security.auth.login.LoginException;

public class formulario {
    private String nombre, dni, apelldios; ;

    public formulario(String nombre, String dni, String apelldios) {
        this.nombre = nombre;
        this.dni = dni;
        this.apelldios = apelldios;
    }
public formulario(){

}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        char ultimaLetra = dni.charAt(dni.length());
        if (Character.isDigit(ultimaLetra)){

            throw new LetraExepcion ("El ultimo digito es una letra");
        }

        if (dni.length() !9 ){

            try {
                throw new LoginException( );
            } catch (LoginException e) {
                throw new RuntimeException(e);
            }
        }





        this.dni = dni;




    }




    public String getApelldios() {
        return apelldios;
    }

    public void setApelldios(String apelldios) {
        this.apelldios = apelldios;
    }
}

 */
