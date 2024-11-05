package com.zelling.tools;

import com.zelling.models.Currency;

public class UiHelper {
    private String baseString =
            """
             *************************************************       
             Selecione uma opção :
             1) Dólar Americano => Peso Argentino
             2) Peso Argentino => Dólar Americano
             3) Dólar Americano => Real Brasileiro
             4) Real Brasileiro => Dólar americano
             5) Dólar Americano => Peso Colombiano
             6) Peso Colombiano => Dólar Americano
             7) Sair
             *************************************************       
            """;
    public void mainMenu(){
        System.out.flush();
        System.out.println(
                """
                 *************************************************       
                 Bem vindo ao conversor de moedas, selecione a opção desejada:
                 1) converter valor
                 2) sair
                 *************************************************       
                """
        );
    }
    public void conversionStepOne(){
        System.out.flush();
        System.out.printf(baseString, "principal");
    }
}
