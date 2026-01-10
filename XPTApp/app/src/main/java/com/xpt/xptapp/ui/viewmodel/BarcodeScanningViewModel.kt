package com.xpt.xptapp.ui.viewmodel
import android.util.Log
import androidx.lifecycle.ViewModel

class BarcodeScanningViewModel : ViewModel() {
    fun onBarcodeScanned(code: String) {
        Log.d("BARCODE", code)
        // appel API / navigation / stockage
    }
}