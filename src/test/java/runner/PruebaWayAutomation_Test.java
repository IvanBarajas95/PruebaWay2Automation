package runner;

import com.nivelics.commons.utils.Hooks;
import org.testng.annotations.Test;
import pages.PruebaWayAutomation;


public class PruebaWayAutomation_Test extends Hooks {
    ThreadLocal<PruebaWayAutomation> test = ThreadLocal.withInitial(PruebaWayAutomation::new);
    @Test
    public void register(){
        test.get().Form();
    }
}
