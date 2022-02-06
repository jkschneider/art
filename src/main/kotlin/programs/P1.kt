package programs

import processing.core.PApplet

object P1 {
    @JvmStatic
    fun main(args: Array<String>) {
        PApplet.runSketch(arrayOf("P1"), object: PApplet() {
            override fun settings() {
                size(1000, 800)
            }

            override fun draw() {
                noLoop()
                colorMode(HSB, 360f, 100f, 100f)
                background(0f, 0f, 100f)
                stroke(0f, 0f, 0f)
                noFill()

                beginShape()
                (0..99).forEach { _ ->
                    vertex(random(width.toFloat()), random(height.toFloat()))
                }
                endShape()
            }
        })
    }
}
