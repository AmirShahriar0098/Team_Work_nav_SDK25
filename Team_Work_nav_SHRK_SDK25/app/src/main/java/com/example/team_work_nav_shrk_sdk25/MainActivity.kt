package com.example.team_work_nav_shrk_sdk25

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.team_work_nav_shrk_sdk25.ui.theme.Team_Work_nav_SHRK_SDK25Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Team_Work_nav_SHRK_SDK25Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyNavigation()
                }
            }
        }
    }
}

@Composable
fun MyNavigation()
{
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route)
    {
        composable(Home.route)
        {
            HomeScreen(navController)
        }
        composable(Second.route)
        {
            SecondScreen(navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Team_Work_nav_SHRK_SDK25Theme {
        MyNavigation()
    }
}