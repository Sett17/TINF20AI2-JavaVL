import java.net.CacheRequest

fun main() {
    val panamera = Car("Porsche", "Panamera", 1.937, CarColor.WHITE)
    val golf = Car("VW", "Golf", 1.795, CarColor.RED)
    val m3 = Car("BMW", "M3", 1.780, CarColor.BLUE)
    val g63 = Car("Mercedes", "G63", 1.885, CarColor.BLACK)
    val gt = Cabrio("Mercedes", "AMG GT Cabriolet", 2.007, CarColor.GREEN)

    panamera.drive()
    golf.drive()
    m3.drive()
    g63.drive()
    gt.drive()
}

enum class CarColor(val seq: Int) {
    WHITE(0), BLUE(34), RED(31), BLACK(7), GREEN(32)
}

open class Car(private var hersteller: String, private var typ: String, private var breite: Double, private var color: CarColor) {

    companion object {
        private var wheels = 4
        var instanceCounter = 0
            private set
    }

    var wheels: Int
        get() = Companion.wheels
        set(wheels) {
            Companion.wheels = wheels
        }

    init {
        instanceCounter++
    }

    fun paintCar(newColor: CarColor = CarColor.BLACK) {
        color = newColor
        println("Car is now \u001B[${color.seq}m$color\u001B[0m")
    }

    open fun drive() {
        println("\u001B[${color.seq}mbrumm brumm\u001B[0m")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Car

        if (hersteller != other.hersteller) return false
        if (typ != other.typ) return false
        if (breite != other.breite) return false
        if (color != other.color) return false

        return true
    }

    override fun hashCode(): Int {
        var result = hersteller.hashCode()
        result = 31 * result + typ.hashCode()
        result = 31 * result + breite.hashCode()
        result = 31 * result + color.hashCode()
        return result
    }

    override fun toString(): String {
        return "\u001B[${color.seq}mCar(hersteller='$hersteller', typ='$typ', breite=$breite, color='$color', wheels=$wheels)\u001B[0m"
    }


}
