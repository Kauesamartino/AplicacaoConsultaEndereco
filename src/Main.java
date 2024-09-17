import br.com.viacep.ConsultaCep;
import br.com.viacep.Endereco;
import br.com.viacep.GeradorArquivo;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String busca = "";


        do {
            System.out.println("Digite o cep do endereço que você deseja buscar:");
            busca = scanner.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                ConsultaCep consultaCep = new ConsultaCep();
                Endereco endereco = consultaCep.buscaEndereco(busca);
                System.out.println(endereco);

                GeradorArquivo geradorArquivo = new GeradorArquivo();
                geradorArquivo.salvaJson(endereco);
            } catch (RuntimeException | IOException e){
                System.out.println(e.getMessage());
            }

        } while (!busca.equalsIgnoreCase("sair"));
        System.out.println("Aplicação finalizada!");
    }
}