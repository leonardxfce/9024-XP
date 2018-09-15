package envase;

import javafx.stage.Stage;
import org.junit.Test;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

public class ControladorTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        Controlador c = new Controlador(stage);
    }

    @Test
    public void test_se_hace_clic() {
        clickOn(".button");
        verifyThat(".button", hasText("Aceptar"));
    }

}
