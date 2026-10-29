package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* compiled from: MyApplication */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5390a;

    public ay(Context context) {
        p3.o.n(context, "Context can not be null");
        this.f5390a = context;
    }

    public final boolean a() {
        Context context = this.f5390a;
        return ((Boolean) v2.e1.a(context, zx.f20509a)).booleanValue() && u3.e.a(context).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean b() {
        return c(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c(Intent intent) {
        p3.o.n(intent, "Intent can not be null");
        return !this.f5390a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
