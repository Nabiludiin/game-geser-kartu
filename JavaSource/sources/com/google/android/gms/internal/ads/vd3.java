package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;

/* compiled from: MyApplication */
final class vd3 implements oc3 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f17580a;

    /* renamed from: b, reason: collision with root package name */
    private final wd3 f17581b;

    /* renamed from: c, reason: collision with root package name */
    private final he3 f17582c;

    /* renamed from: d, reason: collision with root package name */
    private final lc3 f17583d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f17584e;

    vd3(Object obj, wd3 wd3Var, he3 he3Var, lc3 lc3Var, boolean z7) {
        this.f17580a = obj;
        this.f17581b = wd3Var;
        this.f17582c = he3Var;
        this.f17583d = lc3Var;
        this.f17584e = z7;
    }

    private static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ol d02 = pl.d0();
        d02.H(5);
        d02.E(qy4.s(bArr, 0, bArr.length));
        return Base64.encodeToString(((pl) d02.A()).e(), 11);
    }

    private final synchronized byte[] j(Map map, Map map2) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f17580a;
        } catch (Exception e8) {
            this.f17583d.c(2007, System.currentTimeMillis() - currentTimeMillis, e8);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final synchronized String a(Context context, String str) {
        byte[] j7;
        try {
            Map b8 = this.f17582c.b();
            b8.put("f", "q");
            b8.put("ctx", context);
            b8.put("aid", null);
            j7 = j(null, b8);
            if (this.f17584e) {
                b8.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return i(j7);
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final synchronized String b(Context context, String str, String str2, View view, Activity activity) {
        byte[] j7;
        try {
            Map h8 = this.f17582c.h();
            h8.put("f", "c");
            h8.put("ctx", context);
            h8.put("cs", str2);
            h8.put("aid", null);
            h8.put("view", view);
            h8.put("act", activity);
            j7 = j(null, h8);
            if (this.f17584e) {
                h8.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return i(j7);
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final synchronized void c(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Map c8 = this.f17582c.c();
            c8.put("aid", null);
            c8.put("evt", motionEvent);
            Object obj = this.f17580a;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, c8);
            this.f17583d.b(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e8) {
            throw new fe3(2005, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.oc3
    public final synchronized String d(Context context, String str, View view, Activity activity) {
        byte[] j7;
        try {
            Map d8 = this.f17582c.d();
            d8.put("f", "v");
            d8.put("ctx", context);
            d8.put("aid", null);
            d8.put("view", view);
            d8.put("act", activity);
            j7 = j(null, d8);
            if (this.f17584e) {
                d8.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return i(j7);
    }

    final wd3 e() {
        return this.f17581b;
    }

    final synchronized boolean f() {
        Object obj;
        try {
            obj = this.f17580a;
        } catch (Exception e8) {
            throw new fe3(2001, e8);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public final synchronized void g() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.f17580a;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            this.f17583d.b(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e8) {
            throw new fe3(2003, e8);
        }
    }

    public final synchronized int h() {
        Object obj;
        try {
            obj = this.f17580a;
        } catch (Exception e8) {
            throw new fe3(2006, e8);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }
}
