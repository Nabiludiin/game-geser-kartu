package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
public abstract class p14 {
    static Object a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void b(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
