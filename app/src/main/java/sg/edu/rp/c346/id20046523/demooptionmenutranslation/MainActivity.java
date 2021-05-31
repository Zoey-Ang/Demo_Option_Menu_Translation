package sg.edu.rp.c346.id20046523.demooptionmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText=findViewById(R.id.textViewTranslatedText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present
        //inflate means use
        //this is decoratively
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

        //manual program:
        //menu.add()
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //handle action bar item clicks here
        int id = item.getItemId();
        if(id==R.id.EnglishSelection)
        {
            tvTranslatedText.setText("Hello");
            return true;
        }
        else if(id==R.id.italianSelection)
        {
            tvTranslatedText.setText("Ciao");
            return true;
        }
        else
        {
            tvTranslatedText.setText("Error translation");
        }
        
        //if it is super, type code below it
        //return, type codes above it
        return super.onOptionsItemSelected(item);
    }
}