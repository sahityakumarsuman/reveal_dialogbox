package an.materialrevealdialog;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import an.materialrevealdialog.utils.FabTransform;
import an.materialrevealdialog.utils.MorphTransform;
import an.materialrevealdialog.utils.PasswordEntry;

/**
 * Created by sahitya on 30/8/17.
 */

public class DesignerNewsLogin extends Activity {


    private LinearLayout container;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_dialog);
        container = (LinearLayout) findViewById(R.id.container);

        if (!FabTransform.setup(this, container)) {
            MorphTransform.setup(this, container,
                    ContextCompat.getColor(this, R.color.background_light),
                    getResources().getDimensionPixelSize(R.dimen.corner_radius_dialog));
        }

    }
}
