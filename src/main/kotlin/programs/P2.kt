package programs

import processing.core.PApplet

object P2 {
    @JvmStatic
    fun main(args: Array<String>) {
        PApplet.runSketch(arrayOf("P"), P2())
    }

    class P2 : PApplet() {
        override fun settings() {
            // mac 13" 33% width, 100% height
            size(480, 850)
        }

        override fun draw() {
            colorMode(HSB, 360f, 100f, 100f)
            background(0f, 0f, 100f)
            stroke(0f, 0f, 0f)
            noFill()
            ellipse(56f, 45f, 55f, 50f)
            ellipse(106f, 45f, 65f, 65f)
            ellipse(200f, 245f, 82f, 75f)
        }
    }
}
