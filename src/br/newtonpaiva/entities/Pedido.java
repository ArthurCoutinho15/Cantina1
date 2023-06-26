package br.newtonpaiva.entities;

import br.newtonpaiva.entities.Cliente;
import br.newtonpaiva.entities.Ingredientes;
import br.newtonpaiva.entities.Massa;

import java.util.List;
public class Pedido {
    private Cliente cliente;
    private Massa massa;
    private List<Ingredientes> ingredientes;
    public double CalculaValor(){
        double valorTotal = massa.getValor()
                + (ingredientes.size() * 2);
        return valorTotal;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Massa getMassa() {
        return massa;
    }
    public void setMassa(Massa massa) {
        this.massa = massa;
    }
    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
