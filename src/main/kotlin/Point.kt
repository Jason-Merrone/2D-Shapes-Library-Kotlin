package org.example

class Point(
    private var xCoordinate: Double,
    private var yCoordinate: Double,
) {
    init{
        if(xCoordinate.isNaN() || yCoordinate.isNaN()){
            throw IllegalArgumentException("A point must have numerical coordinates")
        }
    }
    public fun getXCoordinate() = xCoordinate
    public fun getYCoordinate() = yCoordinate
    public fun clone() = Point(xCoordinate, yCoordinate)
    public fun move(deltaX: Double, deltaY: Double) {
        xCoordinate += deltaX
        yCoordinate += deltaY
    }
}