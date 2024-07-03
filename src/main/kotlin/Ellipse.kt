package org.example

import kotlin.math.PI

class Ellipse(
    private val centerPoint: Point,
    private val radiusX: Double,
    private val radiusY: Double
) : Shape() {
    init {
        if(radiusX.isNaN() || radiusY.isNaN()) {
            throw IllegalArgumentException("Radius arguments must be a number")
        }

        if(radiusX == 0.0 || radiusY == 0.0) {
            throw IllegalArgumentException("An ellipse cannot have an area of 0")
        }
        points.add(centerPoint)
    }

    override fun getArea(): Double {
        return PI*radiusX*radiusY
    }

    fun getCenterPoint(): Point = points[0].clone()
    fun getRadiusX(): Double = radiusX
    fun getRadiusY(): Double = radiusY
}