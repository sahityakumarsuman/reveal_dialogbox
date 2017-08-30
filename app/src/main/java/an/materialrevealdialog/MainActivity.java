package an.materialrevealdialog;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import an.materialrevealdialog.utils.FabTransform;

public class MainActivity extends AppCompatActivity {


    private ImageButton floatingViewImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingViewImageButton = (ImageButton) findViewById(R.id.fab);

        floatingViewImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DesignerNewsLogin.class);
                FabTransform.addExtras(intent,
                        ContextCompat.getColor(MainActivity.this, R.color.accent), R.drawable.corss_dark);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, floatingViewImageButton,
                        getString(R.string.loginDialog));
                startActivity(intent, options.toBundle());
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
