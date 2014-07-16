//Clase:Radio
//Hecho por: Maria Gabriela López 13056
//		           Augusto Cárdenas 13136
//                 Luis Carlos Ralón 13030
//Fecha: 15-07-2014
//***************************************************************
public interface Radio {
	public void encendidoApagado();
	public void cambiarFrecuencia();
	public void guardarEstacion(double estacion,int boton);
	public void cambiarEstacion(boolean direccion);
	public double getEstacion();
	public boolean getEstado();
	public boolean getFrecuencia();
	public String[] getEstacionesFav();
}
