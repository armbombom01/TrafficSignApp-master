package sdu.cs58.pichsinee.trafficesignapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutMeActivity extends AppCompatActivity {

    //Explicit
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    public void ClickBack(View view) {
    finish();
    }//end clickBack

    public void clickSound(View view) {
    if (mediaPlayer != null){ //ตรวจว่า pbj.mediaPlayer เล่นอยู่รึป่าว
        mediaPlayer.stop();// ทีมีให้หยุดเล่น
        mediaPlayer.release();// resource

    }
    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.lion);
    mediaPlayer.start();

    }//end play

    public void Clickfackbook(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/wattana.taoha.com"));
        startActivity(fbIntent);
    }//end face

    public void clikMoblie(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0644088481"));
        startActivity(mobileIntent);

    }//endMoblie


    public void ClickMap(View view) {
        String lat = "13.776171";
        String lng = "100.510746";
        String label = "มหาวิทยาลัยสวนดุสิต";

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:"+lat+","+lng+"("+label+")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        //mapIntent.setPackage("com.google.android.app.maps");//บังคับว่าลิ้งmapเปิดเฉพาะgoogle mapเท่านั้น และใช้testในgenyไม่ได้
        startActivity(mapIntent);
    }//endMap
}//end Class
