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

public val IconSoppo.IcClose: ImageVector
    get() {
        if (_icClose != null) {
            return _icClose!!
        }
        _icClose = Builder(name = "IcClose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 536.0f)
                lineTo(284.0f, 732.0f)
                quadToRelative(-11.0f, 11.0f, -28.0f, 11.0f)
                reflectiveQuadToRelative(-28.0f, -11.0f)
                quadToRelative(-11.0f, -11.0f, -11.0f, -28.0f)
                reflectiveQuadToRelative(11.0f, -28.0f)
                lineToRelative(196.0f, -196.0f)
                lineToRelative(-196.0f, -196.0f)
                quadToRelative(-11.0f, -11.0f, -11.0f, -28.0f)
                reflectiveQuadToRelative(11.0f, -28.0f)
                quadToRelative(11.0f, -11.0f, 28.0f, -11.0f)
                reflectiveQuadToRelative(28.0f, 11.0f)
                lineToRelative(196.0f, 196.0f)
                lineToRelative(196.0f, -196.0f)
                quadToRelative(11.0f, -11.0f, 28.0f, -11.0f)
                reflectiveQuadToRelative(28.0f, 11.0f)
                quadToRelative(11.0f, 11.0f, 11.0f, 28.0f)
                reflectiveQuadToRelative(-11.0f, 28.0f)
                lineTo(536.0f, 480.0f)
                lineToRelative(196.0f, 196.0f)
                quadToRelative(11.0f, 11.0f, 11.0f, 28.0f)
                reflectiveQuadToRelative(-11.0f, 28.0f)
                quadToRelative(-11.0f, 11.0f, -28.0f, 11.0f)
                reflectiveQuadToRelative(-28.0f, -11.0f)
                lineTo(480.0f, 536.0f)
                close()
            }
        }
        .build()
        return _icClose!!
    }

private var _icClose: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcClose, contentDescription = "")
    }
}
