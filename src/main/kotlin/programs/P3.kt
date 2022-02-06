package programs

import processing.core.PApplet

object P3 {
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

            rectMode(CENTER)
            fill(0f, 0f, 50f)
            rect(width / 2f, height / 2f, 200f, 200f)

            translate(width / 2f, height / 2f);
            rotate(radians(10f));

            fill(0)
            rect(0f, 0f, 40f, 40f)
        }
    }
}
