package fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaCliente {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Métodos de adição: diferença no comportamento quando a fila está cheia
        fila.add("Ana");
        fila.add("Pedro");
        fila.add("Joao");

        // Métodos de acesso aos elementos: diferença de comportamento quando está vazia
        System.out.println("Primeiro elemento da fila: " + fila.peek());
        System.out.println("Primeiro elemento da fila: " + fila.element());

        // Acesso de acordo com a sequência da fila
        System.out.println("---- Sequencia da fila ----");
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // Converter a fila em uma lista
        LinkedList<String> lista = new LinkedList<>(fila);

        // Iterar sobre os elementos da lista usando um loop for (com problema)
        System.out.println("---- Elementos restantes na fila ----");
        while (!fila.isEmpty()) {
            String elemento = fila.poll();
            System.out.println(elemento);
        }
    }
}
