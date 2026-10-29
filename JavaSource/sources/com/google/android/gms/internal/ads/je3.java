package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: MyApplication */
public final class je3 {

    /* renamed from: a, reason: collision with root package name */
    final me3 f10526a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f10527b;

    private je3(me3 me3Var) {
        this.f10526a = me3Var;
        this.f10527b = me3Var != null;
    }

    public static je3 b(Context context, String str, String str2) {
        me3 ke3Var;
        try {
            try {
                try {
                    IBinder d8 = DynamiteModule.e(context, DynamiteModule.f4575b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d8 == null) {
                        ke3Var = null;
                    } else {
                        IInterface queryLocalInterface = d8.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        ke3Var = queryLocalInterface instanceof me3 ? (me3) queryLocalInterface : new ke3(d8);
                    }
                    ke3Var.f7(w3.b.C1(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new je3(ke3Var);
                } catch (Exception e8) {
                    throw new ld3(e8);
                }
            } catch (Exception e9) {
                throw new ld3(e9);
            }
        } catch (RemoteException | ld3 | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new je3(new ne3());
        }
    }

    public static je3 c() {
        ne3 ne3Var = new ne3();
        Log.d("GASS", "Clearcut logging disabled");
        return new je3(ne3Var);
    }

    public final ie3 a(byte[] bArr) {
        return new ie3(this, bArr, null);
    }
}
