package com.londonappbrewery.destini;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button topButton;
    Button bottomButton;
    TextView story;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);
        story = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(topButton.getText().toString().equals(getString(R.string.T1_Ans1))){
                    story.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                }
                else if(topButton.getText().toString().equals(getString(R.string.T2_Ans1))){
                    story.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                }

                else if(topButton.getText().toString().equals(getString(R.string.T3_Ans1))){
                    story.setText(R.string.T6_End);
                    ViewGroup parent = (ViewGroup) topButton.getParent();
                    if(parent != null){
                        parent.removeView(topButton);
                        parent.removeView(bottomButton);
                    }
                }



            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bottomButton.getText().toString().equals(getString(R.string.T1_Ans2))){
                    story.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                }
                else if(bottomButton.getText().toString().equals(getString(R.string.T2_Ans2))){
                    story.setText(R.string.T4_End);
                    ViewGroup parent = (ViewGroup) topButton.getParent();
                    if(parent != null){
                        parent.removeView(topButton);
                        parent.removeView(bottomButton);
                    }
                }

                else if(bottomButton.getText().toString().equals(getString(R.string.T3_Ans2))){
                    story.setText(R.string.T5_End);
                    ViewGroup parent = (ViewGroup) topButton.getParent();
                    if(parent != null){
                        parent.removeView(topButton);
                        parent.removeView(bottomButton);
                    }
                }



            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
