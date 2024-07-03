package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class LineTest {

    @Test
    fun testGetArea() {
        val line = Line(Point(0.0, 0.0), Point(1.0, 0.0))
        assertEquals(0.0, line.getArea())
    }

    @Test
    fun testGetLength() {
        val line = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        assertEquals(5.0, line.getLength())
    }

    @Test
    fun testGetSlope() {
        // Horizontal line
        val line1 = Line(Point(0.0, 0.0), Point(1.0, 0.0))
        assertEquals(0.0, line1.getSlope())

        // Vertical line
        val line2 = Line(Point(0.0, 0.0), Point(0.0, 1.0))
        assertEquals(Double.POSITIVE_INFINITY, line2.getSlope())

        // Regular slope
        val line3 = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        assertEquals(4.0 / 3.0, line3.getSlope())
    }

    @Test
    fun testGetStart() {
        val start = Point(0.0, 0.0)
        val end = Point(1.0, 1.0)
        val line = Line(start, end)
        val returnedStart = line.getStart()

        // Ensure it's a new instance
        assertNotSame(start, returnedStart)
        assertEquals(start.getXCoordinate(), returnedStart.getXCoordinate())
        assertEquals(start.getYCoordinate(), returnedStart.getYCoordinate())
    }

    @Test
    fun testGetEnd() {
        val start = Point(0.0, 0.0)
        val end = Point(1.0, 1.0)
        val line = Line(start, end)
        val returnedEnd = line.getEnd()

        // Ensure it's a new instance
        assertNotSame(end, returnedEnd)
        assertEquals(end.getXCoordinate(), returnedEnd.getXCoordinate())
        assertEquals(end.getYCoordinate(), returnedEnd.getYCoordinate())
    }

    @Test
    fun testZeroLengthLine() {
        assertThrows<IllegalArgumentException> { Line(Point(0.0, 0.0), Point(0.0, 0.0)) }
    }
}