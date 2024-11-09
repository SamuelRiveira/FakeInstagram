import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import javax.naming.Name

data class Message(val name: String, val message: String)
val body = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

val message = listOf<Message>(
    Message("Persona1", body),
    Message("Persona2", body),
    Message("Persona3", body)
)

val items = listOf(
    "Home" to Icons.Default.Home,
    "Search" to Icons.Default.Search,
    "Setting" to Icons.Default.Settings
)

data class Image(val image: String)
data class Name(val name: String)

val name = listOf(
    Name("Diana Amoros"),
    Name("Alex Ares"),
    Name("Aaron Liu"),
    Name("Maria Cruz"),
    Name("Adelina Lucas"),
    Name("Jose Enrique"),
    Name("Laura Valera"),
    Name("Javier Paz"),
    Name("Gloria Bermejo"),
    Name("Leopoldo Vila"),
    Name("Godofredo Eustaquio")
)

val images = listOf(
    Image("img1.jpeg"),
    Image("img2.jpeg"),
    Image("img3.jpeg"),
    Image("img4.jpeg"),
    Image("img5.jpeg"),
    Image("img6.jpeg"),
    Image("img7.jpeg"),
    Image("img8.jpeg"),
    Image("img9.jpeg"),
    Image("img10.jpeg"),
    Image("img11.jpeg")
)

val publications = listOf(
    Image("img12.jpg"),
    Image("img13.jpg")
)