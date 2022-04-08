package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.Alert;

public class Alert_Test extends Hooks {
    ThreadLocal<Alert> testAlert = ThreadLocal.withInitial(Alert::new);
    @Test
    public void register(){
        testAlert.get().Form();
    }
}

