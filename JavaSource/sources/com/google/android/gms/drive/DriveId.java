package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.drive.a;
import com.google.android.gms.internal.drive.l0;
import p3.o;
import q3.a;
import v3.c;

public class DriveId extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<DriveId> CREATOR = new c();

    /* renamed from: q, reason: collision with root package name */
    private final String f4569q;

    /* renamed from: r, reason: collision with root package name */
    private final long f4570r;

    /* renamed from: s, reason: collision with root package name */
    private final long f4571s;

    /* renamed from: t, reason: collision with root package name */
    private final int f4572t;

    /* renamed from: u, reason: collision with root package name */
    private volatile String f4573u = null;

    /* renamed from: v, reason: collision with root package name */
    private volatile String f4574v = null;

    public DriveId(String str, long j7, long j8, int i7) {
        this.f4569q = str;
        boolean z7 = true;
        o.a(!"".equals(str));
        if (str == null && j7 == -1) {
            z7 = false;
        }
        o.a(z7);
        this.f4570r = j7;
        this.f4571s = j8;
        this.f4572t = i7;
    }

    public final String M0() {
        if (this.f4573u == null) {
            a.C0079a v7 = com.google.android.gms.internal.drive.a.w().v(1);
            String str = this.f4569q;
            if (str == null) {
                str = "";
            }
            String valueOf = String.valueOf(Base64.encodeToString(((com.google.android.gms.internal.drive.a) ((l0) v7.q(str).r(this.f4570r).s(this.f4571s).w(this.f4572t).p())).c(), 10));
            this.f4573u = valueOf.length() != 0 ? "DriveId:".concat(valueOf) : new String("DriveId:");
        }
        return this.f4573u;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.f4571s != this.f4571s) {
                return false;
            }
            long j7 = driveId.f4570r;
            if (j7 == -1 && this.f4570r == -1) {
                return driveId.f4569q.equals(this.f4569q);
            }
            String str2 = this.f4569q;
            if (str2 != null && (str = driveId.f4569q) != null) {
                return j7 == this.f4570r && str.equals(str2);
            }
            if (j7 == this.f4570r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f4570r == -1) {
            return this.f4569q.hashCode();
        }
        String valueOf = String.valueOf(String.valueOf(this.f4571s));
        String valueOf2 = String.valueOf(String.valueOf(this.f4570r));
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }

    public String toString() {
        return M0();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, this.f4569q, false);
        q3.c.o(parcel, 3, this.f4570r);
        q3.c.o(parcel, 4, this.f4571s);
        q3.c.l(parcel, 5, this.f4572t);
        q3.c.b(parcel, a8);
    }
}
