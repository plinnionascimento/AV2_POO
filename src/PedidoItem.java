public class PedidoItem {

    package vendaIngressos;

    protected Main.Evento evento;
        private int qtdeIngressos;

        public PedidoItem(Main.Evento evento, int qtdeIngressos) {
            this.evento = evento;
            this.qtdeIngressos = qtdeIngressos;
        }

        protected <Evento> Main.Evento getEvento() {
            return evento;
        }

        public void setEvento(Main.Evento evento) {
            this.evento = evento;
        }

        public int getQtdeIngressos() {
            return qtdeIngressos;
        }

        public void setQtdeIngressos(int qtdeIngressos) {
            this.qtdeIngressos = qtdeIngressos;
        }

        public void atualizaEstoqueIngresso() {
            evento.setQtdeIngressos(evento.getQtdeIngressos() - qtdeIngressos);
        }
    }

}
