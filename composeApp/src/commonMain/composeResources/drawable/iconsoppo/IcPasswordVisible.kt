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

public val IconSoppo.IcPasswordVisible: ImageVector
    get() {
        if (_icPasswordVisible != null) {
            return _icPasswordVisible!!
        }
        _icPasswordVisible = Builder(name = "IcPasswordVisible", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 640.0f)
                quadToRelative(75.0f, 0.0f, 127.5f, -52.5f)
                reflectiveQuadTo(660.0f, 460.0f)
                quadToRelative(0.0f, -75.0f, -52.5f, -127.5f)
                reflectiveQuadTo(480.0f, 280.0f)
                quadToRelative(-75.0f, 0.0f, -127.5f, 52.5f)
                reflectiveQuadTo(300.0f, 460.0f)
                quadToRelative(0.0f, 75.0f, 52.5f, 127.5f)
                reflectiveQuadTo(480.0f, 640.0f)
                close()
                moveTo(480.0f, 568.0f)
                quadToRelative(-45.0f, 0.0f, -76.5f, -31.5f)
                reflectiveQuadTo(372.0f, 460.0f)
                quadToRelative(0.0f, -45.0f, 31.5f, -76.5f)
                reflectiveQuadTo(480.0f, 352.0f)
                quadToRelative(45.0f, 0.0f, 76.5f, 31.5f)
                reflectiveQuadTo(588.0f, 460.0f)
                quadToRelative(0.0f, 45.0f, -31.5f, 76.5f)
                reflectiveQuadTo(480.0f, 568.0f)
                close()
                moveTo(480.0f, 760.0f)
                quadToRelative(-134.0f, 0.0f, -244.5f, -72.0f)
                reflectiveQuadTo(61.0f, 498.0f)
                quadToRelative(-5.0f, -9.0f, -7.5f, -18.5f)
                reflectiveQuadTo(51.0f, 460.0f)
                quadToRelative(0.0f, -10.0f, 2.5f, -19.5f)
                reflectiveQuadTo(61.0f, 422.0f)
                quadToRelative(64.0f, -118.0f, 174.5f, -190.0f)
                reflectiveQuadTo(480.0f, 160.0f)
                quadToRelative(134.0f, 0.0f, 244.5f, 72.0f)
                reflectiveQuadTo(899.0f, 422.0f)
                quadToRelative(5.0f, 9.0f, 7.5f, 18.5f)
                reflectiveQuadTo(909.0f, 460.0f)
                quadToRelative(0.0f, 10.0f, -2.5f, 19.5f)
                reflectiveQuadTo(899.0f, 498.0f)
                quadToRelative(-64.0f, 118.0f, -174.5f, 190.0f)
                reflectiveQuadTo(480.0f, 760.0f)
                close()
                moveTo(480.0f, 460.0f)
                close()
                moveTo(480.0f, 680.0f)
                quadToRelative(113.0f, 0.0f, 207.5f, -59.5f)
                reflectiveQuadTo(832.0f, 460.0f)
                quadToRelative(-50.0f, -101.0f, -144.5f, -160.5f)
                reflectiveQuadTo(480.0f, 240.0f)
                quadToRelative(-113.0f, 0.0f, -207.5f, 59.5f)
                reflectiveQuadTo(128.0f, 460.0f)
                quadToRelative(50.0f, 101.0f, 144.5f, 160.5f)
                reflectiveQuadTo(480.0f, 680.0f)
                close()
            }
        }
        .build()
        return _icPasswordVisible!!
    }

private var _icPasswordVisible: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcPasswordVisible, contentDescription = "")
    }
}
