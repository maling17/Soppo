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

public val IconSoppo.IcHome: ImageVector
    get() {
        if (_icHome != null) {
            return _icHome!!
        }
        _icHome = Builder(name = "IcHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 760.0f)
                horizontalLineToRelative(120.0f)
                verticalLineToRelative(-200.0f)
                quadToRelative(0.0f, -17.0f, 11.5f, -28.5f)
                reflectiveQuadTo(400.0f, 520.0f)
                horizontalLineToRelative(160.0f)
                quadToRelative(17.0f, 0.0f, 28.5f, 11.5f)
                reflectiveQuadTo(600.0f, 560.0f)
                verticalLineToRelative(200.0f)
                horizontalLineToRelative(120.0f)
                verticalLineToRelative(-360.0f)
                lineTo(480.0f, 220.0f)
                lineTo(240.0f, 400.0f)
                verticalLineToRelative(360.0f)
                close()
                moveTo(160.0f, 760.0f)
                verticalLineToRelative(-360.0f)
                quadToRelative(0.0f, -19.0f, 8.5f, -36.0f)
                reflectiveQuadToRelative(23.5f, -28.0f)
                lineToRelative(240.0f, -180.0f)
                quadToRelative(21.0f, -16.0f, 48.0f, -16.0f)
                reflectiveQuadToRelative(48.0f, 16.0f)
                lineToRelative(240.0f, 180.0f)
                quadToRelative(15.0f, 11.0f, 23.5f, 28.0f)
                reflectiveQuadToRelative(8.5f, 36.0f)
                verticalLineToRelative(360.0f)
                quadToRelative(0.0f, 33.0f, -23.5f, 56.5f)
                reflectiveQuadTo(720.0f, 840.0f)
                lineTo(560.0f, 840.0f)
                quadToRelative(-17.0f, 0.0f, -28.5f, -11.5f)
                reflectiveQuadTo(520.0f, 800.0f)
                verticalLineToRelative(-200.0f)
                horizontalLineToRelative(-80.0f)
                verticalLineToRelative(200.0f)
                quadToRelative(0.0f, 17.0f, -11.5f, 28.5f)
                reflectiveQuadTo(400.0f, 840.0f)
                lineTo(240.0f, 840.0f)
                quadToRelative(-33.0f, 0.0f, -56.5f, -23.5f)
                reflectiveQuadTo(160.0f, 760.0f)
                close()
                moveTo(480.0f, 490.0f)
                close()
            }
        }
        .build()
        return _icHome!!
    }

private var _icHome: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcHome, contentDescription = "")
    }
}
