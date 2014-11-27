package edu.np.ece.mapg.s10145676.mp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	int myNumber =	6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void makeGuess(View view){
        EditText etUserInput = (EditText) findViewById(R.id.etNumber);
        int Guess = Integer.parseInt(etUserInput.getText().toString());

        if (Guess == myNumber)
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Bingo! Correct number.", Toast.LENGTH_SHORT);
            toast.show();
        }
        else
            Toast.makeText(getApplicationContext(),"Try again!", Toast.LENGTH_SHORT).show();
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
