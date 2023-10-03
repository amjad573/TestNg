import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exampleTest {
    @DataProvider(name = "divisionData")
    public Object[][] dpMethod() {
        return new Object[][]{
                {10.0f, 2.0f, 5.0f},
                {-10.0f, -2.0f, 5.0f},
                {10.0f, -2.0f, -5.0f},
                {-10.0f, 2.0f, -5.0f},
                {0.0f, 2.0f, 10.0f},
                {0.0f, -2.0f, 10.0f},
        };
    }

    @DataProvider(name = "Invalid Division Data")
    public Object[][] divisionTestInvalidData() {
        return new Object[][]{

                {10.0f, 0.0f},
        };
    }

    @Test(dataProvider = "divisionData")
    public void testDivision(float x, float y, float expected) {
        calculator cal = new calculator();
        float z = cal.division(x, y);
        Assert.assertEquals(z, expected);
    }

    @Test(dataProvider = "Invalid Division Data", expectedExceptions = ArithmeticException.class)
    public void testInvalidDivision(float x, float y) {
        calculator cal = new calculator();
        float z = cal.division(x, y);
    }
}