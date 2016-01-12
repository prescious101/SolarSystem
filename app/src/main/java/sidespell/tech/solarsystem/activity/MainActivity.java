package sidespell.tech.solarsystem.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import sidespell.tech.solarsystem.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner mSpin;
    ImageView imageView;
    int[] images = {R.mipmap.mercury,R.mipmap.venus,R.mipmap.earth,R.mipmap.mars,R.mipmap.jupiter,R.mipmap.saturn
                    ,R.mipmap.uranus,R.mipmap.neptune};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imageView = (ImageView) findViewById(R.id.image);
        mSpin = (Spinner) findViewById(R.id.spnPlanet);

        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.Planets,android.R.layout.simple_spinner_item);

        mSpin.setAdapter(adapter);
        //this.mSpin.setSelection(0);
        mSpin.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //ImageView mImg
        TextView mText = (TextView) view;
        if(images!=null) {
            imageView.setImageResource(images[position]);
            Toast.makeText(this, "You Selected " + mText.getText() + " the position in array index is " + position, Toast.LENGTH_LONG).show();
        }
        else
            Toast.makeText(this,"You Selected "+ mText.getText()+"position in index is"+position,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }






}
