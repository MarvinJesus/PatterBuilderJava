package com.cenfotec.comida.bd;
/**
*
* @author Marvin Calvo
* @version 0.1.2017
*/
public class BaseDatos {
	private  int[] valoresDeComida =  new int[8];
	public  int[] obtenerValNutriOllaCarne() {
		valoresDeComida[0]=1;//Cantidad de porciones
		valoresDeComida[1]=1;//Porciones
		valoresDeComida[2]=128;//Calorias
		valoresDeComida[3]=2;//Grasas
		valoresDeComida[4]=598;//Sodio
		valoresDeComida[5]=172;//Potasio
		valoresDeComida[6]=10;//Carbhidrato
		valoresDeComida[7]=19;//Proteina
		return valoresDeComida;
		
	}
	public  int[] obtenerValNutriHamburgesa() {
		valoresDeComida[0]=1;//Cantidad de porciones
		valoresDeComida[1]=1;//Porciones
		valoresDeComida[2]=295;//Calorias
		valoresDeComida[3]=14;//Grasas
		valoresDeComida[4]=414;//Sodio
		valoresDeComida[5]=226;//Potasio
		valoresDeComida[6]=24;//Carbhidrato
		valoresDeComida[7]=17;//Proteina
		return valoresDeComida;
		
	}
	public  int[] obtenerValNutriChocolate() {
		valoresDeComida[0]=1;//Cantidad de porciones
		valoresDeComida[1]=1;//Porciones
		valoresDeComida[2]=546;//Calorias
		valoresDeComida[3]=31;//Grasas
		valoresDeComida[4]=24;//Sodio
		valoresDeComida[5]=559;//Potasio
		valoresDeComida[6]=61;//Carbhidrato
		valoresDeComida[7]=5;//Proteina
		return valoresDeComida;
		
	}
	public  int[] obtenerValNutriPizza() {
		valoresDeComida[0]=1;//Cantidad de porciones
		valoresDeComida[1]=1;//Porciones
		valoresDeComida[2]=340;//Calorias
		valoresDeComida[3]=10;//Grasas
		valoresDeComida[4]=598;//Sodio
		valoresDeComida[5]=172;//Potasio
		valoresDeComida[6]=33;//Carbhidrato
		valoresDeComida[7]=11;//Proteina
		return valoresDeComida;
		
	}
}
