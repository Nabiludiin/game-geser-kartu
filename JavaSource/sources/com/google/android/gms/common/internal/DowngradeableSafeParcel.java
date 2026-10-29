package com.google.android.gms.common.internal;

/* compiled from: MyApplication */
public abstract class DowngradeableSafeParcel extends q3.a implements ReflectedParcelable {

    /* renamed from: r, reason: collision with root package name */
    private static final Object f4553r = new Object();

    /* renamed from: q, reason: collision with root package name */
    private boolean f4554q = false;

    protected static boolean M0(String str) {
        synchronized (f4553r) {
        }
        return true;
    }

    protected static Integer N0() {
        synchronized (f4553r) {
        }
        return null;
    }

    protected boolean O0() {
        return this.f4554q;
    }
}
