package tapapies.com.comerciolavapies.tapapies.model;

/**
 * Created by Miguel on 01/06/2015.
 */
public class Bar {

    String Nombre, Direccion, NombreTapa, Imagen;

    public Bar() {
    }

    public Bar(String direccion, String imagen, String nombre, String nombreTapa) {
        this.Direccion = direccion;
        this.Imagen = imagen;
        this.Nombre = nombre;
        this.NombreTapa = nombreTapa;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombreTapa() {
        return NombreTapa;
    }

    public void setNombreTapa(String nombreTapa) {
        NombreTapa = nombreTapa;
    }
}
