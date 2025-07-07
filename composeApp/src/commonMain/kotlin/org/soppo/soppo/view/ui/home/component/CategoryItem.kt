package org.soppo.soppo.view.ui.home.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.soppo.soppo.view.themes.Colors
import org.soppo.soppo.view.themes.MulishFontFamily
import org.soppo.soppo.view.ui.home.CategoryModel


@Composable
fun CategoryItem(item: CategoryModel) {

    Card(colors = CardDefaults.cardColors(Color(0xFFF4F4F4)), shape = RoundedCornerShape(8.dp)) {
        Row(modifier = Modifier.padding(12.dp)) {

            Text(
                item.categoryName, style = TextStyle(
                    fontFamily = MulishFontFamily(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.W400,
                    color = Color.Black
                )
            )

            Icon(
                painterResource(item.drawableResource),
                contentDescription = "",
                tint = Colors.orange,
                modifier = Modifier.size(40.dp)
            )


        }
    }

}