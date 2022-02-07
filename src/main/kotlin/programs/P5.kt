package programs

import BlankCanvas
import runSketch

fun main() = runSketch(object : BlankCanvas(480) {
    override fun setup() {
        super.setup()
        noStroke()
    }

    override fun drawOnReload(frame: Float) {
        filter(BLUR, 1)

        repeat(height / 10) { idx ->
            val i = idx.toFloat() * 10f
            fill((360f/(height / 10)) * idx, 20, noise(i / 10f + frame / 100f) * 150f)
            val size = noise(0.3 + frame / 1000f) * 15f
            rect(frame, i, size, size)
        }
    }
})
