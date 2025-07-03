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

public val IconSoppo.IcShare: ImageVector
    get() {
        if (_icShare != null) {
            return _icShare!!
        }
        _icShare = Builder(name = "IcShare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(680.0f, 880.0f)
                quadToRelative(-50.0f, 0.0f, -85.0f, -35.0f)
                reflectiveQuadToRelative(-35.0f, -85.0f)
                quadToRelative(0.0f, -6.0f, 3.0f, -28.0f)
                lineTo(282.0f, 568.0f)
                quadToRelative(-16.0f, 15.0f, -37.0f, 23.5f)
                reflectiveQuadToRelative(-45.0f, 8.5f)
                quadToRelative(-50.0f, 0.0f, -85.0f, -35.0f)
                reflectiveQuadToRelative(-35.0f, -85.0f)
                quadToRelative(0.0f, -50.0f, 35.0f, -85.0f)
                reflectiveQuadToRelative(85.0f, -35.0f)
                quadToRelative(24.0f, 0.0f, 45.0f, 8.5f)
                reflectiveQuadToRelative(37.0f, 23.5f)
                lineToRelative(281.0f, -164.0f)
                quadToRelative(-2.0f, -7.0f, -2.5f, -13.5f)
                reflectiveQuadTo(560.0f, 200.0f)
                quadToRelative(0.0f, -50.0f, 35.0f, -85.0f)
                reflectiveQuadToRelative(85.0f, -35.0f)
                quadToRelative(50.0f, 0.0f, 85.0f, 35.0f)
                reflectiveQuadToRelative(35.0f, 85.0f)
                quadToRelative(0.0f, 50.0f, -35.0f, 85.0f)
                reflectiveQuadToRelative(-85.0f, 35.0f)
                quadToRelative(-24.0f, 0.0f, -45.0f, -8.5f)
                reflectiveQuadTo(598.0f, 288.0f)
                lineTo(317.0f, 452.0f)
                quadToRelative(2.0f, 7.0f, 2.5f, 13.5f)
                reflectiveQuadToRelative(0.5f, 14.5f)
                quadToRelative(0.0f, 8.0f, -0.5f, 14.5f)
                reflectiveQuadTo(317.0f, 508.0f)
                lineToRelative(281.0f, 164.0f)
                quadToRelative(16.0f, -15.0f, 37.0f, -23.5f)
                reflectiveQuadToRelative(45.0f, -8.5f)
                quadToRelative(50.0f, 0.0f, 85.0f, 35.0f)
                reflectiveQuadToRelative(35.0f, 85.0f)
                quadToRelative(0.0f, 50.0f, -35.0f, 85.0f)
                reflectiveQuadToRelative(-85.0f, 35.0f)
                close()
                moveTo(680.0f, 800.0f)
                quadToRelative(17.0f, 0.0f, 28.5f, -11.5f)
                reflectiveQuadTo(720.0f, 760.0f)
                quadToRelative(0.0f, -17.0f, -11.5f, -28.5f)
                reflectiveQuadTo(680.0f, 720.0f)
                quadToRelative(-17.0f, 0.0f, -28.5f, 11.5f)
                reflectiveQuadTo(640.0f, 760.0f)
                quadToRelative(0.0f, 17.0f, 11.5f, 28.5f)
                reflectiveQuadTo(680.0f, 800.0f)
                close()
                moveTo(200.0f, 520.0f)
                quadToRelative(17.0f, 0.0f, 28.5f, -11.5f)
                reflectiveQuadTo(240.0f, 480.0f)
                quadToRelative(0.0f, -17.0f, -11.5f, -28.5f)
                reflectiveQuadTo(200.0f, 440.0f)
                quadToRelative(-17.0f, 0.0f, -28.5f, 11.5f)
                reflectiveQuadTo(160.0f, 480.0f)
                quadToRelative(0.0f, 17.0f, 11.5f, 28.5f)
                reflectiveQuadTo(200.0f, 520.0f)
                close()
                moveTo(680.0f, 240.0f)
                quadToRelative(17.0f, 0.0f, 28.5f, -11.5f)
                reflectiveQuadTo(720.0f, 200.0f)
                quadToRelative(0.0f, -17.0f, -11.5f, -28.5f)
                reflectiveQuadTo(680.0f, 160.0f)
                quadToRelative(-17.0f, 0.0f, -28.5f, 11.5f)
                reflectiveQuadTo(640.0f, 200.0f)
                quadToRelative(0.0f, 17.0f, 11.5f, 28.5f)
                reflectiveQuadTo(680.0f, 240.0f)
                close()
                moveTo(680.0f, 760.0f)
                close()
                moveTo(200.0f, 480.0f)
                close()
                moveTo(680.0f, 200.0f)
                close()
            }
        }
        .build()
        return _icShare!!
    }

private var _icShare: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcShare, contentDescription = "")
    }
}
