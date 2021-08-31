package com.omni.tasks;

import com.omni.user_interfaces.HomePage;
import com.omni.user_interfaces.ItemDetail;
import com.omni.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PrintResults implements Task {

    private static final Logger log = LoggerFactory.getLogger("List");

    public List<String> lstPrices = new ArrayList<>();
    public List<String> lstNameArticles = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int i = 1; i <= Constants.NUM_ARTICLES; i++){
            actor.attemptsTo(Click.on(HomePage.ARTICLE.of(String.valueOf(i)))

            );
            if (ItemDetail.LBL_PRICE.resolveFor(actor).isPresent()){
                /** String priceTotal = ItemDetail.PRICE.resolveFor(actor).getText();
                String[] priceReal = priceTotal.split("-");
                String price = priceReal[0];
                lstPrices.add(price);*/
                String nameArticle = ItemDetail.TITLE_ARTICLE.resolveFor(actor).getText();
                lstNameArticles.add(nameArticle);
            }else {
                /** actor.attemptsTo(Click.on(ItemDetail.SELECT_COLOUR));
                String priceTotal = ItemDetail.PRICE.resolveFor(actor).getText();
                String[] priceReal= priceTotal.split("-");
                String price = priceReal[0];
                lstPrices.add(price);*/
                String nameArticle = ItemDetail.TITLE_ARTICLE.resolveFor(actor).getText();
                lstNameArticles.add(nameArticle);
            }

            actor.attemptsTo(Click.on(ItemDetail.BACK_RESULTS));

        }

        Collections.sort(lstPrices, Collections.reverseOrder());
        log.info("+++ Esta es la lista ordenada descendentemente +++");
        log.info("+++ " + lstPrices + " +++");

    }

    public static PrintResults descending (){
        return  instrumented(PrintResults.class);
    }
}
