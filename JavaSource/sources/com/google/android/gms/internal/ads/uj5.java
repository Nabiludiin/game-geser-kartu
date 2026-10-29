package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: MyApplication */
public final class uj5 implements Comparator, Parcelable {
    public static final Parcelable.Creator<uj5> CREATOR = new fe5();

    /* renamed from: q, reason: collision with root package name */
    private final ii5[] f16794q;

    /* renamed from: r, reason: collision with root package name */
    private int f16795r;

    /* renamed from: s, reason: collision with root package name */
    public final String f16796s;

    /* renamed from: t, reason: collision with root package name */
    public final int f16797t;

    uj5(Parcel parcel) {
        this.f16796s = parcel.readString();
        ii5[] ii5VarArr = (ii5[]) parcel.createTypedArray(ii5.CREATOR);
        String str = hi2.f9535a;
        this.f16794q = ii5VarArr;
        this.f16797t = ii5VarArr.length;
    }

    public final ii5 a(int i7) {
        return this.f16794q[i7];
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ii5 ii5Var = (ii5) obj2;
        UUID uuid = vk3.f17657a;
        UUID uuid2 = ((ii5) obj).f10057r;
        return uuid.equals(uuid2) ? !uuid.equals(ii5Var.f10057r) ? 1 : 0 : uuid2.compareTo(ii5Var.f10057r);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uj5.class == obj.getClass()) {
            uj5 uj5Var = (uj5) obj;
            if (Objects.equals(this.f16796s, uj5Var.f16796s) && Arrays.equals(this.f16794q, uj5Var.f16794q)) {
                return true;
            }
        }
        return false;
    }

    public final uj5 f(String str) {
        return Objects.equals(this.f16796s, str) ? this : new uj5(str, false, this.f16794q);
    }

    public final int hashCode() {
        int i7 = this.f16795r;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f16796s;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f16794q);
        this.f16795r = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16796s);
        parcel.writeTypedArray(this.f16794q, 0);
    }

    private uj5(String str, boolean z7, ii5... ii5VarArr) {
        this.f16796s = str;
        ii5VarArr = z7 ? (ii5[]) ii5VarArr.clone() : ii5VarArr;
        this.f16794q = ii5VarArr;
        this.f16797t = ii5VarArr.length;
        Arrays.sort(ii5VarArr, this);
    }

    public uj5(String str, ii5... ii5VarArr) {
        this(null, true, ii5VarArr);
    }

    public uj5(List list) {
        this(null, false, (ii5[]) list.toArray(new ii5[0]));
    }
}
