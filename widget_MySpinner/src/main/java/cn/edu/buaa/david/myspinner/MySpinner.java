package cn.edu.buaa.david.myspinner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;

/**
 * Created by David on 2016/10/22.
 *
 * The Spinner can be custom using the following function in MySpinnerAdapter:
 *
 */

public class MySpinner extends Spinner {

    public MySpinner(Context context) {
        super(context);
    }

    public MySpinner(Context context, int mode) {
        super(context, mode);
    }

    public MySpinner(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setOnItemClickListener(OnItemClickListener l) {
        super.setOnItemClickListener(l);
    }
}
