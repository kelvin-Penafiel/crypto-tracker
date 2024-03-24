package com.example.android1.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AssetRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.AccountCircle, contentDescription = null,
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .size(30.dp)
        )
        Column(

        ) {
            Text(
                text = "bitcoin",
                fontSize = 16.sp
            )
            Text(
                text = "BTC",
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "$1000",
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Text(
            text = "+30%",
            fontSize = 14.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun AssetRowPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(14.dp)
    ) {
        AssetRow()
        Divider()
        AssetRow()
        Divider()
        AssetRow()

    }
}