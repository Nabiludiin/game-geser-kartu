package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public final class bo3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f5876f;

    bo3(ak akVar, dn3 dn3Var, Context context, nu3 nu3Var) {
        super("fPyGoeDuTUuDJV03GsNFpCGRO2J3Ui8HA6QvnuqOeQaxvLcgOY5Y2sf90BXpAioC", "znAIQ1vWTnsSA3nf0QmMCBs/bj4g6mmUyXonbfu9VUs=", akVar, dn3Var, nu3Var.a(119));
        this.f5876f = context;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        Object[] objArr = (Object[]) method.invoke("", this.f5876f);
        objArr.getClass();
        synchronized (akVar) {
            akVar.q0(((Long) objArr[0]).longValue());
            akVar.T(((Long) objArr[1]).longValue());
        }
    }
}
