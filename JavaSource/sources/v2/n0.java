package v2;

import android.content.Context;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.kg;
import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.uy;
import java.util.Map;

/* compiled from: MyApplication */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static hf f26800a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f26801b = new Object();

    public n0(Context context) {
        hf a8;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f26801b) {
            try {
                if (f26800a == null) {
                    uy.a(context);
                    if (!com.google.android.gms.common.util.d.a()) {
                        if (((Boolean) s2.b0.c().d(uy.Y4)).booleanValue()) {
                            a8 = z.b(context);
                            f26800a = a8;
                        }
                    }
                    a8 = kg.a(context, null);
                    f26800a = a8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a5.d a(String str) {
        im0 im0Var = new im0();
        f26800a.b(new m0(str, null, im0Var));
        return im0Var;
    }

    public final a5.d b(int i7, String str, Map map, byte[] bArr) {
        k0 k0Var = new k0(null);
        i0 i0Var = new i0(this, str, k0Var);
        w2.m mVar = new w2.m(null);
        j0 j0Var = new j0(this, i7, str, k0Var, i0Var, bArr, map, mVar);
        if (w2.m.j()) {
            try {
                mVar.b(str, "GET", j0Var.s(), j0Var.t());
            } catch (oe e8) {
                String message = e8.getMessage();
                int i8 = n1.f26802b;
                w2.p.f(message);
            }
        }
        f26800a.b(j0Var);
        return k0Var;
    }
}
