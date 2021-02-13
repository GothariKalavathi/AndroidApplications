package brau.edu.in.hellosharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
int mcount=0;
Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.txt1);
    }

    public void count(View view) {
        mcount++;
        textView.setText("",+mcount);
    }

    public void reset(View view) {
        reset(textView);
    }

    public void changeColor(View view) {
    }
}