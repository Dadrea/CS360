package com.zybooks.inventoryapplication;

import android.os.Bundle;
import android.view.View;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    // Define variables for UI elements
    private EditText usernameInput;
    private EditText passwordInput;
    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link UI components
        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);
        loginButton = findViewById(R.id.login_btn);
        registerButton = findViewById(R.id.register_btn);

        // Set up login button click event
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input from the user
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                // Perform login logic (replace with your authentication logic)
                if (username.equals("admin") && password.equals("password")) {
                    // Display success message and navigate to next activity
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, InventoryActivity.class);
                    startActivity(intent);
                } else {
                    // Display error message
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set up register button click event (optional, for navigating to a registration screen)
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to RegisterActivity if you have a separate registration page
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}