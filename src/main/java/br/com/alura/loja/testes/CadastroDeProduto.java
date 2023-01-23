package br.com.alura.loja.testes;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProduto {

	public static void main(String[] args) {
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), Categoria.CELULARES);

		EntityManager entityManager = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(entityManager);

		entityManager.getTransaction().begin();
		dao.cadastrar(celular);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
