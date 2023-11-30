package vendaIngressos;

import java.util.ArrayList;
import java.util.Date;

public class Pedido<PedidoItem> {

    private int numeroPedido;
    private Date dataHoraPedido;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido, Date dataHoraPedido, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.statusPedido = statusPedido;
        itensPedido = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public <PedidoItem> ArrayList<PedidoItem> getItensPedido() {
        return (ArrayList<PedidoItem>) itensPedido;
    }

    public void setItensPedido(ArrayList<PedidoItem> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public void inserirItensPedido(PedidoItem itemPedido) {
        itensPedido.add(itemPedido);
        itemPedido.getClass().getClasses();
    }

    public void excluirItensPedido(PedidoItem itemPedido) {
        itensPedido.remove(itemPedido);
        itemPedido.getClass().toString();
    }

    public double calculaTotalPagar() {
        double total = 0;
        for (PedidoItem itemPedido : itensPedido) {
            total = total + itemPedido.getClass().getProtectionDomain() * itemPedido.toString();
        }
        return total;
    }
}
