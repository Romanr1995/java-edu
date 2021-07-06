package com.metanit.collect;

import com.metanit.zadaniya.Brace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BraceTest {

    @Test
    public void общийСлучайРасположенияСкобок() {
        boolean res = Brace.isCorrectBraceSequene("([{}])");

        assertTrue(res);
    }

    @Test
    public void другойСлучайРасположенияСкобок() {
        boolean res = Brace.isCorrectBraceSequene("()()");

        assertTrue(res);
    }

    public static Stream<Arguments> braces() {
        return Stream.of(
                Arguments.of("()",     true),
                Arguments.of("([])",   true),
                Arguments.of("{)",     false),
                Arguments.of("())", false),
                Arguments.of("[{}({})]", true),
                Arguments.of("[{}({})])", false),
                Arguments.of("[({}({})]", false),
                Arguments.of("[{[)}({})]", false),
                Arguments.of("[!]", false)
        );
    }

    @ParameterizedTest
    @MethodSource("braces")
    public void testBraceCorrectness(String braces, boolean expected) {
        boolean actual = Brace.isBraceSequenceCorrect(braces);

        assertEquals(expected, actual);
    }

}
