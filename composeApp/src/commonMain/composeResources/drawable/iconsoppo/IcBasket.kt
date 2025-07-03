package iconsoppo

import IconSoppo
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.Unit

public val IconSoppo.IcBasket: ImageVector
    get() {
        if (_icBasket != null) {
            return _icBasket!!
        }
        _icBasket = Builder(name = "IcBasket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.0f, 440.0f)
                horizontalLineToRelative(114.0f)
                quadToRelative(-6.0f, -38.0f, -23.0f, -71.0f)
                reflectiveQuadToRelative(-43.0f, -59.0f)
                quadToRelative(-18.0f, 29.0f, -30.5f, 61.5f)
                reflectiveQuadTo(162.0f, 440.0f)
                close()
                moveTo(684.0f, 440.0f)
                horizontalLineToRelative(114.0f)
                quadToRelative(-5.0f, -36.0f, -17.5f, -68.5f)
                reflectiveQuadTo(750.0f, 310.0f)
                quadToRelative(-26.0f, 26.0f, -43.0f, 59.0f)
                reflectiveQuadToRelative(-23.0f, 71.0f)
                close()
                moveTo(210.0f, 650.0f)
                quadToRelative(26.0f, -26.0f, 43.0f, -59.0f)
                reflectiveQuadToRelative(23.0f, -71.0f)
                lineTo(162.0f, 520.0f)
                quadToRelative(5.0f, 36.0f, 17.5f, 68.5f)
                reflectiveQuadTo(210.0f, 650.0f)
                close()
                moveTo(750.0f, 650.0f)
                quadToRelative(18.0f, -29.0f, 30.5f, -61.5f)
                reflectiveQuadTo(798.0f, 520.0f)
                lineTo(684.0f, 520.0f)
                quadToRelative(6.0f, 38.0f, 23.0f, 71.0f)
                reflectiveQuadToRelative(43.0f, 59.0f)
                close()
                moveTo(358.0f, 440.0f)
                horizontalLineToRelative(82.0f)
                verticalLineToRelative(-278.0f)
                quadToRelative(-53.0f, 8.0f, -98.5f, 29.5f)
                reflectiveQuadTo(260.0f, 248.0f)
                quadToRelative(39.0f, 38.0f, 64.5f, 86.5f)
                reflectiveQuadTo(358.0f, 440.0f)
                close()
                moveTo(520.0f, 440.0f)
                horizontalLineToRelative(82.0f)
                quadToRelative(8.0f, -57.0f, 33.5f, -105.5f)
                reflectiveQuadTo(700.0f, 248.0f)
                quadToRelative(-36.0f, -35.0f, -81.5f, -56.5f)
                reflectiveQuadTo(520.0f, 162.0f)
                verticalLineToRelative(278.0f)
                close()
                moveTo(440.0f, 798.0f)
                verticalLineToRelative(-278.0f)
                horizontalLineToRelative(-82.0f)
                quadToRelative(-8.0f, 57.0f, -33.5f, 105.5f)
                reflectiveQuadTo(260.0f, 712.0f)
                quadToRelative(36.0f, 35.0f, 81.5f, 56.5f)
                reflectiveQuadTo(440.0f, 798.0f)
                close()
                moveTo(520.0f, 798.0f)
                quadToRelative(53.0f, -8.0f, 98.5f, -29.5f)
                reflectiveQuadTo(700.0f, 712.0f)
                quadToRelative(-39.0f, -38.0f, -64.5f, -86.5f)
                reflectiveQuadTo(602.0f, 520.0f)
                horizontalLineToRelative(-82.0f)
                verticalLineToRelative(278.0f)
                close()
                moveTo(480.0f, 480.0f)
                close()
                moveTo(480.0f, 880.0f)
                quadToRelative(-83.0f, 0.0f, -156.0f, -31.5f)
                reflectiveQuadTo(197.0f, 763.0f)
                quadToRelative(-54.0f, -54.0f, -85.5f, -127.0f)
                reflectiveQuadTo(80.0f, 480.0f)
                quadToRelative(0.0f, -83.0f, 31.5f, -156.0f)
                reflectiveQuadTo(197.0f, 197.0f)
                quadToRelative(54.0f, -54.0f, 127.0f, -85.5f)
                reflectiveQuadTo(480.0f, 80.0f)
                quadToRelative(83.0f, 0.0f, 156.0f, 31.5f)
                reflectiveQuadTo(763.0f, 197.0f)
                quadToRelative(54.0f, 54.0f, 85.5f, 127.0f)
                reflectiveQuadTo(880.0f, 480.0f)
                quadToRelative(0.0f, 83.0f, -31.5f, 156.0f)
                reflectiveQuadTo(763.0f, 763.0f)
                quadToRelative(-54.0f, 54.0f, -127.0f, 85.5f)
                reflectiveQuadTo(480.0f, 880.0f)
                close()
            }
        }
        .build()
        return _icBasket!!
    }

private var _icBasket: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcBasket, contentDescription = "")
    }
}
