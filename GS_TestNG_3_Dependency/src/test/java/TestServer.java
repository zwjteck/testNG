import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */

//all methods of this class are belong to "deploy" group.
@Test(groups="deploy")
public class TestServer {
    @DataProvider(name = "provideNumbers")
    public Object[][] provideData() {
        System.out.println("provideData belong deploy group");
        return new Object[][] {
                { 11, 20 },
                { 100, 110 },
                { 200, 210 }
        };
    }
    public int num=0;
    @Test
    public void deployServer() {
        num++;
        System.out.println("Deploying Server...,  num="+num);
    }

    //Run this if deployServer() is passed.
    @Test(dependsOnMethods="deployServer")
    public void deployBackUpServer() {
        num++;
        System.out.println("Deploying Backup Server...,  num="+num);
    }

}
