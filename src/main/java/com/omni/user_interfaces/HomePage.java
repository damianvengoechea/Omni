package com.omni.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.amazon.com/")
public class HomePage  extends PageObject {

    public static final Target BAR_SEARCH = Target.the("Bar Search product").located(By.id("twotabsearchtextbox"));
    public static final Target BTN_SEARCH = Target.the("Button Search product").located(By.id("nav-search-submit-button"));
    public static final Target CHB_BRAND = Target.the("Button Search product").locatedBy("//*[@id='p_89/{0}']//i");
    public static final Target ORDER_BY = Target.the("Select list order by").located(By.id("a-autoid-0-announce"));
    public static final Target OPTION_ORDER = Target.the("Order list product").locatedBy("//*[@class ='a-popover a-dropdown a-dropdown-common a-declarative']//li[{0}]");
    public static final Target ARTICLE = Target.the("Order list product").locatedBy("//img[@data-image-index='{0}']");
}
