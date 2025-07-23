import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        String texto;
        StringBuilder conteudo = new StringBuilder();

        while(true){
            texto = scanner.nextLine();
            if (texto.equalsIgnoreCase("sair")) {
                break;
            }
            conteudo.append(texto).append(System.lineSeparator());
        }
        
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(conteudo.toString());
            System.out.printf("Arquivo %s criado com sucesso!", fileName);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
