/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.*;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
	public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            Postre.anadirAderezo(postre,new Crema());
            Postre.quitarAderezo(postre,new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
        });        
        
    }

}
public static double calcularPrecioFinal(Postre post){
        double precioFinal;
        
        
        precioFinal=(post.getPrecioParcial()+(post.getPrecioParcial()*0.12))+(post.getAderezos().size()*0.50);
        return precioFinal;
    }

	
	public static String  showPrecioFinal(Postre post){
        return "Precio Final: $ " + ManejadorDePrecio.calcularPrecioFinal(post);
    }
}
