package org.soppo.soppo.view.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.soppo.soppo.view.themes.Colors
import org.soppo.soppo.view.themes.MulishFontFamily
import org.soppo.soppo.view.ui.home.MatchModel

@Composable
fun MatchItem(item: MatchModel) {

    Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

        Card(
            modifier = Modifier.size(width = 160.dp, height = 120.dp),
            shape = RoundedCornerShape(10.dp)
        ) {

            Image(
                painterResource(item.matchImage),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize(),
            )

        }

        Spacer(Modifier.width(16.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                item.matchTitle, style = TextStyle(
                    fontFamily = MulishFontFamily(),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.Black
                )
            )

            Spacer(Modifier.height(12.dp))

            Text(
                item.matchLocation, style = TextStyle(
                    fontFamily = MulishFontFamily(),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W300,
                    color = Color.Black
                )
            )

            Spacer(Modifier.height(4.dp))


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    item.matchDate, style = TextStyle(
                        fontFamily = MulishFontFamily(),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W300,
                        color = Color.Black
                    )
                )

                Box(modifier = Modifier.size(4.dp).background(Color.Black, shape = CircleShape))

                Text(
                    item.matchTime, style = TextStyle(
                        fontFamily = MulishFontFamily(),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W300,
                        color = Color.Black
                    )
                )
            }

            Spacer(Modifier.height(12.dp))

            Text(
                "Organizer: ${item.matchHost}", style = TextStyle(
                    fontFamily = MulishFontFamily(),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    color = Colors.orange
                )
            )

        }

    }

}