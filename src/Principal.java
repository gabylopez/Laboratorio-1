//Clase:Principal
//Hecho por: Maria Gabriela L�pez 13056
//		           Augusto C�rdenas 13136
//                 Luis Carlos Ral�n 13030
//Fecha: 15-07-2014
//***************************************************************

import javax.swing.*;
public class Principal{ //clase Principal 
	public static void main(String[] args) {
		Interfaz ig=new Interfaz();
		JFrame ventana = new JFrame();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ventana.setContentPane(ig);
		ig.setVisible(true);
		//Anadir Panel a la venta
		//Haver visible la ventana
		//ventana.setVisible(true);
		//ig.ingresarCant();//para mostrar la interfaz grafica
	}
}
