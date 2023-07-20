package com.example.anew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ThirdActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth= FirebaseAuth.getInstance()
        setContentView(R.layout.activity_third)

        val email=findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val password=findViewById<EditText>(R.id.editTextNumberPassword2)
        val button= findViewById<Button>(R.id.button2)
        val signupbutton=findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            val intent = Intent(this,FourthActivity::class.java)
            startActivity(intent)
        }


        signupbutton.setOnClickListener {


            val giveEmail=email.text.toString()
            val givepassword=password.text.toString()

            auth.createUserWithEmailAndPassword(giveEmail, givepassword)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this,SecondActivity::class.java)
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

    }
}