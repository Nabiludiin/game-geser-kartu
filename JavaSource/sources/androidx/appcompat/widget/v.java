package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* compiled from: MyApplication */
public class v extends RatingBar {

    /* renamed from: q, reason: collision with root package name */
    private final t f895q;

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.D);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Bitmap b8 = this.f895q.b();
        if (b8 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b8.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }

    public v(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        n1.a(this, getContext());
        t tVar = new t(this);
        this.f895q = tVar;
        tVar.c(attributeSet, i7);
    }
}
