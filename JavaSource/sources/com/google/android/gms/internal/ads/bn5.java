package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class bn5 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    bn5(in5 in5Var) {
        Objects.requireNonNull(in5Var);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}
