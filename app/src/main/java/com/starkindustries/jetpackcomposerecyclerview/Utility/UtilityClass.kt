package com.starkindustries.jetpackcomposerecyclerview.Utility
import com.starkindustries.jetpackcomposerecyclerview.Data.User
import com.starkindustries.jetpackcomposerecyclerview.R

fun dataProvider():ArrayList<User>{
    val usersList=ArrayList<User>()
    usersList.add(User(R.drawable.batman,"Aditya","2021FHCO042"))
    usersList.add(User(R.drawable.ironman_arc_reactor,"Sandesh","2021FHCO054"))
    usersList.add(User(R.drawable.batman,"Mayur","2021FHCO056"))
    usersList.add(User(R.drawable.ironman_arc_reactor,"Aaryaman","2021FHCO069"))
    usersList.add(User(R.drawable.batman,"Piyush","2021FHCO064"))
    usersList.add(User(R.drawable.ironman_arc_reactor,"Parth","2021FHCO042"))
    usersList.add(User(R.drawable.batman,"Paaji","2021FHCO069"))
    usersList.add(User(R.drawable.ironman_arc_reactor,"Kaustubh","2021FHCO010"))
    usersList.add(User(R.drawable.batman,"Raj","2021FHCO058"))
    usersList.add(User(R.drawable.ironman_arc_reactor,"Sammit","2021FHCO042"))
    return usersList
}