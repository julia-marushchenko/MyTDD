package com.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExcerciseManagementTest {

    private ExcerciseManagement management;

    @Before
    public void initialize() {
        management = new ExcerciseManagement();
    }

    @Test
    public void exerciseIsEmptyAtTheBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write a test.");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedexerciseIsInList() {
        management.add("Write a test.");
        assertTrue(management.exerciseList().contains("Write a test."));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("New exercise.");
        management.markAsCompleted("New exercise.");
        assertTrue(management.isCompleted("New exercise."));
    }

}