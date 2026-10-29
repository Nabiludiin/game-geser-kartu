package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class in5 {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f10098a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private LoudnessCodecController f10099b;

    public in5(dn5 dn5Var) {
    }

    public final void a(int i7) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.f10099b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f10099b = null;
        }
        create = LoudnessCodecController.create(i7, g74.a(), new bn5(this));
        this.f10099b = create;
        Iterator it = this.f10098a.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public final void b(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = this.f10099b;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        rx3.h(this.f10098a.add(mediaCodec));
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f10098a.remove(mediaCodec) || (loudnessCodecController = this.f10099b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d() {
        this.f10098a.clear();
        LoudnessCodecController loudnessCodecController = this.f10099b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
