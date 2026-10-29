package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: MyApplication */
public final class ui0 implements f3.b {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f16783a;

    public ui0(hi0 hi0Var) {
        this.f16783a = hi0Var;
    }

    @Override // f3.b
    public final int a() {
        hi0 hi0Var = this.f16783a;
        if (hi0Var != null) {
            try {
                return hi0Var.e();
            } catch (RemoteException e8) {
                w2.p.g("Could not forward getAmount to RewardItem", e8);
            }
        }
        return 0;
    }

    @Override // f3.b
    public final String getType() {
        hi0 hi0Var = this.f16783a;
        if (hi0Var != null) {
            try {
                return hi0Var.c();
            } catch (RemoteException e8) {
                w2.p.g("Could not forward getType to RewardItem", e8);
            }
        }
        return null;
    }
}
