package logica;
/**
 *
 * @author felix
 */
public class Puestos {
    private int idPuesto;
    private String nomProducto;
    private double salario;

    public Puestos(int idPuesto, String nomProducto, double salario) {
        this.idPuesto = idPuesto;
        this.nomProducto = nomProducto;
        this.salario = salario;
    }
     public Puestos() {
        this.idPuesto = 0;
        this.nomProducto = "";
        this.salario = 0;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
