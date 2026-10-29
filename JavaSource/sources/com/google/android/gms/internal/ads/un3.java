package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: MyApplication */
final class un3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final li3 f16843f;

    un3(ak akVar, dn3 dn3Var, li3 li3Var, nu3 nu3Var) {
        super("By5K9EmVfikEcCFMOZQd1jxZLLuKkdFWcNBLbmtQ/cGwaIFZzYRhON9QKnCD3h+X", "jO4sZLvDsqH0XT1pMychedS7fP8lDaqZlRwqYI2S90Y=", akVar, dn3Var, nu3Var.a(116));
        this.f16843f = li3Var;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        Object[] objArr = (Object[]) method.invoke("", this.f16843f.i0());
        objArr.getClass();
        synchronized (akVar) {
            akVar.p0((String) objArr[0]);
            akVar.f0((String) objArr[1]);
        }
    }
}
