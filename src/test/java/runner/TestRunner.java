package runner; // Asegúrate de que coincida con el nombre de tu carpeta

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {""}, // Asegúrate de que el nombre coincida exactamente con el paquete
        plugin = {"pretty"}
)
public class TestRunner {
}