package r2;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.aj;
import com.google.android.gms.internal.ads.bj;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.ee3;
import com.google.android.gms.internal.ads.jd3;
import com.google.android.gms.internal.ads.lc3;
import com.google.android.gms.internal.ads.p64;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.wm;
import com.google.android.gms.internal.ads.zm;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import s2.b0;
import s2.z;
import v2.f2;
import v2.n1;

/* compiled from: MyApplication */
public final class k implements Runnable, zm {
    private static final long F = System.currentTimeMillis();
    private w2.a A;
    private final w2.a B;
    private final boolean C;
    private int E;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f25804t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f25805u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f25806v;

    /* renamed from: w, reason: collision with root package name */
    private final Executor f25807w;

    /* renamed from: x, reason: collision with root package name */
    private final lc3 f25808x;

    /* renamed from: y, reason: collision with root package name */
    private Context f25809y;

    /* renamed from: z, reason: collision with root package name */
    private final Context f25810z;

    /* renamed from: q, reason: collision with root package name */
    private final List f25801q = new Vector();

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference f25802r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f25803s = new AtomicReference();
    final CountDownLatch D = new CountDownLatch(1);

    public k(Context context, w2.a aVar) {
        this.f25809y = context;
        this.f25810z = context;
        this.A = aVar;
        this.B = aVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f25807w = newCachedThreadPool;
        boolean booleanValue = ((Boolean) b0.c().d(uy.N2)).booleanValue();
        this.C = booleanValue;
        this.f25808x = lc3.a(context, newCachedThreadPool, booleanValue);
        this.f25805u = ((Boolean) b0.c().d(uy.K2)).booleanValue();
        this.f25806v = ((Boolean) b0.c().d(uy.O2)).booleanValue();
        if (((Boolean) b0.c().d(uy.M2)).booleanValue()) {
            this.E = 2;
        } else {
            this.E = 1;
        }
        if (!((Boolean) b0.c().d(uy.X3)).booleanValue()) {
            this.f25804t = d();
        }
        if (((Boolean) b0.c().d(uy.Q3)).booleanValue()) {
            cm0.f6500a.execute(this);
            return;
        }
        z.a();
        if (w2.g.C()) {
            cm0.f6500a.execute(this);
        } else {
            run();
        }
    }

    private final void q() {
        List<Object[]> list = this.f25801q;
        zm s7 = s();
        if (list.isEmpty() || s7 == null) {
            return;
        }
        for (Object[] objArr : list) {
            int length = objArr.length;
            if (length == 1) {
                s7.f((MotionEvent) objArr[0]);
            } else if (length == 3) {
                s7.e(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        list.clear();
    }

    private final void r(boolean z7) {
        String str = this.A.f27051q;
        Context t7 = t(this.f25809y);
        aj h02 = bj.h0();
        h02.F(z7);
        h02.E(str);
        this.f25802r.set(dn.x(t7, (bj) h02.A()));
    }

    private final zm s() {
        return p() == 2 ? (zm) this.f25803s.get() : (zm) this.f25802r.get();
    }

    private static final Context t(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final wm u(Context context, w2.a aVar, boolean z7, boolean z8) {
        aj h02 = bj.h0();
        h02.F(z7);
        h02.E(aVar.f27051q);
        return wm.a(t(context), (bj) h02.A(), z8);
    }

    public final boolean a() {
        try {
            this.D.await();
            return true;
        } catch (InterruptedException e8) {
            int i7 = n1.f26802b;
            w2.p.g("Interrupted during GADSignals creation.", e8);
            return false;
        }
    }

    public final String b(Context context, byte[] bArr) {
        zm s7;
        if (!a() || (s7 = s()) == null) {
            return "";
        }
        q();
        return s7.j(t(context));
    }

    public final String c() {
        int i7 = this.E;
        int i8 = i7 - 1;
        if (i7 != 0) {
            return i8 != 0 ? "2" : "1";
        }
        throw null;
    }

    protected final boolean d() {
        Context context = this.f25809y;
        h hVar = new h(this);
        lc3 lc3Var = this.f25808x;
        return new ee3(this.f25809y, jd3.b(context, lc3Var), hVar, ((Boolean) b0.c().d(uy.L2)).booleanValue()).d(1);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void e(int i7, int i8, int i9) {
        zm s7 = s();
        if (s7 == null) {
            this.f25801q.add(new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
        } else {
            q();
            s7.e(i7, i8, i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void f(MotionEvent motionEvent) {
        zm s7 = s();
        if (s7 == null) {
            this.f25801q.add(new Object[]{motionEvent});
        } else {
            q();
            s7.f(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String g(Context context, String str, View view, Activity activity) {
        if (!a()) {
            return "";
        }
        zm s7 = s();
        if (((Boolean) b0.c().d(uy.Ib)).booleanValue()) {
            t.g();
            f2.n(view, 4, null);
        }
        if (s7 == null) {
            return "";
        }
        q();
        return s7.g(t(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String h(final Context context) {
        try {
            return (String) p64.d(new Callable() { // from class: r2.j
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return k.this.b(context, null);
                }
            }, this.f25807w).get(((Integer) b0.c().d(uy.f17085e3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return sm.a(context, this.B.f27051q, F, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void i(StackTraceElement[] stackTraceElementArr) {
        zm s7;
        zm s8;
        if (((Boolean) b0.c().d(uy.f17145l3)).booleanValue()) {
            if (this.D.getCount() != 0 || (s8 = s()) == null) {
                return;
            }
            s8.i(stackTraceElementArr);
            return;
        }
        if (!a() || (s7 = s()) == null) {
            return;
        }
        s7.i(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String j(Context context) {
        return b(context, null);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void k(View view) {
        zm s7 = s();
        if (s7 != null) {
            s7.k(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String l(Context context, String str, View view) {
        return g(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String m(Context context, View view, Activity activity) {
        if (!((Boolean) b0.c().d(uy.Hb)).booleanValue()) {
            zm s7 = s();
            if (((Boolean) b0.c().d(uy.Ib)).booleanValue()) {
                t.g();
                f2.n(view, 2, null);
            }
            return s7 != null ? s7.m(context, view, activity) : "";
        }
        if (!a()) {
            return "";
        }
        zm s8 = s();
        if (((Boolean) b0.c().d(uy.Ib)).booleanValue()) {
            t.g();
            f2.n(view, 2, null);
        }
        return s8 != null ? s8.m(context, view, activity) : "";
    }

    final /* synthetic */ void n(boolean z7) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            u(this.f25810z, this.B, z7, this.C).d();
        } catch (NullPointerException e8) {
            this.f25808x.c(2027, System.currentTimeMillis() - currentTimeMillis, e8);
        }
    }

    final /* synthetic */ lc3 o() {
        return this.f25808x;
    }

    protected final int p() {
        if (!this.f25805u || this.f25804t) {
            return this.E;
        }
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) b0.c().d(uy.X3)).booleanValue()) {
                this.f25804t = d();
            }
            boolean z7 = this.A.f27054t;
            final boolean z8 = false;
            if (!((Boolean) b0.c().d(uy.f17167o1)).booleanValue() && z7) {
                z8 = true;
            }
            if (p() == 1) {
                r(z8);
                if (this.E == 2) {
                    this.f25807w.execute(new Runnable() { // from class: r2.i
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            k.this.n(z8);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    wm u7 = u(this.f25809y, this.A, z8, this.C);
                    this.f25803s.set(u7);
                    if (this.f25806v && !u7.b()) {
                        this.E = 1;
                        r(z8);
                    }
                } catch (NullPointerException e8) {
                    this.E = 1;
                    r(z8);
                    this.f25808x.c(2031, System.currentTimeMillis() - currentTimeMillis, e8);
                }
            }
            this.D.countDown();
            this.f25809y = null;
            this.A = null;
        } catch (Throwable th) {
            this.D.countDown();
            this.f25809y = null;
            this.A = null;
            throw th;
        }
    }
}
