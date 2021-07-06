package com.metanit;

import com.metanit.zadaniya.Ballot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BallotTest {

    @Test
    public void случай557() {

        assertEquals(6, Ballot.ballot(3,5,5,7));
    }

    @Test
    public void случай42137() {

        assertEquals(5,Ballot.ballot(5,4,2,1,3,7));
    }

    @Test
    public void одноЗначение() {

        assertEquals(1,Ballot.ballot(1,1));
    }

    @Test
    public void четыреОдинаковыхЗначения() {

        assertEquals(9,Ballot.ballot(4,4,4,4,4));
    }
}
