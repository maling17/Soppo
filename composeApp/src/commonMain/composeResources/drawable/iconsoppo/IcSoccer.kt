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

public val IconSoppo.IcSoccer: ImageVector
    get() {
        if (_icSoccer != null) {
            return _icSoccer!!
        }
        _icSoccer = Builder(name = "IcSoccer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(680.0f, 380.0f)
                lineTo(734.0f, 362.0f)
                lineTo(750.0f, 308.0f)
                quadToRelative(-32.0f, -48.0f, -77.0f, -82.5f)
                reflectiveQuadTo(574.0f, 174.0f)
                lineToRelative(-54.0f, 38.0f)
                verticalLineToRelative(56.0f)
                lineToRelative(160.0f, 112.0f)
                close()
                moveTo(280.0f, 380.0f)
                lineTo(440.0f, 268.0f)
                verticalLineToRelative(-56.0f)
                lineToRelative(-54.0f, -38.0f)
                quadToRelative(-54.0f, 17.0f, -99.0f, 51.5f)
                reflectiveQuadTo(210.0f, 308.0f)
                lineToRelative(16.0f, 54.0f)
                lineToRelative(54.0f, 18.0f)
                close()
                moveTo(238.0f, 688.0f)
                lineTo(284.0f, 684.0f)
                lineTo(314.0f, 630.0f)
                lineTo(256.0f, 456.0f)
                lineTo(200.0f, 436.0f)
                lineTo(160.0f, 466.0f)
                quadToRelative(0.0f, 65.0f, 18.0f, 118.5f)
                reflectiveQuadTo(238.0f, 688.0f)
                close()
                moveTo(480.0f, 800.0f)
                quadToRelative(26.0f, 0.0f, 51.0f, -4.0f)
                reflectiveQuadToRelative(49.0f, -12.0f)
                lineToRelative(28.0f, -60.0f)
                lineToRelative(-26.0f, -44.0f)
                lineTo(378.0f, 680.0f)
                lineToRelative(-26.0f, 44.0f)
                lineToRelative(28.0f, 60.0f)
                quadToRelative(24.0f, 8.0f, 49.0f, 12.0f)
                reflectiveQuadToRelative(51.0f, 4.0f)
                close()
                moveTo(390.0f, 600.0f)
                horizontalLineToRelative(180.0f)
                lineToRelative(56.0f, -160.0f)
                lineToRelative(-146.0f, -102.0f)
                lineToRelative(-144.0f, 102.0f)
                lineToRelative(54.0f, 160.0f)
                close()
                moveTo(722.0f, 688.0f)
                quadToRelative(42.0f, -50.0f, 60.0f, -103.5f)
                reflectiveQuadTo(800.0f, 466.0f)
                lineToRelative(-40.0f, -28.0f)
                lineToRelative(-56.0f, 18.0f)
                lineToRelative(-58.0f, 174.0f)
                lineToRelative(30.0f, 54.0f)
                lineToRelative(46.0f, 4.0f)
                close()
            }
        }
        .build()
        return _icSoccer!!
    }

private var _icSoccer: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcSoccer, contentDescription = "")
    }
}
