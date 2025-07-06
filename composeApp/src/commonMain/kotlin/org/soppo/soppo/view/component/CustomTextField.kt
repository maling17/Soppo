package org.soppo.soppo.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.soppo.soppo.view.component.CustomTextField.Basic
import org.soppo.soppo.view.themes.Colors
import org.soppo.soppo.view.themes.MulishFontFamily

@Preview
@Composable
fun PreviewTextField() {

    Basic(
        "",
        "example@email.com",
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        trailIcon = {
           /* Icon(
                imageVector = Re,
                contentDescription = "Tambah"
            )*/
        }
    )
}

object CustomTextField {


    @Composable
    fun Basic(
        value: String,
        placeholder: String,
        maxLine: Int = 1,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        leadingIcon: @Composable (() -> Unit)? = null,
        trailIcon: @Composable (() -> Unit)? = null
    ) {

        var valueTemp by remember { mutableStateOf(value) }

        Box(
            modifier = Modifier.fillMaxWidth()
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .padding(13.dp)

        ) {

            Row(modifier = Modifier.fillMaxWidth()) {

                if (leadingIcon != null) {
                    leadingIcon.invoke()
                    Spacer(Modifier.width(13.dp))
                }

                if (valueTemp.isNotEmpty()) {
                    BasicTextField(
                        value = valueTemp,
                        onValueChange = { text -> valueTemp = text },
                        maxLines = maxLine,
                        singleLine = maxLine == 1,
                        textStyle = TextStyle(
                            fontFamily = MulishFontFamily(),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Normal,
                            color = Colors.black
                        ),
                        keyboardOptions = keyboardOptions,
                        modifier = Modifier.weight(1f)
                    )
                } else {
                    Text(
                        text = placeholder, style = TextStyle(
                            fontFamily = MulishFontFamily(),
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Light,
                            color = Colors.lightGray
                        ),
                        modifier = Modifier.weight(1f)
                    )

                }
                if (trailIcon != null) {
                    Spacer(Modifier.width(13.dp))
                    trailIcon.invoke()

                }
            }

        }
    }
}
