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

public val IconSoppo.IcTeam: ImageVector
    get() {
        if (_icTeam != null) {
            return _icTeam!!
        }
        _icTeam = Builder(name = "IcTeam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(240.0f, 438.0f)
                lineToRelative(-40.0f, 22.0f)
                quadToRelative(-14.0f, 8.0f, -30.0f, 4.0f)
                reflectiveQuadToRelative(-24.0f, -18.0f)
                lineTo(66.0f, 306.0f)
                quadToRelative(-8.0f, -14.0f, -4.0f, -30.0f)
                reflectiveQuadToRelative(18.0f, -24.0f)
                lineToRelative(230.0f, -132.0f)
                horizontalLineToRelative(70.0f)
                quadToRelative(9.0f, 0.0f, 14.5f, 5.5f)
                reflectiveQuadTo(400.0f, 140.0f)
                verticalLineToRelative(20.0f)
                quadToRelative(0.0f, 33.0f, 23.5f, 56.5f)
                reflectiveQuadTo(480.0f, 240.0f)
                quadToRelative(33.0f, 0.0f, 56.5f, -23.5f)
                reflectiveQuadTo(560.0f, 160.0f)
                verticalLineToRelative(-20.0f)
                quadToRelative(0.0f, -9.0f, 5.5f, -14.5f)
                reflectiveQuadTo(580.0f, 120.0f)
                horizontalLineToRelative(70.0f)
                lineToRelative(230.0f, 132.0f)
                quadToRelative(14.0f, 8.0f, 18.0f, 24.0f)
                reflectiveQuadToRelative(-4.0f, 30.0f)
                lineToRelative(-80.0f, 140.0f)
                quadToRelative(-8.0f, 14.0f, -23.5f, 17.5f)
                reflectiveQuadTo(760.0f, 459.0f)
                lineToRelative(-40.0f, -20.0f)
                verticalLineToRelative(361.0f)
                quadToRelative(0.0f, 17.0f, -11.5f, 28.5f)
                reflectiveQuadTo(680.0f, 840.0f)
                lineTo(280.0f, 840.0f)
                quadToRelative(-17.0f, 0.0f, -28.5f, -11.5f)
                reflectiveQuadTo(240.0f, 800.0f)
                verticalLineToRelative(-362.0f)
                close()
                moveTo(320.0f, 304.0f)
                verticalLineToRelative(456.0f)
                horizontalLineToRelative(320.0f)
                verticalLineToRelative(-456.0f)
                lineToRelative(124.0f, 68.0f)
                lineToRelative(42.0f, -70.0f)
                lineToRelative(-172.0f, -100.0f)
                quadToRelative(-15.0f, 51.0f, -56.5f, 84.5f)
                reflectiveQuadTo(480.0f, 320.0f)
                quadToRelative(-56.0f, 0.0f, -97.5f, -33.5f)
                reflectiveQuadTo(326.0f, 202.0f)
                lineTo(154.0f, 302.0f)
                lineToRelative(42.0f, 70.0f)
                lineToRelative(124.0f, -68.0f)
                close()
                moveTo(480.0f, 481.0f)
                close()
            }
        }
        .build()
        return _icTeam!!
    }

private var _icTeam: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcTeam, contentDescription = "")
    }
}
