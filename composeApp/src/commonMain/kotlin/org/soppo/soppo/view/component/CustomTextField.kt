package org.soppo.soppo.view.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.soppo.soppo.view.component.CustomTextField.Basic
import org.soppo.soppo.view.themes.Colors
import org.soppo.soppo.view.themes.MulishFontFamily
import soppo.composeapp.generated.resources.Res
import soppo.composeapp.generated.resources.ic_add
import soppo.composeapp.generated.resources.ic_password_invisible
import soppo.composeapp.generated.resources.ic_password_visible

@Preview
@Composable
fun PreviewTextField() {

    Basic(
        modifier = Modifier.fillMaxWidth(),
        "",
        "example@email.com",
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        trailIcon = {
            Icon(
                painter = painterResource(Res.drawable.ic_add),
                contentDescription = "Tambah",
                tint = Color.Black
            )
        }
    )
}

object CustomTextField {


    @Composable
    fun Basic(
        modifier: Modifier = Modifier.fillMaxWidth(),
        value: String,
        placeholder: String,
        fontSize: TextUnit = 13.sp,
        maxLine: Int = 1,
        maxLength: Int= Int.MAX_VALUE,
        textAlign: TextAlign = TextAlign.Start,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        visualTransformation: VisualTransformation = VisualTransformation.None,
        leadingIcon: @Composable (() -> Unit)? = null,
        trailIcon: @Composable (() -> Unit)? = null,
        onTextListener:(()-> Unit)? = null
    ) {

        var valueTemp by remember { mutableStateOf(value) }

        Box(
            modifier = modifier
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .padding(13.dp)

        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                if (leadingIcon != null) {
                    leadingIcon.invoke()
                    Spacer(Modifier.width(13.dp))
                }


                BasicTextField(
                    value = valueTemp,
                    onValueChange = { text -> if (text.length <= maxLength) {
                        valueTemp = text
                        onTextListener?.invoke()
                    } },
                    maxLines = maxLine,
                    singleLine = maxLine == 1,
                    textStyle = TextStyle(
                        fontFamily = MulishFontFamily(),
                        fontSize = fontSize,
                        fontWeight = FontWeight.Normal,
                        color = Colors.black,
                        textAlign = textAlign
                    ),
                    visualTransformation = visualTransformation,
                    keyboardOptions = keyboardOptions,
                    modifier = Modifier.weight(1f)
                ) {
                    if (valueTemp.isNotEmpty()) {
                        it.invoke()
                    } else {
                        Text(
                            text = placeholder, style = TextStyle(
                                fontFamily = MulishFontFamily(),
                                fontSize = fontSize,
                                fontWeight = FontWeight.Light,
                                color = Colors.lightGray
                            ),
                            modifier = Modifier.weight(1f)
                        )

                    }
                }
                if (trailIcon != null) {
                    Spacer(Modifier.width(13.dp))
                    trailIcon.invoke()

                }
            }

        }
    }

    @Composable
    fun Email(value: String) {
        Basic(
            value = value,
            placeholder = "example@email.com",
            maxLine = 1,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )
    }

    @Composable
    fun Phone(value: String) {
        Basic(
            value = value,
            placeholder = "Enter your phone number",
            maxLine = 1,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            )
        )
    }

    @Composable
    fun Password(value: String) {

        var passwordToggleVisible by remember { mutableStateOf(false) }

        Basic(
            value = value,
            placeholder = "*********",
            maxLine = 1,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = if (passwordToggleVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailIcon = {
                Icon(
                    painter = painterResource(if (!passwordToggleVisible) Res.drawable.ic_password_invisible else Res.drawable.ic_password_visible),
                    contentDescription = null,
                    tint = Color(0xFFA8A8A8),
                    modifier = Modifier.clickable {
                        passwordToggleVisible = !passwordToggleVisible
                    }
                )
            }
        )
    }
}
