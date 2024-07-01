package org.example
import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    private val point1 = Point(1.0,2.0)
    @Test
    fun testGettingPoints() {
        assertEquals(1.0,point1.getXCoordinate())
        assertEquals(2.0,point1.getYCoordinate())
    }
    @Test
    fun testClonePoint() {
        val clone = point1.clonePoint()
        assertEquals(1.0, clone.getXCoordinate())
        assertEquals(2.0, clone.getYCoordinate())
    }
    @Test
    fun testMovePoint(){
        point1.movePoint(1.0,-1.0)
        assertEquals(2.0, point1.getXCoordinate())
        assertEquals(1.0, point1.getYCoordinate())
    }
}