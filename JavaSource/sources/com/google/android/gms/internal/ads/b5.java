package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
final class b5 extends d5 {

    /* renamed from: b, reason: collision with root package name */
    private long f5577b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f5578c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f5579d;

    public b5() {
        super(new h2());
        this.f5577b = -9223372036854775807L;
        this.f5578c = new long[0];
        this.f5579d = new long[0];
    }

    private static Double g(y82 y82Var) {
        return Double.valueOf(Double.longBitsToDouble(y82Var.d()));
    }

    private static String h(y82 y82Var) {
        int S = y82Var.S();
        int F = y82Var.F();
        y82Var.J(S);
        return new String(y82Var.H(), F, S);
    }

    private static HashMap i(y82 y82Var) {
        int h8 = y82Var.h();
        HashMap hashMap = new HashMap(h8);
        for (int i7 = 0; i7 < h8; i7++) {
            String h9 = h(y82Var);
            Object j7 = j(y82Var, y82Var.R());
            if (j7 != null) {
                hashMap.put(h9, j7);
            }
        }
        return hashMap;
    }

    private static Object j(y82 y82Var, int i7) {
        if (i7 == 0) {
            return g(y82Var);
        }
        if (i7 == 1) {
            return Boolean.valueOf(y82Var.R() == 1);
        }
        if (i7 == 2) {
            return h(y82Var);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return i(y82Var);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) g(y82Var).doubleValue());
                y82Var.J(2);
                return date;
            }
            int h8 = y82Var.h();
            ArrayList arrayList = new ArrayList(h8);
            for (int i8 = 0; i8 < h8; i8++) {
                Object j7 = j(y82Var, y82Var.R());
                if (j7 != null) {
                    arrayList.add(j7);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String h9 = h(y82Var);
            int R = y82Var.R();
            if (R == 9) {
                return hashMap;
            }
            Object j8 = j(y82Var, R);
            if (j8 != null) {
                hashMap.put(h9, j8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d5
    protected final boolean a(y82 y82Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d5
    protected final boolean b(y82 y82Var, long j7) {
        if (y82Var.R() == 2 && "onMetaData".equals(h(y82Var)) && y82Var.C() != 0 && y82Var.R() == 8) {
            HashMap i7 = i(y82Var);
            Object obj = i7.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f5577b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = i7.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f5578c = new long[size];
                    this.f5579d = new long[size];
                    for (int i8 = 0; i8 < size; i8++) {
                        Object obj5 = list.get(i8);
                        Object obj6 = list2.get(i8);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f5578c = new long[0];
                            this.f5579d = new long[0];
                            break;
                        }
                        this.f5578c[i8] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f5579d[i8] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.f5577b;
    }

    public final long[] e() {
        return this.f5578c;
    }

    public final long[] f() {
        return this.f5579d;
    }
}
