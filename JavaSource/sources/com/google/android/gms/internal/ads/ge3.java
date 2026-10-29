package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: MyApplication */
public final class ge3 {

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap f8857h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f8858a;

    /* renamed from: b, reason: collision with root package name */
    private final he3 f8859b;

    /* renamed from: c, reason: collision with root package name */
    private final lc3 f8860c;

    /* renamed from: d, reason: collision with root package name */
    private final gc3 f8861d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8862e;

    /* renamed from: f, reason: collision with root package name */
    private vd3 f8863f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f8864g = new Object();

    public ge3(Context context, he3 he3Var, lc3 lc3Var, gc3 gc3Var, boolean z7) {
        this.f8858a = context;
        this.f8859b = he3Var;
        this.f8860c = lc3Var;
        this.f8861d = gc3Var;
        this.f8862e = z7;
    }

    private final synchronized Class d(wd3 wd3Var) {
        try {
            if (wd3Var.a() == null) {
                throw new fe3(4010, "mc");
            }
            String d02 = wd3Var.a().d0();
            HashMap hashMap = f8857h;
            Class cls = (Class) hashMap.get(d02);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.f8861d.a(wd3Var.b())) {
                    throw new fe3(2026, "VM did not pass signature verification");
                }
                try {
                    File c8 = wd3Var.c();
                    if (!c8.exists()) {
                        c8.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(wd3Var.b().getAbsolutePath(), c8.getAbsolutePath(), null, this.f8858a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(d02, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e8) {
                    e = e8;
                    throw new fe3(2008, e);
                } catch (IllegalArgumentException e9) {
                    e = e9;
                    throw new fe3(2008, e);
                } catch (SecurityException e10) {
                    e = e10;
                    throw new fe3(2008, e);
                }
            } catch (GeneralSecurityException e11) {
                throw new fe3(2026, e11);
            }
        } finally {
        }
    }

    public final boolean a(wd3 wd3Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                vd3 vd3Var = new vd3(d(wd3Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f8858a, "msa-r", wd3Var.d(), null, new Bundle(), 2), wd3Var, this.f8859b, this.f8860c, this.f8862e);
                if (!vd3Var.f()) {
                    throw new fe3(4000, "init failed");
                }
                int h8 = vd3Var.h();
                if (h8 != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(h8).length() + 4);
                    sb.append("ci: ");
                    sb.append(h8);
                    throw new fe3(4001, sb.toString());
                }
                synchronized (this.f8864g) {
                    vd3 vd3Var2 = this.f8863f;
                    if (vd3Var2 != null) {
                        try {
                            vd3Var2.g();
                        } catch (fe3 e8) {
                            this.f8860c.c(e8.a(), -1L, e8);
                        }
                    }
                    this.f8863f = vd3Var;
                }
                this.f8860c.b(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e9) {
                throw new fe3(2004, e9);
            }
        } catch (fe3 e10) {
            this.f8860c.c(e10.a(), System.currentTimeMillis() - currentTimeMillis, e10);
            return false;
        } catch (Exception e11) {
            this.f8860c.c(4010, System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        }
    }

    public final oc3 b() {
        vd3 vd3Var;
        synchronized (this.f8864g) {
            vd3Var = this.f8863f;
        }
        return vd3Var;
    }

    public final wd3 c() {
        synchronized (this.f8864g) {
            try {
                vd3 vd3Var = this.f8863f;
                if (vd3Var == null) {
                    return null;
                }
                return vd3Var.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
