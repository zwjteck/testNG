package ru.javacourse;

import org.testng.annotations.DataProvider;

/**
 * Created by zhangWeiJie on 2017/8/18.
 */
public class TestDataProvider {
    @DataProvider(name = "create")
    public static Object[][] createData() {
        return new Object[][] {
                {new Integer(100)},
                {new Integer(10)}

        };
    }
    @DataProvider(name = "login")
    public static Object[][] loginData() {
        return new Object[][] {
                        {"zhangsan","pwd123"},
                        {"lisi","pwd334"}
        };
    }

    public static Object[][] testUser(){

        return new Object[][]{
                {},
                {}
        };
    }
}