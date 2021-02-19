package com.yagmurerdogan.radiobuttoncheckboxkullanimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatRadioButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val barcelonaDurum = radioButtonBarcelona.isChecked
            val realMadridDurum = radioButtonRealMadrid.isChecked

            Log.e("Barcelona Durum: ", barcelonaDurum.toString())
            Log.e("Real Madrid Durum: ", realMadridDurum.toString())
        }

        radioButtonBarcelona.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(this, "Tebrikler", Toast.LENGTH_SHORT).show()
            }

        }

        group.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radio1)
                Toast.makeText(this, radio1.text.toString(), Toast.LENGTH_SHORT).show()

            if (checkedId == R.id.radio2)
                Toast.makeText(this, radio2.text.toString(), Toast.LENGTH_SHORT).show()

            if (checkedId == R.id.radio3)
                Toast.makeText(this, radio3.text.toString(), Toast.LENGTH_SHORT).show()
        }

        rbGroup.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.rbLeft) {
                rbLeft.setTextColor(Color.WHITE)
                rbRight.setTextColor(Color.RED)
            }
            if (checkedId == R.id.rbRight) {
                rbRight.setTextColor(Color.WHITE)
                rbLeft.setTextColor(Color.RED)
            }

        }

    }
}