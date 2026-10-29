package c6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import c6.t;
import c6.w;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public class x {

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f3749m = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    private final t f3750a;

    /* renamed from: b, reason: collision with root package name */
    private final w.b f3751b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3752c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3753d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3754e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f3755f;

    /* renamed from: g, reason: collision with root package name */
    private int f3756g;

    /* renamed from: h, reason: collision with root package name */
    private int f3757h;

    /* renamed from: i, reason: collision with root package name */
    private int f3758i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f3759j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f3760k;

    /* renamed from: l, reason: collision with root package name */
    private Object f3761l;

    x(t tVar, Uri uri, int i7) {
        if (tVar.f3682n) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f3750a = tVar;
        this.f3751b = new w.b(uri, i7, tVar.f3679k);
    }

    private w b(long j7) {
        int andIncrement = f3749m.getAndIncrement();
        w a8 = this.f3751b.a();
        a8.f3716a = andIncrement;
        a8.f3717b = j7;
        boolean z7 = this.f3750a.f3681m;
        if (z7) {
            e0.v("Main", "created", a8.g(), a8.toString());
        }
        w m7 = this.f3750a.m(a8);
        if (m7 != a8) {
            m7.f3716a = andIncrement;
            m7.f3717b = j7;
            if (z7) {
                e0.v("Main", "changed", m7.d(), "into " + m7);
            }
        }
        return m7;
    }

    private Drawable d() {
        return this.f3755f != 0 ? this.f3750a.f3672d.getResources().getDrawable(this.f3755f) : this.f3759j;
    }

    public x a() {
        this.f3751b.b();
        return this;
    }

    public x c() {
        this.f3753d = true;
        return this;
    }

    public void e(ImageView imageView) {
        f(imageView, null);
    }

    public void f(ImageView imageView, e eVar) {
        Bitmap j7;
        long nanoTime = System.nanoTime();
        e0.c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.f3751b.c()) {
            this.f3750a.c(imageView);
            if (this.f3754e) {
                u.d(imageView, d());
                return;
            }
            return;
        }
        if (this.f3753d) {
            if (this.f3751b.d()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.f3754e) {
                    u.d(imageView, d());
                }
                this.f3750a.e(imageView, new h(this, imageView, eVar));
                return;
            }
            this.f3751b.e(width, height);
        }
        w b8 = b(nanoTime);
        String h8 = e0.h(b8);
        if (!p.c(this.f3757h) || (j7 = this.f3750a.j(h8)) == null) {
            if (this.f3754e) {
                u.d(imageView, d());
            }
            this.f3750a.g(new l(this.f3750a, imageView, b8, this.f3757h, this.f3758i, this.f3756g, this.f3760k, h8, this.f3761l, eVar, this.f3752c));
            return;
        }
        this.f3750a.c(imageView);
        t tVar = this.f3750a;
        Context context = tVar.f3672d;
        t.e eVar2 = t.e.MEMORY;
        u.c(imageView, context, j7, eVar2, this.f3752c, tVar.f3680l);
        if (this.f3750a.f3681m) {
            e0.v("Main", "completed", b8.g(), "from " + eVar2);
        }
        if (eVar != null) {
            eVar.a();
        }
    }

    public x g(int i7, int i8) {
        this.f3751b.e(i7, i8);
        return this;
    }

    x h() {
        this.f3753d = false;
        return this;
    }
}
