package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: MyApplication */
public final class wn3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private static volatile Long f18332f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f18333g = new Object();

    wn3(ak akVar, dn3 dn3Var, nu3 nu3Var) {
        super("Zh6cd+aDndZV+YUcVHG1KoZXWtL97j2QmZXbwOqvXvMv7NRw9MmD/Gx8wRyupV8R", "kj+4OypsnIcMTfpnmlGzqqY0pqeQ7F3FRQZTzB0M60E=", akVar, dn3Var, nu3Var.a(117));
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        if (f18332f == null) {
            synchronized (f18333g) {
                try {
                    if (f18332f == null) {
                        Long l7 = (Long) method.invoke("", null);
                        if (l7 == null) {
                            throw null;
                        }
                        f18332f = l7;
                    }
                } finally {
                }
            }
        }
        synchronized (akVar) {
            try {
                if (f18332f != null) {
                    akVar.A0(f18332f.longValue());
                }
            } finally {
            }
        }
    }
}
