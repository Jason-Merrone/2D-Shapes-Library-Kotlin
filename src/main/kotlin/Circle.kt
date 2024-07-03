package org.example

import kotlin.math.PI

class Circle(
    private val centerPoint: Point,
    private val radius: Double,
) : Shape() {
    init{
        if(radius.isNaN()){
            throw IllegalArgumentException("Radius must be a number")
        }
        if(radius == 0.0) {
            throw IllegalArgumentException("A circle cannot have an area of 0")
        }
        points.add(centerPoint)
    }

    override fun getArea(): Double {
        return PI*radius*radius
    }

    fun getCenterPoint(): Point = points[0].clone()
    fun getRadiusX(): Double = radius
}