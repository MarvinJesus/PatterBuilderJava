package com.cenfotec.calculadoracomida;
/**
 *
 * @author Marvin Calvo
 * @version 0.1.2017
 */
public class InformacionComida {
	private final String nombre; 
    private final int cantidadPorcion;
    private final Medida unidadDeMedida;
    private final int porciones;
    private final int calorias;
    private final int grasa;
    private final int sodio;
    private final int potasio;
    private final int carbohidratos;
    private final int proteina;
    /**
     * Metodo constructor de InformacioComida
     * @param pNombre Nombre de la comida
     * @param pCantidad Porcion Porciones de la comida
     * @param pMedida  Tipo de medidas(g,ml,kg)
     * @param pPorciones Porcion por comida
     * @param pCalorias Cantidad de Calorias que contiene la comida
     * @param pGrasa Cantidad de Grasa que contiene la comida
     * @param pSodio  Cantidad de Sodio que contiene la comida
     * @param pPotasio Cantidad de  Potasio que contiene la comida
     * @param pCarbohidratos Cantidad de Carbohidratos que contiene la comida.
     * @param pProteina	Cantidad de proteina que contiene la comida.
     */
    public InformacionComida(final String pNombre,final int pCantidadPorcion,final  Medida pMedida, 
                           final int pPorciones, final int pCalorias, final int pGrasa, final int pSodio, final int pPotasio, final int pCarbohidratos, final int pProteina){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.potasio = pPotasio;
        this.carbohidratos = pCarbohidratos;
        this.proteina = pProteina;
    }
    @Override
	public String toString() {
		return "Nombre: " + nombre + "\nCantidad Porcion: " + cantidadPorcion + "\nUnidad de Medida: "
				+ unidadDeMedida + "\nPorciones: " + porciones + "\nCalorias: " + calorias + "\nGrasa: " + grasa
				+ "\nSodio: " + sodio + "\nPotasio: " + potasio + "\nCarbohidratos: " + carbohidratos + "\nProteinas: " + proteina + "\n";
	}
    /**
     * 
     * @author Marvin Calvo
     *
     */
    public static class  InformacionComidaBuilder{
		private  String nestedNombre; 
        private  int nestedCantidadPorcion;
        private  Medida nestedUnidadDeMedida;
        private  int nestedPorciones;
        private  int nestedCalorias;
        private  int nestedGrasa;
        private  int nestedSodio;
        private  int nestedPotasio;
        private  int nestedCarbohidratos;
        private  int nestedProteina;
        public InformacionComidaBuilder(String nestedNombre, int nestedCantidadPorcion, Medida nestedUnidadDeMedida) {
			this.nestedNombre = nestedNombre;
			this.nestedCantidadPorcion = nestedCantidadPorcion;
			this.nestedUnidadDeMedida = nestedUnidadDeMedida;
			
		}
        public InformacionComidaBuilder nombre(String newNombre) {
        	this.nestedNombre = newNombre;
        	return this;
        }
        public InformacionComidaBuilder cantidadPorcion(int newCantidadPorcion) {
        	this.nestedCantidadPorcion = newCantidadPorcion;
        	return this;
        }
        public InformacionComidaBuilder unidadDeMedida(Medida newUnidadDeMedida) {
        	this.nestedUnidadDeMedida = newUnidadDeMedida;
        	return this;
        }
        public InformacionComidaBuilder porciones(int newPorciones) {
        	this.nestedPorciones = newPorciones;
        	return this;
        } 
        public InformacionComidaBuilder calorias(int newCalorias) {
        	this.nestedCalorias = newCalorias;
        	return this;
        }
        public InformacionComidaBuilder grasa(int newGrasa) {
        	this.nestedGrasa = newGrasa;
        	return this;
        }
        public InformacionComidaBuilder sodio(int newSodio) {
        	this.nestedSodio =newSodio;
        	return this;
        }
        public InformacionComidaBuilder potasio(int newPotasio) {
        	this.nestedPotasio =newPotasio;
        	return this;
        }
        public InformacionComidaBuilder carboidratos(int newCarboidrato) {
        		this.nestedCarbohidratos = newCarboidrato;
        	return this;
        }
        public InformacionComidaBuilder proteinas(int newProteina) {
    		this.nestedProteina = newProteina;
    	return this;
    }
        public InformacionComida createInformacionComida() {
        	return new InformacionComida(this.nestedNombre,this.nestedCantidadPorcion,this.nestedUnidadDeMedida,this.nestedPorciones,
        			this.nestedCalorias,this.nestedGrasa,this.nestedSodio,this.nestedPotasio,this.nestedCarbohidratos,this.nestedProteina);
        }
    }
    
    
}
