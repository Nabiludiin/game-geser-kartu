package p3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class r1 extends o4.a implements j {
    r1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p3.j
    public final Account b() {
        Parcel a8 = a(2, O());
        Account account = (Account) o4.e.a(a8, Account.CREATOR);
        a8.recycle();
        return account;
    }
}
