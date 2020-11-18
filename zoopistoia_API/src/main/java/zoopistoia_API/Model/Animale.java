package zoopistoia_API.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



@SuppressWarnings("serial")
@Entity 
@Table(name ="animali")
public class Animale implements Serializable{
	
	public Animale() {};

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "tipo_animale")
	private String tipo_animale;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_recinzione", nullable = false)
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	@JsonIdentityReference(alwaysAsId = true)
	@JsonProperty("id_recinzione")
	private Recinzione recinzione;
	
//	public Animale(Integer id, String tipo_animale) {
//		this.id=id;
//		this.tipo_animale=tipo_animale;
//	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Recinzione getRecinzione() {
		return recinzione;
	}
	
	public void setRecinzione(Recinzione recinzione) {
		this.recinzione = recinzione;
	}
	
	public String getTipo_animale() {
		return tipo_animale;
	}

	public void setTipo_animale(String tipo_animale) {
		this.tipo_animale = tipo_animale;
	}
	
}