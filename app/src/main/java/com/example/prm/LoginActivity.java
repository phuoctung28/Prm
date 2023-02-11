package com.example.prm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;
    private TextView mSignUpTextView;
    private static final String username  = "12345";
    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsernameEditText = findViewById(R.id.username_edit_text);
        mPasswordEditText = findViewById(R.id.password_edit_text);

        EditTextFocusChangeListener focusChangeListener = new EditTextFocusChangeListener();

        mUsernameEditText.setOnFocusChangeListener(focusChangeListener);
        mPasswordEditText.setOnFocusChangeListener(focusChangeListener);
    }

    public void onLogin(View view) {
        String userName = mUsernameEditText.getText().toString();
        String passWord = mPasswordEditText.getText().toString();
        Log.v(TAG, userName);
        Log.v(TAG, passWord);
        if (userName.equals(username) && passWord.equals(username)) {
            Toast.makeText(LoginActivity.this, "Login successfully", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(LoginActivity.this, "Login failed", Toast.LENGTH_LONG).show();
        }
    }

}