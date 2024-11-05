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

        while (option != 2) {
            ui.mainMenu();
            option = scanner.nextInt();

            if (option == 1) {
                ui.conversionStepOne();
                var convertOption = scanner.nextInt();
                var converter = new Converter();
                double amount, result;
                System.out.println("Digite o valor que deseja converter:");
                switch (convertOption) {
                    case 1:
                        amount = scanner.nextDouble();
                        result = converter.convert(convertOption, amount);
                        System.out.println(result);
                        break;
                    case 2:
                        amount = scanner.nextDouble();
                        result = converter.convert(convertOption, amount);
                        System.out.println(result);
                        break;
                    case 3:
                        amount = scanner.nextDouble();
                        result = converter.convert(convertOption, amount);
                        System.out.println(result);
                        break;
                    case 4:
                        amount = scanner.nextDouble();
                        result = converter.convert(convertOption, amount);
                        System.out.println(result);
                        break;
                    case 5:
                        amount = scanner.nextDouble();
                        result = converter.convert(convertOption, amount);
                        System.out.println(result);
                        break;
                    case 6:
                        amount = scanner.nextDouble();
                        result = converter.convert(convertOption, amount);
                        System.out.println(result);
                        break;
                }
            } else  {
                System.out.println("Opção inválida.");
            }
        }
    }
}
