package c6;

import android.graphics.Bitmap;
import android.net.Uri;
import c6.t;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class w {

    /* renamed from: s, reason: collision with root package name */
    private static final long f3715s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    int f3716a;

    /* renamed from: b, reason: collision with root package name */
    long f3717b;

    /* renamed from: c, reason: collision with root package name */
    int f3718c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f3719d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3720e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3721f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3722g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3723h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3724i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3725j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3726k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3727l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3728m;

    /* renamed from: n, reason: collision with root package name */
    public final float f3729n;

    /* renamed from: o, reason: collision with root package name */
    public final float f3730o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3731p;

    /* renamed from: q, reason: collision with root package name */
    public final Bitmap.Config f3732q;

    /* renamed from: r, reason: collision with root package name */
    public final t.f f3733r;

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f3734a;

        /* renamed from: b, reason: collision with root package name */
        private int f3735b;

        /* renamed from: c, reason: collision with root package name */
        private String f3736c;

        /* renamed from: d, reason: collision with root package name */
        private int f3737d;

        /* renamed from: e, reason: collision with root package name */
        private int f3738e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3739f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f3740g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f3741h;

        /* renamed from: i, reason: collision with root package name */
        private float f3742i;

        /* renamed from: j, reason: collision with root package name */
        private float f3743j;

        /* renamed from: k, reason: collision with root package name */
        private float f3744k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f3745l;

        /* renamed from: m, reason: collision with root package name */
        private List f3746m;

        /* renamed from: n, reason: collision with root package name */
        private Bitmap.Config f3747n;

        /* renamed from: o, reason: collision with root package name */
        private t.f f3748o;

        b(Uri uri, int i7, Bitmap.Config config) {
            this.f3734a = uri;
            this.f3735b = i7;
            this.f3747n = config;
        }

        public w a() {
            boolean z7 = this.f3740g;
            if (z7 && this.f3739f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f3739f && this.f3737d == 0 && this.f3738e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z7 && this.f3737d == 0 && this.f3738e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f3748o == null) {
                this.f3748o = t.f.NORMAL;
            }
            return new w(this.f3734a, this.f3735b, this.f3736c, this.f3746m, this.f3737d, this.f3738e, this.f3739f, this.f3740g, this.f3741h, this.f3742i, this.f3743j, this.f3744k, this.f3745l, this.f3747n, this.f3748o);
        }

        public b b() {
            if (this.f3740g) {
                throw new IllegalStateException("Center crop can not be used after calling centerInside");
            }
            this.f3739f = true;
            return this;
        }

        boolean c() {
            return (this.f3734a == null && this.f3735b == 0) ? false : true;
        }

        boolean d() {
            return (this.f3737d == 0 && this.f3738e == 0) ? false : true;
        }

        public b e(int i7, int i8) {
            if (i7 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i8 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i8 == 0 && i7 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f3737d = i7;
            this.f3738e = i8;
            return this;
        }
    }

    String a() {
        Uri uri = this.f3719d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f3720e);
    }

    boolean b() {
        return this.f3722g != null;
    }

    public boolean c() {
        return (this.f3723h == 0 && this.f3724i == 0) ? false : true;
    }

    String d() {
        long nanoTime = System.nanoTime() - this.f3717b;
        if (nanoTime > f3715s) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    boolean e() {
        return c() || this.f3728m != 0.0f;
    }

    boolean f() {
        return e() || b();
    }

    String g() {
        return "[R" + this.f3716a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i7 = this.f3720e;
        if (i7 > 0) {
            sb.append(i7);
        } else {
            sb.append(this.f3719d);
        }
        List list = this.f3722g;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f3722g.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                sb.append(' ');
                throw null;
            }
        }
        if (this.f3721f != null) {
            sb.append(" stableKey(");
            sb.append(this.f3721f);
            sb.append(')');
        }
        if (this.f3723h > 0) {
            sb.append(" resize(");
            sb.append(this.f3723h);
            sb.append(',');
            sb.append(this.f3724i);
            sb.append(')');
        }
        if (this.f3725j) {
            sb.append(" centerCrop");
        }
        if (this.f3726k) {
            sb.append(" centerInside");
        }
        if (this.f3728m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f3728m);
            if (this.f3731p) {
                sb.append(" @ ");
                sb.append(this.f3729n);
                sb.append(',');
                sb.append(this.f3730o);
            }
            sb.append(')');
        }
        if (this.f3732q != null) {
            sb.append(' ');
            sb.append(this.f3732q);
        }
        sb.append('}');
        return sb.toString();
    }

    private w(Uri uri, int i7, String str, List list, int i8, int i9, boolean z7, boolean z8, boolean z9, float f8, float f9, float f10, boolean z10, Bitmap.Config config, t.f fVar) {
        this.f3719d = uri;
        this.f3720e = i7;
        this.f3721f = str;
        if (list == null) {
            this.f3722g = null;
        } else {
            this.f3722g = Collections.unmodifiableList(list);
        }
        this.f3723h = i8;
        this.f3724i = i9;
        this.f3725j = z7;
        this.f3726k = z8;
        this.f3727l = z9;
        this.f3728m = f8;
        this.f3729n = f9;
        this.f3730o = f10;
        this.f3731p = z10;
        this.f3732q = config;
        this.f3733r = fVar;
    }
}
