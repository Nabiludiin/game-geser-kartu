package v3;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

public class a extends q3.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: q, reason: collision with root package name */
    private final ParcelFileDescriptor f26898q;

    /* renamed from: r, reason: collision with root package name */
    final int f26899r;

    /* renamed from: s, reason: collision with root package name */
    private final int f26900s;

    /* renamed from: t, reason: collision with root package name */
    private final DriveId f26901t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f26902u;

    /* renamed from: v, reason: collision with root package name */
    private final String f26903v;

    public a(ParcelFileDescriptor parcelFileDescriptor, int i7, int i8, DriveId driveId, boolean z7, String str) {
        this.f26898q = parcelFileDescriptor;
        this.f26899r = i7;
        this.f26900s = i8;
        this.f26901t = driveId;
        this.f26902u = z7;
        this.f26903v = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.q(parcel, 2, this.f26898q, i7, false);
        q3.c.l(parcel, 3, this.f26899r);
        q3.c.l(parcel, 4, this.f26900s);
        q3.c.q(parcel, 5, this.f26901t, i7, false);
        q3.c.c(parcel, 7, this.f26902u);
        q3.c.r(parcel, 8, this.f26903v, false);
        q3.c.b(parcel, a8);
    }
}
