package p3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: MyApplication */
public final class j0 extends q3.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: q, reason: collision with root package name */
    final int f25207q;

    /* renamed from: r, reason: collision with root package name */
    private final Account f25208r;

    /* renamed from: s, reason: collision with root package name */
    private final int f25209s;

    /* renamed from: t, reason: collision with root package name */
    private final GoogleSignInAccount f25210t;

    j0(int i7, Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this.f25207q = i7;
        this.f25208r = account;
        this.f25209s = i8;
        this.f25210t = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f25207q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.q(parcel, 2, this.f25208r, i7, false);
        q3.c.l(parcel, 3, this.f25209s);
        q3.c.q(parcel, 4, this.f25210t, i7, false);
        q3.c.b(parcel, a8);
    }

    public j0(Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i7, googleSignInAccount);
    }
}
