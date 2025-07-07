package org.soppo.soppo.view.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberOverscrollEffect
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
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
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.soppo.soppo.view.themes.MulishFontFamily
import org.soppo.soppo.view.ui.home.component.CategoryItem
import org.soppo.soppo.view.ui.home.component.MatchItem
import org.soppo.soppo.view.ui.home.component.NewsItem
import soppo.composeapp.generated.resources.Res
import soppo.composeapp.generated.resources.banner_soppo
import soppo.composeapp.generated.resources.ic_badminton
import soppo.composeapp.generated.resources.ic_basket
import soppo.composeapp.generated.resources.ic_notif
import soppo.composeapp.generated.resources.ic_soccer

@Preview
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}

data class CategoryModel(val categoryName: String, val drawableResource: DrawableResource)
data class NewsModel(
    val newsTitle: String,
    val newsDesc: String,
    val newsAuthor: String,
    val newsDate: String,
    val newsImage: DrawableResource,
)

data class MatchModel(
    val matchImage: DrawableResource,
    val matchTitle: String,
    val matchLocation: String,
    val matchDate: String,
    val matchTime: String,
    val matchHost: String,
    val matchPlayTime: String,
    val matchScoreHome: Int,
    val matchScoreAway: Int,
    val isMatchFinish: Boolean,
    val isMatchOngoing: Boolean,
)

@Composable
private fun HomeScreen() {


    val listCategory = listOf(
        CategoryModel("Futsal", Res.drawable.ic_soccer),
        CategoryModel("Mini Soccer", Res.drawable.ic_soccer),
        CategoryModel("Badminton", Res.drawable.ic_badminton),
        CategoryModel("Basket", Res.drawable.ic_basket),
    )

    val listNews = listOf(
        NewsModel(
            newsTitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            newsDesc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Urna, eget imperdiet molestie nunc tortor, orci pharetra. Auctor ac sed tristique nisi. Cras tortor quis lacus mauris sapien. Adipiscing auctor vulputate a orci phasellus nunc quam gravida. Pulvinar consequat diam urna integer maecenas purus sem. Scelerisque in praesent nibh eget egestas tempus, diam. Eu cras quam nulla sed cursus quis. Congue convallis eget volutpat posuere.",
            newsAuthor = "Author xxxx",
            newsDate = "June 28, 2021",
            newsImage = Res.drawable.banner_soppo
        ),
        NewsModel(
            newsTitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            newsDesc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Urna, eget imperdiet molestie nunc tortor, orci pharetra. Auctor ac sed tristique nisi. Cras tortor quis lacus mauris sapien. Adipiscing auctor vulputate a orci phasellus nunc quam gravida. Pulvinar consequat diam urna integer maecenas purus sem. Scelerisque in praesent nibh eget egestas tempus, diam. Eu cras quam nulla sed cursus quis. Congue convallis eget volutpat posuere.",
            newsAuthor = "Author xxxx",
            newsDate = "June 28, 2021",
            newsImage = Res.drawable.banner_soppo
        ),
        NewsModel(
            newsTitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            newsDesc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Urna, eget imperdiet molestie nunc tortor, orci pharetra. Auctor ac sed tristique nisi. Cras tortor quis lacus mauris sapien. Adipiscing auctor vulputate a orci phasellus nunc quam gravida. Pulvinar consequat diam urna integer maecenas purus sem. Scelerisque in praesent nibh eget egestas tempus, diam. Eu cras quam nulla sed cursus quis. Congue convallis eget volutpat posuere.",
            newsAuthor = "Author xxxx",
            newsDate = "June 28, 2021",
            newsImage = Res.drawable.banner_soppo
        ),
        NewsModel(
            newsTitle = "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            newsDesc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Urna, eget imperdiet molestie nunc tortor, orci pharetra. Auctor ac sed tristique nisi. Cras tortor quis lacus mauris sapien. Adipiscing auctor vulputate a orci phasellus nunc quam gravida. Pulvinar consequat diam urna integer maecenas purus sem. Scelerisque in praesent nibh eget egestas tempus, diam. Eu cras quam nulla sed cursus quis. Congue convallis eget volutpat posuere.",
            newsAuthor = "Author xxxx",
            newsDate = "June 28, 2021",
            newsImage = Res.drawable.banner_soppo
        ),
    )

    val listMatch = listOf(
        MatchModel(
            matchImage = Res.drawable.banner_soppo,
            matchTitle = "Sparing Antar RT",
            matchLocation = "Lapangan Futsal XXX",
            matchDate = "28 Juli 2021",
            matchTime = "15:00 - 18:00",
            matchHost = "Karasuno VBC",
            matchPlayTime = "3 hours",
            matchScoreHome = 0,
            matchScoreAway = 0,
            isMatchFinish = false,
            isMatchOngoing = false
        ),
        MatchModel(
            matchImage = Res.drawable.banner_soppo,
            matchTitle = "Sparing Antar RT",
            matchLocation = "Lapangan Futsal XXX",
            matchDate = "28 Juli 2021",
            matchTime = "15:00 - 18:00",
            matchHost = "Karasuno VBC",
            matchPlayTime = "3 hours",
            matchScoreHome = 0,
            matchScoreAway = 0,
            isMatchFinish = false,
            isMatchOngoing = false
        ),
        MatchModel(
            matchImage = Res.drawable.banner_soppo,
            matchTitle = "Sparing Antar RT",
            matchLocation = "Lapangan Futsal XXX",
            matchDate = "28 Juli 2021",
            matchTime = "15:00 - 18:00",
            matchHost = "Karasuno VBC",
            matchPlayTime = "3 hours",
            matchScoreHome = 0,
            matchScoreAway = 0,
            isMatchFinish = false,
            isMatchOngoing = false
        ),
    )

    val overscrollEffect = rememberOverscrollEffect()

    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {

        item {
            Box(modifier = Modifier.fillMaxWidth().height(250.dp)) {

                Image(
                    painterResource(Res.drawable.banner_soppo),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxWidth().height(250.dp)
                )
                Icon(
                    painterResource(Res.drawable.ic_notif),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier.align(Alignment.TopEnd)
                        .padding(vertical = 16.dp, horizontal = 16.dp)
                )

            }
        }

        item {

            Text(
                "What game do you wanna play?", style = TextStyle(
                    fontFamily = MulishFontFamily(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.Black
                ), modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(Modifier.height(12.dp))

            LazyRow(
                modifier = Modifier.padding(start = 16.dp),
                overscrollEffect = overscrollEffect
            ) {
                items(listCategory.size) {
                    CategoryItem(listCategory[it])
                    Spacer(Modifier.width(16.dp))
                }
            }
        }

        item {

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Ongoing Match", style = TextStyle(
                        fontFamily = MulishFontFamily(),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.Black
                    )
                )

                Text(
                    "All", style = TextStyle(
                        fontFamily = MulishFontFamily(),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.W300,
                        color = Color.Black
                    ), modifier = Modifier.padding(horizontal = 16.dp)
                )
            }

            Spacer(Modifier.height(24.dp))

            Column(Modifier.fillMaxWidth().padding(horizontal = 16.dp)) {

                repeat(listMatch.size) {
                    MatchItem(listMatch[it])

                    if (it + 1 != listMatch.size) {
                        HorizontalDivider(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
                            1.dp,
                            color = Color(0xFFF4F4F4)
                        )
                    }
                }
            }

        }

        item {
            Card(
                modifier = Modifier.padding(16.dp).fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(Color(0xFFF4F4F4))
            ) {

                Column(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 18.dp)
                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "News", style = TextStyle(
                                fontFamily = MulishFontFamily(),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.W600,
                                color = Color.Black
                            )
                        )

                        Text(
                            "All", style = TextStyle(
                                fontFamily = MulishFontFamily(),
                                fontSize = 13.sp,
                                fontWeight = FontWeight.W300,
                                color = Color.Black
                            ), modifier = Modifier.padding(horizontal = 16.dp)
                        )
                    }

                    Spacer(Modifier.height(16.dp))

                    FlowRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(32.dp),
                        verticalArrangement = Arrangement.spacedBy(22.dp),
                    ) {
                        repeat(listNews.size) {

                            NewsItem(modifier = Modifier.weight(1f), listNews[it])
                        }
                    }
                }

            }
        }
    }


}
