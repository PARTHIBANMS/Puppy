package com.example.puppy;

import java.util.Locale;
import java.util.Random;





import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class PlayScreen extends ActionBarActivity implements OnInitListener{
	//TTS object
	private TextToSpeech myTTS;
	//status check code
	private int MY_DATA_CHECK_CODE = 0;

	final Handler handler = new Handler();
	static int clickvalue;
	TextView[] tv = new TextView[10];
	static int[] anum =new int[10];
	public int flag=0;
	public static int index;
	public Random r;
	public Button btnOpenPopup;
	private ImageView letterView;                       // The letter that the user drags.
	private ImageView emptyLetterView;              // The letter outline that the user is supposed to drag letterView to.
	private AbsoluteLayout mainLayout;
	public Animation animSequential;
	private static final String DEBUG_TAG = "MyActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_screen);
		//check for TTS data
		Intent checkTTSIntent = new Intent();
		checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
		startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);


		tv[0]=(TextView)findViewById(R.id.TextView0);
		tv[1]=(TextView)findViewById(R.id.TextView1);
		tv[2]=(TextView)findViewById(R.id.TextView2);
		tv[3]=(TextView)findViewById(R.id.TextView3);
		tv[4]=(TextView)findViewById(R.id.TextView4);
		tv[5]=(TextView)findViewById(R.id.TextView5);
		tv[6]=(TextView)findViewById(R.id.TextView6);
		tv[7]=(TextView)findViewById(R.id.TextView7);
		tv[8]=(TextView)findViewById(R.id.TextView8);
		tv[9]=(TextView)findViewById(R.id.TextView9);
//		mainLayout = (AbsoluteLayout) findViewById(R.id.container);
//		mainLayout.setOnTouchListener(this);
//		letterView = (ImageView) findViewById(R.id.letterView);
//		letterView.setOnTouchListener(this);
//		letterView = (ImageView) findViewById(R.id.letterView);
//		btnOpenPopup = (Button)findViewById(R.id.openpopup);
		tv[0].setOnClickListener(mGlobal_OnClickListener);
		tv[1].setOnClickListener(mGlobal_OnClickListener);
		tv[2].setOnClickListener(mGlobal_OnClickListener);
		tv[3].setOnClickListener(mGlobal_OnClickListener);
		tv[4].setOnClickListener(mGlobal_OnClickListener);
		tv[5].setOnClickListener(mGlobal_OnClickListener);
		tv[6].setOnClickListener(mGlobal_OnClickListener);
		tv[7].setOnClickListener(mGlobal_OnClickListener);
		tv[8].setOnClickListener(mGlobal_OnClickListener);
		tv[9].setOnClickListener(mGlobal_OnClickListener);

		if(flag==0)
		{
			initialSetText();
			setVoiceCmd();
			flag=1;
		}
		//puppyClick();


	}
	final OnClickListener mGlobal_OnClickListener = new OnClickListener() {
		public void onClick(final View v) {
			switch(v.getId()) {
			case R.id.TextView0:
				//Inform the user the button1 has been clicked
				// Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show(); 

				if(clickvalue==Integer.parseInt(tv[0].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[0].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[0].getText().toString());
											anum[0]=Integer.parseInt(tv[0].getText().toString());

											i=10;
										}

									}
								}
							}
						}
					}

					setVoiceCmd();

				}
				else
				{
					speakWords("please click a correct number");
				}
				break;

			case R.id.TextView1:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show(); 
				if(clickvalue==Integer.parseInt(tv[1].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[1].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[1].getText().toString());
											anum[1]=Integer.parseInt(tv[1].getText().toString());

											i=10;
										}

									}
								}
							}
						}
					}

					setVoiceCmd();

				}
				else
				{
					speakWords("please click a correct number");
				}
				break;

			case R.id.TextView2:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				if(clickvalue==Integer.parseInt(tv[2].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[2].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[2].getText().toString());
											anum[2]=Integer.parseInt(tv[2].getText().toString());

											i=10;
										}

									}
								}
							}
						}
					}

					setVoiceCmd();

				}
				else
				{
					speakWords("please click a correct number");
				}
				break;

			case R.id.TextView3:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				if(clickvalue==Integer.parseInt(tv[3].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[3].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[3].getText().toString());
											anum[3]=Integer.parseInt(tv[3].getText().toString());

											i=10;
										}

									}
								}
							}
						}
					}
					setVoiceCmd();


				}
				else
				{
					speakWords("please click a correct number");
				}

				break;

			case R.id.TextView4:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				if(clickvalue==Integer.parseInt(tv[4].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[4].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[4].getText().toString());
											anum[4]=Integer.parseInt(tv[4].getText().toString());

											i=10;
										}

									}
								}
							}
						}
					}

					setVoiceCmd();

				}
				else
				{
					speakWords("please click a correct number");
				}

				break;

			case R.id.TextView5:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();  
				if(clickvalue==Integer.parseInt(tv[5].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[5].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[5].getText().toString());
											anum[5]=Integer.parseInt(tv[5].getText().toString());

											i=10;
										}

									}
								}
							}
						}
					}

					setVoiceCmd();

				}
				else
				{
					speakWords("please click a correct number");
				}
				break;

			case R.id.TextView6:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				if(clickvalue==Integer.parseInt(tv[6].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[6].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[6].getText().toString());
											anum[6]=Integer.parseInt(tv[6].getText().toString());

											i=10;
										}

									}
								}
							}
						}
					}
					setVoiceCmd();


				}
				else
				{
					speakWords("please click a correct number");
				}
				break;

			case R.id.TextView7:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				if(clickvalue==Integer.parseInt(tv[7].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[7].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[7].getText().toString());
											anum[7]=Integer.parseInt(tv[7].getText().toString());
											setVoiceCmd();
											i=10;
										}

									}
								}
							}
						}
					}

					setVoiceCmd();
				}
				else
				{
					speakWords("please click a correct number");
				}
				break;

			case R.id.TextView8:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				if(clickvalue==Integer.parseInt(tv[8].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[8].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[8].getText().toString());
											anum[8]=Integer.parseInt(tv[8].getText().toString());

											i=10;
										}

									}
								}
							}
						}
					}

					setVoiceCmd();

				}
				else
				{
					speakWords("please click a correct number");
				}
				break;

			case R.id.TextView9:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				if(clickvalue==Integer.parseInt(tv[9].getText().toString()))
				{
					for(int i=0;i<10;i++)
					{
						int min = 0;
						int max = 99;


						r = new Random();
						int i1 = r.nextInt(max - min + 1) + min;

						if(i1!=anum[0] && i1!=anum[1] ){
							if(i1!=anum[2] && i1!=anum[3] ){
								if(i1!=anum[4] && i1!=anum[5] ){
									if(i1!=anum[6] && i1!=anum[7] ){
										if(i1!=anum[8] && i1!=anum[9] ){
											tv[9].setText(String.valueOf(i1));
											System.out.println("pressed position: 0 value:"+tv[9].getText().toString());
											anum[9]=Integer.parseInt(tv[9].getText().toString());


											i=10;
										}

									}
								}
							}
						}
					}

					setVoiceCmd();

				}
				else
				{
					speakWords("please click a correct number");
				}
				break;

			}
		}

		
	};


	//        int index = (Integer) v.getTag();
	//        System.out.println("pressed position:" +index+"value:"+tv[index].getText().toString());

	public void initialSetText(){
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++){
				int min = 0;
				int max = 99;


				r = new Random();
				int i1 = r.nextInt(max - min + 1) + min;


				if(i1!=anum[0] && i1!=anum[1] ){
					if(i1!=anum[2] && i1!=anum[3] ){
						if(i1!=anum[4] && i1!=anum[5] ){
							if(i1!=anum[6] && i1!=anum[7] ){
								if(i1!=anum[8] && i1!=anum[9] ){
									tv[i].setText(String.valueOf(i1));
									anum[i]=i1;
									j=10;
								}
							}

						}
					}
				}
			}
		}


	}

	public void setVoiceCmd()
	{

		handler.postDelayed(new Runnable() {
			@Override
			public void run() {

				// Do something after 5s = 5000ms
				int min = 0;
				int max = 9;


				r = new Random();
				int i2 = r.nextInt(max - min + 1) + min;
				System.out.println("number is: "+i2+" word to speak is:"+anum[i2]);
				speakWords("press "+anum[i2]);
				clickvalue=anum[i2];

			}
		}, 1000);



	}
	//speak the user text
	public void speakWords(String speech) {

		//speak straight away
		myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
	}

	//act on result of TTS data check
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		if (requestCode == MY_DATA_CHECK_CODE) {
			if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
				//the user has the necessary data - create the TTS
				myTTS = new TextToSpeech(this, this);
			}
			else {
				//no data - install it now
				Intent installTTSIntent = new Intent();
				installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
				startActivity(installTTSIntent);
			}
		}
	}

	//setup TTS
	public void onInit(int initStatus) {

		//check for successful instantiation
		if (initStatus == TextToSpeech.SUCCESS) {
			if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
				myTTS.setLanguage(Locale.US);
			myTTS.setSpeechRate(0.5f);
		}
		else if (initStatus == TextToSpeech.ERROR) {
			Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
		}
	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.play_screen, menu);
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
//	public void puppyClick()
//	{
//		btnOpenPopup.setOnClickListener(new Button.OnClickListener()
//		{
//
//			@Override
//			public void onClick(View arg0) 
//			{
//
//				LayoutInflater layoutInflater = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE); 
//
//				View popupView = layoutInflater.inflate(R.layout.popup, null); 
//
//				final PopupWindow popupWindow = new PopupWindow( popupView, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);  
//
//				popupWindow.showAtLocation(popupView, Gravity.CLIP_VERTICAL, 0, 0);
//
//				Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
//
//				btnDismiss.setOnClickListener(new Button.OnClickListener()
//				{
//
//					@Override
//					public void onClick(View v) {
//						// TODO Auto-generated method stub
//						popupWindow.dismiss();
//					}});
//
//				popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
//
//			}});
//	}

//	@SuppressLint("NewApi")
//	@Override
//	public boolean onTouch(View v, MotionEvent event) {
//		boolean eventConsumed = true;
//		int x = (int)event.getX();
//		int y = (int)event.getY();
//		System.out.println("x value " + x );
//		System.out.println("y value " + y );
//
//		int action = event.getAction();
//		if (action == MotionEvent.ACTION_DOWN) {
//			if (v == letterView) {
//				//letterView.setImageResource(R.drawable.ic_launcher);
//				//	dragging = true;
//				eventConsumed = false;
//			}
//			
//
//			setAbsoluteLocationCentered(letterView, x, y);
//			
//
//
//			// load the animation
//			animSequential = AnimationUtils.loadAnimation(getApplicationContext(),
//					R.anim.flyingbird);
//
//			// set animation listener
//			animSequential.setAnimationListener(this);
//
//			letterView.startAnimation(animSequential);
//
//			System.out.println("Animation running");
//			
////			handler.postDelayed(new Runnable() {
////			@Override
////			public void run() {
////
////				// Do something after 5s = 5000ms
////			
////				
////				// load the animation
////				animSequential = AnimationUtils.loadAnimation(getApplicationContext(),
////						R.anim.move);
////
////				// set animation listener
////				animSequential.setAnimationListener(this);
////
////				letterView.startAnimation(animSequential);
////
////				System.out.println("Animation move running");
////
////			}
////		}, 3000);
//		
//
//
//			
//			
//
//			
//
//
//		} else if (action == MotionEvent.ACTION_UP) {
//
//
//			
//
//
//			
//			
////			if (v != letterView) {
////				 boolean dragging = false;
////				if (dragging) {
////					setAbsoluteLocationCentered(letterView, x, y);
////				}
////			}
//
////			letterView.setPivotX(x);
////			letterView.setPivotY(y);
//
//
//			//		letterView.setVisibility (View.INVISIBLE);			
//			//		System.out.println("Animation stopped");
//
//
//
//
//			//		if (dragging) {
//			//			emptyLetterView.getHitRect(hitRect);
//			//			if (hitRect.contains(x, y)) {
//			//				letterView.setImageResource(R.drawable.ic_launcher);
//			//				setSameAbsoluteLocation(letterView, emptyLetterView);
//			//			}
//			//		}
//			//		dragging = false;
//			//		eventConsumed = false;
//
//		} else if (action == MotionEvent.ACTION_MOVE) {
////					if (v != letterView) {
////						if (dragging) {
////							setAbsoluteLocationCentered(letterView, x, y);
////						}
////					}
//		}
//
//		return eventConsumed;
//	}
//	private void setSameAbsoluteLocation(View v1, View v2) {
//		AbsoluteLayout.LayoutParams alp2 = (AbsoluteLayout.LayoutParams) v2.getLayoutParams();
//		setAbsoluteLocation(v1, alp2.x, alp2.y);
//	}
//
//
//	private void setAbsoluteLocationCentered(View v, int x, int y) {
//		setAbsoluteLocation(v, x - v.getWidth() / 2, y - v.getHeight() / 2);
//	}
//
//
//	private void setAbsoluteLocation(View v, int x, int y) {
//		AbsoluteLayout.LayoutParams alp = (AbsoluteLayout.LayoutParams) v.getLayoutParams();
//		alp.x = x;
//		alp.y = y;
//		v.setLayoutParams(alp);
//	}
//	@Override
//	public void onAnimationEnd(Animation animation) {
//		// Take any action after completing the animation
//
//		// check for zoom in animation
//		if (animation == animSequential) {
//		}
//
//	}
//
//	@Override
//	public void onAnimationRepeat(Animation animation) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void onAnimationStart(Animation animation) {
//		// TODO Auto-generated method stub
//
//	}

}


