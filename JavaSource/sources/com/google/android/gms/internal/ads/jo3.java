package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* compiled from: MyApplication */
final class jo3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final Map f10677f;

    /* renamed from: g, reason: collision with root package name */
    private final jj3 f10678g;

    jo3(ak akVar, dn3 dn3Var, jj3 jj3Var, Map map, nu3 nu3Var) {
        super("lJ67yAwBUtoZhasVqN11g6g6opAmTxjVxzUKxhl0fOhTr4nQH4cVWV7NJy0RD49z", "0isRm8IoYsyXMQyBCJPbREn4r5FwCMP2Q3k9zoXRqyk=", akVar, dn3Var, nu3Var.a(122));
        this.f10677f = map;
        this.f10678g = jj3Var;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.f10677f;
        lArr[0] = (Long) ox3.a((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) ox3.a((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) ox3.a((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) ox3.a((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) ox3.a((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) ox3.a((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) ox3.a((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) ox3.a((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) ox3.a((Long) map.get("tst"), -1L);
        for (int i7 = 0; i7 < 9; i7++) {
            if (lArr[i7] == null) {
                lArr[i7] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.f10678g.ordinal()));
        lArr2.getClass();
        synchronized (akVar) {
            akVar.h0(lArr2[0].longValue());
            akVar.G0(lArr2[1].longValue());
            akVar.B0(lArr2[2].longValue());
            akVar.y0(lArr2[3].longValue());
            akVar.c0(lArr2[4].longValue());
            akVar.d0(lArr2[5].longValue());
            akVar.J(lArr2[6].longValue());
            akVar.K(lArr2[7].longValue());
        }
    }
}
