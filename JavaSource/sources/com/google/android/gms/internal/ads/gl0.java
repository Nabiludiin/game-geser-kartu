package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* compiled from: MyApplication */
public abstract class gl0 {

    /* renamed from: a, reason: collision with root package name */
    private static AudioManager f9002a;

    public static synchronized AudioManager a(Context context) {
        synchronized (gl0.class) {
            try {
                final Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f9002a = null;
                }
                AudioManager audioManager = f9002a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    final sg1 sg1Var = new sg1(pd1.f13828a);
                    f71.a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dk0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            gl0.d(applicationContext, sg1Var);
                        }
                    });
                    sg1Var.d();
                    AudioManager audioManager2 = f9002a;
                    if (audioManager2 != null) {
                        return audioManager2;
                    }
                    throw null;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                f9002a = audioManager3;
                if (audioManager3 != null) {
                    return audioManager3;
                }
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int b(AudioManager audioManager, cj0 cj0Var) {
        int requestAudioFocus;
        if (Build.VERSION.SDK_INT >= 26) {
            requestAudioFocus = audioManager.requestAudioFocus(cj0Var.c());
            return requestAudioFocus;
        }
        AudioManager.OnAudioFocusChangeListener b8 = cj0Var.b();
        cj0Var.a();
        return audioManager.requestAudioFocus(b8, 3, 1);
    }

    public static int c(AudioManager audioManager, cj0 cj0Var) {
        int abandonAudioFocusRequest;
        if (Build.VERSION.SDK_INT < 26) {
            return audioManager.abandonAudioFocus(cj0Var.b());
        }
        abandonAudioFocusRequest = audioManager.abandonAudioFocusRequest(cj0Var.c());
        return abandonAudioFocusRequest;
    }

    static /* synthetic */ void d(Context context, sg1 sg1Var) {
        f9002a = (AudioManager) context.getSystemService("audio");
        sg1Var.a();
    }
}
