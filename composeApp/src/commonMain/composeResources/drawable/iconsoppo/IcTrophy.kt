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

public val IconSoppo.IcTrophy: ImageVector
    get() {
        if (_icTrophy != null) {
            return _icTrophy!!
        }
        _icTrophy = Builder(name = "IcTrophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFFe3e3e3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.0f, 760.0f)
                verticalLineToRelative(-124.0f)
                quadToRelative(-49.0f, -11.0f, -87.5f, -41.5f)
                reflectiveQuadTo(296.0f, 518.0f)
                quadToRelative(-75.0f, -9.0f, -125.5f, -65.5f)
                reflectiveQuadTo(120.0f, 320.0f)
                verticalLineToRelative(-40.0f)
                quadToRelative(0.0f, -33.0f, 23.5f, -56.5f)
                reflectiveQuadTo(200.0f, 200.0f)
                horizontalLineToRelative(80.0f)
                quadToRelative(0.0f, -33.0f, 23.5f, -56.5f)
                reflectiveQuadTo(360.0f, 120.0f)
                horizontalLineToRelative(240.0f)
                quadToRelative(33.0f, 0.0f, 56.5f, 23.5f)
                reflectiveQuadTo(680.0f, 200.0f)
                horizontalLineToRelative(80.0f)
                quadToRelative(33.0f, 0.0f, 56.5f, 23.5f)
                reflectiveQuadTo(840.0f, 280.0f)
                verticalLineToRelative(40.0f)
                quadToRelative(0.0f, 76.0f, -50.5f, 132.5f)
                reflectiveQuadTo(664.0f, 518.0f)
                quadToRelative(-18.0f, 46.0f, -56.5f, 76.5f)
                reflectiveQuadTo(520.0f, 636.0f)
                verticalLineToRelative(124.0f)
                horizontalLineToRelative(120.0f)
                quadToRelative(17.0f, 0.0f, 28.5f, 11.5f)
                reflectiveQuadTo(680.0f, 800.0f)
                quadToRelative(0.0f, 17.0f, -11.5f, 28.5f)
                reflectiveQuadTo(640.0f, 840.0f)
                lineTo(320.0f, 840.0f)
                quadToRelative(-17.0f, 0.0f, -28.5f, -11.5f)
                reflectiveQuadTo(280.0f, 800.0f)
                quadToRelative(0.0f, -17.0f, 11.5f, -28.5f)
                reflectiveQuadTo(320.0f, 760.0f)
                horizontalLineToRelative(120.0f)
                close()
                moveTo(280.0f, 432.0f)
                verticalLineToRelative(-152.0f)
                horizontalLineToRelative(-80.0f)
                verticalLineToRelative(40.0f)
                quadToRelative(0.0f, 38.0f, 22.0f, 68.5f)
                reflectiveQuadToRelative(58.0f, 43.5f)
                close()
                moveTo(480.0f, 560.0f)
                quadToRelative(50.0f, 0.0f, 85.0f, -35.0f)
                reflectiveQuadToRelative(35.0f, -85.0f)
                verticalLineToRelative(-240.0f)
                lineTo(360.0f, 200.0f)
                verticalLineToRelative(240.0f)
                quadToRelative(0.0f, 50.0f, 35.0f, 85.0f)
                reflectiveQuadToRelative(85.0f, 35.0f)
                close()
                moveTo(680.0f, 432.0f)
                quadToRelative(36.0f, -13.0f, 58.0f, -43.5f)
                reflectiveQuadToRelative(22.0f, -68.5f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(-80.0f)
                verticalLineToRelative(152.0f)
                close()
                moveTo(480.0f, 380.0f)
                close()
            }
        }
        .build()
        return _icTrophy!!
    }

private var _icTrophy: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = IconSoppo.IcTrophy, contentDescription = "")
    }
}
