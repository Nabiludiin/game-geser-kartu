package s2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.f10;
import com.google.android.gms.internal.ads.r00;
import com.google.android.gms.internal.ads.uy;

/* compiled from: MyApplication */
abstract class y {

    /* renamed from: a, reason: collision with root package name */
    private static final o1 f26264a;

    static {
        o1 o1Var = null;
        try {
            Object newInstance = w.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                o1Var = queryLocalInterface instanceof o1 ? (o1) queryLocalInterface : new m1(iBinder);
            } else {
                w2.p.f("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            w2.p.f("Failed to instantiate ClientApi class.");
        }
        f26264a = o1Var;
    }

    y() {
    }

    private final Object e() {
        o1 o1Var = f26264a;
        if (o1Var == null) {
            w2.p.f("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return c(o1Var);
        } catch (RemoteException e8) {
            w2.p.g("Cannot invoke local loader using ClientApi class.", e8);
            return null;
        }
    }

    private final Object f() {
        try {
            return b();
        } catch (RemoteException e8) {
            w2.p.g("Cannot invoke remote loader.", e8);
            return null;
        }
    }

    protected abstract Object a();

    protected abstract Object b();

    protected abstract Object c(o1 o1Var);

    public final Object d(Context context, boolean z7) {
        boolean z8;
        Object e8;
        if (!z7) {
            z.a();
            if (!w2.g.A(context, k3.k.f24503a)) {
                w2.p.a("Google Play Services is not available.");
                z7 = true;
            }
        }
        boolean z9 = false;
        boolean z10 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        uy.a(context);
        if (((Boolean) r00.f14687a.e()).booleanValue()) {
            z8 = false;
        } else if (((Boolean) r00.f14688b.e()).booleanValue()) {
            z8 = true;
            z9 = true;
        } else {
            z9 = z7 | z10;
            z8 = false;
        }
        if (z9) {
            e8 = e();
            if (e8 == null && !z8) {
                e8 = f();
            }
        } else {
            Object f8 = f();
            if (f8 == null) {
                if (z.e().nextInt(((Long) f10.f7955a.e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    z.a().q(context, z.d().f27051q, "gmob-apps", bundle, true);
                }
            }
            e8 = f8 == null ? e() : f8;
        }
        return e8 == null ? a() : e8;
    }
}
