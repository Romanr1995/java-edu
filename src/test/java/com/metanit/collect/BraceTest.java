package com.metanit.collect;

import com.metanit.zadaniya.Brace;
import org.junit.jupiter.api.Test;

public class BraceTest {

    @Test
    public void общийСлучайРасположенияСкобок() {
        boolean res = Brace.isCorrectBraceSequene("([{}])");

        assert res==true;
    }

    @Test
    public void другойСлучайРасположенияСкобок() {
        boolean res = Brace.isCorrectBraceSequene("()()");

        assert res==true;
    }

}
