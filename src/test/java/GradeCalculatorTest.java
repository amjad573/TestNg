import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GradeCalculatorTest {

    @DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][]{
                {-10, "Invalid"},   // Case 1
                {0, "Invalid"},     // Case 2
                {1, "Invalid"},     // Case 3
                {39, "Invalid"},     // Case 4
                {40, "Failed"},     // Case 5
                {59, "Failed"},     // Case 6
                {60, "Accepted"},   // Case 7
                {69, "Accepted"},   // Case 8
                {70, "Good"},       // Case 9
                {79, "Good"},       // Case 10
                {80, "Very Good"},  // Case 11
                {89, "Very Good"},  // Case 12
                {90, "Excellent"},  // Case 13
                {100, "Excellent"}, // Case 14
                {101, "Invalid"},   // Case 15
                {1000, "Invalid"},  // Case 16
                {-1000, "Invalid"}, // Case 17

        };
    }

    @Test(dataProvider = "testData")
    public void testGetGrade(int mark, String expectedGrade) {
        calculator calculator = new calculator();
        String actualGrade = calculator.getGrade(mark);
        Assert.assertEquals(actualGrade, expectedGrade);
    }
}