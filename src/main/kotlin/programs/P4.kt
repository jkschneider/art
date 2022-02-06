package programs

import BlankCanvas
import processing.core.PVector
import runSketch

fun main() = runSketch(object: BlankCanvas() {
    val particles = List(4000) { Particle() }

    override fun drawOnReload() {
        background(200, 100, 50)
        drawParticleCloud(100, 100)
    }

    fun drawParticleCloud(x: Int, y: Int) {
        pushMatrix()
        translate(x.toFloat(), y.toFloat())
        for (p in particles) {
            // change position and draw particle
            p.move(abs(width.toFloat() / 2 - random(width.toFloat())))
            p.show()
        }
        popMatrix()
    }

    inner class Particle {
        var x = 0f
        var y = 0f
        val size: Float = random(0.5, 4)
        var directionX: Float = random(-1, 1)
        var directionY: Float = random(-1, 1)

        fun move(radius: Float) {
            if (dist(x, y, 0, 0) > radius) {
                val position = PVector(x, y)
                val target = PVector(
                    random(-radius, radius),
                    random(-radius, radius)
                )
                val direction = PVector.sub(target, position)
                direction.div(600f)
                directionX = direction.x
                directionY = direction.y
            }
            this.x += directionX
            this.y += directionY
        }

        fun show() {
            stroke(200, 1000, 90)
            // set individual particle color
            fill(200, 100, 90, size * 30)
            // draw particle shape
            ellipse(x, y, size, size)
        }
    }
})
