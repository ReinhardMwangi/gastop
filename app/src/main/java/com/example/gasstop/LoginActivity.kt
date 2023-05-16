package com.example.gasstop

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class LoginActivity : AppCompatActivity() {
    lateinit var btnsubmit: Button
    lateinit var edtEmail: EditText
    lateinit var edtPhone: EditText
    lateinit var edtPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edtEmail = findViewById(R.id.medtEmail)
        edtPassword = findViewById(R.id.mEdtPassword)
        btnsubmit = findViewById(R.id.mBtnSignup)
        var progress = ProgressDialog(this)
        progress.setTitle("Saving")
        progress.setMessage("Please wait...")

        btnsubmit.setOnClickListener {
            val sajili = Intent(this@LoginActivity,HomeActivity::class.java)
            startActivity(sajili)

            var email = edtEmail.text.toString().trim()
            var password = edtPassword.toString().trim()
            // Check if the user is submitting empty fields
            if (email.isEmpty()) {
                edtEmail.setError("Please fill this input")
                edtEmail.requestFocus()
            } else if (password.isEmpty()) {
                edtPassword.setError("Please fill this input")
                edtPassword.requestFocus()
            } else {
                // Proceed to save
                progress.show()
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    progress.dismiss()
                    if (it.isSuccessful) {
                        Toast.makeText(this, "User logged in successfully!", Toast.LENGTH_LONG).show()
                        startActivity(Intent(this,HomeActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(
                            this, "User login failed!",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }

            }
        }

    }


}

