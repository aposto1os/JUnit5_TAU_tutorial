package junit5Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTestClass {

    @Test
    void firstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @DisplayName("US12 - TC3 - this the second test method")
    void secondMethod(){
        System.out.println("This is the second test method");
    }
}
