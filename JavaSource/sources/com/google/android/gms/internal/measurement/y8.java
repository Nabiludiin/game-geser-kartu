package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: MyApplication */
final class y8 extends i9 {
    y8(c9 c9Var, String str, Long l7, boolean z7) {
        super(c9Var, str, l7, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.i9
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f21035b;
        String obj2 = obj.toString();
        StringBuilder sb = new StringBuilder(str.length() + 25 + obj2.length());
        sb.append("Invalid long value for ");
        sb.append(str);
        sb.append(": ");
        sb.append(obj2);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
