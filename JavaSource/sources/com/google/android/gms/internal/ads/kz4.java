package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
final class kz4 {

    /* renamed from: d, reason: collision with root package name */
    private static final kz4 f11305d = new kz4(true);

    /* renamed from: a, reason: collision with root package name */
    final u15 f11306a = new q15();

    /* renamed from: b, reason: collision with root package name */
    boolean f11307b;

    /* renamed from: c, reason: collision with root package name */
    boolean f11308c;

    private kz4() {
    }

    static void c(az4 az4Var, l25 l25Var, int i7, Object obj) {
        if (l25Var == l25.B) {
            az4Var.i(i7, 3);
            ((v05) obj).n(az4Var);
            az4Var.i(i7, 4);
            return;
        }
        az4Var.i(i7, l25Var.d());
        m25 m25Var = m25.INT;
        switch (l25Var.ordinal()) {
            case 0:
                az4Var.A(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                az4Var.y(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                az4Var.z(((Long) obj).longValue());
                break;
            case 3:
                az4Var.z(((Long) obj).longValue());
                break;
            case 4:
                az4Var.w(((Integer) obj).intValue());
                break;
            case 5:
                az4Var.A(((Long) obj).longValue());
                break;
            case 6:
                az4Var.y(((Integer) obj).intValue());
                break;
            case 7:
                az4Var.v(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof qy4)) {
                    az4Var.B((String) obj);
                    break;
                } else {
                    az4Var.s((qy4) obj);
                    break;
                }
            case 9:
                ((v05) obj).n(az4Var);
                break;
            case 10:
                az4Var.u((v05) obj);
                break;
            case 11:
                if (!(obj instanceof qy4)) {
                    byte[] bArr = (byte[]) obj;
                    az4Var.t(bArr, 0, bArr.length);
                    break;
                } else {
                    az4Var.s((qy4) obj);
                    break;
                }
            case 12:
                az4Var.x(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof uz4)) {
                    az4Var.w(((Integer) obj).intValue());
                    break;
                } else {
                    az4Var.w(((uz4) obj).a());
                    break;
                }
            case 14:
                az4Var.y(((Integer) obj).intValue());
                break;
            case 15:
                az4Var.A(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                az4Var.x((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                az4Var.z((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    static int d(l25 l25Var, int i7, Object obj) {
        int b8 = az4.b(i7 << 3);
        if (l25Var == l25.B) {
            b8 += b8;
        }
        return b8 + e(l25Var, obj);
    }

    static int e(l25 l25Var, Object obj) {
        int h8;
        int b8;
        l25 l25Var2 = l25.f11367s;
        m25 m25Var = m25.INT;
        switch (l25Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i7 = az4.f5414d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i8 = az4.f5414d;
                return 4;
            case 2:
                return az4.c(((Long) obj).longValue());
            case 3:
                return az4.c(((Long) obj).longValue());
            case 4:
                return az4.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i9 = az4.f5414d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i10 = az4.f5414d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i11 = az4.f5414d;
                return 1;
            case 8:
                if (!(obj instanceof qy4)) {
                    return az4.d((String) obj);
                }
                int i12 = az4.f5414d;
                h8 = ((qy4) obj).h();
                b8 = az4.b(h8);
                break;
            case 9:
                return ((v05) obj).m();
            case 10:
                return az4.e((v05) obj);
            case 11:
                if (!(obj instanceof qy4)) {
                    int i13 = az4.f5414d;
                    h8 = ((byte[]) obj).length;
                    b8 = az4.b(h8);
                    break;
                } else {
                    int i14 = az4.f5414d;
                    h8 = ((qy4) obj).h();
                    b8 = az4.b(h8);
                    break;
                }
            case 12:
                return az4.b(((Integer) obj).intValue());
            case 13:
                return obj instanceof uz4 ? az4.c(((uz4) obj).a()) : az4.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i15 = az4.f5414d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i16 = az4.f5414d;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return az4.b((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return az4.c((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return b8 + h8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void f(com.google.android.gms.internal.ads.jz4 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.l25 r0 = r4.b()
            byte[] r1 = com.google.android.gms.internal.ads.c05.f6204b
            r5.getClass()
            com.google.android.gms.internal.ads.l25 r1 = com.google.android.gms.internal.ads.l25.f11367s
            com.google.android.gms.internal.ads.m25 r1 = com.google.android.gms.internal.ads.m25.INT
            com.google.android.gms.internal.ads.m25 r0 = r0.c()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.v05
            if (r0 == 0) goto L44
            return
        L1e:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L26
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.uz4
            if (r0 == 0) goto L44
        L26:
            return
        L27:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.qy4
            if (r0 != 0) goto L2f
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L44
        L2f:
            return
        L30:
            boolean r0 = r5 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r5 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r5 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r5 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r5 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.ads.l25 r4 = r4.b()
            com.google.android.gms.internal.ads.m25 r4 = r4.c()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kz4.f(com.google.android.gms.internal.ads.jz4, java.lang.Object):void");
    }

    public final void a() {
        if (this.f11307b) {
            return;
        }
        u15 u15Var = this.f11306a;
        int c8 = u15Var.c();
        for (int i7 = 0; i7 < c8; i7++) {
            Object value = u15Var.d(i7).getValue();
            if (value instanceof sz4) {
                ((sz4) value).O();
            }
        }
        Iterator it = u15Var.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof sz4) {
                ((sz4) value2).O();
            }
        }
        u15Var.a();
        this.f11307b = true;
    }

    public final void b(jz4 jz4Var, Object obj) {
        if (!jz4Var.h()) {
            f(jz4Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = list.get(i7);
                f(jz4Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f11306a.put(jz4Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        kz4 kz4Var = new kz4();
        u15 u15Var = this.f11306a;
        int c8 = u15Var.c();
        for (int i7 = 0; i7 < c8; i7++) {
            Map.Entry d8 = u15Var.d(i7);
            android.support.v4.media.session.b.a(((r15) d8).c());
            kz4Var.b(null, d8.getValue());
        }
        for (Map.Entry entry : u15Var.e()) {
            android.support.v4.media.session.b.a(entry.getKey());
            kz4Var.b(null, entry.getValue());
        }
        kz4Var.f11308c = this.f11308c;
        return kz4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kz4) {
            return this.f11306a.equals(((kz4) obj).f11306a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11306a.hashCode();
    }

    private kz4(boolean z7) {
        a();
        a();
    }
}
