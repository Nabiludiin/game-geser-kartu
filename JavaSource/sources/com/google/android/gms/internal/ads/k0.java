package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.Objects;

/* compiled from: MyApplication */
final class k0 implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayManager f10830a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m0 f10831b;

    public k0(m0 m0Var, DisplayManager displayManager) {
        Objects.requireNonNull(m0Var);
        this.f10831b = m0Var;
        this.f10830a = displayManager;
    }

    private final Display c() {
        return this.f10830a.getDisplay(0);
    }

    public final void a() {
        this.f10830a.registerDisplayListener(this, hi2.z(null));
        this.f10831b.j(c());
    }

    public final void b() {
        this.f10830a.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        if (i7 == 0) {
            this.f10831b.j(c());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }
}
