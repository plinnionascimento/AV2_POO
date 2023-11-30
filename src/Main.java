import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    package vendaIngressos;

    public class Evento {

        public String nomeEvento;
        protected Date dataEvento;
        private double precoEvento;
        private Categoria categoria;
        private int qtdeIngressos;

        public Evento(String nomeEvento, Date dataEvento, double precoEvento, Categoria categoria, int qtdeIngressos) {
            this.nomeEvento = nomeEvento;
            this.dataEvento = dataEvento;
            this.precoEvento = precoEvento;
            this.categoria = categoria;
            this.qtdeIngressos = qtdeIngressos;
        }

        public String getNomeEvento() {
            return nomeEvento;
        }

        public void setNomeEvento(String nomeEvento) {
            this.nomeEvento = nomeEvento;
        }

        public Date getDataEvento() {
            return dataEvento;
        }

        public void setDataEvento(Date dataEvento) {
            this.dataEvento = dataEvento;
        }

        public double getPrecoEvento() {
            return precoEvento;
        }

        public void setPrecoEvento(double precoEvento) {
            this.precoEvento = precoEvento;
        }

        public Categoria getCategoria() {
            return categoria;
        }

        public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
        }

        public int getQtdeIngressos() {
            return qtdeIngressos;
        }

        public void setQtdeIngressos(int qtdeIngressos) {
            this.qtdeIngressos = qtdeIngressos;
        }

        public boolean buscarEvento(Evento evento) {
            return this.nomeEvento.equals(evento.nomeEvento);
        }
    }

}