package p3;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public abstract class c {
    private boolean A;
    private volatile f1 B;
    protected AtomicInteger C;

    /* renamed from: a, reason: collision with root package name */
    private int f25121a;

    /* renamed from: b, reason: collision with root package name */
    private long f25122b;

    /* renamed from: c, reason: collision with root package name */
    private long f25123c;

    /* renamed from: d, reason: collision with root package name */
    private int f25124d;

    /* renamed from: e, reason: collision with root package name */
    private long f25125e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f25126f;

    /* renamed from: g, reason: collision with root package name */
    q1 f25127g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f25128h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f25129i;

    /* renamed from: j, reason: collision with root package name */
    private final h f25130j;

    /* renamed from: k, reason: collision with root package name */
    private final k3.h f25131k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f25132l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f25133m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f25134n;

    /* renamed from: o, reason: collision with root package name */
    private l f25135o;

    /* renamed from: p, reason: collision with root package name */
    protected InterfaceC0119c f25136p;

    /* renamed from: q, reason: collision with root package name */
    private IInterface f25137q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f25138r;

    /* renamed from: s, reason: collision with root package name */
    private b1 f25139s;

    /* renamed from: t, reason: collision with root package name */
    private int f25140t;

    /* renamed from: u, reason: collision with root package name */
    private final a f25141u;

    /* renamed from: v, reason: collision with root package name */
    private final b f25142v;

    /* renamed from: w, reason: collision with root package name */
    private final int f25143w;

    /* renamed from: x, reason: collision with root package name */
    private final String f25144x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f25145y;

    /* renamed from: z, reason: collision with root package name */
    private k3.b f25146z;
    private static final k3.d[] E = new k3.d[0];
    public static final String[] D = {"service_esmobile", "service_googleme"};

    /* compiled from: MyApplication */
    public interface a {
        void O(int i7);

        void r0(Bundle bundle);
    }

    /* compiled from: MyApplication */
    public interface b {
        void a(k3.b bVar);
    }

    /* compiled from: MyApplication */
    /* renamed from: p3.c$c, reason: collision with other inner class name */
    public interface InterfaceC0119c {
        void b(k3.b bVar);
    }

    /* compiled from: MyApplication */
    protected class d implements InterfaceC0119c {
        public d() {
        }

        @Override // p3.c.InterfaceC0119c
        public final void b(k3.b bVar) {
            if (bVar.Q0()) {
                c cVar = c.this;
                cVar.k(null, cVar.H());
            } else if (c.this.f25142v != null) {
                c.this.f25142v.a(bVar);
            }
        }
    }

    /* compiled from: MyApplication */
    public interface e {
        void a1();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected c(android.content.Context r10, android.os.Looper r11, int r12, p3.c.a r13, p3.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            p3.h r3 = p3.h.a(r10)
            k3.h r4 = k3.h.h()
            p3.o.m(r13)
            p3.o.m(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.c.<init>(android.content.Context, android.os.Looper, int, p3.c$a, p3.c$b, java.lang.String):void");
    }

    static /* bridge */ /* synthetic */ void h0(c cVar, f1 f1Var) {
        cVar.B = f1Var;
        if (cVar.X()) {
            p3.e eVar = f1Var.f25187t;
            p.b().c(eVar == null ? null : eVar.R0());
        }
    }

    static /* bridge */ /* synthetic */ void i0(c cVar, int i7) {
        int i8;
        int i9;
        synchronized (cVar.f25133m) {
            i8 = cVar.f25140t;
        }
        if (i8 == 3) {
            cVar.A = true;
            i9 = 5;
        } else {
            i9 = 4;
        }
        Handler handler = cVar.f25132l;
        handler.sendMessage(handler.obtainMessage(i9, cVar.C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean l0(c cVar, int i7, int i8, IInterface iInterface) {
        synchronized (cVar.f25133m) {
            try {
                if (cVar.f25140t != i7) {
                    return false;
                }
                cVar.n0(i8, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean m0(c cVar) {
        if (cVar.A || TextUtils.isEmpty(cVar.J()) || TextUtils.isEmpty(cVar.G())) {
            return false;
        }
        try {
            Class.forName(cVar.J());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(int i7, IInterface iInterface) {
        q1 q1Var;
        o.a((i7 == 4) == (iInterface != null));
        synchronized (this.f25133m) {
            try {
                this.f25140t = i7;
                this.f25137q = iInterface;
                Bundle bundle = null;
                if (i7 == 1) {
                    b1 b1Var = this.f25139s;
                    if (b1Var != null) {
                        h hVar = this.f25130j;
                        String b8 = this.f25127g.b();
                        o.m(b8);
                        hVar.e(b8, this.f25127g.a(), 4225, b1Var, c0(), this.f25127g.c());
                        this.f25139s = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    b1 b1Var2 = this.f25139s;
                    if (b1Var2 != null && (q1Var = this.f25127g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + q1Var.b() + " on " + q1Var.a());
                        h hVar2 = this.f25130j;
                        String b9 = this.f25127g.b();
                        o.m(b9);
                        hVar2.e(b9, this.f25127g.a(), 4225, b1Var2, c0(), this.f25127g.c());
                        this.C.incrementAndGet();
                    }
                    b1 b1Var3 = new b1(this, this.C.get());
                    this.f25139s = b1Var3;
                    q1 q1Var2 = (this.f25140t != 3 || G() == null) ? new q1(L(), K(), false, 4225, N()) : new q1(D().getPackageName(), G(), true, 4225, false);
                    this.f25127g = q1Var2;
                    if (q1Var2.c() && o() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f25127g.b())));
                    }
                    h hVar3 = this.f25130j;
                    String b10 = this.f25127g.b();
                    o.m(b10);
                    k3.b c8 = hVar3.c(new j1(b10, this.f25127g.a(), 4225, this.f25127g.c()), b1Var3, c0(), B());
                    if (!c8.Q0()) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f25127g.b() + " on " + this.f25127g.a());
                        int M0 = c8.M0() == -1 ? 16 : c8.M0();
                        if (c8.O0() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c8.O0());
                        }
                        j0(M0, bundle, this.C.get());
                    }
                } else if (i7 == 4) {
                    o.m(iInterface);
                    P(iInterface);
                }
            } finally {
            }
        }
    }

    public k3.d[] A() {
        return E;
    }

    protected Executor B() {
        return null;
    }

    public Bundle C() {
        return null;
    }

    public final Context D() {
        return this.f25128h;
    }

    public int E() {
        return this.f25143w;
    }

    protected Bundle F() {
        return new Bundle();
    }

    protected String G() {
        return null;
    }

    protected Set H() {
        return Collections.EMPTY_SET;
    }

    public final IInterface I() {
        IInterface iInterface;
        synchronized (this.f25133m) {
            try {
                if (this.f25140t == 5) {
                    throw new DeadObjectException();
                }
                w();
                iInterface = this.f25137q;
                o.n(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    protected abstract String J();

    protected abstract String K();

    protected String L() {
        return "com.google.android.gms";
    }

    public p3.e M() {
        f1 f1Var = this.B;
        if (f1Var == null) {
            return null;
        }
        return f1Var.f25187t;
    }

    protected boolean N() {
        return o() >= 211700000;
    }

    public boolean O() {
        return this.B != null;
    }

    protected void P(IInterface iInterface) {
        this.f25123c = System.currentTimeMillis();
    }

    protected void Q(k3.b bVar) {
        this.f25124d = bVar.M0();
        this.f25125e = System.currentTimeMillis();
    }

    protected void R(int i7) {
        this.f25121a = i7;
        this.f25122b = System.currentTimeMillis();
    }

    protected void S(int i7, IBinder iBinder, Bundle bundle, int i8) {
        this.f25132l.sendMessage(this.f25132l.obtainMessage(1, i8, -1, new c1(this, i7, iBinder, bundle)));
    }

    public boolean T() {
        return false;
    }

    public void U(String str) {
        this.f25145y = str;
    }

    public void V(int i7) {
        this.f25132l.sendMessage(this.f25132l.obtainMessage(6, this.C.get(), i7));
    }

    protected void W(InterfaceC0119c interfaceC0119c, int i7, PendingIntent pendingIntent) {
        o.n(interfaceC0119c, "Connection progress callbacks cannot be null.");
        this.f25136p = interfaceC0119c;
        this.f25132l.sendMessage(this.f25132l.obtainMessage(3, this.C.get(), i7, pendingIntent));
    }

    public boolean X() {
        return false;
    }

    public boolean a() {
        boolean z7;
        synchronized (this.f25133m) {
            z7 = this.f25140t == 4;
        }
        return z7;
    }

    public boolean b() {
        return false;
    }

    protected final String c0() {
        String str = this.f25144x;
        return str == null ? this.f25128h.getClass().getName() : str;
    }

    public void d(String str) {
        this.f25126f = str;
        h();
    }

    public void e(InterfaceC0119c interfaceC0119c) {
        o.n(interfaceC0119c, "Connection progress callbacks cannot be null.");
        this.f25136p = interfaceC0119c;
        n0(2, null);
    }

    public boolean f() {
        boolean z7;
        synchronized (this.f25133m) {
            int i7 = this.f25140t;
            z7 = true;
            if (i7 != 2 && i7 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    public String g() {
        q1 q1Var;
        if (!a() || (q1Var = this.f25127g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return q1Var.a();
    }

    public void h() {
        this.C.incrementAndGet();
        synchronized (this.f25138r) {
            try {
                int size = this.f25138r.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((z0) this.f25138r.get(i7)).d();
                }
                this.f25138r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f25134n) {
            this.f25135o = null;
        }
        n0(1, null);
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i7;
        IInterface iInterface;
        l lVar;
        synchronized (this.f25133m) {
            i7 = this.f25140t;
            iInterface = this.f25137q;
        }
        synchronized (this.f25134n) {
            lVar = this.f25135o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i7 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i7 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i7 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i7 == 4) {
            printWriter.print("CONNECTED");
        } else if (i7 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) J()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (lVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(lVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f25123c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j7 = this.f25123c;
            append.println(j7 + " " + simpleDateFormat.format(new Date(j7)));
        }
        if (this.f25122b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i8 = this.f25121a;
            if (i8 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i8 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i8 != 3) {
                printWriter.append((CharSequence) String.valueOf(i8));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j8 = this.f25122b;
            append2.println(j8 + " " + simpleDateFormat.format(new Date(j8)));
        }
        if (this.f25125e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) l3.c.a(this.f25124d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j9 = this.f25125e;
            append3.println(j9 + " " + simpleDateFormat.format(new Date(j9)));
        }
    }

    protected final void j0(int i7, Bundle bundle, int i8) {
        this.f25132l.sendMessage(this.f25132l.obtainMessage(7, i8, -1, new d1(this, i7, bundle)));
    }

    public void k(j jVar, Set set) {
        Bundle F = F();
        String str = Build.VERSION.SDK_INT < 31 ? this.f25145y : this.f25145y;
        int i7 = this.f25143w;
        int i8 = k3.h.f24498a;
        Scope[] scopeArr = f.E;
        Bundle bundle = new Bundle();
        k3.d[] dVarArr = f.F;
        f fVar = new f(6, i7, i8, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        fVar.f25177t = this.f25128h.getPackageName();
        fVar.f25180w = F;
        if (set != null) {
            fVar.f25179v = (Scope[]) set.toArray(new Scope[0]);
        }
        if (t()) {
            Account z7 = z();
            if (z7 == null) {
                z7 = new Account("<<default account>>", "com.google");
            }
            fVar.f25181x = z7;
            if (jVar != null) {
                fVar.f25178u = jVar.asBinder();
            }
        } else if (T()) {
            fVar.f25181x = z();
        }
        fVar.f25182y = E;
        fVar.f25183z = A();
        if (X()) {
            fVar.C = true;
        }
        try {
            synchronized (this.f25134n) {
                try {
                    l lVar = this.f25135o;
                    if (lVar != null) {
                        lVar.C3(new a1(this, this.C.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            V(3);
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            S(8, null, null, this.C.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            S(8, null, null, this.C.get());
        }
    }

    public void l(e eVar) {
        eVar.a1();
    }

    public boolean m() {
        return true;
    }

    public int o() {
        return k3.h.f24498a;
    }

    public final k3.d[] p() {
        f1 f1Var = this.B;
        if (f1Var == null) {
            return null;
        }
        return f1Var.f25185r;
    }

    public String r() {
        return this.f25126f;
    }

    public Intent s() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean t() {
        return false;
    }

    public void v() {
        int j7 = this.f25131k.j(this.f25128h, o());
        if (j7 == 0) {
            e(new d());
        } else {
            n0(1, null);
            W(new d(), j7, null);
        }
    }

    protected final void w() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface x(IBinder iBinder);

    protected boolean y() {
        return false;
    }

    public Account z() {
        return null;
    }

    protected c(Context context, Looper looper, h hVar, k3.h hVar2, int i7, a aVar, b bVar, String str) {
        this.f25126f = null;
        this.f25133m = new Object();
        this.f25134n = new Object();
        this.f25138r = new ArrayList();
        this.f25140t = 1;
        this.f25146z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        o.n(context, "Context must not be null");
        this.f25128h = context;
        o.n(looper, "Looper must not be null");
        this.f25129i = looper;
        o.n(hVar, "Supervisor must not be null");
        this.f25130j = hVar;
        o.n(hVar2, "API availability must not be null");
        this.f25131k = hVar2;
        this.f25132l = new y0(this, looper);
        this.f25143w = i7;
        this.f25141u = aVar;
        this.f25142v = bVar;
        this.f25144x = str;
    }
}
