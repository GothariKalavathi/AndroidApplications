package brau.edu.in.countapp_abr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mcount=0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.text1);
    }

    public void count(View view) {
        mcount++;
        textView.setText(""+mcount);
    }

    public void toast(View view) {
        Toast.makeText(this,"Hai ",Toast.LENGTH_LONG).show();
    }

    public void countdec(View view) {
        mcount--;
        textView.setText(""+mcount);
    }

    public void reset(View view) {
        reset(textView);
    }
}