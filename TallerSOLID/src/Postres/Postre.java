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
    public Postre() {

	}
    


    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    
    





    @Override
    public String toString() {
        return "{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }







}	
