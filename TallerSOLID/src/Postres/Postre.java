package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }
    
    public Postre(String sabor) {
        super();
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 15.55;
	}
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }

    @Override
    public String toString() {
        return "{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
	

}
