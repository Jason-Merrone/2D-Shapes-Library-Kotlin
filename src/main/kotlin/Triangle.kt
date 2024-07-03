package org.example

import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(
    private val point1: Point,
    private val point2: Point,
    private val point3: Point
) : Shape() {
    init{

        points.add(point1)
        points.add(point2)
        points.add(point3)

        if(getArea() == 0.0){
            throw IllegalArgumentException("A triangle must not have an area of 0")
        }
    }

    override fun getArea(): Double {
        val sideA = computeDistance(points[0], points[1])
        val sideB = computeDistance(points[1], points[2])
        val sideC = computeDistance(points[2], points[0])

        val semiPerimeter = (sideA + sideB + sideC) / 2.0

        // Heron's Formula
        return sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
    }

    fun getPoint1(): Point = points[0].clone()
    fun getPoint2(): Point = points[1].clone()
    fun getPoint3(): Point = points[2].clone()
}