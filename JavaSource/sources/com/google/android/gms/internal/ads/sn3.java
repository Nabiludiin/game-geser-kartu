package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
final class sn3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f15725f;

    sn3(ak akVar, dn3 dn3Var, Context context, nu3 nu3Var) {
        super("BhNDAdNbKVCXLou3UwS6SQycA6O/T9ZMbr2NWffNFtsRs3WScUuYHsaYRJ0jHvCA", "oaC5CLMjwUmi/i48MFPdrATPzdM8HcSPBi81Io4IqyU=", akVar, dn3Var, nu3Var.a(115));
        this.f15725f = context;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        int i7 = 1;
        Object[] objArr = (Object[]) method.invoke("", this.f15725f);
        objArr.getClass();
        synchronized (akVar) {
            try {
                akVar.S(((Integer) objArr[0]).intValue());
                akVar.r0(((Integer) objArr[1]).intValue());
                akVar.s0(((Integer) objArr[2]).intValue());
                akVar.g0(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    akVar.k0(3);
                } else {
                    akVar.k0(true != bool.booleanValue() ? 1 : 2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    akVar.j0(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i7 = 2;
                    }
                    akVar.j0(i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
