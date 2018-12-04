package General;

import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.signuppage.SignupPageObject;

@Data
public class TestContext {
    private User user;
    private AccountPageObject accountPage;
    private NavigationPageObject navigation;
    private SignupPageObject signuupPage;

    public TestContext(){
        this.user = new User();
        this.accountPage = new AccountPageObject();
        this.navigation = new NavigationPageObject();
        this.signuupPage = new SignupPageObject();
    }
    }
