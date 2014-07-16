//Clase:Radioc
//Hecho por: Maria Gabriela López 13056
//		           Augusto Cárdenas 13136
//                 Luis Carlos Ralón 13030
//Fecha: 15-07-2014
//***************************************************************

import java.util.Arrays;


public class Radioc implements Radio{

	private boolean estado, amFm;
	private String[] estacionesFav;
	private double estacion;
	
	public Radioc(){
		estado = true;
		amFm = true;
		estacionesFav = new String[12];
		estacion = 530;
		
	}
	
	@Override
	public void encendidoApagado() {
		if(estado){
			estado = false;
		}else{
			estado = true;
		}
		
	}
	
	@Override
	public void cambiarFrecuencia() {
		if(amFm){
			amFm = false;
		}else{
			amFm = true;
		}
	}
	
	@Override
	public void cambiarEstacion(boolean direccion) {
		if(amFm){
			if(direccion){
				if(estacion <= 1610){
					estacion += 10;
				}else{
					estacion = 530;
				}
			}else{
				if(estacion >= 530){
					estacion -= 10;
				}else{
					estacion = 1610;
				}
			}
		}else{
			if(direccion){
				if(estacion <= 107.9){
					estacion += 0.2;
				}else{
					estacion = 87.9;
				}
			}else{
				if(estacion >= 87.9){
					estacion -= 0.2;
				}else{
					estacion = 107.9;
				}
			}
		}
		
		
	}

	@Override
	public void guardarEstacion(double estacion, int boton) {
		estacionesFav[boton] = estacion+"";
	}
	
	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean getFrecuencia() {
		return amFm;
	}

	public void setAmFm(boolean amFm) {
		this.amFm = amFm;
		if(amFm){
			estacion = 530;
		}else{
			estacion = 87.9;
		}
	}
	@Override
	public String[] getEstacionesFav() {
		return estacionesFav;
	}

	public void setEstacionesFav(String[] estacionesFav) {
		this.estacionesFav = estacionesFav;
	}

	public double getEstacion() {
		return estacion;
	}

	public void setEstacion(double estacion) {
		this.estacion = estacion;
	}

	@Override
	public String toString() {
		return "Radioc [estado=" + estado + ", amFm=" + amFm
				+ ", estacionesFav=" + Arrays.toString(estacionesFav)
				+ ", estacion=" + estacion + "]";
	}
		
	}

	
