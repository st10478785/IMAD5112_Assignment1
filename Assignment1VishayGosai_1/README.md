"# Assessment1" 


Summary 

This is an application made using Android Studios, coded using Kotlin about a meal suggestion app.

 UI Element References:
  txtMealPicker (TextView for title)
txtOptions (TextView for instructions)
edtTime (EditText for time input)
txtAnswer (TextView for showing suggestions)
btnSuggestion and btnReset (Buttons)


Button Functionality:
"Get Suggestion" Button:
Gets text from edtTime input field
Converts input to lowercase and removes whitespace
Uses if-else statements to match input with specific times:

"morning" - "Breakfast: Eggs and toast"
"mid-morning" - "Snack: A fresh fruit"
 "afternoon" - "Lunch: A nice sandwich"
 "mid-afternoon" - "Snack: A slice of cake"
"dinner" - "Pasta with your favourite sauce"
 "after dinner" - "Dessert: Ice cream or chocolate"
Invalid input - Error message


Displays the suggestion in txtAnswer

"Reset" Button:
- Clears both the input field (edtTime)
- Clears the answer display (txtAnswer)

  
The app provides a simple interface where users can:
1. Enter a time of day
2. Type time of day ( morning, afternoon etc ) 
3. Press get suggestion
4. You will get a meal suggestion based on that time
5. Reset the button to clear the input and to start over


Graph using git hub read me file style 

Time of Day.        | Suggestion |
| Morning           | Breakfast: Eggs and toast |
| Mid-morning       | Snack: A fresh fruit |
| Afternoon         | Lunch: A nice sandwich |
| Mid-afternoon     | Snack: A slice of cake |
| Dinner            | Dinner: Pasta with your favourite sauce |
| After dinner      | Dessert: Ice cream or chocolate |



YouTube link : https://youtu.be/QHHp-Z34Y28


GitHub link : https://github.com/st10478785




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
GUI code - home page (Meal Picker) : 
activity_main.xml


<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FAF7F7"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/txtAnswer"
        android:layout_width="338dp"
        android:layout_height="115dp"
        android:layout_marginStart="36dp"
        android:layout_marginBottom="11dp"
        android:text="Answer"
        android:textColor="#E95B21"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/btnSuggestion"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/btnSuggestion"
        android:layout_width="359dp"
        android:layout_height="70dp"
        android:layout_marginStart="26dp"
        android:layout_marginTop="11dp"
        android:backgroundTint="#D71010"
        android:text="Get Suggestion "
        android:textColor="#F0EDED"
        android:textColorLink="#FDFCFC"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/txtAnswer"
        app:strokeColor="#FBFBFB" />

    <Button
        android:id="@+id/btnReset"
        android:layout_width="357dp"
        android:layout_height="69dp"
        android:layout_marginStart="26dp"
        android:layout_marginTop="34dp"
        android:backgroundTint="#4CAF50"
        android:text="Reset"
        android:textColor="#FBF8F8"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btnSuggestion" />







    <TextView
        android:id="@+id/txtOptions"
        android:layout_width="338dp"
        android:layout_height="115dp"
        android:layout_marginStart="36dp"
        android:layout_marginBottom="21dp"
        android:text="Time of day ( morning, mid-morning, afternoon, mid-afternoon or dinner )             Lower case"
        android:textColor="#3F51B5"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/edtTime"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/txtMealPicker"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="19dp"
        android:layout_marginBottom="14dp"
        android:text="Meal Picker"
        android:textColor="#101010"
        android:textSize="70sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/txtOptions"
        app:layout_constraintStart_toStartOf="parent" />

    <EditText
        android:id="@+id/edtTime"
        android:layout_width="338dp"
        android:layout_height="82dp"
        android:layout_marginStart="36dp"
        android:layout_marginEnd="37dp"
        android:layout_marginBottom="36dp"
        android:ems="10"
        android:gravity="start|top"
        android:inputType="textMultiLine"
        android:textColor="#141414"
        app:layout_constraintBottom_toTopOf="@+id/txtAnswer"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>





