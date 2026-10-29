package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public abstract class of4 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f13315a = Logger.getLogger(of4.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f13316b = new AtomicBoolean(false);

    public static boolean a() {
        return f13316b.get();
    }

    static Boolean b() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f13315a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }
}
