package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* compiled from: MyApplication */
public final class ee3 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f7583f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f7584a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f7585b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7586c;

    /* renamed from: d, reason: collision with root package name */
    private final kd3 f7587d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7588e;

    public ee3(Context context, mq mqVar, kd3 kd3Var, boolean z7) {
        this.f7588e = false;
        this.f7584a = context;
        this.f7586c = Integer.toString(mqVar.a());
        this.f7585b = context.getSharedPreferences("pcvmspf", 0);
        this.f7587d = kd3Var;
        this.f7588e = z7;
    }

    private final File e(String str) {
        return new File(new File(this.f7584a.getDir("pccache", 0), this.f7586c), str);
    }

    private final String f() {
        return "FBAMTD".concat(String.valueOf(this.f7586c));
    }

    private final String g() {
        return "LATMTD".concat(String.valueOf(this.f7586c));
    }

    private static String h(oq oqVar) {
        tq k02 = uq.k0();
        k02.E(oqVar.d0().d0());
        k02.F(oqVar.d0().e0());
        k02.H(oqVar.d0().g0());
        k02.I(oqVar.d0().h0());
        k02.G(oqVar.d0().f0());
        return com.google.android.gms.common.util.k.a(((uq) k02.A()).e());
    }

    private final void i(int i7, long j7) {
        this.f7587d.b(i7, j7);
    }

    private final void j(int i7, long j7, String str) {
        this.f7587d.c(i7, j7, str);
    }

    private final uq k(int i7) {
        String string = i7 == 1 ? this.f7585b.getString(g(), null) : this.f7585b.getString(f(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] c8 = com.google.android.gms.common.util.k.c(string);
            qy4 qy4Var = qy4.f14669r;
            return uq.j0(qy4.s(c8, 0, c8.length), this.f7588e ? ez4.a() : ez4.b());
        } catch (e05 unused) {
            return null;
        } catch (NullPointerException unused2) {
            i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean a(oq oqVar, de3 de3Var) {
        boolean z7;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f7583f) {
            try {
                uq k7 = k(1);
                String d02 = oqVar.d0().d0();
                if (k7 != null && k7.d0().equals(d02)) {
                    i(4014, currentTimeMillis);
                    return false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                File e8 = e(d02);
                if (e8.exists()) {
                    String str = true != e8.isDirectory() ? "0" : "1";
                    String str2 = true != e8.isFile() ? "0" : "1";
                    z7 = false;
                    StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    j(4023, currentTimeMillis2, sb.toString());
                    i(4015, currentTimeMillis2);
                } else {
                    z7 = false;
                    if (!e8.mkdirs()) {
                        j(4024, currentTimeMillis2, "cw:".concat(true != e8.canWrite() ? "0" : "1"));
                        i(4015, currentTimeMillis2);
                        return false;
                    }
                }
                File e9 = e(d02);
                File file = new File(e9, "pcam.jar");
                File file2 = new File(e9, "pcbc");
                if (!yd3.b(file, oqVar.e0().w())) {
                    i(4016, currentTimeMillis);
                    return z7;
                }
                if (!yd3.b(file2, oqVar.f0().w())) {
                    i(4017, currentTimeMillis);
                    return z7;
                }
                if (de3Var != null && !de3Var.a(file)) {
                    i(4018, currentTimeMillis);
                    yd3.e(e9);
                    return z7;
                }
                String h8 = h(oqVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.f7585b;
                String string = sharedPreferences.getString(g(), null);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(g(), h8);
                if (string != null) {
                    edit.putString(f(), string);
                }
                if (!edit.commit()) {
                    i(4019, currentTimeMillis3);
                    return z7;
                }
                HashSet hashSet = new HashSet();
                uq k8 = k(1);
                if (k8 != null) {
                    hashSet.add(k8.d0());
                }
                uq k9 = k(2);
                if (k9 != null) {
                    hashSet.add(k9.d0());
                }
                boolean z8 = z7;
                File[] listFiles = new File(this.f7584a.getDir("pccache", z8 ? 1 : 0), this.f7586c).listFiles();
                int length = listFiles.length;
                for (int i7 = z8 ? 1 : 0; i7 < length; i7++) {
                    File file3 = listFiles[i7];
                    if (!hashSet.contains(file3.getName())) {
                        yd3.e(file3);
                    }
                }
                i(5014, currentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(oq oqVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f7583f) {
            try {
                if (!yd3.b(new File(e(oqVar.d0().d0()), "pcbc"), oqVar.f0().w())) {
                    i(4020, currentTimeMillis);
                    return false;
                }
                String h8 = h(oqVar);
                SharedPreferences.Editor edit = this.f7585b.edit();
                edit.putString(g(), h8);
                boolean commit = edit.commit();
                if (commit) {
                    i(5015, currentTimeMillis);
                } else {
                    i(4021, currentTimeMillis);
                }
                return commit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wd3 c(int i7) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f7583f) {
            try {
                uq k7 = k(1);
                if (k7 == null) {
                    i(4022, currentTimeMillis);
                    return null;
                }
                File e8 = e(k7.d0());
                File file = new File(e8, "pcam.jar");
                if (!file.exists()) {
                    file = new File(e8, "pcam");
                }
                File file2 = new File(e8, "pcbc");
                File file3 = new File(e8, "pcopt");
                i(5016, currentTimeMillis);
                return new wd3(k7, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(int i7) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f7583f) {
            try {
                uq k7 = k(1);
                if (k7 == null) {
                    i(4025, currentTimeMillis);
                    return false;
                }
                File e8 = e(k7.d0());
                if (!new File(e8, "pcam.jar").exists()) {
                    i(4026, currentTimeMillis);
                    return false;
                }
                if (new File(e8, "pcbc").exists()) {
                    i(5019, currentTimeMillis);
                    return true;
                }
                i(4027, currentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
