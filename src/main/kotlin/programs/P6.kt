package programs

import MemoryDot
import processing.core.PApplet
import processing.core.PVector
import runSketch

fun main() = runSketch(object : PApplet() {
    var positions = List<PVector>(10000) {
        PVector(random(-250f, 600f), random(100f, 600f), random(90f, 100f))
    }

    var windDirection: MemoryDot = MemoryDot(250)

    // wind target will be updated regularly
    var windTarget = PVector(random(-20f, 20f), random(-20f, 20f))

    override fun settings() {
        size(400, 400, P3D)
    }

    override fun setup() {
        colorMode(HSB)
    }

    override fun draw() {
        // white background in HSB model
        background(255f, 0f, 255f)
        // translate and rotate for good viewing angle
        translate(0f, 0f, -300f)
        rotateX(radians(-15f))
        // every 150 frames, reset the wind target
        if (frameCount % 150 == 0) {
            windTarget = PVector(random(-5f, 5f), random(-5f, 5f))
        }
        // update wind direction with current target
        windDirection.update(windTarget)
        // draw grass at all positions one by one
        for (i in positions.indices) {
            val p: PVector = positions[i]
            // set green stroke color
            stroke(100f, 150f, 50f + p.z)
            // use noise for wind strength
            val windStrength = noise((frameCount / 500.0).toFloat()) * 2
            // draw every grass blade
            line(p.x, 200f, p.y, p.x - windDirection.x * windStrength, 200 - p.z, p.y - windDirection.y * windStrength)
        }
    }
})
