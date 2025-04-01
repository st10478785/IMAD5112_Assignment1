package com.example.assignment1vishaygosai_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Get the references to the UI elements from the XML layout
        val txtMealPicker = findViewById<TextView>(R.id.txtMealPicker)
        val txtOptions = findViewById<TextView>(R.id.txtOptions)
        val edtTime = findViewById<EditText>(R.id.edtTime)
        val txtAnswer = findViewById<TextView>(R.id.txtAnswer)
        val btnSuggestion = findViewById<Button>(R.id.btnSuggestion)
        val btnReset = findViewById<Button>(R.id.btnReset)

        // Set up the click listener for the "Suggest Meal" button
        btnSuggestion.setOnClickListener {
            // Get the input from the EditText and convert it to lowercase, for easy comparison
            val timeOfDay = edtTime.text.toString().trim().lowercase()

            // Use if statements to determine the meal suggestion based on the time of day
            val suggestion = if (timeOfDay == "morning") {
                "Breakfast: Eggs and toast"
            } else if (timeOfDay == "mid-morning") {
                "Snack: A fresh fruit"
            } else if (timeOfDay == "afternoon") {
                "Lunch: A nice sandwich"
            } else if (timeOfDay == "mid-afternoon") {
                "Snack: A slice of cake"
            } else if (timeOfDay == "dinner") {
                "Dinner: Pasta with your favorite sauce"
            } else if (timeOfDay == "after dinner") {
                "Dessert: Ice cream or chocolate"
            } else {
                "Invalid input. Please enter a valid time of day."
            }

            // Display the meal suggestion in the txtAnswer TextView
            txtAnswer.text = suggestion
        }

        /// Set up the click listener for the "Reset" button
        btnReset.setOnClickListener {
            // Clear the input and suggestion fields for (edtTime) and (txtAnswer)
            edtTime.text.clear()
            txtAnswer.text = ""
        }
    }
}