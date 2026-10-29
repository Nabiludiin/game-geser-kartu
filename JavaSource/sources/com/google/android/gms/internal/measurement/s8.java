package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* compiled from: MyApplication */
final class s8 implements p8 {

    /* renamed from: d, reason: collision with root package name */
    private static s8 f21373d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21374a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f21375b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21376c;

    private s8() {
        this.f21376c = false;
        this.f21374a = null;
        this.f21375b = null;
    }

    static s8 a(Context context) {
        s8 s8Var;
        synchronized (s8.class) {
            try {
                if (f21373d == null) {
                    f21373d = androidx.core.content.b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new s8(context) : new s8();
                }
                s8 s8Var2 = f21373d;
                if (s8Var2 != null && s8Var2.f21375b != null && !s8Var2.f21376c) {
                    try {
                        context.getContentResolver().registerContentObserver(y7.f21449a, true, f21373d.f21375b);
                        ((s8) y4.h.h(f21373d)).f21376c = true;
                    } catch (SecurityException e8) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e8);
                    }
                }
                s8Var = (s8) y4.h.h(f21373d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return s8Var;
    }

    static synchronized void c() {
        Context context;
        synchronized (s8.class) {
            try {
                s8 s8Var = f21373d;
                if (s8Var != null && (context = s8Var.f21374a) != null && s8Var.f21375b != null && s8Var.f21376c) {
                    context.getContentResolver().unregisterContentObserver(f21373d.f21375b);
                }
                f21373d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.p8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String y(final String str) {
        Context context = this.f21374a;
        if (context != null && !f8.b(context)) {
            try {
                return (String) o8.a(new n8() { // from class: com.google.android.gms.internal.measurement.r8
                    @Override // com.google.android.gms.internal.measurement.n8
                    public final /* synthetic */ Object a() {
                        return s8.this.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e8) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e8);
            }
        }
        return null;
    }

    final /* synthetic */ String d(String str) {
        return x7.a(((Context) y4.h.h(this.f21374a)).getContentResolver(), str, null);
    }

    private s8(Context context) {
        this.f21376c = false;
        this.f21374a = context;
        this.f21375b = new q8(this, null);
    }
}
