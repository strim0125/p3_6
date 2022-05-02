package org.iges;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calc calc;

    @BeforeAll
    static void init(){
        calc = new Calculator();
    }

    @Test
    void add1() {
//        Calc calc = new Calculator();
        Assertions.assertEquals(5,calc.add(2,3));
    }

    @Test
    void add2() {
//        Calc calc = new Calculator();
        Assertions.assertEquals(10,calc.add(7,3));
    }


    @Test
    @Disabled("На рефакториге")
    void mul1() {
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
     void div1() {
//        Calc calc = new Calculator();
        Assertions.assertEquals(11,calc.div(33,3));
    }

    @Test
    void div2(){
//        Calc calc = new Calculator();
        Assertions.assertThrows(ArithmeticException.class,() -> calc.div(7,0));
    }

    @AfterAll
    static void finish(){

    }

}