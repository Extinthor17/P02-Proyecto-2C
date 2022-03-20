package fp.dom;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fp.utiles.Checkers;

public class HabilidadesCampeones implements Comparable<HabilidadesCampeones> {
	
		//champion ability type description range cooldown cost scalings
		
	
		private String campeon, habilidad,descripcion,tipo, escalados;
		private Integer rango, coste, enfriamiento;
		
		public HabilidadesCampeones(String cam, String hab, String tip, String des,Integer ran, Integer enf,Integer cos, String esc) {
			
			Checkers.check("Coste de habilidad no valido", cos>=0);
			Checkers.check("Valor de enfriamiento no valido", enf>=0);
			Checkers.check("Tipo de habilidad no valido", tip!="Q");
			Checkers.check("Tipo de habilidad no valido", tip!="W");
			Checkers.check("Tipo de habilidad no valido", tip!="E");
			Checkers.check("Tipo de habilidad no valido", tip!="R");
			Checkers.check("Tipo de habilidad no valido", tip!="Passive");
			
			
			
			
			 
			
			
			this.campeon=cam;
			this.habilidad=hab;
			this.tipo=tip;
			this.descripcion=des;
			this.rango=ran;
			this.enfriamiento=enf;
			this.coste=cos;
			this.escalados=esc;
			
			//System.out.println("Estoy en el C1");
			
			
			
		}
		
		public HabilidadesCampeones(String cam, String hab, String tip,Integer ran, Integer enf,Integer cos, String esc) {
			
			Checkers.check("Coste de habilidad no valido", cos>=0);
			Checkers.check("Valor de enfriamiento no valido", enf>=0);
			Checkers.check("Tipo de habilidad no valido", tip!="Q");
			Checkers.check("Tipo de habilidad no valido", tip!="W");
			//Checkers.check("Tipo de habilidad no valido", tip!="E");
			//Checkers.check("Tipo de habilidad no valido", tip!="R");
			//Checkers.check("Tipo de habilidad no valido", tip!="Passive");
			

			this.campeon=cam;
			this.habilidad=hab;
			this.tipo=tip;
			this.rango=ran;
			this.enfriamiento=enf;
			this.coste=cos;
			this.escalados=esc;
			
			
			
			//System.out.println("Estoy en el C2");
				
		
		}
		
		public int hashCode() {
			return Objects.hash(campeon, coste, descripcion, enfriamiento, escalados, habilidad, rango, tipo);
		}
		
		//Dos HabilidadesCampeones son el mismo cuando su nombre, nombre de la habilidad y tipo son iguales
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			HabilidadesCampeones other = (HabilidadesCampeones) obj;
			return Objects.equals(campeon, other.campeon)
					&& Objects.equals(enfriamiento, other.enfriamiento)
					&& Objects.equals(habilidad, other.habilidad)
					&& Objects.equals(tipo, other.tipo);
		}

			
		
		public String toString() {
			
			//Convierte los datos introducidos en una linea de texto para una mejor presentacion			
			
			return "Campeón: "+this.campeon+", Habilidad: "+this.habilidad+", Coste: "+this.coste+", Enfriamiento: "+this.enfriamiento;
			
		}
		
		//Se ordenan por coste los campeones
		@Override
		public int compareTo(HabilidadesCampeones o) {
			if (this.coste != o.getCoste()) {
				
				return this.coste - o.getCoste();
			}
			return this.campeon.compareTo(o.getCampeon());
			}
			
			
		
		
		
		public String getCampeon() {
			return campeon;
		}

		

		public void setCampeon(String campeon) {
			this.campeon = campeon;
		}

		public String getHabilidad() {
			return habilidad;
		}

		public void setHabilidad(String habilidad) {
			this.habilidad = habilidad;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getEscalados() {
			return escalados;
		}

		public void setEscalados(String escalados) {
			this.escalados = escalados;
		}

		public Integer getRango() {
			return rango;
		}

		public void setRango(Integer rango) {
			this.rango = rango;
		}

		public Integer getCoste() {
			return coste;
		}

		public void setCoste(Integer coste) {
			this.coste = coste;
		}

		public Integer getEnfriamiento() {
			return enfriamiento;
		}

		public void setEnfriamiento(Integer enfriamiento) {
			this.enfriamiento = enfriamiento;
		}
		
		
		
		
		
		
		
	

}
