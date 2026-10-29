package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class ml2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f12299a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f12300b;

    public ml2(z64 z64Var, Context context) {
        this.f12299a = z64Var;
        this.f12300b = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f12299a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.ll2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return ml2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 13;
    }

    final /* synthetic */ nl2 c() {
        int i7;
        int i8;
        AudioManager audioManager = (AudioManager) this.f12300b.getSystemService("audio");
        float b8 = r2.t.m().b();
        boolean d8 = r2.t.m().d();
        if (audioManager == null) {
            return new nl2(-1, false, false, -1, -1, -1, -1, -1, b8, d8, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) s2.b0.c().d(uy.Zb)).booleanValue()) {
            int j7 = r2.t.j().j(audioManager);
            i8 = audioManager.getStreamMaxVolume(3);
            i7 = j7;
        } else {
            i7 = -1;
            i8 = -1;
        }
        return new nl2(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i7, i8, audioManager.getRingerMode(), audioManager.getStreamVolume(2), b8, d8, false);
    }
}
