package view;

import javax.swing.JOptionPane;

import FilaStrings.Fila;
import controller.TelefoneController;

public class Principal {
    
    public static void main(String[] args) {
        Fila ligacoesPerdidas = new Fila();
        TelefoneController controller = new TelefoneController();
        int opcao = 0;
        while (opcao != 3) {
            String menu = "Selecione uma opção:\n" +
                          "1 - Registrar uma ligação perdida\n" +
                          "2 - Consultar as ligações perdidas\n" +
                          "3 - Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    String numeroTelefone = JOptionPane.showInputDialog("Digite o número do telefone:");
                    controller.insereLigacao(ligacoesPerdidas, numeroTelefone);
                    JOptionPane.showMessageDialog(null, "Ligação perdida registrada.");
                    break;
                case 2:
                    controller.consultaLigacoes(ligacoesPerdidas);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

}
