package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: MyApplication */
public final class ii5 implements Parcelable {
    public static final Parcelable.Creator<ii5> CREATOR = new gf5();

    /* renamed from: q, reason: collision with root package name */
    private int f10056q;

    /* renamed from: r, reason: collision with root package name */
    public final UUID f10057r;

    /* renamed from: s, reason: collision with root package name */
    public final String f10058s;

    /* renamed from: t, reason: collision with root package name */
    public final String f10059t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f10060u;

    ii5(Parcel parcel) {
        this.f10057r = new UUID(parcel.readLong(), parcel.readLong());
        this.f10058s = parcel.readString();
        String readString = parcel.readString();
        String str = hi2.f9535a;
        this.f10059t = readString;
        this.f10060u = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ii5)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ii5 ii5Var = (ii5) obj;
        return Objects.equals(this.f10058s, ii5Var.f10058s) && Objects.equals(this.f10059t, ii5Var.f10059t) && Objects.equals(this.f10057r, ii5Var.f10057r) && Arrays.equals(this.f10060u, ii5Var.f10060u);
    }

    public final int hashCode() {
        int i7 = this.f10056q;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = this.f10057r.hashCode() * 31;
        String str = this.f10058s;
        int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f10059t.hashCode()) * 31) + Arrays.hashCode(this.f10060u);
        this.f10056q = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f10057r;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f10058s);
        parcel.writeString(this.f10059t);
        parcel.writeByteArray(this.f10060u);
    }

    public ii5(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f10057r = uuid;
        this.f10058s = null;
        this.f10059t = th.i(str2);
        this.f10060u = bArr;
    }
}
