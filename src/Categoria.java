public class Categoria {

    package vendaIngressos;

    public class Categoria {

        private String nomeCategoria;
        private double precoIngresso;

        public Categoria(String nomeCategoria, double precoIngresso) {
            this.nomeCategoria = nomeCategoria;
            this.precoIngresso = precoIngresso;
        }

        public String getNomeCategoria() {
            return nomeCategoria;
        }

        public void setNomeCategoria(String nomeCategoria) {
            this.nomeCategoria = nomeCategoria;
        }

        public double getPrecoIngresso() {
            return precoIngresso;
        }

        public void setPrecoIngresso(double precoIngresso) {
            this.precoIngresso = precoIngresso;
        }
    }

}
