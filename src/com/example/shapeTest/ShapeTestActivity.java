package com.example.shapeTest;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

public class ShapeTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Resources res = getResources( );
        Drawable shape = res. getDrawable( R.drawable.gradient_box );

        TextView tv = (TextView)findViewById( R.id.shapeTxtId );
        tv.setBackgroundDrawable(shape);
    }
}