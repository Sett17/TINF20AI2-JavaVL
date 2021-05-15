class Cabrio(hersteller: String, typ: String, breite: Double, color: CarColor) : Car(hersteller, typ, breite, color) {

    override fun drive() {
        super.drive()
        println("\tohne dach!")
    }
}
