package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class h22 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9292a;

    /* renamed from: b, reason: collision with root package name */
    private final w2.a f9293b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f9294c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f9295d = new AtomicReference("");

    h22(Context context, w2.a aVar, Executor executor) {
        this.f9292a = context;
        this.f9293b = aVar;
        this.f9294c = executor;
    }

    private final String c() {
        String str;
        w2.a aVar = this.f9293b;
        String str2 = null;
        if (aVar.f27054t) {
            str = yr0.class.getName();
        } else {
            try {
                str = (String) new JSONObject(d((String) s2.b0.c().d(uy.df))).get(Integer.toString(aVar.f27053s));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e8) {
                if (((Boolean) s2.b0.c().d(uy.cf)).booleanValue()) {
                    r2.t.l().i(e8, "SdkIE");
                }
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "2";
        }
        try {
            str2 = d((String) s2.b0.c().d(uy.ef));
        } catch (IllegalArgumentException e9) {
            if (((Boolean) s2.b0.c().d(uy.cf)).booleanValue()) {
                r2.t.l().i(e9, "SdkIE");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return "3";
        }
        try {
            for (Method method : this.f9292a.getClassLoader().loadClass(str).getDeclaredMethods()) {
                if (method.getName().matches(str2)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }

    private static final String d(String str) {
        return v2.f2.X(new String(Base64.decode(str, 0)), new String(Base64.decode((String) s2.b0.c().d(uy.ff), 10), StandardCharsets.UTF_8));
    }

    public final String a() {
        if (((Boolean) s2.b0.c().d(uy.bf)).booleanValue()) {
            if (!((String) s2.b0.c().d(uy.df)).isEmpty()) {
                if (!((String) s2.b0.c().d(uy.ef)).isEmpty()) {
                    if (!((String) s2.b0.c().d(uy.ff)).isEmpty()) {
                        String str = (String) this.f9295d.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.f9294c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g22
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                h22.this.b();
                            }
                        });
                        return null;
                    }
                }
            }
        }
        return null;
    }

    final /* synthetic */ void b() {
        AtomicReference atomicReference = this.f9295d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(c());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
