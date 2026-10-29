package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
final class qa {

    /* renamed from: d, reason: collision with root package name */
    private static final qa f21250d = new qa(true);

    /* renamed from: a, reason: collision with root package name */
    final qc f21251a = new mc();

    /* renamed from: b, reason: collision with root package name */
    private boolean f21252b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21253c;

    private qa() {
    }

    static void c(ha haVar, ed edVar, int i7, Object obj) {
        if (edVar == ed.B) {
            xb xbVar = (xb) obj;
            eb.d(xbVar);
            haVar.i(i7, 3);
            xbVar.d(haVar);
            haVar.i(i7, 4);
            return;
        }
        haVar.i(i7, edVar.d());
        fd fdVar = fd.INT;
        switch (edVar.ordinal()) {
            case 0:
                haVar.A(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                haVar.y(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                haVar.z(((Long) obj).longValue());
                break;
            case 3:
                haVar.z(((Long) obj).longValue());
                break;
            case 4:
                haVar.w(((Integer) obj).intValue());
                break;
            case 5:
                haVar.A(((Long) obj).longValue());
                break;
            case 6:
                haVar.y(((Integer) obj).intValue());
                break;
            case 7:
                haVar.v(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ca)) {
                    haVar.C((String) obj);
                    break;
                } else {
                    haVar.r((ca) obj);
                    break;
                }
            case 9:
                ((xb) obj).d(haVar);
                break;
            case 10:
                haVar.u((xb) obj);
                break;
            case 11:
                if (!(obj instanceof ca)) {
                    byte[] bArr = (byte[]) obj;
                    haVar.s(bArr, 0, bArr.length);
                    break;
                } else {
                    haVar.r((ca) obj);
                    break;
                }
            case 12:
                haVar.x(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof za)) {
                    haVar.w(((Integer) obj).intValue());
                    break;
                } else {
                    haVar.w(((za) obj).a());
                    break;
                }
            case 14:
                haVar.y(((Integer) obj).intValue());
                break;
            case 15:
                haVar.A(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                haVar.x((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                haVar.z((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    static int d(ed edVar, int i7, Object obj) {
        int E = ha.E(i7 << 3);
        if (edVar == ed.B) {
            eb.d((xb) obj);
            E += E;
        }
        return E + e(edVar, obj);
    }

    static int e(ed edVar, Object obj) {
        int g8;
        int E;
        ed edVar2 = ed.f20915s;
        fd fdVar = fd.INT;
        switch (edVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i7 = ha.f21005d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i8 = ha.f21005d;
                return 4;
            case 2:
                return ha.a(((Long) obj).longValue());
            case 3:
                return ha.a(((Long) obj).longValue());
            case 4:
                return ha.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i9 = ha.f21005d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i10 = ha.f21005d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i11 = ha.f21005d;
                return 1;
            case 8:
                if (!(obj instanceof ca)) {
                    return ha.b((String) obj);
                }
                int i12 = ha.f21005d;
                g8 = ((ca) obj).g();
                E = ha.E(g8);
                break;
            case 9:
                return ((xb) obj).a();
            case 10:
                return ha.c((xb) obj);
            case 11:
                if (!(obj instanceof ca)) {
                    int i13 = ha.f21005d;
                    g8 = ((byte[]) obj).length;
                    E = ha.E(g8);
                    break;
                } else {
                    int i14 = ha.f21005d;
                    g8 = ((ca) obj).g();
                    E = ha.E(g8);
                    break;
                }
            case 12:
                return ha.E(((Integer) obj).intValue());
            case 13:
                return obj instanceof za ? ha.a(((za) obj).a()) : ha.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i15 = ha.f21005d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i16 = ha.f21005d;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return ha.E((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return ha.a((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return E + g8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void f(com.google.android.gms.internal.measurement.pa r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.measurement.ed r0 = r4.b()
            byte[] r1 = com.google.android.gms.internal.measurement.eb.f20914b
            r5.getClass()
            com.google.android.gms.internal.measurement.ed r1 = com.google.android.gms.internal.measurement.ed.f20915s
            com.google.android.gms.internal.measurement.fd r1 = com.google.android.gms.internal.measurement.fd.INT
            com.google.android.gms.internal.measurement.fd r0 = r0.c()
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
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.xb
            if (r0 == 0) goto L44
            return
        L1e:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L26
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.za
            if (r0 == 0) goto L44
        L26:
            return
        L27:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.ca
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
            com.google.android.gms.internal.measurement.ed r4 = r4.b()
            com.google.android.gms.internal.measurement.fd r4 = r4.c()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.qa.f(com.google.android.gms.internal.measurement.pa, java.lang.Object):void");
    }

    public final void a() {
        if (this.f21252b) {
            return;
        }
        qc qcVar = this.f21251a;
        int c8 = qcVar.c();
        for (int i7 = 0; i7 < c8; i7++) {
            Object value = qcVar.d(i7).getValue();
            if (value instanceof xa) {
                ((xa) value).q();
            }
        }
        Iterator it = qcVar.e().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof xa) {
                ((xa) value2).q();
            }
        }
        qcVar.a();
        this.f21252b = true;
    }

    public final void b(pa paVar, Object obj) {
        if (!paVar.h()) {
            f(paVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = list.get(i7);
                f(paVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f21251a.put(paVar, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        qa qaVar = new qa();
        qc qcVar = this.f21251a;
        int c8 = qcVar.c();
        for (int i7 = 0; i7 < c8; i7++) {
            Map.Entry d8 = qcVar.d(i7);
            android.support.v4.media.session.b.a(((nc) d8).c());
            qaVar.b(null, d8.getValue());
        }
        for (Map.Entry entry : qcVar.e()) {
            android.support.v4.media.session.b.a(entry.getKey());
            qaVar.b(null, entry.getValue());
        }
        qaVar.f21253c = this.f21253c;
        return qaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qa) {
            return this.f21251a.equals(((qa) obj).f21251a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21251a.hashCode();
    }

    private qa(boolean z7) {
        a();
        a();
    }
}
