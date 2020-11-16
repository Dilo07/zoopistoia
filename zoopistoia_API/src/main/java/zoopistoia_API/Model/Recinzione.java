package zoopistoia_API.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@SuppressWarnings("serial")
@Entity
@Table(name="recinzioni")
public class Recinzione implements Serializable{
	
	public Recinzione() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "Tipo_Animali")
	private String tipo_Animali;
	@Column(name = "Capienza")
	private Integer capienza;
	@Column(name = "Disponibilità")
	private Integer disponibilità;
	
//	@OneToMany(targetEntity = Animale.class,cascade = CascadeType.ALL)
//	@JoinColumn(name ="id_recinzione",referencedColumnName = "id")
	@OneToMany(mappedBy = "recinzione")
	private List<Animale> animali;
	
//	public Recinzione(Integer id, String Tipo_Animali, Integer Capienza, Integer Disponibilità) {
//		this.id=id;
//		this.tipo_Animali=Tipo_Animali;
//		this.capienza=Capienza;
//		this.disponibilità=Disponibilità;
//	}

	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public List<Animale> getAnimali() {
		return animali;
	}
	
	public void setAnimali(List<Animale> animali) {
		this.animali = animali;
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