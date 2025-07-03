package org.soppo.soppo.view.themes

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import soppo.composeapp.generated.resources.Res
import soppo.composeapp.generated.resources.mulish_black
import soppo.composeapp.generated.resources.mulish_black_italic
import soppo.composeapp.generated.resources.mulish_bold
import soppo.composeapp.generated.resources.mulish_bold_italic
import soppo.composeapp.generated.resources.mulish_extra_bold
import soppo.composeapp.generated.resources.mulish_extra_bold_italic
import soppo.composeapp.generated.resources.mulish_extra_light
import soppo.composeapp.generated.resources.mulish_extra_light_italic
import soppo.composeapp.generated.resources.mulish_italic
import soppo.composeapp.generated.resources.mulish_light
import soppo.composeapp.generated.resources.mulish_light_italic
import soppo.composeapp.generated.resources.mulish_medium
import soppo.composeapp.generated.resources.mulish_medium_italic
import soppo.composeapp.generated.resources.mulish_regular
import soppo.composeapp.generated.resources.mulish_semi_bold
import soppo.composeapp.generated.resources.mulish_semi_bold_italic


@Composable
fun MulishFontFamily() = FontFamily(
    listOf(
        Font(
            resource = Res.font.mulish_extra_light,
            weight = FontWeight.ExtraLight,
            style = FontStyle.Normal
        ),
        Font(resource = Res.font.mulish_light, weight = FontWeight.Light, style = FontStyle.Normal),
        Font(
            resource = Res.font.mulish_regular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.mulish_medium,
            weight = FontWeight.Medium,
            style = FontStyle.Normal
        ),
        Font(
            resource = Res.font.mulish_semi_bold,
            weight = FontWeight.SemiBold,
            style = FontStyle.Normal
        ),
        Font(resource = Res.font.mulish_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
        Font(
            resource = Res.font.mulish_extra_bold,
            weight = FontWeight.ExtraBold,
            style = FontStyle.Normal
        ),
        Font(resource = Res.font.mulish_black, weight = FontWeight.Black, style = FontStyle.Normal),
        // START ITALIC
        Font(
            resource = Res.font.mulish_extra_light_italic,
            weight = FontWeight.ExtraLight,
            style = FontStyle.Italic
        ),
        Font(
            resource = Res.font.mulish_light_italic,
            weight = FontWeight.Light,
            style = FontStyle.Italic
        ),
        Font(
            resource = Res.font.mulish_medium_italic,
            weight = FontWeight.Medium,
            style = FontStyle.Italic
        ),
        Font(
            resource = Res.font.mulish_italic,
            weight = FontWeight.Normal,
            style = FontStyle.Italic
        ),
        Font(
            resource = Res.font.mulish_semi_bold_italic,
            weight = FontWeight.SemiBold,
            style = FontStyle.Italic
        ),
        Font(
            resource = Res.font.mulish_bold_italic,
            weight = FontWeight.Bold,
            style = FontStyle.Italic
        ),
        Font(
            resource = Res.font.mulish_extra_bold_italic,
            weight = FontWeight.ExtraBold,
            style = FontStyle.Italic
        ),
        Font(
            resource = Res.font.mulish_black_italic,
            weight = FontWeight.Black,
            style = FontStyle.Italic
        ),

        )
)
