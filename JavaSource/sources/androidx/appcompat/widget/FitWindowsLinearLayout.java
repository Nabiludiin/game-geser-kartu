package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: MyApplication */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    private w0 f583q;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        w0 w0Var = this.f583q;
        if (w0Var != null) {
            w0Var.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(w0 w0Var) {
        this.f583q = w0Var;
    }
}
