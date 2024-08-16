package com.example.hotelloginsystem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.hotelloginsystem.nav.NavGraph

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hotelloginsystem.ui.theme.HotelLoginSystemTheme
import com.example.hotelloginsystem.utils.SharedViewModel
import com.google.firebase.FirebaseApp


class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContent {
            HotelLoginSystemTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
                ) {
                    navController = rememberNavController()

                    //Calling the NavGraph that contains the composables with screens
                    NavGraph(navController = navController, sharedViewModel = sharedViewModel)


                }
            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun HotelLoginScreenPreview() {
    HotelLoginSystemTheme {
        HotelLoginScreen()
    }
}

