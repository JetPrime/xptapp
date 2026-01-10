package com.xpt.xptapp.ui.navigation

sealed class Screen(val route: String) {
    object PackageList : Screen("packageList")
    object BarcodeScanning : Screen("barcodeScanning")
}
