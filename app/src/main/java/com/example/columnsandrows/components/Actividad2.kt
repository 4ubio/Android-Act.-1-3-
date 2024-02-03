package com.example.columnsandrows.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Act2(){
    Row(
        modifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .background(Color(0xFFBBADA0)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(3.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "16",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFF59563))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = " 128",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFEDCF72))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 1.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "32",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFF67C5F))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "16",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFF59563))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(3.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFCDC1B4))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "16",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFF59563))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "64",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFF65E3B))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "8",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFF2B179))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 17.dp)
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(3.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFCDC1B4))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFCDC1B4))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "2",
                color = Color(0xFF000000),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFEEE4DA))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 17.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "8",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFF2B179))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 17.dp)
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(3.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "4",
                color = Color(0xFF070707),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFEDE0C8))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 17.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFCDC1B4))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "",
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFCDC1B4))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 10.dp)
            )
            Spacer(modifier = Modifier.height(height = 5.dp))
            Text(
                text = "2",
                color = Color(0xFF000000),
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color(0xFFEEE4DA))
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 17.dp)
            )
        }
    }

}