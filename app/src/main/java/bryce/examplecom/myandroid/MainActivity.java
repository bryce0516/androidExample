package bryce.examplecom.myandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//  boolean bartIsShowing = true;

  public void animateOther(View view) {
    Log.i("Info", "animateOther");
    ImageView bartImageView = (ImageView) findViewById(R.id.bartImage);
    ImageView homerImageView = (ImageView) findViewById(R.id.homerImage);

    bartImageView.animate().translationYBy(1000).setDuration(2000);
    homerImageView.animate().translationXBy(-1000).setDuration(2000);


  }
  public void fadeForBart(View view) {
    Log.i("Info", "Bart Image tapped");

    ImageView bartImageView = (ImageView) findViewById(R.id.bartImage);
    ImageView homerImageView = (ImageView) findViewById(R.id.homerImage);

      bartImageView.animate().alpha(0).setDuration(2000);

      homerImageView.animate().alpha(1).setDuration(2000);
  }

  public void fadeForHomer(View view) {
    Log.i("Info", "Homer Image tapped");

    ImageView bartImageView = (ImageView) findViewById(R.id.bartImage);
    ImageView homerImageView = (ImageView) findViewById(R.id.homerImage);

    bartImageView.animate().alpha(1).setDuration(2000);

    homerImageView.animate().alpha(0).setDuration(2000);

  }
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
    ImageView image = (ImageView) findViewById(R.id.imageView);
    image.setImageResource(R.drawable.five);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}