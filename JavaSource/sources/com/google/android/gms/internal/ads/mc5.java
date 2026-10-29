package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: MyApplication */
final class mc5 extends xk4 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f12200k = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f12201d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12202e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f12203f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f12204g;

    /* renamed from: h, reason: collision with root package name */
    private final az[] f12205h;

    /* renamed from: i, reason: collision with root package name */
    private final Object[] f12206i;

    /* renamed from: j, reason: collision with root package name */
    private final HashMap f12207j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mc5(java.util.Collection r7, com.google.android.gms.internal.ads.tr5 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.az[] r0 = new com.google.android.gms.internal.ads.az[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.tb5 r4 = (com.google.android.gms.internal.ads.tb5) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.az r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.tb5 r3 = (com.google.android.gms.internal.ads.tb5) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mc5.<init>(java.util.Collection, com.google.android.gms.internal.ads.tr5):void");
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int a() {
        return this.f12201d;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int c() {
        return this.f12202e;
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final int p(int i7) {
        return hi2.I(this.f12203f, i7 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final int q(int i7) {
        return hi2.I(this.f12204g, i7 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final int r(Object obj) {
        Integer num = (Integer) this.f12207j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final az s(int i7) {
        return this.f12205h[i7];
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final int t(int i7) {
        return this.f12203f[i7];
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final int u(int i7) {
        return this.f12204g[i7];
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final Object v(int i7) {
        return this.f12206i[i7];
    }

    final List y() {
        return Arrays.asList(this.f12205h);
    }

    public final mc5 z(tr5 tr5Var) {
        az[] azVarArr = this.f12205h;
        az[] azVarArr2 = new az[azVarArr.length];
        for (int i7 = 0; i7 < azVarArr.length; i7++) {
            azVarArr2[i7] = new lc5(this, azVarArr[i7]);
        }
        return new mc5(azVarArr2, this.f12206i, tr5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private mc5(az[] azVarArr, Object[] objArr, tr5 tr5Var) {
        super(false, tr5Var);
        int i7 = 0;
        this.f12205h = azVarArr;
        int length = azVarArr.length;
        this.f12203f = new int[length];
        this.f12204g = new int[length];
        this.f12206i = objArr;
        this.f12207j = new HashMap();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < azVarArr.length) {
            az azVar = azVarArr[i7];
            this.f12205h[i10] = azVar;
            this.f12204g[i10] = i8;
            this.f12203f[i10] = i9;
            i8 += azVar.a();
            i9 += this.f12205h[i10].c();
            this.f12207j.put(objArr[i10], Integer.valueOf(i10));
            i7++;
            i10++;
        }
        this.f12201d = i8;
        this.f12202e = i9;
    }
}
