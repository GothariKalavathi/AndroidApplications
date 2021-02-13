package brau.edu.in.intentsapp_abr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        textView=findViewById(R.id.textView);
        Bundle bundle=getIntent().getExtras();
        String txt=bundle.getString("KEY");
        textView.setText(txt);
    }
}