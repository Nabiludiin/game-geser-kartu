package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: MyApplication */
final class qn3 extends io3 {
    qn3(ak akVar, dn3 dn3Var, nu3 nu3Var) {
        super("dFQH+5qiD2PRdi0XHMSOoNm+a3fekCOGUzmH+eYRmk9bJvOb468Cs8O4aRQ5LdYP", "cV7R50f2/HQumOgCDB4L1ZcSwVOfPPdtbjhx11w36hE=", akVar, dn3Var, nu3Var.a(114));
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        synchronized (akVar) {
            akVar.e0("E");
            akVar.F(0L);
            akVar.Z("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (akVar) {
            akVar.e0((String) objArr[0]);
            akVar.F(((Long) objArr[1]).longValue());
            akVar.Z((String) objArr[2]);
        }
    }
}
