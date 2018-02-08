/**
 * Created by sanseyvich on 2/8/18.
 */

import org.junit.Test;

import java.util.Date;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PrivatExchangeRateTest {

    @Test
    public void checkGeneralInfoResponse() {
        when().
                get("https://api.privatbank.ua/p24api/exchange_rates?json&date=01.12.2014").
        then().
                body("date", is("01.12.2014")).
                body("bank", is("PB")).
                body("baseCurrency", is(980)).
                body("baseCurrencyLit", is("UAH"));
    }
    //"date":"01.12.2014","bank":"PB","baseCurrency":980,"baseCurrencyLit":"UAH","exchangeRate"
}
