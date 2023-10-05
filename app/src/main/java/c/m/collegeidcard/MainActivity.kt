package c.m.collegeidcard

import android.hardware.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier

                    .border(8.dp,
                        color = Color.Blue,
                        shape = RoundedCornerShape(18.dp))
                    .fillMaxSize()
                    .padding(5.dp)
                    .background(
                        color = Color.LightGray)

            ) {

                Text(
                    text = "Government Polytechnic, Bagalkot",
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.Normal,
                    modifier = Modifier.padding(16.dp),
                    color = Color.Red

                )

                Spacer(modifier = Modifier.height(10.dp))
                Image(painter = painterResource(id = R.drawable.photo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(250.dp)
                        .width(200.dp)
                        .padding(16.dp)

                )

                Spacer(modifier = Modifier.height(20.dp))

                Column (
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text(
                        text = "Name : Rudresh koti",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = "Father Name : Irayya",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = "D O B : 31/07/1994",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = "Branch : Mechanical",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = "Semester : 5th",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "Blood Group : AB+",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = "Address : Vidyagiri,Bagalkot,Karnataka 587102",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}



