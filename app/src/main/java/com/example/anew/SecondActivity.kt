package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SecondActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        auth= FirebaseAuth.getInstance()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)



        val email=findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password=findViewById<EditText>(R.id.editTextNumberPassword)
        val button= findViewById<Button>(R.id.button)
        val loginbutton=findViewById<Button>(R.id.button3)

        button.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }


       loginbutton.setOnClickListener {


           val giveEmail=email.text.toString()
           val givepassword=password.text.toString()
           if (giveEmail.isNotEmpty()||givepassword.isNotEmpty()) {



               auth.signInWithEmailAndPassword(giveEmail, givepassword)
                   .addOnCompleteListener(this) { task ->
                       if (task.isSuccessful) {
                           val intent = Intent(this, FourthActivity::class.java)
                           startActivity(intent)
                           // Sign in success, update UI with the signed-in user's information
                       } else {
                           // If sign in fails, display a message to the user.

                           Toast.makeText(
                               baseContext,
                               "Authentication failed.",
                               Toast.LENGTH_SHORT,
                           ).show()

                       }
                   }
           }
           else{
                startActivity(Intent(this,SecondActivity::class.java))
               Toast.makeText(
                   baseContext,
                   "All fields required.",
                   Toast.LENGTH_SHORT,
               ).show()
           }
        }


    }
}