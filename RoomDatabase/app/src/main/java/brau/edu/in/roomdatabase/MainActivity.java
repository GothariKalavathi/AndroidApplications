package brau.edu.in.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView result;
    PersonDatabase personDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.name1);
        et2=findViewById(R.id.name2);
        result=findViewById(R.id.text1);
        personDatabase= Room.databaseBuilder(this,PersonDatabase.class,"mydb").allowMainThreadQueries().build();
    }

    public void save(View view) {
        String name1=et1.getText().toString();
        int age=Integer.parseInt(et2.getText().toString());
        Person person=new Person(name1,age);
        personDatabase.persondao().insert(person);
        getData();


    }

    private void getData() {
        List<Person> p= PersonDatabase.Persondao().getAll();
        result.setText(" ");
        for(int i=0;i<p.size();i++){
            result.append(p.get(i).getId()+"\n");
            result.append(p.get(i).getName()+"\n");
            result.append(p.get(i).getAge()+"\n");


        }
    }
}