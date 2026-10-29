package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public interface nn5 {
    ByteBuffer F(int i7);

    ByteBuffer I(int i7);

    void X(Bundle bundle);

    void a(int i7, int i8, int i9, long j7, int i10);

    void b(int i7, int i8, tg4 tg4Var, long j7, int i9);

    void b0(int i7, long j7);

    int c();

    int d(MediaCodec.BufferInfo bufferInfo);

    void e(int i7, boolean z7);

    MediaFormat f();

    boolean g(ln5 ln5Var);

    void h(Surface surface);

    void i();

    void i0(int i7);

    void l();

    void o();
}
