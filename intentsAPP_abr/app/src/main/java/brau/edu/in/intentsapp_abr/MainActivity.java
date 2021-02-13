package brau.edu.in.intentsapp_abr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText1;
    EditText editText2;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit1);
        editText1=findViewById(R.id.edit2);
        editText2=findViewById(R.id.edit3);
        webView=findViewById(R.id.web1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.gmail.com");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public void secondscreen(View view) {
        Intent intent=new Intent(this,Secondactivity.class);
        startActivity(intent);
    }

    public void browser(View view) {
        String data=editText.getText().toString();
        Uri uri= Uri.parse("http://www."+data);
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }

    public void dail(View view) {
        String number=editText1.getText().toString();
        Uri uri=Uri.parse("tel:"+number);
        Intent it=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);


    }

    public void sendData(View view) {
        String name=editText2.getText().toString();
        Intent intent=new Intent(this,Secondactivity.class);
        intent.putExtra("KEY",name);
        startActivity(intent);
    }
}