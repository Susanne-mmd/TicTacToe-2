package com.example.tictactoe;

import com.example.tictactoe.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {
	// define array
	public int[] fields = new int[9];
	
	// X = true ; O = false
	public boolean x = true;
	
	// set counter to 6 
	int counter = 0;
	
	// constants is in capital letters
	// final means you cant change it later
	final int EMPTY = 0;
	final int X = 1;
	final int O = 2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		fields[0]=0;
		fields[1]=0;
		fields[2]=0;
		fields[3]=0;
		fields[4]=0;
		fields[5]=0;
		fields[6]=0;
		fields[7]=0;
		fields[8]=0;
		
		setContentView(R.layout.activity_main);
		
		// definerer variablen table
		View table = findViewById(R.id.table);
		// bruger variablen table
		table.setOnClickListener(this);
		
		// definerer variablen field
		View field = findViewById(R.id.felt1);
		// bruger variablen field
		field.setOnClickListener(this);
		
		field = findViewById(R.id.felt2);
		field.setOnClickListener(this);
		
		field = findViewById(R.id.felt3);
		field.setOnClickListener(this);
		
		field = findViewById(R.id.felt4);
		field.setOnClickListener(this);
		
		field = findViewById(R.id.felt5);
		field.setOnClickListener(this);
		
		field = findViewById(R.id.felt6);
		field.setOnClickListener(this);
		
		field = findViewById(R.id.felt7);
		field.setOnClickListener(this);
		
		field = findViewById(R.id.felt8);
		field.setOnClickListener(this);
		
		field = findViewById(R.id.felt9);
		field.setOnClickListener(this);
	
		
		// button to restart game
		final Button resetButton = (Button) findViewById(R.id.btnReset);
		resetButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// empty the fields
				fields[0]=0;
				fields[1]=0;
				fields[2]=0;
				fields[3]=0;
				fields[4]=0;
				fields[5]=0;
				fields[6]=0;
				fields[7]=0;
				fields[8]=0;
				
				// image is set to blank again
				ImageView field1 = (ImageView) findViewById(R.id.felt1);
				field1.setImageResource(R.drawable.blanks);
				ImageView field2 = (ImageView) findViewById(R.id.felt2);
				field2.setImageResource(R.drawable.blanks);
				ImageView field3 = (ImageView) findViewById(R.id.felt3);
				field3.setImageResource(R.drawable.blanks);
				ImageView field4 = (ImageView) findViewById(R.id.felt4);
				field4.setImageResource(R.drawable.blanks);
				ImageView field5 = (ImageView) findViewById(R.id.felt5);
				field5.setImageResource(R.drawable.blanks);
				ImageView field6 = (ImageView) findViewById(R.id.felt6);
				field6.setImageResource(R.drawable.blanks);
				ImageView field7 = (ImageView) findViewById(R.id.felt7);
				field7.setImageResource(R.drawable.blanks);
				ImageView field8 = (ImageView) findViewById(R.id.felt8);
				field8.setImageResource(R.drawable.blanks);
				ImageView field9 = (ImageView) findViewById(R.id.felt9);
				field9.setImageResource(R.drawable.blanks);
				
				// conter reset to 0 
				counter = 0;
				
				// "X" start game
				x = true;
				
				System.out.println("Game resat");
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
		// Handle action bar item clicks here.
		// The action bar will automatically handle clicks on the Home/Up button,
		// so long as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onClick(View view) {
		
		// counts number of moves to 6 moves. (0 - 5 = 6) 
		if (counter > 5) {
			return;
		}
		
		if (view.getId()==R.id.felt1) {
			if (fields[0] == EMPTY) {
				ImageView image1 = (ImageView) view;
				counter ++;
				if (x == true) {
					image1.setImageResource(R.drawable.kryds);
					
					x = false;
					fields[0] = X;
				}
				else {
					image1.setImageResource(R.drawable.bolle);
					x = true;
					fields[0] = O;
				}
				System.out.println("field 1 pressed");
			}	
		}
		
		if (view.getId()==R.id.felt2) {
			if (fields[1] == EMPTY) {
				ImageView image2 = (ImageView) view;
				counter ++;
				if (x == true) {
					image2.setImageResource(R.drawable.kryds);
					x = false;
					fields[1] = X;
				}
				else {
					image2.setImageResource(R.drawable.bolle);
					x = true;
					fields[1] = O;
				}
				System.out.println("field 2 pressed");
			}	
		}
		
		if (view.getId()==R.id.felt3) {
			if (fields[2] == EMPTY) {
				ImageView image3 = (ImageView) view;
				counter ++;
				if (x == true) {
					image3.setImageResource(R.drawable.kryds);
					x = false;
					fields[2] = X;
				}
				else {
					image3.setImageResource(R.drawable.bolle);
					x = true;
					fields[2] = O;
				}
				System.out.println("field 3 pressed");
			}	
		}
		
		if (view.getId()==R.id.felt4) {
			if (fields[3] == EMPTY) {
				ImageView image4 = (ImageView) view;
				counter ++;
				if (x == true) {
					image4.setImageResource(R.drawable.kryds);
					x = false;
					fields[3] = X;
				}
				else {
					image4.setImageResource(R.drawable.bolle);
					x = true;
					fields[3] = O;
				}
				System.out.println("field 4 pressed");
			}	
		}
		
		if (view.getId()==R.id.felt5) {
			if (fields[4] == EMPTY) {
				ImageView image5 = (ImageView) view;
				counter ++;
				if (x == true) {
					image5.setImageResource(R.drawable.kryds);
					x = false;
					fields[4] = X;
				}
				else {
					image5.setImageResource(R.drawable.bolle);
					x = true;
					fields[4] = O;
				}
				System.out.println("field 5 pressed");
			}	
		}
		
		if (view.getId()==R.id.felt6) {
			if (fields[5] == EMPTY) {
				ImageView image6 = (ImageView) view;
				counter ++;
				if (x == true) {
					image6.setImageResource(R.drawable.kryds);
					x = false;
					fields[5] = X;
				}
				else {
					image6.setImageResource(R.drawable.bolle);
					x = true;
					fields[5] = O;
				}
				System.out.println("field 6 pressed");
			}	
		}
		
		if (view.getId()==R.id.felt7) {
			if (fields[6] == EMPTY) {
				ImageView image7 = (ImageView) view;
				counter ++;
				if (x == true) {
					image7.setImageResource(R.drawable.kryds);
					x = false;
					fields[6] = X;
				}
				else {
					image7.setImageResource(R.drawable.bolle);
					x = true;
					fields[6] = O;
				}
				System.out.println("field 7 pressed");
			}	
		}
		
		if (view.getId()==R.id.felt8) {
			if (fields[7] == EMPTY) {
				ImageView image8 = (ImageView) view;
				counter ++;
				if (x == true) {
					image8.setImageResource(R.drawable.kryds);
					x = false;
					fields[7] = X;
				}
				else {
					image8.setImageResource(R.drawable.bolle);
					x = true;
					fields[7] = O;
				}
				System.out.println("field 8 pressed");
			}	
		}
		
		if (view.getId()==R.id.felt9) {
			if (fields[8] == EMPTY) {
				ImageView image9 = (ImageView) view;
				counter ++;
				if (x == true) {
					image9.setImageResource(R.drawable.kryds);
					x = false;
					fields[8] = X;
				}
				else {
					image9.setImageResource(R.drawable.bolle);
					x = true;
					fields[8] = O;
				}
				System.out.println("field 9 pressed");
			}	
		}
	}
}