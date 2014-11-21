package co.example.vishnu.hma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SignUp extends Activity {

    String first_s, last_s, user_s, pwd_s, confirm_s;
    String height_s, weight_s, age_s, gender_s, wrist_s, waist_s, hip_s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button signup = (Button) findViewById(R.id.signup2);

        signup.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View v)
            {
                EditText pwd = (EditText) findViewById(R.id.pwd);
                pwd_s = pwd.getText().toString();
                EditText confirm = (EditText) findViewById(R.id.confirmpwd);
                confirm_s = confirm.getText().toString();
                Intent main_intent = new Intent(SignUp.this, WHR.class);
                //main_intent.putExtra("NAME", fname_s);
                startActivity(main_intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sign_up, menu);
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
