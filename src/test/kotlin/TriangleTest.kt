package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class TriangleTest {

    @Test
    fun testGetArea() {
        // Example: 3-4-5 right triangle
        val triangle = Triangle(Point(0.0, 0.0), Point(3.0, 0.0), Point(0.0, 4.0))
        assertEquals(6.0, triangle.getArea())
    }

    @Test
    fun testGetPoint1() {
        val point1 = Point(0.0, 0.0)
        val triangle = Triangle(point1, Point(3.0, 0.0), Point(0.0, 4.0))
        val returnedPoint1 = triangle.getPoint1()

        // Ensure it's a new instance
        assertNotSame(point1, returnedPoint1)
        assertEquals(point1.getXCoordinate(), returnedPoint1.getXCoordinate())
        assertEquals(point1.getYCoordinate(), returnedPoint1.getYCoordinate())
    }

    @Test
    fun testGetPoint2() {
        val point2 = Point(3.0, 0.0)
        val triangle = Triangle(Point(0.0, 0.0), point2, Point(0.0, 4.0))
        val returnedPoint2 = triangle.getPoint2()

        // Ensure it's a new instance
        assertNotSame(point2, returnedPoint2)
        assertEquals(point2.getXCoordinate(), returnedPoint2.getXCoordinate())
        assertEquals(point2.getYCoordinate(), returnedPoint2.getYCoordinate())
    }

    @Test
    fun testGetPoint3() {
        val point3 = Point(0.0, 4.0)
        val triangle = Triangle(Point(0.0, 0.0), Point(3.0, 0.0), point3)
        val returnedPoint3 = triangle.getPoint3()

        // Ensure it's a new instance
        assertNotSame(point3, returnedPoint3)
        assertEquals(point3.getXCoordinate(), returnedPoint3.getXCoordinate())
        assertEquals(point3.getYCoordinate(), returnedPoint3.getYCoordinate())
    }

    @Test
    fun testZeroAreaTriangle() {
        // Points form a straight line, so area should be 0
        assertThrows<IllegalArgumentException> {
            Triangle(Point(0.0, 0.0), Point(1.0, 1.0), Point(2.0, 2.0))
        }
    }
}