package k2;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import s2.g5;

/* compiled from: MyApplication */
public final class h {

    /* renamed from: i, reason: collision with root package name */
    public static final h f24400i = new h(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final h f24401j = new h(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final h f24402k = new h(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final h f24403l = new h(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final h f24404m = new h(300, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final h f24405n = new h(160, 600, "160x600_as");

    /* renamed from: o, reason: collision with root package name */
    public static final h f24406o = new h(-1, -2, "smart_banner");

    /* renamed from: p, reason: collision with root package name */
    public static final h f24407p = new h(-3, -4, "fluid");

    /* renamed from: q, reason: collision with root package name */
    public static final h f24408q = new h(0, 0, "invalid");

    /* renamed from: r, reason: collision with root package name */
    public static final h f24409r = new h(50, 50, "50x50_mb");

    /* renamed from: a, reason: collision with root package name */
    private final int f24410a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24411b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24412c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24413d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24414e;

    /* renamed from: f, reason: collision with root package name */
    private int f24415f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24416g;

    /* renamed from: h, reason: collision with root package name */
    private int f24417h;

    static {
        new h(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(int r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r5)
        La:
            r1 = -2
            if (r6 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L14:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r2 = r2 + 1
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 3
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "x"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "_as"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.<init>(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.h.<init>(int, int):void");
    }

    public int a() {
        return this.f24411b;
    }

    public int b(Context context) {
        int i7 = this.f24411b;
        if (i7 == -4 || i7 == -3) {
            return -1;
        }
        if (i7 == -2) {
            return g5.M0(context.getResources().getDisplayMetrics());
        }
        s2.z.a();
        return w2.g.c(context, i7);
    }

    public int c() {
        return this.f24410a;
    }

    public int d(Context context) {
        int i7 = this.f24410a;
        if (i7 == -3) {
            return -1;
        }
        if (i7 != -1) {
            s2.z.a();
            return w2.g.c(context, i7);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<g5> creator = g5.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean e() {
        return this.f24410a == -3 && this.f24411b == -4;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f24410a == hVar.f24410a && this.f24411b == hVar.f24411b && this.f24412c.equals(hVar.f24412c);
    }

    final boolean f() {
        return this.f24413d;
    }

    final boolean g() {
        return this.f24414e;
    }

    final void h(boolean z7) {
        this.f24414e = true;
    }

    public int hashCode() {
        return this.f24412c.hashCode();
    }

    final void i(int i7) {
        this.f24415f = i7;
    }

    final int j() {
        return this.f24415f;
    }

    final boolean k() {
        return this.f24416g;
    }

    final void l(boolean z7) {
        this.f24416g = true;
    }

    final int m() {
        return this.f24417h;
    }

    final void n(int i7) {
        this.f24417h = i7;
    }

    public String toString() {
        return this.f24412c;
    }

    h(int i7, int i8, String str) {
        if (i7 < 0 && i7 != -1 && i7 != -3) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 26);
            sb.append("Invalid width for AdSize: ");
            sb.append(i7);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i8 < 0 && i8 != -2 && i8 != -4) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 27);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i8);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f24410a = i7;
        this.f24411b = i8;
        this.f24412c = str;
    }
}
