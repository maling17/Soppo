package org.soppo.soppo.view.ui.register

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.soppo.soppo.view.component.CustomTextField
import org.soppo.soppo.view.themes.Colors
import org.soppo.soppo.view.themes.MulishFontFamily


@Preview
@Composable
fun PreviewRegisterScreen() {
    RegisterScreen()
}

@Composable
fun RegisterScreen() {


    var emailValue by remember { mutableStateOf("") }
    var fullnameValue by remember { mutableStateOf("") }
    var phoneValue by remember { mutableStateOf("") }
    var passwordValue by remember { mutableStateOf("") }
    var passwordConfirmValue by remember { mutableStateOf("") }


    Scaffold(
        contentWindowInsets = WindowInsets.safeContent,
        modifier = Modifier.fillMaxSize().background(Colors.lightOrange)
            .padding(start = 16.dp, end = 16.dp, top = 36.dp, bottom = 24.dp),
        bottomBar = {

            Row(
                Modifier.fillMaxWidth().imePadding(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    "Already have an account ", style = TextStyle(
                        color = Colors.black,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W300,
                        lineHeight = 21.sp
                    )
                )

                Text(
                    "Sign In", style = TextStyle(
                        color = Colors.orange,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W700,
                        lineHeight = 21.sp
                    ),
                    modifier = Modifier.clickable {

                    }
                )
            }
        }

    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth().padding(it).consumeWindowInsets(it).imePadding()
        )
        {

            item {

                Text(
                    "Sign Up", style = TextStyle(
                        color = Colors.black,
                        fontSize = 24.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W700,
                        lineHeight = 24.sp
                    )
                )

                Spacer(Modifier.height(9.dp))

                Text(
                    "Welcome and Build your Own Team", style = TextStyle(
                        color = Colors.gray,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W400,
                    )
                )

                Spacer(Modifier.height(46.dp))
            }

            item {
                Text(
                    "Email", style = TextStyle(
                        color = Colors.black,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W300,
                    )
                )
                Spacer(Modifier.height(4.dp))

                CustomTextField.Email(emailValue)

                Spacer(Modifier.height(22.dp))
            }

            item {
                Text(
                    "Fullname", style = TextStyle(
                        color = Colors.black,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W300,
                    )
                )
                Spacer(Modifier.height(4.dp))

                CustomTextField.Basic(
                    value = fullnameValue,
                    placeholder = "Enter your full name",
                    maxLine = 1
                )

                Spacer(Modifier.height(22.dp))
            }

            item {

                Text(
                    "Phone", style = TextStyle(
                        color = Colors.black,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W300,
                    )
                )
                Spacer(Modifier.height(4.dp))

                CustomTextField.Phone(phoneValue)

                Spacer(Modifier.height(22.dp))
            }

            item {
                Text(
                    "Password", style = TextStyle(
                        color = Colors.black,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W300,
                    )
                )
                Spacer(Modifier.height(4.dp))

                CustomTextField.Password(passwordValue)

                Spacer(Modifier.height(22.dp))
            }

            item {
                Text(
                    "Confirm Password", style = TextStyle(
                        color = Colors.black,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W300,
                    )
                )
                Spacer(Modifier.height(4.dp))

                CustomTextField.Password(passwordConfirmValue)

                Spacer(Modifier.height(32.dp))
            }

            item {
                Button(
                    onClick = {

                    },
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 12.dp),
                    colors = ButtonDefaults.buttonColors(Colors.orange),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Register", style = TextStyle(
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = MulishFontFamily(),
                            fontWeight = FontWeight.W700,
                            lineHeight = 24.sp
                        )
                    )
                }
            }

        }

    }
}

