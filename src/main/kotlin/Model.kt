import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings

data class Message(val name: String, val message: String)
val body = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

val message = listOf<Message>(
    Message("Persona1 Apellido1", body),
    Message("Persona2 Apellido2", body),
    Message("Persona3 Apellido3", body)
)

val items = listOf(
    "Home" to Icons.Default.Home,
    "Search" to Icons.Default.Search,
    "Setting" to Icons.Default.Settings
)

data class Image(val image: String)

val images = listOf(
    Image("img1.jpeg"),
    Image("img2.jpeg"),
    Image("img3.jpeg")
)