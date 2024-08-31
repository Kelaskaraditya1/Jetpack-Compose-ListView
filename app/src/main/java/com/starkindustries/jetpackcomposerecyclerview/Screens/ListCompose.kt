package com.starkindustries.jetpackcomposerecyclerview.Screens
import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.starkindustries.jetpackcomposerecyclerview.Data.User
import com.starkindustries.jetpackcomposerecyclerview.R

@Composable
fun ImageComposeMark1(imageId:Int, modifier: Modifier){
    Image(painter = painterResource(id = imageId), contentDescription = ""
    , modifier = modifier.padding(10.dp)
            .height(80.dp).
    width(100.dp))
}

@Composable
fun TextComposeMark1(text:String,fontSize:TextUnit,fontStyle: FontStyle,fontWeight: FontWeight,modifier: Modifier){
    Text(text = text,
        fontSize=fontSize,
        fontStyle=fontStyle,
        fontWeight = fontWeight,
        modifier = modifier)
}

@Composable
fun ListCompose(user:User){
Card(modifier = Modifier
    .fillMaxWidth()
    .padding(10.dp),
    shape = RoundedCornerShape(10.dp),
    colors = CardDefaults.cardColors(Color.LightGray),
    elevation = CardDefaults.cardElevation(12.dp)
) {
    Row() {
        ImageComposeMark1(imageId = user.imageId, Modifier)
        Column(verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp, 10.dp, 0.dp, 0.dp)
        ) {
            TextComposeMark1(text = user.name, 30.sp, fontStyle = FontStyle.Normal, fontWeight = FontWeight.W500,Modifier)
            TextComposeMark1(text = user.sid, fontSize = 18.sp, fontStyle = FontStyle.Normal, fontWeight = FontWeight.W300,Modifier.padding(0.dp,5.dp,0.dp,0.dp))
        }
    }
}
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewFunctionMark2(){
    ListCompose(user = User(R.drawable.batman,"Aditya","2021FHCO042"))
}