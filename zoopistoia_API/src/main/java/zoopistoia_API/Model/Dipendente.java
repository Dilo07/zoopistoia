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
@Table(name ="dipendenti")
public class Dipendente implements Serializable {
	
	public Dipendente() {};
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "Nome")
	private String nome;
	@Column(name = "Cognome")
	private String cognome;
	
	@OneToMany(mappedBy = "dipendente")
	private List<Accesso> accessi;
	
	@OneToMany(mappedBy = "dipendente")
	private List<Permesso> permessi;
	
	
	public Dipendente(Integer id, String nome, String cognome){
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}

	public Integer getId() {
		return id;
	}
	
	public List<Accesso> getAccessi() {
		return accessi;
	}

	public void setAccessi(List<Accesso> accessi) {
		this.accessi = accessi;
	}

	public List<Permesso> getPermessi() {
		return permessi;
	}

	public void setPermessi(List<Permesso> permessi) {
		this.permessi = permessi;
	}
		
}