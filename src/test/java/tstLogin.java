import base.TestBase;
import org.testng.annotations.Test;

@Test(description = "login")

public class tstLogin extends TestBase {

        public void ckeckLogin(){
            //mainPageStep.loginGo();
           // loginPageStep.loginWizzAir("tatester@12storage.com","qwerty12345");
            mainPageStep.fillCountries("prague","bari");
        }

}
