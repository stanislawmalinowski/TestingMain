package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Starting test");
    }

    @AfterEach
    public void after() {
        System.out.println("Test finished");
    }

    @DisplayName("when list is empty, " +
            "then exterminate() should return an empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> result = new OddNumbersExterminator().exterminate(emptyList);

        //Then
        assertEquals(emptyList, result);
    }

    @DisplayName("when list contains even and odd numbers, " +
            "then exterminate() should return a list with even numbers only")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> expectedList = Arrays.asList(2, 4, 6, 8);

        //When
        List<Integer> result = new OddNumbersExterminator().exterminate(list);

        //Then
        assertEquals(expectedList, result);
    }
}