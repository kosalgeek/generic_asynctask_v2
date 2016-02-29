package com.kosalgeek.genasync12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;
    int clickerId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://10.0.3.2/client/post.php?format=json";
                PostResponseAsyncTask readTask = new PostResponseAsyncTask(MainActivity.this, new AsyncResponse() {
                    @Override
                    public void processFinish(String s) {
                        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
                    }
                });
                readTask.execute(url);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://10.0.3.2/client/post.php";
                PostResponseAsyncTask readTask = new PostResponseAsyncTask(MainActivity.this, new AsyncResponse() {
                    @Override
                    public void processFinish(String s) {
                        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
                    }
                });
                readTask.execute(url);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "http://10.0.3.2/client/post.php";

                //setting false in the 2nd argument will disable the loading message
                PostResponseAsyncTask readTask = new PostResponseAsyncTask(
                        MainActivity.this, false,
                        new AsyncResponse() {
                            @Override
                            public void processFinish(String s) {
                                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
                            }
                        });
                readTask.execute(url);

            }
        });
    }

}