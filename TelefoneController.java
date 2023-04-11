package controller;

import java.util.NoSuchElementException;

import FilaStrings.Fila;

public class TelefoneController {
    
    public void insereLigacao(Fila f, String numeroTelefone) {
        f.insert(numeroTelefone);
    }
    
    public void consultaLigacoes(Fila f) {
        try {
            while (!f.isEmpty()) {
                System.out.println("Ligação perdida: " + f.remove());
            }
        } catch (NoSuchElementException e) {
            System.out.println("Não há ligações perdidas.");
        }
    }

}
