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

public val IconSoppo.IcArrowDown: ImageVector
    get() {
        if (_icArrowDown != null) {
            return _icArrowDown!!
        }
        _icArrowDown = Builder(name = "IcArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 599.0f)
                quadToRelative(-8.0f, 0.0f, -15.0f, -2.5f)
                reflectiveQuadToRelative(-13.0f, -8.5f)
                lineTo(268.0f, 404.0f)
                quadToRelative(-11.0f, -11.0f, -11.0f, -28.0f)
                reflectiveQuadToRelative(11.0f, -28.0f)
                quadToRelative(11.0f, -11.0f, 28.0f, -11.0f)
                reflectiveQuadToRelative(28.0f, 11.0f)
                lineToRelative(156.0f, 156.0f)
                lineToRelative(156.0f, -156.0f)
                quadToRelative(11.0f, -11.0f, 28.0f, -11.0f)
                reflectiveQuadToRelative(28.0f, 11.0f)
                quadToRelative(11.0f, 11.0f, 11.0f, 28.0f)
                reflectiveQuadToRelative(-11.0f, 28.0f)
                lineTo(508.0f, 588.0f)
                quadToRelative(-6.0f, 6.0f, -13.0f, 8.5f)
                reflectiveQuadToRelative(-15.0f, 2.5f)
                close()
            }
        }
        .build()
        return _icArrowDown!!
    }

private var _icArrowDown: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcArrowDown, contentDescription = "")
    }
}
