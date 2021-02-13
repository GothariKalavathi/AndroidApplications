package brau.edu.in.alaram;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton tb;
AlarmManager am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=findViewById(R.id.t1);
        am= (AlarmManager) getSystemService(ALARM_SERVICE);
    }

    public void on(View view) {
        if(tb.isChecked()) {
            Intent intent = new Intent(MainActivity.this, MyReceiver.class);
            PendingIntent pi = PendingIntent.getBroadcast(MainActivity.this, 23, intent,PendingIntent.FLAG_CANCEL_CURRENT );
            tb.setOnCheckedChangeListener();

            // Toast.makeText(this, "Standard Up On", Toast.LENGTH_SHORT).show();
        }
        else{

        }
      //  Toast.makeText(this, "Standard Up Off", Toast.LENGTH_SHORT).show();
    }
}