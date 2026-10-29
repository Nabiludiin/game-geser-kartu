package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class e85 {
    public static e85 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new z75(cls.getSimpleName()) : new b85(cls.getSimpleName());
    }

    public abstract void a(String str);
}
