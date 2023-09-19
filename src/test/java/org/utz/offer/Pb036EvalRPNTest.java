package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb036EvalRPNTest {

    @Test
    void evalRPN() {
        Pb036EvalRPN pb036EvalRPN = new Pb036EvalRPN();
        String[] tokens = new String[]{"2","1","+","3","*"};
        int result = 9;
        assertEquals(result, pb036EvalRPN.evalRPN(tokens));

        String[] tokens2 = new String[]{"4","13","5","/","+"};
        assertEquals(6, pb036EvalRPN.evalRPN(tokens2));
    }
}