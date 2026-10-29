package c6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import c6.j;
import c6.r;
import c6.t;
import c6.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
class c implements Runnable {
    private static final Object J = new Object();
    private static final ThreadLocal K = new a();
    private static final AtomicInteger L = new AtomicInteger();
    private static final y M = new b();
    c6.a A;
    List B;
    Bitmap C;
    Future D;
    t.e E;
    Exception F;
    int G;
    int H;
    t.f I;

    /* renamed from: q, reason: collision with root package name */
    final int f3588q = L.incrementAndGet();

    /* renamed from: r, reason: collision with root package name */
    final t f3589r;

    /* renamed from: s, reason: collision with root package name */
    final i f3590s;

    /* renamed from: t, reason: collision with root package name */
    final d f3591t;

    /* renamed from: u, reason: collision with root package name */
    final a0 f3592u;

    /* renamed from: v, reason: collision with root package name */
    final String f3593v;

    /* renamed from: w, reason: collision with root package name */
    final w f3594w;

    /* renamed from: x, reason: collision with root package name */
    final int f3595x;

    /* renamed from: y, reason: collision with root package name */
    int f3596y;

    /* renamed from: z, reason: collision with root package name */
    final y f3597z;

    /* compiled from: MyApplication */
    static class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* compiled from: MyApplication */
    static class b extends y {
        b() {
        }

        @Override // c6.y
        public boolean c(w wVar) {
            return true;
        }

        @Override // c6.y
        public y.a f(w wVar, int i7) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: c6.c$c, reason: collision with other inner class name */
    static class RunnableC0069c implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ RuntimeException f3598q;

        RunnableC0069c(c0 c0Var, RuntimeException runtimeException) {
            this.f3598q = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            new StringBuilder().append("Transformation ");
            throw null;
        }
    }

    c(t tVar, i iVar, d dVar, a0 a0Var, c6.a aVar, y yVar) {
        this.f3589r = tVar;
        this.f3590s = iVar;
        this.f3591t = dVar;
        this.f3592u = a0Var;
        this.A = aVar;
        this.f3593v = aVar.d();
        this.f3594w = aVar.i();
        this.I = aVar.h();
        this.f3595x = aVar.e();
        this.f3596y = aVar.f();
        this.f3597z = yVar;
        this.H = yVar.e();
    }

    static Bitmap a(List list, Bitmap bitmap) {
        if (list.size() <= 0) {
            return bitmap;
        }
        android.support.v4.media.session.b.a(list.get(0));
        try {
            throw null;
        } catch (RuntimeException e8) {
            t.f3667o.post(new RunnableC0069c(null, e8));
            return null;
        }
    }

    private t.f d() {
        t.f fVar = t.f.LOW;
        List list = this.B;
        boolean z7 = (list == null || list.isEmpty()) ? false : true;
        c6.a aVar = this.A;
        if (aVar == null && !z7) {
            return fVar;
        }
        if (aVar != null) {
            fVar = aVar.h();
        }
        if (z7) {
            int size = this.B.size();
            for (int i7 = 0; i7 < size; i7++) {
                t.f h8 = ((c6.a) this.B.get(i7)).h();
                if (h8.ordinal() > fVar.ordinal()) {
                    fVar = h8;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(InputStream inputStream, w wVar) {
        n nVar = new n(inputStream);
        long c8 = nVar.c(65536);
        BitmapFactory.Options d8 = y.d(wVar);
        boolean g8 = y.g(d8);
        boolean t7 = e0.t(nVar);
        nVar.a(c8);
        if (t7) {
            byte[] x7 = e0.x(nVar);
            if (g8) {
                BitmapFactory.decodeByteArray(x7, 0, x7.length, d8);
                y.b(wVar.f3723h, wVar.f3724i, d8, wVar);
            }
            return BitmapFactory.decodeByteArray(x7, 0, x7.length, d8);
        }
        if (g8) {
            BitmapFactory.decodeStream(nVar, null, d8);
            y.b(wVar.f3723h, wVar.f3724i, d8, wVar);
            nVar.a(c8);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(nVar, null, d8);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static c g(t tVar, i iVar, d dVar, a0 a0Var, c6.a aVar) {
        w i7 = aVar.i();
        List h8 = tVar.h();
        int size = h8.size();
        for (int i8 = 0; i8 < size; i8++) {
            y yVar = (y) h8.get(i8);
            if (yVar.c(i7)) {
                return new c(tVar, iVar, dVar, a0Var, aVar, yVar);
            }
        }
        return new c(tVar, iVar, dVar, a0Var, aVar, M);
    }

    private static boolean t(boolean z7, int i7, int i8, int i9, int i10) {
        return !z7 || i7 > i9 || i8 > i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.graphics.Bitmap w(c6.w r13, android.graphics.Bitmap r14, int r15) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.w(c6.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void x(w wVar) {
        String a8 = wVar.a();
        StringBuilder sb = (StringBuilder) K.get();
        sb.ensureCapacity(a8.length() + 8);
        sb.replace(8, sb.length(), a8);
        Thread.currentThread().setName(sb.toString());
    }

    void b(c6.a aVar) {
        boolean z7 = this.f3589r.f3681m;
        w wVar = aVar.f3543b;
        if (this.A == null) {
            this.A = aVar;
            if (z7) {
                List list = this.B;
                if (list == null || list.isEmpty()) {
                    e0.v("Hunter", "joined", wVar.d(), "to empty hunter");
                    return;
                } else {
                    e0.v("Hunter", "joined", wVar.d(), e0.m(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.B == null) {
            this.B = new ArrayList(3);
        }
        this.B.add(aVar);
        if (z7) {
            e0.v("Hunter", "joined", wVar.d(), e0.m(this, "to "));
        }
        t.f h8 = aVar.h();
        if (h8.ordinal() > this.I.ordinal()) {
            this.I = h8;
        }
    }

    boolean c() {
        List list;
        Future future;
        return this.A == null && ((list = this.B) == null || list.isEmpty()) && (future = this.D) != null && future.cancel(false);
    }

    void f(c6.a aVar) {
        boolean remove;
        if (this.A == aVar) {
            this.A = null;
            remove = true;
        } else {
            List list = this.B;
            remove = list != null ? list.remove(aVar) : false;
        }
        if (remove && aVar.h() == this.I) {
            this.I = d();
        }
        if (this.f3589r.f3681m) {
            e0.v("Hunter", "removed", aVar.f3543b.d(), e0.m(this, "from "));
        }
    }

    c6.a h() {
        return this.A;
    }

    List i() {
        return this.B;
    }

    w j() {
        return this.f3594w;
    }

    Exception k() {
        return this.F;
    }

    String l() {
        return this.f3593v;
    }

    t.e m() {
        return this.E;
    }

    int n() {
        return this.f3595x;
    }

    t o() {
        return this.f3589r;
    }

    t.f p() {
        return this.I;
    }

    Bitmap q() {
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:36:0x009a, B:38:0x00a2, B:41:0x00c4, B:43:0x00cc, B:45:0x00da, B:46:0x00e9, B:51:0x00a9, B:53:0x00b7), top: B:35:0x009a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.graphics.Bitmap r() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.r():android.graphics.Bitmap");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        try {
                            x(this.f3594w);
                            if (this.f3589r.f3681m) {
                                e0.u("Hunter", "executing", e0.l(this));
                            }
                            Bitmap r7 = r();
                            this.C = r7;
                            if (r7 == null) {
                                this.f3590s.e(this);
                            } else {
                                this.f3590s.d(this);
                            }
                            Thread.currentThread().setName("Picasso-Idle");
                        } catch (r.a e8) {
                            this.F = e8;
                            this.f3590s.g(this);
                            Thread.currentThread().setName("Picasso-Idle");
                        }
                    } catch (IOException e9) {
                        this.F = e9;
                        this.f3590s.g(this);
                        Thread.currentThread().setName("Picasso-Idle");
                    }
                } catch (j.b e10) {
                    if (!e10.f3633q || e10.f3634r != 504) {
                        this.F = e10;
                    }
                    this.f3590s.e(this);
                    Thread.currentThread().setName("Picasso-Idle");
                }
            } catch (Exception e11) {
                this.F = e11;
                this.f3590s.e(this);
                Thread.currentThread().setName("Picasso-Idle");
            } catch (OutOfMemoryError e12) {
                StringWriter stringWriter = new StringWriter();
                this.f3592u.a().a(new PrintWriter(stringWriter));
                this.F = new RuntimeException(stringWriter.toString(), e12);
                this.f3590s.e(this);
                Thread.currentThread().setName("Picasso-Idle");
            }
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    boolean s() {
        Future future = this.D;
        return future != null && future.isCancelled();
    }

    boolean u(boolean z7, NetworkInfo networkInfo) {
        int i7 = this.H;
        if (i7 <= 0) {
            return false;
        }
        this.H = i7 - 1;
        return this.f3597z.h(z7, networkInfo);
    }

    boolean v() {
        return this.f3597z.i();
    }
}
