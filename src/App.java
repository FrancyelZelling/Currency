import com.zelling.tools.Converter;
import com.zelling.tools.ExchangeApiSearch;
import com.zelling.tools.UiHelper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var ui = new UiHelper();
        var scanner = new Scanner(System.in);
        var apiSearch = new ExchangeApiSearch();
        var option = 0;

        while(option != 3){
            // aqui quero simplesmente deixar o mais limpo possivel
            // passar as opções basicas
            // passar a opção de cada conversão, pra isso preciso mandar a opção base pra uma função
            // função na qual vai implementar toda a lógica pora conversão de valores (busca na api, conversão e retornar)
            // a funcão vai me retornar o valor para que eu consiga exibir uma mensagem na tela
            // vou ter cases para cada opção
            ui.mainMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    ui.conversionStepOne();
                    var conversionOption = scanner.nextInt();

                    switch (conversionOption){
                        case 1:
                            System.out.println("Digite o valor a converter: ");
                            var amount = scanner.nextDouble();
                    }
            }
        }
    }
}
