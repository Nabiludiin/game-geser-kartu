package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: MyApplication */
final class z8 extends i9 {
    z8(c9 c9Var, String str, Boolean bool, boolean z7) {
        super(c9Var, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.i9
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (y7.f21451c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (y7.f21452d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f21035b;
        String obj2 = obj.toString();
        StringBuilder sb = new StringBuilder(str2.length() + 28 + obj2.length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(obj2);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
