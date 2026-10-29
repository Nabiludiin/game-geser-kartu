package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public abstract class gu0 implements oy0 {

    /* renamed from: a, reason: collision with root package name */
    private static gu0 f9149a;

    private static synchronized gu0 h(Context context, kb0 kb0Var, int i7, boolean z7, int i8, pv0 pv0Var) {
        synchronized (gu0.class) {
            try {
                gu0 gu0Var = f9149a;
                if (gu0Var != null) {
                    return gu0Var;
                }
                long a8 = r2.t.o().a();
                uy.a(context);
                if (((Boolean) o00.f13125e.e()).booleanValue()) {
                    fy.a(context);
                }
                t13 a9 = t13.a(context);
                w2.a b8 = a9.b(ModuleDescriptor.MODULE_VERSION, false, i8);
                a9.c(kb0Var);
                fw0 fw0Var = new fw0(null);
                hu0 hu0Var = new hu0();
                hu0Var.a(b8);
                hu0Var.b(context);
                hu0Var.c(a8);
                fw0Var.a(new iu0(hu0Var, null));
                fw0Var.b(new dx0(pv0Var));
                gu0 c8 = fw0Var.c();
                if (((Boolean) s2.b0.c().d(uy.Fe)).booleanValue()) {
                    r2.t.i().a(z33.c(), c8.e());
                    r2.t.i().b();
                }
                ((h22) ((tv0) c8).f16438r.b()).a();
                ((zt0) ((tv0) c8).f16435q.b()).a(context, b8);
                r2.t.l().g(context, b8, c8.e());
                r2.t.n().a(context);
                r2.t.g().O(context);
                r2.t.g().P(context);
                v2.m1.a(context);
                r2.t.k().a(context);
                r2.t.a().a(context);
                if (((Boolean) s2.b0.c().d(uy.Ye)).booleanValue()) {
                    String str = (String) s2.b0.c().d(uy.Ze);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            c8.f().a(r2.t.k());
                        }
                    }
                } else {
                    if (((Boolean) s2.b0.c().d(uy.Xe)).booleanValue()) {
                        c8.f().a(r2.t.k());
                    }
                }
                ((v2.b1) ((tv0) c8).f16439r0.b()).a();
                kk0.b(context);
                if (((Boolean) s2.b0.c().d(uy.L6)).booleanValue()) {
                    if (!((Boolean) s2.b0.c().d(uy.P0)).booleanValue()) {
                        new j82(context, b8, new iu(new nu(context)), new n72(new j72(context), (z64) ((tv0) c8).f16405g.b())).a(r2.t.l().q().H());
                    }
                }
                if (((Boolean) s2.b0.c().d(uy.Re)).booleanValue()) {
                    c8.o().a();
                }
                f9149a = c8;
                return c8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static gu0 i(Context context, kb0 kb0Var, int i7) {
        return h(context, kb0Var, ModuleDescriptor.MODULE_VERSION, false, i7, new pv0());
    }

    public abstract b3.w A();

    public abstract b3.q1 B();

    public abstract i92 C();

    @Override // com.google.android.gms.internal.ads.oy0
    public final dl0 D() {
        return g();
    }

    public abstract w13 E();

    public abstract b12 F();

    public abstract e63 G();

    protected abstract dt2 H(iu2 iu2Var);

    @Override // com.google.android.gms.internal.ads.oy0
    public final dt2 a(eh0 eh0Var, int i7) {
        return H(new iu2(eh0Var, i7));
    }

    public abstract jz1 b();

    public abstract n13 c();

    public abstract z12 d();

    public abstract rx1 e();

    abstract wu1 f();

    public abstract dl0 g();

    public abstract Executor j();

    public abstract ScheduledExecutorService k();

    public abstract ed1 l();

    public abstract ox0 m();

    public abstract k83 n();

    public abstract q52 o();

    public abstract t52 p();

    public abstract m31 q();

    public abstract pw2 r();

    public abstract t11 s();

    public abstract av2 t();

    public abstract zk1 u();

    public abstract hy2 v();

    public abstract vl1 w();

    public abstract rt1 x();

    public abstract vz2 y();

    public abstract b3.d z();
}
