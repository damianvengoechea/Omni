package com.omni.tasks;

import com.omni.user_interfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;



public class Searchproduct implements Task {

    public String product;
    public String brand;

    public Searchproduct(String product, String brand) {
        this.product = product;
        this.brand = brand;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BAR_SEARCH),
                Enter.theValue(product).into(HomePage.BAR_SEARCH),
                Click.on(HomePage.BTN_SEARCH),
                Click.on(HomePage.CHB_BRAND.of(brand))
        );
    }

    public static Searchproduct correct(String product, String brand ){
        return  instrumented(Searchproduct.class, product, brand);
    }
}
