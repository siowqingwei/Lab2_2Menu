package my.edu.tarc.lab2_2menu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.time.LocalDate;

public class AboutUsActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void  visitTARC (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.tarc.edu.my"));
        if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }else{
            Log.d("Visit TARC","No able to handle intent.");
        }
    }

    public void showDial(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+ "012345678"));
        if(intent.resolveActivity(getPackageManager())!= null){
            startActivity(intent);
        }else{
            Toast.makeText(this,"No app to handle this action",Toast.LENGTH_SHORT).show();
        }
    }

    public void showMain(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }

    public void showSendTO(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+"Info@tarc.edu.my"));
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }else{
            Toast.makeText(this, "No app to handle this intent", Toast.LENGTH_SHORT).show();
        }
    }

}
