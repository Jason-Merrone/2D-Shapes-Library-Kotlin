package org.example

import kotlin.math.pow
import kotlin.math.sqrt

abstract class Shape {
    protected val points = mutableListOf<Point>()

    fun moveShape(deltaX: Double, deltaY: Double){
        for (point in points){
            point.move(deltaX, deltaY)
        }
    }

    protected fun computeDistance(point1: Point, point2: Point): Double {
        return sqrt((point2.getXCoordinate()-point1.getXCoordinate()).pow(2) + (point2.getYCoordinate()-point1.getYCoordinate()).pow(2))
    }

    abstract fun getArea(): Double
}