/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesFiguras;

/**
 *
 * @author mosin
 */
public class Figura {
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension Dimensiones;

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension Dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.Dimensiones = Dimensiones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimensiones() {
        return Dimensiones;
    }

    public void setDimensiones(Dimension Dimensiones) {
        this.Dimensiones = Dimensiones;
    }

    @Override
    public String toString() {
        return "Figura:\n" + "codigo=" + codigo + ", precio=" + precio + "\n" + superheroe + "\n" + Dimensiones ;
    }
    
    public void subirprecio(double cantidad){
    
                   precio+=cantidad;
    }
            
}
