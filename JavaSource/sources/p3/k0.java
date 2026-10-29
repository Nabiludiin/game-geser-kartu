package p3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: MyApplication */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        Account account = null;
        int i7 = 0;
        int i8 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 == 2) {
                account = (Account) q3.b.f(parcel, s7, Account.CREATOR);
            } else if (m7 == 3) {
                i8 = q3.b.u(parcel, s7);
            } else if (m7 != 4) {
                q3.b.y(parcel, s7);
            } else {
                googleSignInAccount = (GoogleSignInAccount) q3.b.f(parcel, s7, GoogleSignInAccount.CREATOR);
            }
        }
        q3.b.l(parcel, z7);
        return new j0(i7, account, i8, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new j0[i7];
    }
}
