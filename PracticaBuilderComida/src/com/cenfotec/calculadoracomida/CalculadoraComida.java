package com.cenfotec.calculadoracomida;
import com.cenfotec.calculadoracomida.InformacionComida.InformacionComidaBuilder;
import com.cenfotec.comida.bd.BaseDatos;
/**
*
* @author Marvin Calvo
* @version 0.1.2017
*/
public class CalculadoraComida {
	private static volatile CalculadoraComida instance = null;
	private int[] valorComidas = new int[7];
	private InformacionComidaBuilder builder;
	private  CalculadoraComida() {
		 builder = new InformacionComidaBuilder(" ",0,Medida.G);
	}
	public static CalculadoraComida getInstance() {
		if(instance == null) {
			synchronized(CalculadoraComida.class){
		      if(instance == null) {
		         instance = new CalculadoraComida();
		      }
			}
		}
		return instance;
	 }
	
	public String obtenerValorComida(int pvalor) {
		return cargarBuilder(pvalor).toString();
	}
	/**
	 * Metodo que configura un builder
	 * @param pvalor Entero que indica la configuracion para el builder
	 * @return InformacionComida
	 */
   private InformacionComida cargarBuilder(int pvalor) {
	   BaseDatos bd = new BaseDatos();
	   switch (pvalor){
		case 1:
			valorComidas = bd.obtenerValNutriPizza();
			builder = new InformacionComidaBuilder("Pizza",valorComidas[1],Medida.G);
			updateBuilder();
		    return builder.createInformacionComida();
		case 2:
			valorComidas = bd.obtenerValNutriOllaCarne();
			builder = new InformacionComidaBuilder("Olla De Carne",valorComidas[1],Medida.G);
			updateBuilder();
		    return builder.createInformacionComida();
	case 3:
			valorComidas = bd.obtenerValNutriHamburgesa();
			builder = new InformacionComidaBuilder("Hamburgesa",240,Medida.G);		    
			updateBuilder();
		    return builder.createInformacionComida();
	case 4:
			valorComidas = bd.obtenerValNutriChocolate();
			builder = new InformacionComidaBuilder("Chocolate",240,Medida.G);		    
			updateBuilder();
		    return  builder.createInformacionComida();
	default:
			break;
		};
	return builder.createInformacionComida();
	   
   }
   /**
    * Metodo que actualiza el builder.
    */
   private void updateBuilder() {
		builder.porciones(valorComidas[0]);
	    builder.calorias(valorComidas[2]);
	    builder.grasa(valorComidas[3]);
	    builder.sodio(valorComidas[4]);
	    builder.potasio(valorComidas[5]);
	    builder.carboidratos(valorComidas[6]);
	    builder.proteinas(valorComidas[7]);;
	   }
   }
