package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
final class on3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final Map f13402f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f13403g;

    /* renamed from: h, reason: collision with root package name */
    private final jj3 f13404h;

    /* renamed from: i, reason: collision with root package name */
    private final long f13405i;

    /* renamed from: j, reason: collision with root package name */
    private final long f13406j;

    on3(ak akVar, dn3 dn3Var, Map map, Context context, jj3 jj3Var, li3 li3Var, nu3 nu3Var) {
        super("zRITP136LTX4rFLknKK5s+BdzyKXJ24gjaP1ECV594x04Hyj3q+IVU95/J2vSCm1", "E6K+C1ogZN29OFWU2j1wUPRhMI7Lv3qBcqHzi1vCWW4=", akVar, dn3Var, nu3Var.a(113));
        this.f13403g = context;
        this.f13402f = map;
        this.f13404h = jj3Var;
        this.f13405i = li3Var.p0();
        this.f13406j = li3Var.q0();
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        xk xkVar;
        Object[] objArr = (Object[]) method.invoke("", this.f13403g, Integer.valueOf(this.f13404h.ordinal()));
        objArr.getClass();
        String str = "E";
        try {
            a5.d dVar = (a5.d) this.f13402f.get("gs");
            if (dVar != null && ((Build.VERSION.SDK_INT < 31 || dVar.isDone()) && (xkVar = (xk) dVar.get(this.f13405i, TimeUnit.MILLISECONDS)) != null && xkVar.Z0().length() > 1)) {
                str = xkVar.Z0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str.equals("E")) {
            try {
                a5.d dVar2 = (a5.d) this.f13402f.get("ai");
                if (dVar2 != null) {
                    String str2 = (String) dVar2.get(this.f13406j, TimeUnit.MILLISECONDS);
                    if (!iy3.c(str2)) {
                        str = str2;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (akVar) {
            try {
                akVar.I0(((Long) objArr[0]).longValue());
                akVar.H0((String) objArr[1]);
                akVar.H((String) objArr[2]);
                akVar.I((String) objArr[3]);
                q34 g8 = q34.l().g();
                byte[] bArr = (byte[]) objArr[4];
                akVar.D0(g8.h(bArr, 0, bArr.length));
                akVar.C0(str);
                if (bool != null) {
                    akVar.n0(true != bool.booleanValue() ? 1 : 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
