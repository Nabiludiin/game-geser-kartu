package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: MyApplication */
final class dl5 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f7158a;

    /* renamed from: b, reason: collision with root package name */
    private final dj5 f7159b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f7160c;

    /* renamed from: d, reason: collision with root package name */
    private AudioRouting$OnRoutingChangedListener f7161d = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.yk5
        public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
            dl5.this.b(audioRouting);
        }
    };

    public dl5(AudioTrack audioTrack, dj5 dj5Var) {
        this.f7158a = audioTrack;
        this.f7159b = dj5Var;
        Handler handler = new Handler(Looper.myLooper());
        this.f7160c = handler;
        audioTrack.addOnRoutingChangedListener(this.f7161d, handler);
    }

    public final void a() {
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.f7161d;
        audioRouting$OnRoutingChangedListener.getClass();
        this.f7158a.removeOnRoutingChangedListener(zk5.a(audioRouting$OnRoutingChangedListener));
        this.f7161d = null;
    }

    final /* synthetic */ void b(final AudioRouting audioRouting) {
        if (this.f7161d == null) {
            return;
        }
        f71.a().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vk5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                dl5.this.c(audioRouting);
            }
        });
    }

    final /* synthetic */ void c(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice;
        routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.f7160c.post(new Runnable() { // from class: com.google.android.gms.internal.ads.wk5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    dl5.this.d(routedDevice);
                }
            });
        }
    }

    final /* synthetic */ void d(AudioDeviceInfo audioDeviceInfo) {
        if (this.f7161d == null) {
            return;
        }
        this.f7159b.c(audioDeviceInfo);
    }
}
