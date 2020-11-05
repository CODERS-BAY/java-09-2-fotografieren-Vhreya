import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCases {

    Lens lensTest = new Lens(30, 32);
    Camera cameraTest = new Camera("test", 1234, 12345, true, lensTest);
    Lens lensTest2 = new Lens(20, 25);

    public TestCases() throws Exception {
    }

    @Test
    public void testSetLowerMaxFocalLengthThanMinFocalLength(){
        assertThrows (RuntimeException.class, () -> lensTest.setMaxFocalLength(29));
        assertEquals(32, lensTest.getMaxFocalLength());
    }

    @Test
    public void testSwitchLenses(){
        cameraTest.setLens(lensTest2);
        assertEquals(lensTest2, cameraTest.getLens());
    }

    @Test
    public void testIfCounterVariableForCameraWorks(){
        assertEquals(2, Camera.getCOUNTER());
        Camera Test2 = new Camera("bla", 123, 1234, true, lensTest);
        assertEquals(3, Camera.getCOUNTER());
    }

    @Test
    public void testIfCounterVariableForLensWorks() throws Exception {
        assertEquals(2, Lens.getCOUNTERLENSES());
        Lens test3 = new Lens(20, 25);
        assertEquals(3, Lens.getCOUNTERLENSES());
    }
}
