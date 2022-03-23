package com.jacaranda.libros;

public class LibroPapel extends Libro{
	
	private double precio;
	private double peso;

	public LibroPapel(String titulo, String autor,double precio,double peso) throws Exception {
		super(titulo, autor);
		this.precio=precio;
		this.peso=peso;
		}

	public LibroPapel(String titulo, String autor, String editorial,double precio,double peso) throws Exception {
		super(titulo, autor, editorial);
		this.precio=peso;
		this.peso=peso;
	}

	public double getPrecio() {
		return precio;
	}

	public double getPeso() {
		return peso;
	}
	
	public boolean masCaro(LibroPapel l1) throws LibroException {
		if(l1==null) {
			throw new LibroException("El libro no es v�lido");
		}
		boolean resul=false;
		if(l1.getPrecio()<this.getPrecio()) {
			resul=true;
		}
		return resul;
	}

	
	
}
