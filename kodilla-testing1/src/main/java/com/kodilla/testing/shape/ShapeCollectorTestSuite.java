package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private ShapeCollector shapeCollector;

    @BeforeEach
    public void beforeEach() {
        shapeCollector = new ShapeCollector();
    }

    @Nested
    @DisplayName("Tests for addFigure method")
    class AddFigureTests {
        @Test
        @DisplayName("Test adding circle to shape collector")
        public void testAddCircle() {
            // Given
            Circle circle = new Circle(5.0);

            // When
            shapeCollector.addFigure(circle);

            // Then
            assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        @DisplayName("Test adding square to shape collector")
        public void testAddSquare() {
            // Given
            Square square = new Square(5.0);

            // When
            shapeCollector.addFigure(square);

            // Then
            assertEquals(square, shapeCollector.getFigure(0));
        }
    }

    @Nested
    @DisplayName("Tests for removeFigure method")
    class RemoveFigureTests {
        @Test
        @DisplayName("Test removing circle from shape collector")
        public void testRemoveCircle() {
            // Given
            Circle circle = new Circle(5.0);
            shapeCollector.addFigure(circle);

            // When
            boolean result = shapeCollector.removeFigure(circle);

            // Then
            assertTrue(result);
            assertNull(shapeCollector.getFigure(0));
        }

        @Test
        @DisplayName("Test removing non-existing figure from shape collector")
        public void testRemoveNonExistingFigure() {
            // Given
            Circle circle = new Circle(5.0);

            // When
            boolean result = shapeCollector.removeFigure(circle);

            // Then
            assertFalse(result);
        }
    }
}