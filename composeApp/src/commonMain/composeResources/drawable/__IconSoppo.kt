import androidx.compose.ui.graphics.vector.ImageVector
import iconsoppo.IcAdd
import iconsoppo.IcArrowDown
import iconsoppo.IcBack
import iconsoppo.IcBackIphone
import iconsoppo.IcBadminton
import iconsoppo.IcBasket
import iconsoppo.IcClose
import iconsoppo.IcHome
import iconsoppo.IcLocation
import iconsoppo.IcMinus
import iconsoppo.IcPasswordInvisible
import iconsoppo.IcPasswordVisible
import iconsoppo.IcProfile
import iconsoppo.IcSettings
import iconsoppo.IcSettingsFill
import iconsoppo.IcShare
import iconsoppo.IcSoccer
import iconsoppo.IcTeam
import iconsoppo.IcTrophy
import kotlin.collections.List as ____KtList

public object IconSoppo

private var __AllIcons: ____KtList<ImageVector>? = null

public val IconSoppo.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(IcAdd, IcArrowDown, IcBack, IcBackIphone, IcBadminton, IcBasket, IcClose,
        IcHome, IcLocation, IcMinus, IcPasswordInvisible, IcPasswordVisible, IcProfile, IcSettings,
        IcSettingsFill, IcShare, IcSoccer, IcTeam, IcTrophy)
    return __AllIcons!!
  }
