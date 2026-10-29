package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: MyApplication */
public final class p5 extends a8 {

    /* renamed from: c, reason: collision with root package name */
    private char f22460c;

    /* renamed from: d, reason: collision with root package name */
    private long f22461d;

    /* renamed from: e, reason: collision with root package name */
    private String f22462e;

    /* renamed from: f, reason: collision with root package name */
    private final n5 f22463f;

    /* renamed from: g, reason: collision with root package name */
    private final n5 f22464g;

    /* renamed from: h, reason: collision with root package name */
    private final n5 f22465h;

    /* renamed from: i, reason: collision with root package name */
    private final n5 f22466i;

    /* renamed from: j, reason: collision with root package name */
    private final n5 f22467j;

    /* renamed from: k, reason: collision with root package name */
    private final n5 f22468k;

    /* renamed from: l, reason: collision with root package name */
    private final n5 f22469l;

    /* renamed from: m, reason: collision with root package name */
    private final n5 f22470m;

    /* renamed from: n, reason: collision with root package name */
    private final n5 f22471n;

    p5(w6 w6Var) {
        super(w6Var);
        this.f22460c = (char) 0;
        this.f22461d = -1L;
        this.f22463f = new n5(this, 6, false, false);
        this.f22464g = new n5(this, 6, true, false);
        this.f22465h = new n5(this, 6, false, true);
        this.f22466i = new n5(this, 5, false, false);
        this.f22467j = new n5(this, 5, true, false);
        this.f22468k = new n5(this, 5, false, true);
        this.f22469l = new n5(this, 4, false, false);
        this.f22470m = new n5(this, 3, false, false);
        this.f22471n = new n5(this, 2, false, false);
    }

    static String A(boolean z7, String str, Object obj, Object obj2, Object obj3) {
        String B = B(z7, obj);
        String B2 = B(z7, obj2);
        String B3 = B(z7, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(B2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(B2);
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    static String B(boolean z7, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i7 = 0;
        if (obj instanceof Long) {
            if (!z7) {
                return obj.toString();
            }
            Long l7 = (Long) obj;
            if (Math.abs(l7.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l7.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + length + 3 + str.length() + String.valueOf(round2).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof o5 ? ((o5) obj).a() : z7 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z7 ? th.getClass().getName() : th.toString());
        String C = C(w6.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        while (true) {
            if (i7 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(C)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i7++;
        }
        return sb2.toString();
    }

    static String C(String str) {
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, lastIndexOf);
    }

    protected static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new o5(str);
    }

    final /* synthetic */ char D() {
        return this.f22460c;
    }

    final /* synthetic */ void E(char c8) {
        this.f22460c = c8;
    }

    final /* synthetic */ long F() {
        return this.f22461d;
    }

    final /* synthetic */ void G(long j7) {
        this.f22461d = 133005L;
    }

    @Override // com.google.android.gms.measurement.internal.a8
    protected final boolean i() {
        return false;
    }

    public final n5 o() {
        return this.f22463f;
    }

    public final n5 p() {
        return this.f22464g;
    }

    public final n5 q() {
        return this.f22465h;
    }

    public final n5 r() {
        return this.f22466i;
    }

    public final n5 s() {
        return this.f22467j;
    }

    public final n5 t() {
        return this.f22468k;
    }

    public final n5 u() {
        return this.f22469l;
    }

    public final n5 v() {
        return this.f22470m;
    }

    public final n5 w() {
        return this.f22471n;
    }

    protected final void y(int i7, boolean z7, boolean z8, String str, Object obj, Object obj2, Object obj3) {
        if (!z7 && Log.isLoggable(z(), i7)) {
            Log.println(i7, z(), A(false, str, obj, obj2, obj3));
        }
        if (z8 || i7 < 5) {
            return;
        }
        p3.o.m(str);
        s6 A = this.f22928a.A();
        if (A == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!A.k()) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i7 >= 9) {
                i7 = 8;
            }
            A.t(new m5(this, i7, str, obj, obj2, obj3));
        }
    }

    protected final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f22462e == null) {
                    this.f22462e = this.f22928a.w().u();
                }
                p3.o.m(this.f22462e);
                str = this.f22462e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
