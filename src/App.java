import com.zelling.tools.ExchangeApiSearch;

public class App {
    public static void main(String[] args) throws Exception {
        var apiSearch = new ExchangeApiSearch();
        var result = apiSearch.search("BRL");
        System.out.println(result.getNestedExchangeApiResponse().getUsd());
        System.out.println(result.getNestedExchangeApiResponse().getArs());
        System.out.println(result.getNestedExchangeApiResponse().getBob());
        System.out.println(result.getNestedExchangeApiResponse().getCop());
        System.out.println(result.getNestedExchangeApiResponse().getClp());

        System.out.println("*********************************************************");

        System.out.printf("10 reais em peso argentino é %.2f%n", (result.getNestedExchangeApiResponse().getArs()*10));
    }
}
