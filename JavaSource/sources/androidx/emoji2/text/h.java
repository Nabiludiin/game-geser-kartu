package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: MyApplication */
public abstract class h extends ReplacementSpan {

    /* renamed from: r, reason: collision with root package name */
    private final f f2056r;

    /* renamed from: q, reason: collision with root package name */
    private final Paint.FontMetricsInt f2055q = new Paint.FontMetricsInt();

    /* renamed from: s, reason: collision with root package name */
    private short f2057s = -1;

    /* renamed from: t, reason: collision with root package name */
    private short f2058t = -1;

    /* renamed from: u, reason: collision with root package name */
    private float f2059u = 1.0f;

    h(f fVar) {
        androidx.core.util.e.g(fVar, "metadata cannot be null");
        this.f2056r = fVar;
    }

    public final f a() {
        return this.f2056r;
    }

    final int b() {
        return this.f2057s;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2055q);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2055q;
        this.f2059u = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f2056r.e();
        this.f2058t = (short) (this.f2056r.e() * this.f2059u);
        short i9 = (short) (this.f2056r.i() * this.f2059u);
        this.f2057s = i9;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2055q;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i9;
    }
}
