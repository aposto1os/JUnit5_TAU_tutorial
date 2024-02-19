package junit5Tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {

    @ParameterizedTest(name = "run: {index} - value: {arguments}")
    @ValueSource(ints = {1,3,5})
    void methodWithIntParameter(int param){
        System.out.println("param = " + param);
    }

    @ParameterizedTest
    @ValueSource(strings = {"firstString", "secondString"})
    @NullAndEmptySource
    void methodWithStringParameter(String param){
        System.out.println("param = " + param);
    }
}
