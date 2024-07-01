package org.example

class Point(
    private var xCoordinate: Double,
    private var yCoordinate: Double,
) {
    public fun getXCoordinate() = xCoordinate
    public fun getYCoordinate() = yCoordinate
    public fun clonePoint() = Point(xCoordinate, yCoordinate)
    public fun movePoint(deltaX: Double, deltaY: Double) {
        xCoordinate += deltaX
        yCoordinate += deltaY
    }
}