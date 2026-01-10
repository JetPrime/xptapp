package com.xpt.xptapp.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.xpt.xptapp.ui.navigation.Screen
import com.xpt.xptapp.ui.viewmodel.PackageListViewModel
import androidx.compose.ui.tooling.preview.Devices

@Composable
fun PackageListScreen(navController: NavController,
    viewModel: PackageListViewModel = viewModel()
) {
    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            FloatingActionButton(
                onClick = {
                    navController.navigate(Screen.BarcodeScanning.route)
                }
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_4 // Use a predefined device
)
@Composable
fun PackageListScreenPreview() {
    PackageListScreen(rememberNavController())
}