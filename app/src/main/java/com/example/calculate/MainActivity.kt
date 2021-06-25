package com.example.calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edittext :EditText
     var number1 :Float = 0.0F
     var is_plus : Boolean = false
    var is_minis :Boolean = false
     var is_diba : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edittext = findViewById(R.id.number_edit_text)
    }
    fun operationFunction(view : View)
    {

        when(  view.id)
        {
            R.id.button_one -> {
                 val number = edittext.text.toString() + "1"
                edittext.setText(number)
            }
            R.id.button_two ->
            {
                val number = edittext.text.toString() + "2"
                edittext.setText(number)
            }
            R.id.button_three -> {
                val number = edittext.text.toString() + "3"
                edittext.setText(number)
            }
            R.id.button_four ->
            {
                val number = edittext.text.toString() + "4"
                edittext.setText(number)
            }
            R.id.button_five -> {
                val number = edittext.text.toString() + "5"
                edittext.setText(number)
            }
            R.id.button_six ->
            {
                val number = edittext.text.toString() + "6"
                edittext.setText(number)
            }
            R.id.button_seven -> {
                val number = edittext.text.toString() + "7"
                edittext.setText(number)
            }
            R.id.button_eight->
            {
                val number = edittext.text.toString() + "8"
                edittext.setText(number)
            }
            R.id.button_nine -> {
                val number = edittext.text.toString() + "9"
                edittext.setText(number)
            }
            R.id.button_Zero ->
            {
                val number = edittext.text.toString() + "0"
                edittext.setText(number)
            }
            R.id.button_dot -> {
                val number = edittext.text.toString() + "."
                edittext.setText(number)
            }
            R.id.button_C->
            {
                edittext.setText("")
            }
        R.id.button_plus->
        {
            number1 = edittext.text.toString().toFloat()
            edittext.setText("")
            is_plus = true

        }
             R.id.button_Equel ->
             {  if (is_plus)
             {
                 var number2 = edittext.text.toString().toFloat()
                 val result = number1 + number2
                 edittext.setText(result.toString())
                 is_plus = false
             }
                  else if (is_minis)
             {
                 var number2 = edittext.text.toString().toFloat()
                 val result = number1 - number2
                 edittext.setText(result.toString())
                  is_minis= false
             }

             else if (is_diba)
             {
                 var number2 = edittext.text.toString().toFloat()
                 val result = number1 / number2
                 edittext.setText(result.toString())
                 is_diba= false
             }

             }
             R.id.button_pen ->
             {
                 number1 = edittext.text.toString().toFloat()
                 edittext.setText("")
                 is_minis = true


             }
            R.id.button_sl ->
            {
                number1 = edittext.text.toString().toFloat()
                edittext.setText("")
                is_diba = true


            }

        }
    }
}