package jp.techacademy.naoto.ichihashi.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog(){
        val timePickerDialog= TimePickerDialog(this,TimePickerDialog.OnTimeSetListener{view,hour,minute ->
            val Hour = hour
            val output = findViewById<TextView>(R.id.greeting_output)
            if (2 <= Hour && Hour <10){
                output.text = "おはよう"
            }

            else if (10 <= Hour && Hour < 18){
                output.text = "こんにちは"
            }

            else if (18 <= Hour || Hour < 2){
                output.text = "こんばんは"
            }
        },13,0,true)
        timePickerDialog.show()
    }
}
