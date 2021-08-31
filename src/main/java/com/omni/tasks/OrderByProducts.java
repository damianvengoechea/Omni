package com.omni.tasks;

import com.omni.user_interfaces.HomePage;
import com.omni.user_interfaces.ItemDetail;
import com.omni.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OrderByProducts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.ORDER_BY),
                Click.on(HomePage.OPTION_ORDER.of(Constants.ASCENDING))
        );
    }

    public static OrderByProducts correct(){
        return  instrumented(OrderByProducts.class);
    }
}
