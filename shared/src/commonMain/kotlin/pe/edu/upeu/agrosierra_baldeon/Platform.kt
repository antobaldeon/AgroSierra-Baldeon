package pe.edu.upeu.agrosierra_baldeon

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform