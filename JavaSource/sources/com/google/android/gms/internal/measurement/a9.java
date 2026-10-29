package com.google.android.gms.internal.measurement;

import android.util.Log;

/* compiled from: MyApplication */
final class a9 extends i9 {
    a9(c9 c9Var, String str, Double d8, boolean z7) {
        super(c9Var, "measurement.test.double_flag", d8, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.i9
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f21035b;
        String obj2 = obj.toString();
        StringBuilder sb = new StringBuilder(str.length() + 27 + obj2.length());
        sb.append("Invalid double value for ");
        sb.append(str);
        sb.append(": ");
        sb.append(obj2);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
