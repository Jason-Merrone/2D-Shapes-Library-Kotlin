package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class PointTest {

    @Test
    fun testGetXCoordinate() {
        val point = Point(1.0, 2.0)
        assertEquals(1.0, point.getXCoordinate())
    }

    @Test
    fun testGetYCoordinate() {
        val point = Point(1.0, 2.0)
        assertEquals(2.0, point.getYCoordinate())
    }

    @Test
    fun testClone() {
        val point = Point(1.0, 2.0)
        val clone = point.clone()
        assertEquals(point.getXCoordinate(), clone.getXCoordinate())
        assertEquals(point.getYCoordinate(), clone.getYCoordinate())
    }

    @Test
    fun testMove() {
        val point = Point(1.0, 2.0)
        point.move(2.0, 3.0)
        assertEquals(3.0, point.getXCoordinate())
        assertEquals(5.0, point.getYCoordinate())
    }

    @Test
    fun testInvalidCoordinatesNaN() {
        assertThrows<IllegalArgumentException> { Point(Double.NaN, 1.0) }
        assertThrows<IllegalArgumentException> { Point(1.0, Double.NaN) }
    }
}