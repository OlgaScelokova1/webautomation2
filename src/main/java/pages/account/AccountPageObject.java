package pages.account;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AccountPageObject {
    private SelenideElement getUserLogo() {
        return $("img[src='https://www.phptravels.net/uploads/global/default/user.png']");
    }

    private SelenideElement getGreeting() {
        return $("h3.RTL");
    }

    public String getGreetingsText(){
        return getGreeting().getText();
    }

    public void waitUntilLogoLoadingIsFinished(){
        getUserLogo().waitUntil(Condition.visible, 5000);
    }
    public boolean isUserLogoVisible(){
        return getUserLogo().isDisplayed();
    }
}
