package com.ducat.sumit.hindiwriters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class about_writer extends AppCompatActivity {
    TextView name;
    ImageView photo;
    //EditText about;
    TextView about;
    String names[],abouts[];
    int pos;
    int[] list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_writer);
        name=findViewById(R.id.name);
        photo=findViewById(R.id.photo);
        about=findViewById(R.id.about);
        names=getResources().getStringArray(R.array.names);
        abouts=getResources().getStringArray(R.array.about);
       // about.setEnabled(false);

        list=new int[]{R.drawable.munsi,
                R.drawable.surya,
                R.drawable.rama,
                R.drawable.mahadevi,
                R.drawable.harivansh,
                R.drawable.kabir,
                R.drawable.yashpal,
                R.drawable.bhishma,
                R.drawable.bhagwati,
                R.drawable.tulsi};

        about.setMovementMethod(new ScrollingMovementMethod());
        Bundle b=getIntent().getExtras();
        pos=b.getInt("pos");
        name.setText(names[pos]);
        about.setText(abouts[pos]);
        photo.setImageDrawable(getResources().getDrawable(list[pos]));

    }
}
