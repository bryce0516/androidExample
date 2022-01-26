package bryce.examplecom.myandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  public void clickFunction(View view) {

    EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

    Log.i("Info", "Button presssed!");

    Log.i("Values", nameEditText.getText().toString());

    Toast.makeText(this, "Hello " +nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();

  }

  public void loginFunction(View view) {
    Log.i("Info","LoginButton pressed");
    EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
    EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

    Log.i("Username", usernameEditText.getText().toString());
    Log.i("Password", passwordEditText.getText().toString());

    Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
  }

  public void imageChangeFunction(View view) {

  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}