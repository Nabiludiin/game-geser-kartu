package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: MyApplication */
public abstract class o0 {
    public static Object a(Iterable iterable, Object obj) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
