package co.example.vishnu.hma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Metrics extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metrics);

        Button bmi = (Button) findViewById(R.id.BMI);

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bmi_intent = new Intent(Metrics.this, BMI.class);
                startActivity(bmi_intent);
            }
        });

        Button bmr = (Button) findViewById(R.id.BMR);

        bmr.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent bmr_intent = new Intent(Metrics.this, BMR.class);
                startActivity(bmr_intent);
            }
        });

        Button bfs = (Button) findViewById(R.id.BFS);

        bfs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent bfs_intent = new Intent(Metrics.this, BFS.class);
                startActivity(bfs_intent);
            }

        });

        Button bfp = (Button) findViewById(R.id.BFP);

        bfp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent bfp_intent = new Intent(Metrics.this, BFP.class);
                startActivity(bfp_intent);
            }
        });

        Button whr = (Button) findViewById(R.id.WHR);

        whr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent whr_intent = new Intent(Metrics.this, WHR.class);
                startActivity(whr_intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.metrics, menu);
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
