package org.soppo.soppo.view.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.soppo.soppo.view.themes.MulishFontFamily
import org.soppo.soppo.view.ui.home.NewsModel


@Composable
fun NewsItem(modifier: Modifier, item: NewsModel) {

    Column(modifier = modifier) {
        Card(
            modifier = modifier,
            shape = RoundedCornerShape(10.dp)
        ) {

            Image(
                painterResource(item.newsImage),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize(),
            )

        }

        Spacer(Modifier.height(8.dp))

        Text(
            item.newsTitle, style = TextStyle(
                fontFamily = MulishFontFamily(),
                fontSize = 13.sp,
                fontWeight = FontWeight.W400,
                color = Color.Black
            ),
        )
    }

}