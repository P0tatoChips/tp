package computercomponentchooser;

import computercomponentchooser.components.Cpu;
import computercomponentchooser.components.Gpu;
import computercomponentchooser.components.Motherboard;
import computercomponentchooser.exceptions.NegativeNumberException;
import org.junit.jupiter.api.BeforeEach;

public class BuildTest {

    Build build1;
    Cpu cpu1;
    Gpu gpu1;
    Motherboard mobo1;

    @BeforeEach
    public void setUp() {
        try {
            cpu1 = new Cpu("cpu1", "123", "12", "1", "4.0");
            gpu1 = new Gpu("gpu1", "456", "45", "4", "5");
            mobo1 = new Motherboard("mobo1", "123", "12", "1", "full ATX", "2", "2");
        } catch (NegativeNumberException | NumberFormatException e) {
            System.out.println("Error in setUp");
        }
        build1 = new Build("build1");
        build1.addComponent("cpu", cpu1);
        build1.addComponent("gpu", gpu1);
        build1.addComponent("motherboard", mobo1);
    }
}
