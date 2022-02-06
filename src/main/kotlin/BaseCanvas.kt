import org.objectweb.asm.ClassReader
import org.objectweb.asm.util.TraceClassVisitor
import processing.core.PApplet
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.PrintWriter
import java.time.Duration

fun runSketch(canvas: BlankCanvas) {
    PApplet.runSketch(arrayOf("Art"), canvas)
}

abstract class BlankCanvas: KPApplet() {
    private var lastCheck = System.nanoTime()
    private var classBytes: ByteArray? = null

    override fun settings() {
        // mac 13" 33% width, 100% height
        size(480, 850)
    }

    override fun setup() {
        colorMode(PApplet.HSB, 360f, 100f, 100f)
        background(0f, 0f, 100f)
        stroke(0f, 0f, 0f)
    }

    override fun draw() {
        try {
            if(classBytes == null || Duration.ofNanos(System.nanoTime() - lastCheck).seconds > 2) {
                val reader = ClassReader(this::class.java.name)
                val bos = ByteArrayOutputStream()
                val tcv = TraceClassVisitor(PrintWriter(bos))
                reader.accept(tcv, 0)
                val currentClassBytes = bos.toByteArray()
                if (classBytes == null) {
                    drawOnReload()
                    classBytes = currentClassBytes
                } else {
                    if (!classBytes.contentEquals(currentClassBytes)) {
                        classBytes = currentClassBytes
                        drawOnReload()
                    }
                }
                lastCheck = System.nanoTime()
            }
        } catch (_: IOException) {
        }
    }

    abstract fun drawOnReload()
}
