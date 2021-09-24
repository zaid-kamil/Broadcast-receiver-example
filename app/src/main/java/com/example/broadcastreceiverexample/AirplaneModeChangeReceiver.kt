package com.example.broadcastreceiverexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView
import android.widget.Toast

class AirplaneModeChangeReceiver(val textView: TextView) : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return
        if (isAirplaneModeEnabled) {
            Toast.makeText(context, "Airplane mode enabled", Toast.LENGTH_LONG).show()
            textView.text = "Mode On"
        } else {
            Toast.makeText(context, "Airplane mode Disabled", Toast.LENGTH_LONG).show()
            textView.text = "Mode Off"
        }
    }
}