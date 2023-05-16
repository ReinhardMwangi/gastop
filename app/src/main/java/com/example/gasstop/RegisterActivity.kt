package com.example.gasstop

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class RegisterActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    lateinit var btnsubmit: Button
    lateinit var edtName: EditText
    lateinit var edtEmail: EditText
    lateinit var edtPhone: EditText
    lateinit var edtPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        edtName = findViewById(R.id.mEdtName)
        edtEmail = findViewById(R.id.mEdtEmail)
        edtPassword = findViewById(R.id.mEdtPassword)
        edtPhone = findViewById(R.id.mEdtPhone)
        btnsubmit = findViewById(R.id.mBtnSignup)
        var progress = ProgressDialog(this)
        progress.setTitle("Saving")
        progress.setMessage("Please wait...")

        btnsubmit.setOnClickListener {

            val sajili = Intent(this@RegisterActivity,HomeActivity::class.java)
            startActivity(sajili)


            var name = edtName.text.toString().trim()
            var email = edtEmail.text.toString().trim()
            var phone = edtPhone.text.toString().trim()
            var password = edtPassword.toString().trim()
            var id = System.currentTimeMillis().toString()
            // Check if the user is submitting empty fields
            if (name.isEmpty()) {
                edtName.setError("Please fill this input")
                edtName.requestFocus()
            } else if (email.isEmpty()) {
                edtEmail.setError("Please fill this input")
                edtEmail.requestFocus()
            } else if (phone.isEmpty()) {
                edtPhone.setError("Please fill this input")
                edtPhone.requestFocus()
            } else if (password.isEmpty()) {
                edtPassword.setError("Please fill this input")
                edtPassword.requestFocus()
            } else {
                // Proceed to save
                var user = User(name, email, phone, password)
                //Create a reference to the FirebaseDatabase
                var ref = FirebaseDatabase.getInstance().getReference().child("Users/" + id)

                progress.show()
                ref.setValue(user).addOnCompleteListener {
                    progress.dismiss()
                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                    if (it.isSuccessful) {
                        Toast.makeText(this, "User registered successfully!", Toast.LENGTH_LONG).show()
                        FirebaseAuth.getInstance().signOut()
                        startActivity(Intent(this,LoginActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(
                            this, "User registration failed!",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }

            }
        }

    }


    }







