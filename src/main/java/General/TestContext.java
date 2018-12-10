package General;

import lombok.Data;
import pages.landing.LandingPageObject;

@Data
public class TestContext {
    private User user;
    private LandingPageObject landingpage;


    public TestContext(){
        this.user = new User();
        this.landingpage = new LandingPageObject();
    }
    }
