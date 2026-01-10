package com.xpt.xptapp.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.xpt.xptapp.ui.navigation.Screen
import com.xpt.xptapp.ui.viewmodel.BarcodeScanningViewModel

@Composable
fun BarcodeScanningScreen(navController: NavController,
    viewModel: BarcodeScanningViewModel = viewModel()
) {
    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = {
                    navController.navigate(Screen.PackageList.route)
                }
            ) {
                Text("Retour")
            }
        }
    }
}