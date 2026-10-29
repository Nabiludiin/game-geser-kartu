package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: MyApplication */
public class x extends SeekBar {

    /* renamed from: q, reason: collision with root package name */
    private final y f920q;

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.F);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f920q.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f920q.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f920q.g(canvas);
    }

    public x(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        n1.a(this, getContext());
        y yVar = new y(this);
        this.f920q = yVar;
        yVar.c(attributeSet, i7);
    }
}
