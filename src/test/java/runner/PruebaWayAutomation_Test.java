package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.PruebaWayAutomation;


public class PruebaWayAutomation_Test extends Hooks {
    ThreadLocal<PruebaWayAutomation> form = ThreadLocal.withInitial(PruebaWayAutomation::new);
    @Test
    public void form(){
        form.get().Form();
    }

}
