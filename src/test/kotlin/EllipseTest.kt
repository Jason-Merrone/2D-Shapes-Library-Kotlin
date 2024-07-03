package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.math.PI

internal class EllipseTest {

    @Test
    fun testGetArea() {
        val ellipse = Ellipse(Point(0.0, 0.0), 2.0, 3.0)
        assertEquals(PI * 2.0 * 3.0, ellipse.getArea())
    }

    @Test
    fun testGetCenterPoint() {
        val center = Point(1.0, 2.0)
        val ellipse = Ellipse(center, 2.0, 3.0)
        val returnedCenter = ellipse.getCenterPoint()

        // Ensure it's a new instance
        assertNotSame(center, returnedCenter)
        assertEquals(center.getXCoordinate(), returnedCenter.getXCoordinate())
        assertEquals(center.getYCoordinate(), returnedCenter.getYCoordinate())
    }

    @Test
    fun testGetRadiusX() {
        val ellipse = Ellipse(Point(0.0, 0.0), 2.0, 3.0)
        assertEquals(2.0, ellipse.getRadiusX())
    }

    @Test
    fun testGetRadiusY() {
        val ellipse = Ellipse(Point(0.0, 0.0), 2.0, 3.0)
        assertEquals(3.0, ellipse.getRadiusY())
    }

    @Test
    fun testZeroRadiusX() {
        assertThrows<IllegalArgumentException> { Ellipse(Point(0.0, 0.0), 0.0, 2.0) }
    }

    @Test
    fun testZeroRadiusY() {
        assertThrows<IllegalArgumentException> { Ellipse(Point(0.0, 0.0), 2.0, 0.0) }
    }

    @Test
    fun testInvalidRadiusXNaN() {
        assertThrows<IllegalArgumentException> { Ellipse(Point(0.0, 0.0), Double.NaN, 2.0) }
    }

    @Test
    fun testInvalidRadiusYNaN() {
        assertThrows<IllegalArgumentException> { Ellipse(Point(0.0, 0.0), 2.0, Double.NaN) }
    }

}