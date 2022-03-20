package fp.dom.test;

import fp.dom.HabilidadesCampeones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TesthabilidadesCampeones {

	public static void main(String[] args) {
		
		//(String cam, String hab, String tip, String des,Integer ran, Integer enf,Integer cos, String esc)
		
		HabilidadesCampeones H = new HabilidadesCampeones("Aatrox","Deathbringer","Aatrox heals himself once with a basic attack when active"
				,"Passive",950,10,0,"5/6/7%");
		
		HabilidadesCampeones H2 = new HabilidadesCampeones("Darius","Noxian Guillotine","R",300,90,100,"30% missing HP & 100% bonus AD");
		
		
		HabilidadesCampeones H3 = new HabilidadesCampeones("Ahri","Charm","Ahri charms an enemy for 2s when struck"
				,"E",950,10,90,"5/6/7%");
		
		HabilidadesCampeones H4 = new HabilidadesCampeones("Annie","Desintegrate","Annie burns an area dealing magic damage in a cone."
				,"W",670,15,90,"5/6/7%");
		
		HabilidadesCampeones[] campeones= {H,H2,H3,H4};
		
		
		
		
		
		
		
		System.out.println(H.toString());
		System.out.println(H2.toString());
		System.out.println(H3.toString());
		System.out.println(H4.toString());
		
		System.out.println("Son el primer y el segundo campeon iguales? "+ H.equals(H3));
		
		Arrays.sort(campeones);
		System.out.println(Arrays.toString(campeones));
		

			
	
		
		
	}
		
	}


