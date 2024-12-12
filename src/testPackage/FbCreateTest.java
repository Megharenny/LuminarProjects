package testPackage;

import org.testng.annotations.Test;
import pagePackage.FbCreateAccount;

public class FbCreateTest extends BaseClassFb {
    @Test
    public void createPageFb() {
        FbCreateAccount ob = new FbCreateAccount(driver);
        ob.createPageLink();
        ob.titleVerification();
        ob.signUp();
    }
}
