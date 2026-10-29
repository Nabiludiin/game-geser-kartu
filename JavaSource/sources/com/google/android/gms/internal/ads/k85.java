package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: MyApplication */
public abstract class k85 {
    public static List a(int i7) {
        return i7 == 0 ? Collections.EMPTY_LIST : new ArrayList(i7);
    }

    static HashSet b(int i7) {
        return new HashSet(d(i7));
    }

    public static LinkedHashMap c(int i7) {
        return new LinkedHashMap(d(i7));
    }

    private static int d(int i7) {
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
