package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: MyApplication */
public final class kk5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11091a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f11092b;

    public kk5(Context context) {
        this.f11091a = context == null ? null : context.getApplicationContext();
    }

    public final fj5 a(eq5 eq5Var, mb1 mb1Var) {
        int i7;
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        eq5Var.getClass();
        mb1Var.getClass();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 29 || (i7 = eq5Var.H) == -1) {
            return fj5.f8288d;
        }
        Context context = this.f11091a;
        Boolean bool = this.f11092b;
        boolean z7 = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = gl0.a(context).getParameters("offloadVariableRateSupported");
                this.f11092b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f11092b = Boolean.FALSE;
            }
            booleanValue = this.f11092b.booleanValue();
        }
        String str = eq5Var.f7775o;
        str.getClass();
        int h8 = th.h(str, eq5Var.f7771k);
        if (h8 == 0 || i8 < hi2.d(h8)) {
            return fj5.f8288d;
        }
        int b8 = hi2.b(eq5Var.G);
        if (b8 == 0) {
            return fj5.f8288d;
        }
        try {
            AudioFormat c8 = hi2.c(i7, b8, h8);
            if (i8 < 31) {
                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(c8, mb1Var.a());
                if (!isOffloadedPlaybackSupported) {
                    return fj5.f8288d;
                }
                ej5 ej5Var = new ej5();
                ej5Var.a(true);
                ej5Var.c(booleanValue);
                return ej5Var.d();
            }
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(c8, mb1Var.a());
            if (playbackOffloadSupport == 0) {
                return fj5.f8288d;
            }
            ej5 ej5Var2 = new ej5();
            if (i8 > 32 && playbackOffloadSupport == 2) {
                z7 = true;
            }
            ej5Var2.a(true);
            ej5Var2.b(z7);
            ej5Var2.c(booleanValue);
            return ej5Var2.d();
        } catch (IllegalArgumentException unused) {
            return fj5.f8288d;
        }
    }
}
