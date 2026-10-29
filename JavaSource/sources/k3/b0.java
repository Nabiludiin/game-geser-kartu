package k3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import p3.s0;
import p3.t0;

/* compiled from: MyApplication */
abstract class b0 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile t0 f24471e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f24473g;

    /* renamed from: a, reason: collision with root package name */
    static final z f24467a = new t(x.r0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final z f24468b = new u(x.r0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final z f24469c = new v(x.r0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final z f24470d = new w(x.r0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f24472f = new Object();

    static k0 a(String str, x xVar, boolean z7, boolean z8) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, xVar, z7, z8);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static k0 b(String str, boolean z7, boolean z8, boolean z9) {
        return g(str, z7, false, false, true);
    }

    static /* synthetic */ String c(boolean z7, String str, x xVar) {
        String str2 = (z7 || !f(str, xVar, true, false).f24509a) ? "not allowed" : "debug cert rejected";
        MessageDigest b8 = com.google.android.gms.common.util.a.b("SHA-256");
        p3.o.m(b8);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.k.a(b8.digest(xVar.C1())), Boolean.valueOf(z7), "12451000.false");
    }

    static synchronized void d(Context context) {
        synchronized (b0.class) {
            if (f24473g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f24473g = context.getApplicationContext();
            }
        }
    }

    static boolean e() {
        boolean z7;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                z7 = f24471e.j();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            z7 = false;
        }
        return z7;
    }

    private static k0 f(final String str, final x xVar, final boolean z7, boolean z8) {
        try {
            h();
            p3.o.m(f24473g);
            try {
                return f24471e.I3(new g0(str, xVar, z7, z8), w3.b.C1(f24473g.getPackageManager())) ? k0.b() : new i0(new Callable() { // from class: k3.s
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return b0.c(z7, str, xVar);
                    }
                }, null);
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                return k0.d("module call", e8);
            }
        } catch (DynamiteModule.a e9) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            return k0.d("module init: ".concat(String.valueOf(e9.getMessage())), e9);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, w3.a] */
    private static k0 g(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        k0 d8;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            p3.o.m(f24473g);
            try {
                h();
                c0 c0Var = new c0(str, z7, false, w3.b.C1(f24473g), false, true);
                try {
                    e0 n22 = z10 ? f24471e.n2(c0Var) : f24471e.e1(c0Var);
                    if (n22.b()) {
                        d8 = k0.f(n22.N0());
                    } else {
                        String M0 = n22.M0();
                        PackageManager.NameNotFoundException nameNotFoundException = n22.O0() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (M0 == null) {
                            M0 = "error checking package certificate";
                        }
                        d8 = k0.g(n22.N0(), n22.O0(), M0, nameNotFoundException);
                    }
                } catch (RemoteException e8) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                    d8 = k0.d("module call", e8);
                }
            } catch (DynamiteModule.a e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                d8 = k0.d("module init: ".concat(String.valueOf(e9.getMessage())), e9);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d8;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static void h() {
        if (f24471e != null) {
            return;
        }
        p3.o.m(f24473g);
        synchronized (f24472f) {
            try {
                if (f24471e == null) {
                    f24471e = s0.O(DynamiteModule.e(f24473g, DynamiteModule.f4579f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
