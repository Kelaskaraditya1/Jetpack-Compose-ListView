package com.starkindustries.jetpackcomposerecyclerview.Screens
import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.starkindustries.jetpackcomposerecyclerview.Data.User
import com.starkindustries.jetpackcomposerecyclerview.R

@Composable
fun TextCompose(name:String,modifier: Modifier){
    Text(text = name,
        textAlign = TextAlign.Center,
        color = Color.Black,
        style = MaterialTheme.typography.bodyLarge,
        fontWeight = FontWeight.W300,
        fontStyle = FontStyle.Normal,
        fontSize = 20.sp,
        modifier = modifier
    )
}

@Composable
fun ImageCompose(imageId:Int,modifier: Modifier){
    Image(painter = painterResource(id = imageId), contentDescription = "",
        contentScale = ContentScale.Crop,
        colorFilter = ColorFilter.tint(Color.Red),
        modifier = modifier
    )
}

@Composable
fun RoundImageCompose(imageId:Int){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = imageId),
            contentDescription = "",
            modifier = Modifier
                .size(300.dp)
                .fillMaxSize()
                .background(Color.White)
                .clip(CircleShape)
                .border(2.dp, Color.Black, CircleShape)
                .background(Color.Gray)
                .align(Alignment.Center))
    }

}

@Composable
fun ButtonCompose(){
    Button(onClick = { },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black,
            containerColor = Color.Gray,
        ),
        enabled = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        ImageCompose(imageId = R.drawable.batman,Modifier)
        TextCompose(name = "Submit",Modifier)
    }
}

@Composable
fun EditTextCompose(){
    val state = remember {
        mutableStateOf("")
    }
    TextField(value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { TextCompose(name = "Enter your Name",Modifier)},
        modifier = Modifier.padding(10.dp))
}

@Composable
fun CustomTextCompose(text:String, fontSize: TextUnit, textStyle: TextStyle){
    Text(text = text,
        fontSize = fontSize,
        style = textStyle)
}

@Composable
fun CustomRow(name:String,sid:String){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
        elevation = CardDefaults.cardElevation(12.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color.LightGray)) {
        Row() {
            ImageCompose(imageId = R.drawable.batman, modifier = Modifier.padding(10.dp))
            Column(modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(10.dp, 0.dp, 0.dp, 0.dp)) {
                CustomTextCompose(text = name,30.sp,MaterialTheme.typography.bodyLarge)
                CustomTextCompose(text = sid, fontSize = 18.sp, textStyle = MaterialTheme.typography.labelSmall)
            }
        }
    }

}

@Composable
fun CustomTextComposeMark1(text:String,modifier:Modifier){
    Text(text = text,
        modifier= modifier
            .padding(10.dp)
            .background(Color.LightGray)
    )
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewFunction(){


}

