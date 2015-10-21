package naman14.faisal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.naman14.faisalcrush.Faisal;
import com.naman14.faisalcrush.FaisalBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FaisalBuilder builder = new FaisalBuilder();
        //set crush type (Exception or Error)
        builder.setCrushType(Faisal.CrushType.EXCEPTION);
        //set exception (runtime exceptions only)
        builder.setException(new NullPointerException());
        //set error
        builder.setError(new AbstractMethodError());
        //add stack trace elements
        builder.addStackTraceLement("MainActivity","onCreate","MainActivity.java",4);
        builder.addStackTraceLement("MainActivity","onCreate","MainActivity.java",14);
        builder.addStackTraceLement("MainActivity","onCreate","MainActivity.java",25);
        //crush it!
        builder.build().crush();


        //need to crush in one line?
        //Faisal.getInstance().crush();
    }

}
