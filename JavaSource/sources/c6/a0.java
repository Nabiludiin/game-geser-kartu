package c6;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* compiled from: MyApplication */
class a0 {

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f3555a;

    /* renamed from: b, reason: collision with root package name */
    final d f3556b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f3557c;

    /* renamed from: d, reason: collision with root package name */
    long f3558d;

    /* renamed from: e, reason: collision with root package name */
    long f3559e;

    /* renamed from: f, reason: collision with root package name */
    long f3560f;

    /* renamed from: g, reason: collision with root package name */
    long f3561g;

    /* renamed from: h, reason: collision with root package name */
    long f3562h;

    /* renamed from: i, reason: collision with root package name */
    long f3563i;

    /* renamed from: j, reason: collision with root package name */
    long f3564j;

    /* renamed from: k, reason: collision with root package name */
    long f3565k;

    /* renamed from: l, reason: collision with root package name */
    int f3566l;

    /* renamed from: m, reason: collision with root package name */
    int f3567m;

    /* renamed from: n, reason: collision with root package name */
    int f3568n;

    /* compiled from: MyApplication */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final a0 f3569a;

        /* compiled from: MyApplication */
        /* renamed from: c6.a0$a$a, reason: collision with other inner class name */
        class RunnableC0068a implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Message f3570q;

            RunnableC0068a(Message message) {
                this.f3570q = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f3570q.what);
            }
        }

        public a(Looper looper, a0 a0Var) {
            super(looper);
            this.f3569a = a0Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 0) {
                this.f3569a.j();
                return;
            }
            if (i7 == 1) {
                this.f3569a.k();
                return;
            }
            if (i7 == 2) {
                this.f3569a.h(message.arg1);
                return;
            }
            if (i7 == 3) {
                this.f3569a.i(message.arg1);
            } else if (i7 != 4) {
                t.f3667o.post(new RunnableC0068a(message));
            } else {
                this.f3569a.l((Long) message.obj);
            }
        }
    }

    a0(d dVar) {
        this.f3556b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f3555a = handlerThread;
        handlerThread.start();
        e0.j(handlerThread.getLooper());
        this.f3557c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i7, long j7) {
        return j7 / i7;
    }

    private void m(Bitmap bitmap, int i7) {
        int k7 = e0.k(bitmap);
        Handler handler = this.f3557c;
        handler.sendMessage(handler.obtainMessage(i7, k7, 0));
    }

    b0 a() {
        return new b0(this.f3556b.b(), this.f3556b.size(), this.f3558d, this.f3559e, this.f3560f, this.f3561g, this.f3562h, this.f3563i, this.f3564j, this.f3565k, this.f3566l, this.f3567m, this.f3568n, System.currentTimeMillis());
    }

    void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    void d() {
        this.f3557c.sendEmptyMessage(0);
    }

    void e() {
        this.f3557c.sendEmptyMessage(1);
    }

    void f(long j7) {
        Handler handler = this.f3557c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j7)));
    }

    void h(long j7) {
        int i7 = this.f3567m + 1;
        this.f3567m = i7;
        long j8 = this.f3561g + j7;
        this.f3561g = j8;
        this.f3564j = g(i7, j8);
    }

    void i(long j7) {
        this.f3568n++;
        long j8 = this.f3562h + j7;
        this.f3562h = j8;
        this.f3565k = g(this.f3567m, j8);
    }

    void j() {
        this.f3558d++;
    }

    void k() {
        this.f3559e++;
    }

    void l(Long l7) {
        this.f3566l++;
        long longValue = this.f3560f + l7.longValue();
        this.f3560f = longValue;
        this.f3563i = g(this.f3566l, longValue);
    }
}
