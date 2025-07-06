package org.soppo.soppo.view.ui.verification_otp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.soppo.soppo.view.component.CustomTextField
import org.soppo.soppo.view.themes.Colors
import org.soppo.soppo.view.themes.MulishFontFamily
import soppo.composeapp.generated.resources.Res
import soppo.composeapp.generated.resources.ic_back_iphone


@Preview
@Composable
private fun PreviewVerificationOTPScreen() {
    VerificationOTPScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerificationOTPScreen() {

    var otp1 by remember { mutableStateOf("") }
    var otp2 by remember { mutableStateOf("") }
    var otp3 by remember { mutableStateOf("") }
    var otp4 by remember { mutableStateOf("") }

    Scaffold(
        contentWindowInsets = WindowInsets.safeContent,
        modifier = Modifier.fillMaxSize().background(Colors.lightOrange),
        topBar = {
            TopAppBar(modifier = Modifier.padding(horizontal = 16.dp), title = {
                Text(
                    "OTP Verification", style = TextStyle(
                        color = Colors.black,
                        fontSize = 16.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W300,
                    )
                )
            }, navigationIcon = {
                Icon(
                    painter = painterResource(Res.drawable.ic_back_iphone),
                    contentDescription = "",
                    tint = Color(0xFF525252)
                )
            })
        }) { innerPaddings ->


        Column(modifier = Modifier.fillMaxWidth().padding(innerPaddings).padding(16.dp)) {
            Text(
                "Verificarion code has sent to your email\n" +
                        "Please check your email", style = TextStyle(
                    color = Colors.gray,
                    fontSize = 14.sp,
                    fontFamily = MulishFontFamily(),
                    fontWeight = FontWeight.W400,
                )
            )

            Spacer(Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                CustomTextField.Basic(
                    modifier = Modifier.size(80.dp),
                    fontSize = 32.sp,
                    maxLength = 1,
                    textAlign = TextAlign.Center,
                    value = otp1, placeholder = "", maxLine = 1, keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                ){

                }


                CustomTextField.Basic(
                    modifier = Modifier.size(80.dp),
                    fontSize = 32.sp,
                    maxLength = 1,
                    textAlign = TextAlign.Center,
                    value = otp2, placeholder = "", maxLine = 1, keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                ){
                    
                }


                CustomTextField.Basic(
                    modifier = Modifier.size(80.dp),
                    fontSize = 32.sp,
                    maxLength = 1,
                    textAlign = TextAlign.Center,
                    value = otp3, placeholder = "", maxLine = 1, keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                ){

                }

                CustomTextField.Basic(
                    modifier = Modifier.size(80.dp),
                    fontSize = 32.sp,
                    maxLength = 1,
                    textAlign = TextAlign.Center,
                    value = otp4, placeholder = "", maxLine = 1, keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    )
                ){

                }

            }

            Spacer(Modifier.height(42.dp))
            Button(
                onClick = {

                },
                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 12.dp),
                colors = ButtonDefaults.buttonColors(Colors.orange),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    "Send OTP", style = TextStyle(
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W700,
                        lineHeight = 24.sp
                    )
                )
            }

            Spacer(Modifier.height(22.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Did not recieve Verification Code?", style = TextStyle(
                        color = Colors.gray,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W300,
                    )
                )

                Text(
                    "Resend Code (60s)", style = TextStyle(
                        color = Colors.orange,
                        fontSize = 14.sp,
                        fontFamily = MulishFontFamily(),
                        fontWeight = FontWeight.W400,
                    )
                )
            }


        }


    }

}