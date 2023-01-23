package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table(name = "T_LOJA_CATEGORIAS")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "SQ_LOJA_CATEGORIA", allocationSize = 1)
	@Column(name = "ID_CATEGORIA")
	private Long id;
	@Column(name = "NM_CATEGORIA")
	private String nome;

	public Categoria(String nome) {
		this.nome = nome;
	}

	public Categoria() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Categoria{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				'}';
	}
}
