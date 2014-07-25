package com.example.puppy;





import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class KidName extends ActionBarActivity {
EditText name;
Button save;

//Alert Dialog Manager
	AlertDialogManager alert = new AlertDialogManager();
	
	// Session Manager Class
	SessionManager session;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kid_name);
		
		// Session Manager
        session = new SessionManager(getApplicationContext());                
        
        // Email, Password input text
        name = (EditText) findViewById(R.id.etname);
        
        
        Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();
        
        
        // Login button
        save = (Button) findViewById(R.id.btnsave);
        
        
        // Login button click event
       save.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// Get username, password from EditText
				String username = name.getText().toString();
				
				
				// Check if username, password is filled				
				if(username.trim().length() > 0){
					// For testing puspose username, password is checked with sample data
					// username = test
					// password = test
				
						// Creating user login session
						// For testing i am stroing name, email as follow
						// Use user real data
						session.createLoginSession(username);
						
						// Staring MainActivity
						Intent i = new Intent(getApplicationContext(), MainActivity.class);
						startActivity(i);
						finish();
						
					
				}
				
			}
		});

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kid_name, menu);
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
