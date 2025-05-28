import java.io.FileWriter;
import java.io.IOException;

public class EscritorSimples {
    public static void main(String[] args) {
        try{
            FileWriter escritor = new FileWriter("frase.txt");
            escritor.write("A pratica leva a perfeição");
            escritor.close();

            System.out.print("Frase escrita com sucesso");
        } catch ( IOException e){
            System.out.print("Ocorreu um erro ao escrever um arquivo!");
            e.printStackTrace();
        }
    }
}