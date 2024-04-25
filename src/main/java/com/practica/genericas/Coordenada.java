package com.practica.genericas;


public class Coordenada {
	private float latitud, longitud;

	public Coordenada(float latitud, float longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public float getLatitud() {
		return latitud;
	}


	public float getLongitud() {
		return longitud;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		return operacion(prime, operacion(prime, result, latitud), longitud);
	}

	private int operacion (int prime, int result, float numero) {
		return prime * result + Float.floatToIntBits(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		return latitud == other.latitud && longitud == other.longitud;
	}
	
}
