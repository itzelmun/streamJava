package Producto;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class PrincipalStream {

	public static void main(String[] args) {
		
		List <Producto> listaProductos= new ArrayList<>();
		
		Producto chetos = new Producto(1, "Chetos", 25);
		Producto refresco = new Producto (2, "Refresco", 10);
		Producto gansito = new Producto(3, "Gansito", 15);
		
		listaProductos.add(chetos);
		listaProductos.add(refresco);
		listaProductos.add(gansito);
		
		
		List<Float> listaPrecioProducto = listaProductos.stream()
				.filter(product-> product.getPrecio()<=15)
				.map(product-> product.getPrecio())
				.limit(1)
				.collect(Collectors.toList());

		System.out.println(listaPrecioProducto);
		
	}

}
