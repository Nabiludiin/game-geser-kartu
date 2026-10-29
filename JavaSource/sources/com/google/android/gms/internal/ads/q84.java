package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MyApplication */
public abstract class q84 {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f14304a = new CopyOnWriteArrayList();

    public static p84 a(String str) {
        Iterator it = f14304a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
