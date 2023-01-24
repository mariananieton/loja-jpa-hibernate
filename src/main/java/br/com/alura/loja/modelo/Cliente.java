package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table(name = "T_LOJA_CLIENTES")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "SQ_LOJA_CLIENTE", allocationSize = 1)
    @Column(name = "ID_CLIENTE")
    private Long id;
    @Column(name = "NM_CLIENTE")
    private String nome;
    @Column(name = "NM_CPF")
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
