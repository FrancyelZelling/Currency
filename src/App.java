import com.zelling.tools.ExchangeApiSearch;

public class App {
    public static void main(String[] args) throws Exception {
        var apiSearch = new ExchangeApiSearch();
        var result = apiSearch.search("USD");
        System.out.println(result.getNestedExchangeApiResponse().getUsd());
    }
}
