package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            .setIcon(R.drawable.ic_baseline_warning_24)
            .setTitle("Exit")
            .setMessage("Are you Sure want to exit this app")
            .setPositiveButton("Yes",DialogInterface.OnClickListener {
                    dialogInterface, i -> finish() })
            .setNegativeButton("No",DialogInterface.OnClickListener {
                    dialogInterface, i -> dialogInterface.dismiss() })
            .setNeutralButton("Cancel",DialogInterface.OnClickListener {
                    dialogInterface, i -> Toast.makeText(this,"Please Click Yes to Exit",Toast.LENGTH_SHORT).show()
            }).show()
        }
    }
}