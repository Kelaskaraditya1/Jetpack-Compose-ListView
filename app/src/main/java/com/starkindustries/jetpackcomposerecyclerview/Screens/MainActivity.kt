package com.starkindustries.jetpackcomposerecyclerview.Screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import com.starkindustries.jetpackcomposerecyclerview.Data.User
import com.starkindustries.jetpackcomposerecyclerview.ui.theme.JetPackComposeRecyclerViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//                var list = ArrayList<User>()
//                list = dataProvider()
//                list.forEach{
//                    ListCompose(it)
//                }
//
//            }
            LazyColumn {
                var list = ArrayList<User>()
                list = dataProvider()
                items(list){
                    ListCompose(it)
                }
            }
        }
    }
}

