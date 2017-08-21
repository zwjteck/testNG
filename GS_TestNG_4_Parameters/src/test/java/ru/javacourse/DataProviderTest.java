package ru.javacourse;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Georgy Gobozov on 12.01.2015.
 */
public class DataProviderTest {

    @Test(dataProvider = "provideNumbers")
    public void test(int number, int expected) {
        Assert.assertEquals(number + 10, expected);
    }

    @DataProvider(name = "provideNumbers")
    public Object[][] provideData() {

        return new Object[][] {
                { 11, 20 },
                { 100, 110 },
                { 200, 210 }
        };
    }

    @Test(dataProvider = "range-provider")
    public void testIsBetween(int n, int lower,int upper, boolean expected)
    {
        System.out.println("Received " + n + " " + lower + "-"+ upper + " expected: " + expected);
        Assert.assertEquals(expected, isBetween(n, lower, upper));
    }

    private boolean isBetween(int n, int lower, int upper) {
        return n>lower && n<upper;
    }

    @DataProvider(name = "range-provider")
    public Object[][] rangeData() {
        int lower = 5;
        int upper = 10;
        return new Object[][] {
                { lower-1, lower, upper, false },
                { lower, lower, upper, true },
                { lower+1, lower, upper, true },
                { upper, lower, upper, true},
                { upper+1, lower, upper, false },
        };
    }

}
