
package cola;


public class Digi {
     private String nombre;
     private int cedula;
     private String Tcliente;

    public Digi(String nombre, int cedula, String Tcliente) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.Tcliente = Tcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTcliente() {
        return Tcliente;
    }

    public void setTcliente(String Tcliente) {
        this.Tcliente = Tcliente;
    }
    
}
