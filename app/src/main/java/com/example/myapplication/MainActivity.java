package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    private Button changeBtn;
    private SeekBar seekBar;
    private ImageView starImage;
    private int[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_layout);
        images=new int[]{R.drawable.a,R.drawable.b,R.drawable.c};

        changeBtn=findViewById(R.id.changeBtn);
        starImage=findViewById(R.id.starImage);
        seekBar=findViewById(R.id.seekBar);

        changeBtn.setOnClickListener(this);

        seekBar.setOnSeekBarChangeListener(this);

    }
    private void changeImage(){
        int m=(int)(Math.random()*3);
        starImage.setImageResource(images[m]);
    }
    private void changeImage(int index){

        starImage.setImageResource(images[index]);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.changeBtn:
                 changeImage();
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        changeImage(progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
