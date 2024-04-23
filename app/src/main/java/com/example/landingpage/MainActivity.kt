package com.example.landingpage

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.landingpage.Data.LandingPageData
import com.example.landingpage.ui.theme.LandingPageTheme
import com.example.landingpage.ui.theme.Maroon
import com.example.landingpage.ui.theme.PurpleGrey40
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LandingPageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    LandingPage()
                }
            }
        }
    }
}




val features1 = listOf(
    LandingPageData(
        icon = Icons.Default.Add,
        number = "25",
        description = "Total Refugees",
        color = PurpleGrey40

        ),

    LandingPageData(
        icon = Icons.Default.Phone,
        number = "36",
        description = "Verified Refugees",
        color = PurpleGrey40
    ),

)

val features2 = listOf(
    LandingPageData(
        icon = Icons.Default.AccountCircle,
        number = "25",
        description = "Unverified Refugees",
        color = Maroon

    ),

    LandingPageData(
        icon = Icons.Default.Email,
        number = "70",
        description = "Active Users",
        color = Maroon
    ),

    )


@Composable

fun LandingPage() {

val Norm = Maroon
    Column() {
        Text(
            text = "Welcome, Norman",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(16.dp)
        )


        LazyRow {
            items(features1.size) { index ->
                LandingPageBox1(index = index)
        }}

        Spacer(modifier = Modifier.height(60.dp))

        LazyRow {
            items(features2.size) { index ->
                LandingPageBox2(index = index)
            }}

        Spacer(modifier = Modifier.height(80.dp))


        TextButton(
            modifier= Modifier
                .size(width = 300.dp, height = 50.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(color = Norm)
                .align(Alignment.CenterHorizontally)
                ,

            onClick = { /*TODO*/ }) {
            Text(text = "Refugee Onboarding",
                    color = Color.White)
        }

        Spacer(modifier = Modifier.height(30.dp))

        TextButton(
            modifier= Modifier
            .size(width = 300.dp, height = 50.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(color = Color.White)
            .align(Alignment.CenterHorizontally)
            ,


            onClick = { }
        ) {
            Text(
                text = "Verify Refugee",
                color = Norm)

        }
    }
}


@Composable
fun LandingPageBox1(index: Int) {
    val feature = features1[index]
    var lastItemPaddingEnd = 0.dp
    if (index == features1.size - 1) {
        lastItemPaddingEnd = 16.dp}

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = lastItemPaddingEnd)

    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(feature.color)
                .width(180.dp)
                .height(180.dp)
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(imageVector = feature.icon, contentDescription = "")
            Text(text = feature.number, color = Color.White, fontSize = 40.sp,  fontWeight = FontWeight.Bold )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = feature.description, style = MaterialTheme.typography.labelMedium, color = Color.White)
//
        }
    }

}


@Composable
fun LandingPageBox2(index: Int) {
    val feature = features2[index]
    var lastItemPaddingEnd = 0.dp
    if (index == features2.size - 1) {
        lastItemPaddingEnd = 16.dp}

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = lastItemPaddingEnd)

    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(feature.color)
                .width(180.dp)
                .height(180.dp)
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(imageVector = feature.icon, contentDescription = "")
            Text(text = feature.number, color = Color.White, fontSize = 40.sp,  fontWeight = FontWeight.Bold )

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = feature.description, style = MaterialTheme.typography.labelMedium, color = Color.White)
//
        }
    }

}







