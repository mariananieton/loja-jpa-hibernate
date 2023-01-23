package br.com.alura.loja.modelo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "T_LOJA_PRODUTOS")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "SQ_LOJA_PRODUTO", allocationSize = 1)
	@Column(name = "ID_PRODUTO")
	private Long id;
	@Column(name = "NM_PRODUTO")
	private String nome;
	@Column(name = "DS_DESCRICAO")
	private String descricao;
	@Column(name = "NR_PRECO")
	private BigDecimal preco;
	@Column(name = "DT_CADASTRO")
	private LocalDate dataCadastro = LocalDate.now();
	@Enumerated(EnumType.STRING)
	@Column(name = "NM_CATEGORIA")
	private Categoria categoria;

	public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", descricao='" + descricao + '\'' +
				", preco=" + preco +
				", dataCadastro=" + dataCadastro +
				", categoria=" + categoria +
				'}';
	}
}
