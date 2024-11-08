import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun App(){
    Column (
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.background(Color(0xfff6f6f6)).fillMaxSize()
    ){
        Column(
            modifier = Modifier.background(Color.White).fillMaxWidth().height(70.dp),
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "Instagram",
                fontSize = 36.sp,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
        Row {
            Column(
                modifier = Modifier
            ) {
                Text(
                    text = "Historias",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
                Row {
                    Card(
                        modifier = Modifier.padding(16.dp).width(520.dp),
                        backgroundColor = Color.White,
                        elevation = 2.dp,
                        border = BorderStroke(2.dp,Color(0xffc5c5c5))
                    ){
                        Row {
                            images.forEach { image ->
                                Image(
                                    painter = painterResource(resourcePath = image.image),
                                    contentDescription = "Foto Perfil",
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .size(70.dp)
                                        .clip(CircleShape)
                                        .border(
                                            width = 2.dp,
                                            brush = Brush.linearGradient(
                                                colors = listOf(Color.Yellow, Color.Red),
                                                start = Offset(0f, 0f),
                                                end = Offset(70f, 70f)
                                            ),
                                            shape = CircleShape
                                        )
                                )
                            }
                        }
                    }
                }
                Text(
                    text = "Publicaciones",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
                publications.forEachIndexed { index, publication ->
                    Card(
                        modifier = Modifier.padding(16.dp).width(520.dp).height(350.dp),
                        backgroundColor = Color.White,
                        elevation = 2.dp,
                        border = BorderStroke(2.dp,Color(0xffc5c5c5))
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Column(
                                modifier = Modifier.height(290.dp)
                            ) {
                                Image(
                                    painter = painterResource(resourcePath = publication.image),
                                    contentDescription = "Foto Publicacion",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.White)
                                    .height(60.dp)
                                    .border(width = 1.dp, color = Color(0xffc5c5c5))
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(resourcePath = images[index].image),
                                        contentDescription = "Foto Perfil",
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .size(40.dp)
                                            .clip(CircleShape)
                                    )
                                    Text(
                                        text = name[index].name,
                                    )
                                }
                            }
                        }
                    }
                }
            }
            Column {
                Text(text = "Suggestions for you")
            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Fake Instagram",
        state = rememberWindowState(width = 1000.dp, height = 1100.dp)
    ) {
        App()
    }
}