package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class pm2 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final int f13927a;

    public pm2(int i7) {
        this.f13927a = i7;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public /* synthetic */ void a(lb lbVar) {
        kd.a(this, lbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm2) && this.f13927a == ((pm2) obj).f13927a;
    }

    public final int hashCode() {
        return this.f13927a;
    }

    public final String toString() {
        int i7 = this.f13927a;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 19);
        sb.append("Mp4AlternateGroup: ");
        sb.append(i7);
        return sb.toString();
    }
}
