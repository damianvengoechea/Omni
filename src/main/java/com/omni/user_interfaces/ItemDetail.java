package com.omni.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ItemDetail {

    public static final Target BACK_RESULTS  = Target.the("Back to results").located(By.id("breadcrumb-back-link"));
    public static final Target LBL_PRICE  = Target.the("Back to results").located(By.id("priceblock_ourprice_lbl"));
    public static final Target PRICE  = Target.the("Back to results").located(By.id("priceblock_ourprice"));
    public static final Target SELECT_COLOUR  = Target.the("Select colour article").locatedBy("//li[@id='color_name_0']//img");
    public static final Target TITLE_ARTICLE  = Target.the("Title article").located(By.id("productTitle"));
}
