package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: MyApplication */
final class zi5 extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dj5 f20195a;

    /* synthetic */ zi5(dj5 dj5Var, byte[] bArr) {
        Objects.requireNonNull(dj5Var);
        this.f20195a = dj5Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        dj5 dj5Var = this.f20195a;
        dj5Var.f(yi5.a(dj5Var.g(), dj5Var.j(), dj5Var.h()));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = hi2.f9535a;
        int length = audioDeviceInfoArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            dj5 dj5Var = this.f20195a;
            if (Objects.equals(audioDeviceInfoArr[i7], dj5Var.h())) {
                dj5Var.i(null);
                break;
            }
            i7++;
        }
        dj5 dj5Var2 = this.f20195a;
        dj5Var2.f(yi5.a(dj5Var2.g(), dj5Var2.j(), dj5Var2.h()));
    }
}
