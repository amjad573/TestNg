import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertTest {

    @BeforeClass
    public void printBStatus(){
        System.out.println("class is started");
    }
    @BeforeMethod
    public void printBStatus(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+"is Started");
    }

    @AfterMethod
    public void printAStatus(ITestResult result){
        System.out.println(result.getMethod().getMethodName()+"is Finish");
    }


    @Test(priority=1)
    public void testMultiplication(){
        Assert.assertTrue(5==5);
    }
    @Test(priority=2)
    public void testDivision(){
        Assert.assertTrue(5==5);
    }

@Test
public void testRandom(){
    throw new SkipException("Thow new skipp");
}}