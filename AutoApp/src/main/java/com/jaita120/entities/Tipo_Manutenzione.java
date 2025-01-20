package com.jaita120.entities;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_manutenzione")
public class Tipo_Manutenzione {
	 @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private Integer id_tipoman;
	 

	    
	    
	    @Column (nullable = false)
	    private String descrizione;
	    

	    @Column (nullable = false)
		private String tipodintervento;
	    
	    @ManyToMany(mappedBy = "manutenzioni")
	    private List<Auto> auto;


		public Integer getId_tipoman() {
			return id_tipoman;
		}


		public void setId_tipoman(Integer id_tipoman) {
			this.id_tipoman = id_tipoman;
		}


		public String gettipodintervento() {
			return tipodintervento;
		}


		public void settipodintervento(String tipodintervento) {
			this.tipodintervento = tipodintervento;
		}


		public String getDescrizione() {
			return descrizione;
		}


		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}


		public Tipo_Manutenzione(Integer id_tipoman, String tipodintervento, String descrizione) {
			this.id_tipoman = id_tipoman;
			this.tipodintervento = tipodintervento;
			this.descrizione = descrizione;
		}
		public Tipo_Manutenzione() {
	    }

	    
	    
	    
	 
	 
}
