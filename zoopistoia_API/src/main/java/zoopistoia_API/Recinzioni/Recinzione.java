package zoopistoia_API.Recinzioni;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="recinzioni")
public class Recinzione implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "Tipo_Animali")
	private String tipo_Animali;
	@Column(name = "Capienza")
	private Integer capienza;
	@Column(name = "Disponibilità")
	private Integer disponibilità;
	
	public Recinzione() {}
	
	public Recinzione(Integer id, String Tipo_Animali, Integer Capienza, Integer Disponibilità) {
		this.id=id;
		this.tipo_Animali=Tipo_Animali;
		this.capienza=Capienza;
		this.disponibilità=Disponibilità;
	}

	public Integer getId() {
		return id;
	}

	public String getTipo_Animali() {
		return tipo_Animali;
	}

	public Integer getCapienza() {
		return capienza;
	}

	public Integer getDisponibilità() {
		return disponibilità;
	}
		
}