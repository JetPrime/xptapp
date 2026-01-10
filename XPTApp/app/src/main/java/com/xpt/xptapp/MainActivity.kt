package com.xpt.xptapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.xpt.xptapp.ui.navigation.Screen
import com.xpt.xptapp.ui.screen.BarcodeScanningScreen
import com.xpt.xptapp.ui.screen.PackageListScreen
import com.xpt.xptapp.ui.screen.TaskScreen
import com.xpt.xptapp.ui.theme.XPTAppTheme

class MainActivity : ComponentActivity() {

    //mdp supabase CU#h_ev-g*VYM73
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = Screen.PackageList.route
            ) {
                composable(Screen.PackageList.route) {
                    PackageListScreen(navController)
                }
                composable(Screen.BarcodeScanning.route) {
                    BarcodeScanningScreen(navController)
                }
            }

            /*XPTAppTheme {
                PackageListScreen()
            }*/
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    XPTAppTheme {
        Greeting("Android")
    }
}