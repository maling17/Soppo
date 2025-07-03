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

public val IconSoppo.IcBackIphone: ImageVector
    get() {
        if (_icBackIphone != null) {
            return _icBackIphone!!
        }
        _icBackIphone = Builder(name = "IcBackIphone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(142.0f, 480.0f)
                lineToRelative(294.0f, 294.0f)
                quadToRelative(15.0f, 15.0f, 14.5f, 35.0f)
                reflectiveQuadTo(435.0f, 844.0f)
                quadToRelative(-15.0f, 15.0f, -35.0f, 15.0f)
                reflectiveQuadToRelative(-35.0f, -15.0f)
                lineTo(57.0f, 537.0f)
                quadToRelative(-12.0f, -12.0f, -18.0f, -27.0f)
                reflectiveQuadToRelative(-6.0f, -30.0f)
                quadToRelative(0.0f, -15.0f, 6.0f, -30.0f)
                reflectiveQuadToRelative(18.0f, -27.0f)
                lineToRelative(308.0f, -308.0f)
                quadToRelative(15.0f, -15.0f, 35.5f, -14.5f)
                reflectiveQuadTo(436.0f, 116.0f)
                quadToRelative(15.0f, 15.0f, 15.0f, 35.0f)
                reflectiveQuadToRelative(-15.0f, 35.0f)
                lineTo(142.0f, 480.0f)
                close()
            }
        }
        .build()
        return _icBackIphone!!
    }

private var _icBackIphone: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcBackIphone, contentDescription = "")
    }
}
