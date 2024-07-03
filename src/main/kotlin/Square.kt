package org.example

class Square(
    private val topLeft: Point,
    private val width: Double
) : Shape() {
    init{
        if(width.isNaN()){
            throw IllegalArgumentException("Width must be a number")
        }

        if(width == 0.0){
            throw IllegalArgumentException("A square cannot have 0 width or height")
        }
        points.add(topLeft)
    }

    override fun getArea(): Double {
        return width*width
    }

    fun getTopLeft(): Point = points[0].clone()
    fun getWidth(): Double = width
}