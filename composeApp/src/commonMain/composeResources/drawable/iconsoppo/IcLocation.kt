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

public val IconSoppo.IcLocation: ImageVector
    get() {
        if (_icLocation != null) {
            return _icLocation!!
        }
        _icLocation = Builder(name = "IcLocation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 774.0f)
                quadToRelative(122.0f, -112.0f, 181.0f, -203.5f)
                reflectiveQuadTo(720.0f, 408.0f)
                quadToRelative(0.0f, -109.0f, -69.5f, -178.5f)
                reflectiveQuadTo(480.0f, 160.0f)
                quadToRelative(-101.0f, 0.0f, -170.5f, 69.5f)
                reflectiveQuadTo(240.0f, 408.0f)
                quadToRelative(0.0f, 71.0f, 59.0f, 162.5f)
                reflectiveQuadTo(480.0f, 774.0f)
                close()
                moveTo(480.0f, 853.0f)
                quadToRelative(-14.0f, 0.0f, -28.0f, -5.0f)
                reflectiveQuadToRelative(-25.0f, -15.0f)
                quadToRelative(-65.0f, -60.0f, -115.0f, -117.0f)
                reflectiveQuadToRelative(-83.5f, -110.5f)
                quadToRelative(-33.5f, -53.5f, -51.0f, -103.0f)
                reflectiveQuadTo(160.0f, 408.0f)
                quadToRelative(0.0f, -150.0f, 96.5f, -239.0f)
                reflectiveQuadTo(480.0f, 80.0f)
                quadToRelative(127.0f, 0.0f, 223.5f, 89.0f)
                reflectiveQuadTo(800.0f, 408.0f)
                quadToRelative(0.0f, 45.0f, -17.5f, 94.5f)
                reflectiveQuadToRelative(-51.0f, 103.0f)
                quadTo(698.0f, 659.0f, 648.0f, 716.0f)
                reflectiveQuadTo(533.0f, 833.0f)
                quadToRelative(-11.0f, 10.0f, -25.0f, 15.0f)
                reflectiveQuadToRelative(-28.0f, 5.0f)
                close()
                moveTo(480.0f, 400.0f)
                close()
                moveTo(480.0f, 480.0f)
                quadToRelative(33.0f, 0.0f, 56.5f, -23.5f)
                reflectiveQuadTo(560.0f, 400.0f)
                quadToRelative(0.0f, -33.0f, -23.5f, -56.5f)
                reflectiveQuadTo(480.0f, 320.0f)
                quadToRelative(-33.0f, 0.0f, -56.5f, 23.5f)
                reflectiveQuadTo(400.0f, 400.0f)
                quadToRelative(0.0f, 33.0f, 23.5f, 56.5f)
                reflectiveQuadTo(480.0f, 480.0f)
                close()
            }
        }
        .build()
        return _icLocation!!
    }

private var _icLocation: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcLocation, contentDescription = "")
    }
}
