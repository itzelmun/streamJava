package Producto;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Producto> listaProductos= new ArrayList<>();
		
		Producto chetos = new Producto(1, "Chetos", 25);
		Producto refresco = new Producto (2, "Refresco", 30);
		Producto gansito = new Producto(3, "Gansito", 15);
		
		listaProductos.add(chetos);
		listaProductos.add(refresco);
		listaProductos.add(gansito);
		
		
		List<Float> listaPrecioProducto = new ArrayList<>();
		
		for(Producto producto: listaProductos) {
			if(producto.getPrecio()<=15) {
				listaPrecioProducto.add(producto.getPrecio());
			}
		}
		
		System.out.println(listaPrecioProducto);
	}

}
