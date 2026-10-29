package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: MyApplication */
public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    private w0 f582q;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        w0 w0Var = this.f582q;
        if (w0Var != null) {
            w0Var.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(w0 w0Var) {
        this.f582q = w0Var;
    }
}
