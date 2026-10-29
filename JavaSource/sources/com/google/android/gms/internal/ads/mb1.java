package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* compiled from: MyApplication */
public final class mb1 {

    /* renamed from: b, reason: collision with root package name */
    public static final mb1 f12165b = new mb1(0, 0, 1, 1, 0, false, null);

    /* renamed from: a, reason: collision with root package name */
    private AudioAttributes f12166a;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ mb1(int i7, int i8, int i9, int i10, int i11, boolean z7, byte[] bArr) {
    }

    public final AudioAttributes a() {
        if (this.f12166a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            if (i7 >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f12166a = usage.build();
        }
        return this.f12166a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mb1.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -2092275855;
    }
}
