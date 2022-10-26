package Procesos;
import Postres.Postre;
import Postres.Postre.*;
import java.util.ArrayList;

import Adicionales.Aderezo;

public class ManejadorDePrecio {
	
	

	
	public static double calcularPrecioFinal(Postre post){
        double precioFinal;
        
        
        precioFinal=(post.getPrecioParcial()+(post.getPrecioParcial()*0.12))+(post.getAderezos().size()*0.50);
        return precioFinal;
    }

	


	
	public String showPrecioFinal(Postre post){
        return "Precio Final: $ " + calcularPrecioFinal(post);
    }
	

	
	
	
	
	
	
	
	
	
	

}
