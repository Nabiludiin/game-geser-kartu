package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: MyApplication */
public abstract class kb3 {

    /* renamed from: a, reason: collision with root package name */
    private static int f10955a = 2;

    public static void a(Context context) {
        context.registerReceiver(new jb3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (gb3.b() != t93.CTV) {
            return 2;
        }
        return f10955a;
    }
}
