package com.academicsystem;

import com.academicsystem.evaluations.Evaluation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvaluationsTest {

    @Test
    public void testEvaluationEncapsulation() {
        Evaluation evaluation = new Evaluation("Final Exam", "EX101");
        Assertions.assertEquals("Final Exam", evaluation.getName());
        Assertions.assertEquals("EX101", evaluation.getId());
    }
}