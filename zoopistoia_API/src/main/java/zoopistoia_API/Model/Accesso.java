package zoopistoia_API.Model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



@SuppressWarnings("serial")
@Entity 
@Table(name ="accessi")
public class Accesso implements Serializable{
	
	public Accesso() {};
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Europe/Rome")
	@Column (name = "data_ingresso")
	private java.sql.Timestamp data_ingresso;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Europe/Rome")
	@Column (name = "data_uscita")
	private java.sql.Timestamp data_uscita;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_dipendente", nullable = false)
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	@JsonIdentityReference(alwaysAsId = true)
	@JsonProperty("id_dipendente")
	private Dipendente dipendente;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_recinzione", nullable = false)
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	@JsonIdentityReference(alwaysAsId = true)
	@JsonProperty("id_recinzione")
	private Recinzione recinzione;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Timestamp getData_ingresso() {
		return data_ingresso;
	}
	public Timestamp getData_uscita() {
		return data_uscita;
	}
	public void setData_ingresso(Timestamp timestamp) {
		this.data_ingresso = timestamp;
	}
	public void setData_uscita(Timestamp data_uscita) {
		this.data_uscita = data_uscita;
	}
	public Dipendente getDipendente() {
		return dipendente;
	}
	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}
	public Recinzione getRecinzione() {
		return recinzione;
	}
	public void setRecinzione(Recinzione recinzione) {
		this.recinzione = recinzione;
	}
}
