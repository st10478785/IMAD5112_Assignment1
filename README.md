"# Assessment1"

Summary

This is an application made using Android Studios, coded using Kotlin about a meal suggestion app.

UI Element References: txtMealPicker (TextView for title) txtOptions (TextView for instructions) edtTime (EditText for time input) txtAnswer (TextView for showing suggestions) btnSuggestion and btnReset (Buttons)

Button Functionality: "Get Suggestion" Button: Gets text from edtTime input field Converts input to lowercase and removes whitespace Uses if-else statements to match input with specific times:

"morning" - "Breakfast: Eggs and toast" "mid-morning" - "Snack: A fresh fruit" "afternoon" - "Lunch: A nice sandwich" "mid-afternoon" - "Snack: A slice of cake" "dinner" - "Pasta with your favourite sauce" "after dinner" - "Dessert: Ice cream or chocolate" Invalid input - Error message

Displays the suggestion in txtAnswer

"Reset" Button:

Clears both the input field (edtTime)
Clears the answer display (txtAnswer)
The app provides a simple interface where users can:

Enter a time of day
Type time of day ( morning, afternoon etc )
Press get suggestion
You will get a meal suggestion based on that time
Reset the button to clear the input and to start over
Graph using git hub read me file style

Time of Day. | Suggestion | | Morning | Breakfast: Eggs and toast | | Mid-morning | Snack: A fresh fruit | | Afternoon | Lunch: A nice sandwich | | Mid-afternoon | Snack: A slice of cake | | Dinner | Dinner: Pasta with your favourite sauce | | After dinner | Dessert: Ice cream or chocolate |

YouTube link : https://youtu.be/QHHp-Z34Y28

GitHub link : https://github.com/st10478785

package com.example.assignment1vishaygosai_1

import android.os.Bundle import android.widget.Button import android.widget.EditText import android.widget.TextView import androidx.activity.enableEdgeToEdge import androidx.appcompat.app.AppCompatActivity import androidx.core.view.ViewCompat import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) enableEdgeToEdge() setContentView(R.layout.activity_main)

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
