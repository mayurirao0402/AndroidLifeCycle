package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    OnCreate() is called when the activity is first created. This is where
//    all the static work is done like creating views, binding data to lists, etc.
//    This method also provides a Bundle containing its previous saved state..
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate Called", Toast.LENGTH_LONG).show();
    }

 //onStart() is called when the activity is visible to the user. It is followed by onResume() if the activity is invoked from the background.
 // It is also invoked after onCreate() when the activity is first started.
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart Called", Toast.LENGTH_LONG).show();
    }

//  onRestart()  is called after the activity has been stopped and prior to its starting stage and thus is always followed by onStart()
//  when any activity is revived from background to on-screen.
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart Called", Toast.LENGTH_LONG).show();
    }

   // onResume() is called when the activity starts interacting with the user.
   // activity is at the top of the activity stack, with a user interacting with it. Always followed by onPause() when the activity goes into the background or is closed by the user.
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_LONG).show();
    }

//    onPause() is invoked when an activity is going into the background but has not yet been killed. It is a counterpart to onResume().
//    When an activity is launched in front of another activity, this callback will be invoked on the top activity (currently on screen).
//    The activity, under the active activity, will not be created until the active activity’s onPause() returns, so it is recommended that heavy processing should not be done in this part.
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause Called", Toast.LENGTH_LONG).show();
    }

//    onStop() is invoked when the activity is not visible to the user. It is followed by onRestart()
//    when the activity is revoked from the background, followed by onDestroy() when the activity is closed or finished, and nothing when the activity remains on the background only.
//    this method may never be called, in low memory situations where the system does not have enough memory to keep the activity’s process running after its onPause() method is called.
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop Called", Toast.LENGTH_LONG).show();
    }

//    The final call received before the activity is destroyed.
//    This can happen either because the activity is finishing (when finish() is invoked) or because the system is temporarily destroying this instance of the activity to save space.
//    To distinguish between these scenarios, check it with isFinishing() method.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy Called", Toast.LENGTH_LONG).show();
    }

}
