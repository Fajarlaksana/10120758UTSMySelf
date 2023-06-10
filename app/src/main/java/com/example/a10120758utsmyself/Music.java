package com.example.a10120758utsmyself;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Music extends AppCompatActivity {
    //(27 Mei 2023, 10120758, Fajar Laksana, IF-9)

    Context contextVideo, context;
    RecyclerView recyclerViewVideo, recyclerViewMusic;
    RecyclerView.Adapter recyclerViewAdapterVideo, recyclerViewAdapterMusic;
    RecyclerView.LayoutManager recylerViewLayoutManagerVideo, recylerViewLayoutManagerMusic;
    VideoView videoView;
    String[] subjectValuesVideo = {
            "When I Come Around", "Green Day", "Green Day"
    };
    String[] subjectUrlVideo;
    String[] subjectValuesMusic = {
            "one - Metallica",
            "I Wanna Be Yours - Arctic Monkeys",
            "So Far Away - Avenged Sevenfold ",
            "Hail to the King - Avenged Sevenfold",
            "Paranoid - Black Sabbath",
            "The Number of the Beast - by Iron Maiden",
            "When I Come Around - Green Day",
            "Welcome to Paradise - Green Day",
            "I Miss You - Blink-182",
            "What's My Age Again? - Blink-182",
            "All the Small Things - Blink-182",
            "Stand by Me - oasis"
};
    DrawerLayout drawerLayout;
@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        subjectUrlVideo=new String[]{
        "android.resource://"+getPackageName()+"/"+R.raw.video,
        "android.resource://"+getPackageName()+"/"+R.raw.video2,
        "android.resource://"+getPackageName()+"/"+R.raw.video3
        };
        contextVideo=getApplicationContext();
        recyclerViewVideo=findViewById(R.id.recyclerViewVideo);
        recylerViewLayoutManagerVideo=new LinearLayoutManager(this);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewVideo.setLayoutManager(recylerViewLayoutManagerVideo);
        recyclerViewAdapterVideo=new com.example.a10120758utsmyself.AdapterRecycleViewVideo(subjectValuesVideo,subjectUrlVideo,this);
        recyclerViewVideo.setAdapter(recyclerViewAdapterVideo);

        context=getApplicationContext();
        recyclerViewMusic=findViewById(R.id.recyclerViewMusic);
        recylerViewLayoutManagerMusic=new LinearLayoutManager(context);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewMusic.setLayoutManager(recylerViewLayoutManagerMusic);
        recyclerViewAdapterMusic=new com.example.a10120758utsmyself.AdapterRecycleViewMusic(subjectValuesMusic,context);
        recyclerViewMusic.setAdapter(recyclerViewAdapterMusic);

        //ass
        drawerLayout=findViewById(R.id.DrawerLayout);
        }
public void ClickMenu(View view){
        //Open drawer
    com.example.a10120758utsmyself.HomeActivity.openDrawer(drawerLayout);

        }
public void ClickLogo(View view){
    com.example.a10120758utsmyself.HomeActivity.closeDrawer(drawerLayout);
        }
public void ClickHome(View view){
        //redirect to home
    com.example.a10120758utsmyself.HomeActivity.redirectActivity(this, com.example.a10120758utsmyself.HomeActivity.class);
        }
public void ClickGallery(View view){
        //redirect to gallery
    com.example.a10120758utsmyself.HomeActivity.redirectActivity(this, com.example.a10120758utsmyself.Gallery.class);
        }

public void ClickDaily(View view){
        //redirect to gallery
    com.example.a10120758utsmyself.HomeActivity.redirectActivity(this, com.example.a10120758utsmyself.Daily.class);
        }
public void ClickMusic(View view){

        //recreate
        recreate();
        }
public void ClickProfile(View view){
        //redirect to profile
    com.example.a10120758utsmyself.HomeActivity.redirectActivity(this, com.example.a10120758utsmyself.Profile.class);
        }
public void ClickLogout(View view){
        //close
    com.example.a10120758utsmyself.HomeActivity.logout(this);
        }

@Override
protected void onPause(){
        super.onPause();
        //close drawer
    com.example.a10120758utsmyself.HomeActivity.closeDrawer(drawerLayout);
        }
        }