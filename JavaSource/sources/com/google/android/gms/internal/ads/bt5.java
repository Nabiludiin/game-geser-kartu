package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* compiled from: MyApplication */
final class bt5 implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ xt5 f5998a;

    bt5(lt5 lt5Var, xt5 xt5Var) {
        this.f5998a = xt5Var;
        Objects.requireNonNull(lt5Var);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z7) {
        this.f5998a.q();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z7) {
        this.f5998a.q();
    }
}
