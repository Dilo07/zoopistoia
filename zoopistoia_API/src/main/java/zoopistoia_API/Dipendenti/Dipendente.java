package zoopistoia_API.Dipendenti;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity 
@Table(name ="dipendenti")
public class Dipendente implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	
	public Dipendente() {};
	
	public Dipendente(int id, String nome, String cognome){
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

	public int getId() {
		return id;
	}
		
}