package Pages;

import Common.BasePage;

public class HomePage extends BasePage {
    
    public void navigatePage () {
        initDriver();
        launchHomePage();
        screenShotUsingEventFiring();
    }

    public void closeBrowser() {
        destroyDriver();
    }

}
