package practigagiteclipse;

public class Direccion {
    private String ciudad;
    private String pais;

    public Direccion(String ciudad, String pais) {
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String obtenerDireccionCompleta() {
        return ciudad + ", " + pais;
    }
}