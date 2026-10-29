package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public abstract class qu2 implements n85 {
    public static bs2 a(Context context, cl0 cl0Var, dl0 dl0Var, Object obj, gt2 gt2Var, au2 au2Var, h85 h85Var, h85 h85Var2, h85 h85Var3, h85 h85Var4, h85 h85Var5, h85 h85Var6, h85 h85Var7, Executor executor, b63 b63Var, rx1 rx1Var) {
        HashSet hashSet = new HashSet();
        hashSet.add((tt2) obj);
        hashSet.add(gt2Var);
        hashSet.add(au2Var);
        if (((Boolean) s2.b0.c().d(uy.f17196r6)).booleanValue()) {
            hashSet.add((yr2) h85Var.b());
        }
        if (((Boolean) s2.b0.c().d(uy.f17204s6)).booleanValue()) {
            hashSet.add((yr2) h85Var2.b());
        }
        if (((Boolean) s2.b0.c().d(uy.f17220u6)).booleanValue()) {
            hashSet.add((yr2) h85Var4.b());
        }
        if (((Boolean) s2.b0.c().d(uy.f17228v6)).booleanValue()) {
            hashSet.add((yr2) h85Var5.b());
        }
        if (((Boolean) s2.b0.c().d(uy.f17257z3)).booleanValue()) {
            hashSet.add((yr2) h85Var7.b());
        }
        return new bs2(context, executor, hashSet, b63Var, rx1Var);
    }
}
