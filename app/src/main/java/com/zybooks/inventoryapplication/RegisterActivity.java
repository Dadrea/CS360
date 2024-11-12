package com.zybooks.inventoryapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    private EditText newUsernameInput, newPasswordInput, emailInput, phoneNumberInput, supervisorInput, locationInput;
    private Button createUserBtn, backToLogBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize views
        newUsernameInput = findViewById(R.id.new_username_input);
        newPasswordInput = findViewById(R.id.new_password_input);
        emailInput = findViewById(R.id.email_input);
        phoneNumberInput = findViewById(R.id.phone_number_input);
        supervisorInput = findViewById(R.id.supervisor_input);
        locationInput = findViewById(R.id.location_input);
        createUserBtn = findViewById(R.id.create_user_btn);
        backToLogBtn = findViewById(R.id.back_to_log_btn);

        // Set up click listener for Create User button
        createUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewUser();
            }
        });

        // Set up click listener for Back to Login button
        backToLogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to Login screen
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void createNewUser() {
        // Retrieve input data
        String username = newUsernameInput.getText().toString().trim();
        String password = newPasswordInput.getText().toString().trim();
        String email = emailInput.getText().toString().trim();
        String phone = phoneNumberInput.getText().toString().trim();
        String supervisor = supervisorInput.getText().toString().trim();
        String location = locationInput.getText().toString().trim();

        // Simple validation example
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty() || supervisor.isEmpty() || location.isEmpty()) {
            Toast.makeText(this, "Please fill in all required fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO: Add code to save user data (e.g., database, Firebase)

        // Notify user of successful registration
        Toast.makeText(this, "User registered successfully", Toast.LENGTH_SHORT).show();

        // Navigate back to Login screen
        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
