package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: MyApplication */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f4557a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f4558b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f4559c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f4560d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f4561e;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f4562f;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f4561e == null) {
            boolean z7 = false;
            if (n.f() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z7 = true;
            }
            f4561e = Boolean.valueOf(z7);
        }
        return f4561e.booleanValue();
    }

    public static boolean b(Context context) {
        if (f4562f == null) {
            boolean z7 = false;
            if (n.i() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z7 = true;
            }
            f4562f = Boolean.valueOf(z7);
        }
        return f4562f.booleanValue();
    }

    public static boolean c(Context context) {
        if (f4559c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z7 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z7 = true;
            }
            f4559c = Boolean.valueOf(z7);
        }
        return f4559c.booleanValue();
    }

    public static boolean d(Context context) {
        return h(context);
    }

    public static boolean e() {
        int i7 = k3.k.f24503a;
        return "user".equals(Build.TYPE);
    }

    public static boolean f(Context context) {
        return j(context.getPackageManager());
    }

    public static boolean g(Context context) {
        if (f(context) && !n.e()) {
            return true;
        }
        if (h(context)) {
            return !n.f() || n.i();
        }
        return false;
    }

    public static boolean h(Context context) {
        if (f4558b == null) {
            f4558b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f4558b.booleanValue();
    }

    public static boolean i(Context context) {
        if (f4560d == null) {
            boolean z7 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z7 = false;
            }
            f4560d = Boolean.valueOf(z7);
        }
        return f4560d.booleanValue();
    }

    public static boolean j(PackageManager packageManager) {
        if (f4557a == null) {
            f4557a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f4557a.booleanValue();
    }
}
