package com.example.hotelloginsystem
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.hotelloginsystem.ui.theme.HotelLoginSystemTheme
import com.google.firebase.FirebaseApp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        enableEdgeToEdge()
        setContent {
            HotelLoginSystemTheme {
                HotelLoginScreen()
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