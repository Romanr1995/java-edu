package com.metanit.hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class GridSearchTest {

    private static Stream<Arguments> grids() {
        return Stream.of(
                of(asList("7283455864",
                        "6731158619",
                        "8988242643",
                        "3830589324",
                        "2229505813",
                        "5633845374",
                        "6473530293",
                        "7053106601",
                        "0834282956",
                        "4607924137"),
                        asList(
                            "9505",
                            "3845",
                            "3530"),
                        "YES"),
                of(
                        asList(
                        "400453592126560",
                        "114213133098692",
                        "474386082879648",
                        "522356951189169",
                        "887109450487496",
                        "252802633388782",
                        "502771484966748",
                        "075975207693780",
                        "511799789562806",
                        "404007454272504",
                        "549043809916080",
                        "962410809534811",
                        "445893523733475",
                        "768705303214174",
                        "650629270887160"),
                        asList(
                        "99",
                        "99"),
                        "NO")
        );
    }

    @ParameterizedTest
    @MethodSource("grids")
    public void testGridSearch(List<String> G, List<String> P, String expected) {
        String res = Result.gridSearch(G, P);

        assertEquals(expected, res);
    }

}