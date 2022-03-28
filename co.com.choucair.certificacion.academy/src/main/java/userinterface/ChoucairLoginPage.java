package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target START_BUTTON = Target.the("Enter button").located(By.xpath("//a[@class='btn btn-info btn-sm text-white' and @data-target='#Ingresar']"));

    public static final Target INPUT_USER = Target.the("Field uset").located(By.id("username"));

    public static final Target INPUT_PASS = Target.the("Field password").located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("Enter button").located(By.xpath("//button[contains(text(),'Acceder')]"));

}
