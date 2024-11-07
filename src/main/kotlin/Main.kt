import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun App(){
    Column (
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        Column(
            modifier = Modifier.background(Color.White).fillMaxWidth().height(70.dp),
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "Instagram",
                fontSize = 36.sp
            )
        }
        Column(
            modifier = Modifier.background(Color.Gray).fillMaxWidth()
        ) {
            Text(
                text = "Historias",
                fontSize = 24.sp
            )
            Card(
                modifier = Modifier.padding(top = 15.dp),
                backgroundColor = Color(0xffc6b1c9),
                elevation = 10.dp
            ){
                Row {
                    images.forEach { image ->
                        Image(
                            painter = painterResource(resourcePath = image.image),
                            contentDescription = "Foto Perfil",
                            modifier = Modifier.size(90.dp).padding(10.dp).clip(CircleShape)
                        )
                    }
                }
            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Fake Instagram",
        state = rememberWindowState(width = 1000.dp, height = 600.dp)
    ) {
        App()
    }
}