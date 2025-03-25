    package entidades;

    import java.io.Serializable;
    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;

    @Entity
    public class Produto implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String nome;
        private Double preco;
        private Double custo;
        private int estoque;

        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * @return the nome
         */
        public String getNome() {
            return nome;
        }

        /**
         * @param nome the nome to set
         */
        public void setNome(String nome) {
            this.nome = nome;
        }

        /**
         * @return the preco
         */
        public Double getPreco() {
            return preco;
        }

        /**
         * @param preco the preco to set
         */
        public void setPreco(Double preco) {
            this.preco = preco;
        }

        /**
         * @return the estoque
         */
        public int getEstoque() {
            return estoque;
        }

        /**
         * @param estoque the estoque to set
         */
        public void setEstoque(int estoque) {
            this.estoque = estoque;
        }

        /**
         * @return the custo
         */
        public Double getCusto() {
            return custo;
        }

        /**
         * @param custo the custo to set
         */
        public void setCusto(Double custo) {
            this.custo = custo;
        }
    }
