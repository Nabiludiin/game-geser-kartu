package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
abstract class va {
    public static wa a(wa waVar, String[] strArr, Map map) {
        int length;
        int i7 = 0;
        if (waVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (wa) map.get(strArr[0]);
            }
            if (length2 > 1) {
                wa waVar2 = new wa();
                while (i7 < length2) {
                    waVar2.F((wa) map.get(strArr[i7]));
                    i7++;
                }
                return waVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                waVar.F((wa) map.get(strArr[0]));
                return waVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i7 < length) {
                    waVar.F((wa) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return waVar;
    }
}
