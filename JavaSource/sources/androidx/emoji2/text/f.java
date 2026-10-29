package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: MyApplication */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f2036d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final int f2037a;

    /* renamed from: b, reason: collision with root package name */
    private final l f2038b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f2039c = 0;

    f(l lVar, int i7) {
        this.f2038b = lVar;
        this.f2037a = i7;
    }

    private i0.a g() {
        ThreadLocal threadLocal = f2036d;
        i0.a aVar = (i0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new i0.a();
            threadLocal.set(aVar);
        }
        this.f2038b.d().j(aVar, this.f2037a);
        return aVar;
    }

    public void a(Canvas canvas, float f8, float f9, Paint paint) {
        Typeface g8 = this.f2038b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g8);
        canvas.drawText(this.f2038b.c(), this.f2037a * 2, 2, f8, f9, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i7) {
        return g().h(i7);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f2039c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z7) {
        this.f2039c = z7 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c8 = c();
        for (int i7 = 0; i7 < c8; i7++) {
            sb.append(Integer.toHexString(b(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
