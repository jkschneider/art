import processing.core.PApplet

open class KPApplet : PApplet() {
    fun background(v1: Number, v2: Number, v3: Number) {
        super.background(v1.toFloat(), v2.toFloat(), v3.toFloat())
    }

    fun background(v1: Number, v2: Number, v3: Number, alpha: Number) {
        super.background(v1.toFloat(), v2.toFloat(), v3.toFloat(), alpha.toFloat())
    }

    fun dist(x1: Number, y1: Number, x2: Number, y2: Number) =
        PApplet.dist(x1.toFloat(), y1.toFloat(), x2.toFloat(), y2.toFloat())

    fun dist(x1: Number, y1: Number, z1: Number, x2: Number, y2: Number, z2: Number) =
        PApplet.dist(x1.toFloat(), y1.toFloat(), z1.toFloat(), x2.toFloat(), y2.toFloat(), z2.toFloat())

    fun ellipse(a: Number, b: Number, c: Number, d: Number) {
        super.ellipse(a.toFloat(), b.toFloat(), c.toFloat(), d.toFloat())
    }

    fun fill(v1: Number, v2: Number, v3: Number) {
        super.fill(v1.toFloat(), v2.toFloat(), v3.toFloat())
    }

    fun fill(v1: Number, v2: Number, v3: Number, alpha: Number) {
        super.fill(v1.toFloat(), v2.toFloat(), v3.toFloat(), alpha.toFloat())
    }

    fun filter(kind: Int, param: Number) {
        super.filter(kind, param.toFloat())
    }

    fun noise(x: Number) =
        super.noise(x.toFloat())

    fun noise(x: Number, y: Number) =
        super.noise(x.toFloat(), y.toFloat())

    fun noise(x: Number, y: Number, z: Number) =
        super.noise(x.toFloat(), y.toFloat(), z.toFloat())

    fun random(high: Number) =
        super.random(high.toFloat())

    fun random(low: Number, high: Number) =
        super.random(low.toFloat(), high.toFloat())

    fun rect(a: Number, b: Number, c: Number, d: Number) {
        super.rect(a.toFloat(), b.toFloat(), c.toFloat(), d.toFloat())
    }

    fun rect(a: Number, b: Number, c: Number, d: Number, r: Number) {
        super.rect(a.toFloat(), b.toFloat(), c.toFloat(), d.toFloat(), r.toFloat())
    }

    fun rect(a: Number, b: Number, c: Number, d: Number, tl: Number, tr: Number, br: Number, bl: Number) {
        super.rect(a.toFloat(), b.toFloat(), c.toFloat(), d.toFloat(), tl.toFloat(), tr.toFloat(), br.toFloat(), bl.toFloat())
    }
    
    fun stroke(v1: Number, v2: Number, v3: Number) {
        super.stroke(v1.toFloat(), v2.toFloat(), v3.toFloat())
    }

    fun stroke(v1: Number, v2: Number, v3: Number, alpha: Number) {
        super.stroke(v1.toFloat(), v2.toFloat(), v3.toFloat(), alpha.toFloat())
    }
}
