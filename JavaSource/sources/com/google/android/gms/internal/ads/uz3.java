package com.google.android.gms.internal.ads;

import java.util.Collection;

/* compiled from: MyApplication */
public abstract class uz3 {
    static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
