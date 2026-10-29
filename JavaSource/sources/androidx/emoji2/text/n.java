package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: MyApplication */
public final class n extends h {

    /* renamed from: v, reason: collision with root package name */
    private static Paint f2085v;

    public n(f fVar) {
        super(fVar);
    }

    private static Paint c() {
        if (f2085v == null) {
            TextPaint textPaint = new TextPaint();
            f2085v = textPaint;
            textPaint.setColor(d.b().c());
            f2085v.setStyle(Paint.Style.FILL);
        }
        return f2085v;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f8, int i9, int i10, int i11, Paint paint) {
        Canvas canvas2;
        float f9;
        if (d.b().i()) {
            canvas2 = canvas;
            f9 = f8;
            canvas2.drawRect(f9, i9, f8 + b(), i11, c());
        } else {
            canvas2 = canvas;
            f9 = f8;
        }
        a().a(canvas2, f9, i10, paint);
    }
}
