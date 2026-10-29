package v2;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.uy;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile float f26719c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private static volatile long f26720d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f26721e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private boolean f26722a = false;

    /* renamed from: b, reason: collision with root package name */
    private float f26723b = 1.0f;

    public static float e(Context context) {
        if (!((Boolean) s2.b0.c().d(uy.Ve)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return 0.0f;
            }
            return g(audioManager);
        }
        long a8 = r2.t.o().a();
        long intValue = ((Integer) s2.b0.c().d(uy.We)).intValue();
        if (f26719c != -1.0f && a8 - f26720d < intValue) {
            return f26719c;
        }
        synchronized (f26721e) {
            try {
                long a9 = r2.t.o().a();
                if (f26719c != -1.0f && a9 - f26720d < intValue) {
                    return f26719c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    f26719c = 0.0f;
                    f26720d = a9;
                    return 0.0f;
                }
                f26719c = g(audioManager2);
                f26720d = a9;
                return f26719c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized boolean f() {
        return this.f26723b >= 0.0f;
    }

    private static float g(AudioManager audioManager) {
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    public final synchronized void a(float f8) {
        this.f26723b = f8;
    }

    public final synchronized float b() {
        if (!f()) {
            return 1.0f;
        }
        return this.f26723b;
    }

    public final synchronized void c(boolean z7) {
        this.f26722a = z7;
    }

    public final synchronized boolean d() {
        return this.f26722a;
    }
}
