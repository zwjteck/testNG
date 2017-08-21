import org.testng.annotations.Test;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class TestDatabase{

    private int num =10;
    //belong to "db" group,
    //Run if all methods from "deploy" group are passed.
    @Test(groups="db", dependsOnGroups="deploy")
    public void initDB() {
        num++;
        System.out.println("This is initDB(),  num="+num);
    }

    //belong to "db" group,
    //Run if "initDB" method is passed.
    @Test(dependsOnMethods = { "initDB" }, groups="db")
    public void testConnection() {
        num++;
        System.out.println("This is testConnection(),  num="+num);
    }


}
