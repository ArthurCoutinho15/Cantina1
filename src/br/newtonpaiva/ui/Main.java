package br.newtonpaiva.ui;

import br.newtonpaiva.entities.Cliente;
import br.newtonpaiva.entities.Ingredientes;
import br.newtonpaiva.entities.Massa;
import br.newtonpaiva.entities.Pedido;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Massa massa = new Massa();
        Cliente cliente = new Cliente();

        String name = JOptionPane.showInputDialog("Entre com o nome do cliente: ");
        cliente.setNome(name);
        String tipo = JOptionPane.showInputDialog("Entre com o tipo da massa: ");
        massa.setMassa(tipo);
        Double valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da massa: "));
        massa.setValor(valor);

        List<Ingredientes> ingredientes1 = new ArrayList<>();

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingredientes escolhidos:\n" +
                    "1 - Bacon\n" +
                    "2 - Mussarela\n" +
                    "3 - Tomate\n" +
                    "4 - Queijo\n" +
                    "5 - Sair"));

            if (opcao == 1) {
                Ingredientes ingredientes = new Ingredientes();
                ingredientes.setNome("Bacon");
                ingredientes1.add(ingredientes);
            } else if (opcao == 2) {
                Ingredientes ingredientes = new Ingredientes();
                ingredientes.setNome("Mussarela");
                ingredientes1.add(ingredientes);
            } else if (opcao == 3) {
                Ingredientes ingredientes = new Ingredientes();
                ingredientes.setNome("Tomate");
                ingredientes1.add(ingredientes);
            } else if (opcao == 4) {
                Ingredientes ingredientes = new Ingredientes();
                ingredientes.setNome("Queijo");
                ingredientes1.add(ingredientes);
            } else if (opcao != 5) {
                JOptionPane.showMessageDialog(null, "Número Inválido.");
            }
        } while (opcao != 5);

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setMassa(massa);
        pedido.setIngredientes(ingredientes1);

        String mensagem =  "Pedido feito para: " + pedido.getCliente().getNome() +
                "\n" + pedido.getMassa().getMassa() + "\nValor: R$" + pedido.CalculaValor();

        if (pedido.getIngredientes().size() > 0) {
            for (int a = 0; a < pedido.getIngredientes().size(); a++)
            {
                mensagem += pedido.getIngredientes().get(a).getNome();
                if (a < pedido.getIngredientes().size() - 2) {
                    mensagem += ", ";
                } else
                    mensagem += " e ";
            }
        } else
            mensagem += "nenhum acréscimo e";
        mensagem += " \n o valor ficou em: R$" + String.format("%.2f",
                pedido.CalculaValor()) + " reais";
        JOptionPane.showMessageDialog(null, mensagem, "Valor do pedido", JOptionPane.PLAIN_MESSAGE);
    }
}
