package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* compiled from: MyApplication */
final class mh3 {

    /* renamed from: c, reason: collision with root package name */
    private static mh3 f12256c;

    /* renamed from: a, reason: collision with root package name */
    private final String f12257a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f12258b;

    private mh3(Context context) {
        this.f12257a = context.getPackageName();
        this.f12258b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    static mh3 a(Context context) {
        if (f12256c == null) {
            f12256c = new mh3(context);
        }
        return f12256c;
    }

    final void b(String str, Object obj) {
        boolean commit;
        if (obj instanceof String) {
            commit = this.f12258b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.f12258b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = this.f12258b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                String valueOf = String.valueOf(obj.getClass());
                String str2 = this.f12257a;
                StringBuilder sb = new StringBuilder(valueOf.length() + 33 + String.valueOf(str2).length());
                sb.append("Unexpected object class ");
                sb.append(valueOf);
                sb.append(" for app ");
                sb.append(str2);
                Log.e("GpidLifecycleSPHandler", sb.toString());
                String str3 = this.f12257a;
                StringBuilder sb2 = new StringBuilder(str.length() + 25 + String.valueOf(str3).length());
                sb2.append("Failed to store ");
                sb2.append(str);
                sb2.append(" for app ");
                sb2.append(str3);
                throw new IOException(sb2.toString());
            }
            commit = this.f12258b.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        String str32 = this.f12257a;
        StringBuilder sb22 = new StringBuilder(str.length() + 25 + String.valueOf(str32).length());
        sb22.append("Failed to store ");
        sb22.append(str);
        sb22.append(" for app ");
        sb22.append(str32);
        throw new IOException(sb22.toString());
    }

    final String c(String str, String str2) {
        return this.f12258b.getString(str, null);
    }

    final long d(String str, long j7) {
        return this.f12258b.getLong(str, -1L);
    }

    final boolean e(String str, boolean z7) {
        return this.f12258b.getBoolean(str, true);
    }

    final void f(String str) {
        if (this.f12258b.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.f12257a;
        StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(str2).length());
        sb.append("Failed to remove ");
        sb.append(str);
        sb.append(" for app ");
        sb.append(str2);
        throw new IOException(sb.toString());
    }

    final boolean g(String str) {
        return this.f12258b.contains(str);
    }
}
