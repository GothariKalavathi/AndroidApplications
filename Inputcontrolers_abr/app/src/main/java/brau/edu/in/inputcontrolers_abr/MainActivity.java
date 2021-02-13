package brau.edu.in.inputcontrolers_abr;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    /*Radio group is used to group together one or more buttons
    * Radio button has two states either checked or unchecked
    * checkbox when presenting users with a group of selectable options that are not mutually exclusive*/
    RadioGroup r1;
    RadioButton radio1,radio2;
    CheckBox check1,check2,check3;
    Switch aSwitch;
    LinearLayout linearLayout;
    Spinner spinner;
    DatePicker datePicker;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 =findViewById(R.id.rg1);
        radio1 =findViewById(R.id.rb1);
        radio2 =findViewById(R.id.rb2);
        check1=findViewById(R.id.ch1);
        check2=findViewById(R.id.ch2);
        check3=findViewById(R.id.ch3);
        aSwitch=findViewById(R.id.switch1);
        linearLayout=findViewById(R.id.linear1);
        spinner=findViewById(R.id.sp1);
        datePicker=findViewById(R.id.dp1);
        timePicker=findViewById(R.id.tp1);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this, hourOfDay+":"+minute, Toast.LENGTH_SHORT).show();
            }
        });
        ArrayList weaks=new ArrayList<>();
        weaks.add("sunday");
        weaks.add("Monday");
        weaks.add("Tuesday");
        weaks.add("wednesday");
        weaks.add("Thursday");
        weaks.add("Friday");
        weaks.add("Saturday");
        Calendar calendar=Calendar.getInstance();
        datePicker.init(calendar.get(calendar.YEAR), calendar.get(calendar.MONTH), calendar.get(calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                monthOfYear=monthOfYear+1;
                String date=dayOfMonth+"\n"+monthOfYear+"\n"+year;
                Toast.makeText(MainActivity.this, date, Toast.LENGTH_SHORT).show();
            }
        });
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,weaks);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "selected"+weaks.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb1:
                        Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
                        break;


                }
            }
        });

    }

    public void img(View view) {
        Toast.makeText(this, "Hello <>< ", Toast.LENGTH_SHORT).show();
    }

    public void submit(View view) {
        if(check1.isChecked()&&check2.isChecked()&&check3.isChecked())
        {
            Toast.makeText(this, " "+check1.getText()+"\n"+check2.getText()+"\n"+check3.getText(), Toast.LENGTH_SHORT).show();
        }else if (check1.isChecked()&&check2.isChecked())
        {
            Toast.makeText(this, ""+check1.getText()+"\n"+check2.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (check2.isChecked()&&check3.isChecked())
        {
            Toast.makeText(this, ""+check2.getText()+"\n"+check3.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (check1.isChecked()&&check3.isChecked())
        {
            Toast.makeText(this, ""+check1.getText()+"\n"+check3.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (check1.isChecked())
        {
            Toast.makeText(this, ""+check1.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (check2.isChecked())
        {
            Toast.makeText(this, ""+check2.getText(), Toast.LENGTH_SHORT).show();
        }
        else if (check3.isChecked())
        {
            Toast.makeText(this, ""+check3.getText(), Toast.LENGTH_SHORT).show();
        }
    }



    public void changeColor(View view) {
        if (aSwitch.isChecked()){
            linearLayout.setBackgroundColor(Color.GRAY);
        }
        else{
            linearLayout.setBackgroundColor(Color.BLUE);
        }
    }
}