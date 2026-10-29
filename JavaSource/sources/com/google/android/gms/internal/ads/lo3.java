package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: MyApplication */
final class lo3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final Map f11711f;

    /* renamed from: g, reason: collision with root package name */
    private final dn3 f11712g;

    /* renamed from: h, reason: collision with root package name */
    private final DisplayMetrics f11713h;

    lo3(ak akVar, dn3 dn3Var, Map map, DisplayMetrics displayMetrics, nu3 nu3Var) {
        super("gbI2a8ruQFsh7iJbKP5csiDrRqRaAG+o51RWglq6SF+q1HNUXOxpmDRR6GgQlE1Z", "C7gHksN/1NwyNvzCHdeBzJsOxB75cHtIeny2v2KpeXA=", akVar, dn3Var, nu3Var.a(123));
        this.f11712g = dn3Var;
        this.f11711f = map;
        this.f11713h = displayMetrics;
    }

    private static long b(double d8, DisplayMetrics displayMetrics) {
        return Math.round(d8 / displayMetrics.density);
    }

    private static boolean c(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        Map map = this.f11711f;
        Object obj = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.f11713h;
        Object[] objArr = (Object[]) method.invoke("", obj, displayMetrics);
        objArr.getClass();
        tk d02 = uk.d0();
        Object obj2 = objArr[0];
        if (obj2 != null && objArr[1] != null) {
            d02.E(((Long) obj2).longValue());
            d02.F(((Long) objArr[1]).longValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            d02.L(((Long) obj3).longValue());
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            d02.J(((Long) obj4).longValue());
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            d02.G(((Long) obj5).longValue());
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            d02.W(((Long) obj6).longValue() != 0 ? 2 : 1);
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            d02.N(((Long) obj7).longValue());
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            d02.M(((Long) obj8).longValue());
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            d02.X(((Long) obj9).longValue() != 0 ? 2 : 1);
        }
        synchronized (akVar) {
            try {
                Method h8 = this.f11712g.h("TJcXhplO1c7oeAIzyyjGCjnhXIAfNaFNWGhya9KHb9++zv8J1h9atpUrZL1Yjg6v", "v7ewhEi0QRfAHjcos6RExS5aIOB6pcbb0aW+P30gIsQ=");
                if (h8 == null) {
                    throw null;
                }
                Object[] objArr2 = (Object[]) h8.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
                if (objArr2 == null) {
                    throw null;
                }
                Object obj10 = objArr2[0];
                if (obj10 != null) {
                    akVar.v0(((Long) obj10).longValue());
                }
                Object obj11 = objArr2[1];
                if (obj11 != null) {
                    akVar.w0(((Long) obj11).longValue());
                }
                Object obj12 = objArr2[2];
                if (obj12 != null) {
                    akVar.x0(((Long) obj12).longValue());
                }
                Object obj13 = objArr2[3];
                if (obj13 != null) {
                    akVar.J0(((Long) obj13).longValue());
                }
                Object obj14 = objArr2[4];
                if (obj14 != null) {
                    akVar.K0(((Long) obj14).longValue());
                }
                ul3 ul3Var = (ul3) map.get("oe");
                if (ul3Var != null) {
                    long j7 = ul3Var.f16814a;
                    if (j7 > 0) {
                        akVar.N0(j7);
                    }
                    long j8 = ul3Var.f16815b;
                    if (j8 > 0) {
                        akVar.M0(j8);
                    }
                    long j9 = ul3Var.f16816c;
                    if (j9 > 0) {
                        akVar.L0(j9);
                    }
                    long j10 = ul3Var.f16817d;
                    if (j10 > 0) {
                        akVar.E(j10);
                    }
                }
                ul3 ul3Var2 = (ul3) map.get("oe");
                if (ul3Var2 != null && ul3Var2.f16814a != 0 && c(displayMetrics)) {
                    double d8 = ul3Var2.f16820g;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    d02.P(b(d8, displayMetrics));
                    d02.Q(b(ul3Var2.f16823j - ul3Var2.f16821h, displayMetrics));
                    d02.R(b(ul3Var2.f16824k - ul3Var2.f16822i, displayMetrics));
                    d02.U(b(ul3Var2.f16821h, displayMetrics));
                    d02.V(b(ul3Var2.f16822i, displayMetrics));
                    if (((MotionEvent) map.get("nv")) != null) {
                        long b8 = b(((ul3Var2.f16821h - ul3Var2.f16823j) + r5.getRawX()) - r5.getX(), displayMetrics);
                        if (b8 != 0) {
                            d02.S(b8);
                        }
                        long b9 = b(((ul3Var2.f16822i - ul3Var2.f16824k) + r5.getRawY()) - r5.getY(), displayMetrics);
                        if (b9 != 0) {
                            d02.T(b9);
                        }
                    }
                }
                akVar.N(d02);
                vl3[] vl3VarArr = (vl3[]) map.get("ro");
                if (vl3VarArr != null && c(displayMetrics)) {
                    for (int i7 = 0; i7 <= vl3VarArr.length - 2; i7++) {
                        vl3 vl3Var = vl3VarArr[i7];
                        tk d03 = uk.d0();
                        double d9 = vl3Var.f17667a;
                        if (displayMetrics == null) {
                            throw null;
                        }
                        d03.E(b(d9, displayMetrics));
                        d03.F(b(vl3Var.f17668b, displayMetrics));
                        akVar.O((uk) d03.A());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
