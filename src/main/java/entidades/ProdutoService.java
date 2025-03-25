package entidades;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ProdutoService {

    private static EntityManagerFactory entityManagerFactory;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("default");
        } catch (Exception e) {
            System.out.println("Erro ao criar EntityManagerFactory: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para deletar um produto
    public void deletarProduto(Long id) {
        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            em.getTransaction().begin();
            Produto produto = em.find(Produto.class, id);

            if (produto != null) {
                em.remove(produto);
                System.out.println("Produto deletado com sucesso.");
            } else {
                System.out.println("Produto não encontrado para o ID: " + id);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao deletar o produto: " + e.getMessage());
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    // Método para editar um produto
    public void atualizarProduto(Produto produto) {
        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(produto); // Atualiza o produto no banco de dados
            em.getTransaction().commit();
            System.out.println("Produto editado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao editar o produto: " + e.getMessage());
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    // Método para listar todos os produtos
    public List<Produto> listarProduto() {
        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p", Produto.class);
            query.setMaxResults(1000);
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    // Método para salvar um novo produto
    public void salvarProduto(Produto produto) {
        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
            System.out.println("Produto salvo com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao salvar o produto: " + e.getMessage());
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public static void fecharEntityManagerFactory() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
            System.out.println("EntityManagerFactory fechado com sucesso.");
        }
    }
}
