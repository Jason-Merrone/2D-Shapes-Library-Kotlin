package org.example

import kotlin.math.pow
import kotlin.math.sqrt

class Rectangle(
    private val topLeft: Point,
    private val bottomRight: Point
) : Shape() {
    init{
        if(topLeft.getXCoordinate() == bottomRight.getXCoordinate() || topLeft.getYCoordinate() == bottomRight.getYCoordinate()){
            throw IllegalArgumentException("A rectangle cannot have 0 width or height")
        }
        points.add(topLeft)
        points.add(bottomRight)
    }

    override fun getArea(): Double {
        val width = points[0].getXCoordinate() - points[1].getXCoordinate()
        val height = points[0].getYCoordinate() - points[1].getYCoordinate()

        return sqrt((width*height).pow(2))
    }

    fun getTopLeft(): Point = points[0].clone()
    fun getBottomRight(): Point = points[1].clone()
}