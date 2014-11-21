package co.example.vishnu.hma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main extends Activity {

    EditText username;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button met = (Button) findViewById(R.id.metric);

        met.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent metric_intent = new Intent(Main.this, Metrics.class);
                startActivity(metric_intent);
            }
        });

        Button signup = (Button) findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent signup_intent = new Intent(Main.this, SignUp.class);
                startActivity(signup_intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
