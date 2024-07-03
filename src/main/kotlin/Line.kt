package org.example

class Line(
    private val start: Point,
    private val end: Point) : Shape() {
        init{
            if (computeDistance(start,end) == 0.0) {
                throw IllegalArgumentException("A line cannot have zero length.")
            }
            points.add(start)
            points.add(end)
        }

        override fun getArea(): Double {
            return 0.0
        }

        fun getLength():Double{
            // Distance formula
            val length = computeDistance(points[0],points[1])
            return length
        }

        fun getSlope():Double{
            return ( points[1].getYCoordinate()-points[0].getYCoordinate() ) / ( points[1].getXCoordinate() - points[0].getXCoordinate() )
        }

        fun getStart(): Point = points[0].clone()

        fun getEnd(): Point = points[1].clone()
}
